package com.nes.envite.service;

import com.nes.envite.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

    // Listarría el ranking de jugadores
    @Override
    public List<User> listUsers() {
        return List.of();
    }

    @Override
    public UserService saveUser(User user) {
        return null;
    }

    @Override
    public UserService getUserById(Long id) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }
}
