package com.example.kentaBlogApp.controller;

import com.example.kentaBlogApp.entity.Post;
import com.example.kentaBlogApp.request.PostCreateRequest;
import com.example.kentaBlogApp.request.PostUpdateRequest;
import com.example.kentaBlogApp.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/posts")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<Post>  getAllPosts(){
        return postService.getAllPosts();
    }
    @GetMapping("/{postId}")
    public Post getOnePostById(@PathVariable Long postId){
        return postService.getOnePostById(postId);
    }

    @PostMapping
    public Post createPost(@RequestBody PostCreateRequest postCreateRequest){
        return postService.createPost(postCreateRequest);
    }

    @PutMapping("/{postId}")
    public Post updateOnePost(@PathVariable Long postId,@RequestBody PostUpdateRequest postUpdateRequest){
        return postService.updateOnePost(postId,postUpdateRequest);
    }

    @DeleteMapping("/{postId}")
    public void deleteOnePost(@PathVariable Long postId){
        postService.deleteOnePost(postId);
    }
}
