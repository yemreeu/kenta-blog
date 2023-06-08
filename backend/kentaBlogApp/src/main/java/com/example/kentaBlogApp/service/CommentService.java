package com.example.kentaBlogApp.service;

import com.example.kentaBlogApp.entity.Comment;
import com.example.kentaBlogApp.entity.Post;
import com.example.kentaBlogApp.entity.User;
import com.example.kentaBlogApp.repository.CommentRepository;
import com.example.kentaBlogApp.request.CommentCreateRequest;
import com.example.kentaBlogApp.request.CommentUpdateRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {
    private final CommentRepository commentRepository;
    private final UserService userService;
    private final PostService postService;

    public CommentService(CommentRepository commentRepository, UserService userService, PostService postService) {
        this.commentRepository = commentRepository;
        this.userService = userService;
        this.postService = postService;
    }


    public List<Comment> getAllCommentsWithParams(Optional<Long> userId, Optional<Long> postId) {
        if (userId.isPresent() && postId.isPresent()){
            return commentRepository.findByUserIdAndPostId(userId.get(),postId.get());
        }else if(userId.isPresent()){
            return commentRepository.findByUserId(userId.get());
        }else if(postId.isPresent()){
            return commentRepository.findByPostId(postId.get());
        }else {
            return commentRepository.findAll();
        }
    }

    public Comment getOneCommentById(Long commentId) {
        return commentRepository.findById(commentId).orElse(null);
    }

    public Comment createComment(CommentCreateRequest request) {
        User user = userService.getOneUser(request.getUserId());
        Post post = postService.getOnePostById(request.getPostId());
        if (user != null && post != null){
            Comment commentToSave = new Comment();
            commentToSave.setId(request.getId());
            commentToSave.setText(request.getText());
            commentToSave.setUser(user);
            commentToSave.setPost(post);
            return commentRepository.save(commentToSave);
        }else{
            return null;
        }
    }

    public Comment updateOneComment(Long commentId, CommentUpdateRequest request) {
        Optional<Comment> comment = commentRepository.findById(commentId);
        if (comment.isPresent()){
            Comment commentToUpdate = comment.get();
            commentToUpdate.setText(request.getText());
            return commentRepository.save(commentToUpdate);
        }else
            return null;
    }


    public void deleteOneComment(Long commentId) {
        commentRepository.deleteById(commentId);
    }
}

