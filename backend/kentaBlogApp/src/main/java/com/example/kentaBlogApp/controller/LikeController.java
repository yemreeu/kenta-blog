package com.example.kentaBlogApp.controller;

import com.example.kentaBlogApp.entity.Like;
import com.example.kentaBlogApp.request.LikeCreateRequest;
import com.example.kentaBlogApp.service.LikeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/likes")
public class LikeController {
    private final LikeService likeService;

    public LikeController(LikeService likeService) {
        this.likeService = likeService;
    }

    @GetMapping
    public List<Like> getAllLikes(@RequestParam Optional<Long> postId, @RequestParam Optional<Long> userId){
        return likeService.getAllLikesWithParams(postId,userId);
    }

    @GetMapping("/likeId")
    public  Like getOneLikeById(@PathVariable Long likeId){
        return likeService.getOneLikeById(likeId);
    }

    @PostMapping
    public Like createLike(@RequestBody LikeCreateRequest request){
        return likeService.createLike(request);
    }

    @DeleteMapping("/likeId")
    public void deleteOneLikeById(@PathVariable Long likeId){
        likeService.deleteOneLikeById(likeId);
    }
}
