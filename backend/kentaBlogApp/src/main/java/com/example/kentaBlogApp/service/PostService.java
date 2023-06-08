package com.example.kentaBlogApp.service;

import com.example.kentaBlogApp.entity.Post;
import com.example.kentaBlogApp.entity.User;
import com.example.kentaBlogApp.repository.PostRepository;
import com.example.kentaBlogApp.request.PostCreateRequest;
import com.example.kentaBlogApp.request.PostUpdateRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    private final PostRepository postRepository;
    private final UserService userService;

    public PostService(PostRepository postRepository, UserService userService) {
        this.postRepository = postRepository;
        this.userService = userService;
    }
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Post getOnePostById(Long postId) {
        return postRepository.findById(postId).orElse(null);
    }

    public Post createPost(PostCreateRequest postCreateRequest) {
        User user = userService.getOneUser(postCreateRequest.getUserId());
        if (user == null){
            return null;
        }
        Post toPost = new Post();
        toPost.setId(postCreateRequest.getId());
        toPost.setText(postCreateRequest.getText());
        toPost.setUser(user);
        toPost.setTitle(postCreateRequest.getTitle());
        return postRepository.save(toPost);
    }
    public Post updateOnePost(Long postId, PostUpdateRequest postUpdateRequest) {
        Optional<Post> post = postRepository.findById(postId);
        if (post.isPresent()) {
            Post toUpdatePost = new Post();
            toUpdatePost.setTitle(postUpdateRequest.getTitle());
            toUpdatePost.setText(postUpdateRequest.getText());
            postRepository.save(toUpdatePost);
            return toUpdatePost;
        }
        return null;
    }

    public void deleteOnePost(Long postId) {
        postRepository.deleteById(postId);
    }
}
