package com.kgisl.sbngproject.Service;

import java.util.List;

import com.kgisl.sbngproject.Entity.User;

public interface UserService {
    List<User> getAllUsers();

    User createUser(User user);

}
