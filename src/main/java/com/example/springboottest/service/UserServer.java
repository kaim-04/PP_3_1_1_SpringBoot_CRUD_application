package com.example.springboottest.service;

import com.example.springboottest.model.User;

import java.util.List;

public interface UserServer {
    User findById(long id);
    List<User> findAll();
    User saveUser(User user);
    void deleteById(Long id);
}
