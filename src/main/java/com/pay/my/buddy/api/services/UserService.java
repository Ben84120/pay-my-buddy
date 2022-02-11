package com.pay.my.buddy.api.services;


import com.pay.my.buddy.api.entity.User;
import com.pay.my.buddy.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;

    public Iterable<User> getUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Integer id) {
        return userRepository.findById(id);
    }

    public Iterable<User> getUserByEmail(String email){
        return userRepository.findUserByEmail(email);
    }

    public Iterable<User> getUserByName(String name){
        return userRepository.findUserByName(name);
    }

    public Iterable<User> getUserByLastName(String lastName){
        return userRepository.findUserByLastName(lastName);
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public void deleteUserById(Integer id){
        userRepository.deleteById(id);
    }

}


