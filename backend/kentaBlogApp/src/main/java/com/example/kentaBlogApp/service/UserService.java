package com.example.kentaBlogApp.service;

import com.example.kentaBlogApp.entity.User;
import com.example.kentaBlogApp.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createUser(User newUser) {
        return userRepository.save(newUser);
    }

    public User UpdateOneUser(Long userId,User newUser) {
        Optional<User> user = userRepository.findById(userId);
        if (user.isPresent()){
            User foundUser = user.get();
            foundUser.setName(newUser.getName());
            foundUser.setPassword(newUser.getPassword());
            userRepository.save(foundUser);
            return foundUser;
        }
        else
            return null;
    }

    public User getOneUser(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }
    public void deleteById(Long userId) {
        userRepository.deleteById(userId);
    }
}

