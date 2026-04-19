package com.educandoweb.course.services;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuário não encontrado!"));
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
