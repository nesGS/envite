package com.nes.envite.service;

import com.nes.envite.entities.User;

import java.util.List;

public interface UserService {

    public List<User> listUsers();

    public UserService saveUser(User user);

    public UserService getUserById(Long id);

    public void deleteUser(Long id);
}
