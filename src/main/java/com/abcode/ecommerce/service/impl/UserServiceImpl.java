package com.abcode.ecommerce.service.impl;

import com.abcode.ecommerce.entity.User;
import com.abcode.ecommerce.repository.UserRepository;
import com.abcode.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
