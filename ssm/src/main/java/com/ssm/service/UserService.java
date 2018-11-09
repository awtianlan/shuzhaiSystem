package com.ssm.service;

import com.ssm.model.User;

import java.util.List;

public interface UserService {
    public User getUserByName(String name);
    public User getUserById(int id);
    public void addUser(User user);
    public void updateUser(User user);
    public List<User> getAll();
   // public int getUserId(String name);
}
