package com.test.example.service;

import com.test.example.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User createUser(User user);

}
