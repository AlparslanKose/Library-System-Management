package com.example.alpbaba.services;

import com.example.alpbaba.dao.UserDAO;
import com.example.alpbaba.models.User;
import com.example.alpbaba.dao.UserDAO;
import com.example.alpbaba.models.User;

public class UserService {
    private UserDAO userDAO;

    public UserService() {
        this.userDAO = new UserDAO();
    }

    public User authenticateUser(String username, String password) {
        User user = userDAO.getUserByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    // Add other business logic as needed
}
