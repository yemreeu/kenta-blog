package com.example.kentaBlogApp.repository;

import com.example.kentaBlogApp.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
