package com.kgisl.sbngproject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgisl.sbngproject.Entity.User;
import com.kgisl.sbngproject.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
 
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
 
    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
