package com.example.demo.service;

import com.example.demo.model.dto.NewUserDto;
import com.example.demo.model.dto.UserDto;
import com.example.demo.model.entity.User;

public interface UserService {

    User getUserById(String id);

    void createUser(NewUserDto userDto);

    User updateUser(UserDto userDto);

    void deleteUser(int id);
}
