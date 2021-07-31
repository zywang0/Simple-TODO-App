package com.todo.todolistapp.service;

import com.todo.todolistapp.model.User;
import com.todo.todolistapp.repo.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user){
        return userRepository.save(user);
    }

    public List<User> getUser(){
        return userRepository.findAll();
    }

    public void deleteUser(Long id){
        userRepository.delete(userRepository.getById(id));
    }
}
