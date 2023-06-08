package com.example.kentaBlogApp.repository;

import com.example.kentaBlogApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
