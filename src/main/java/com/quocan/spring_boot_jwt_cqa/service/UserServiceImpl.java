package com.quocan.spring_boot_jwt_cqa.service;

import com.quocan.spring_boot_jwt_cqa.authen.UserPrincipal;
import com.quocan.spring_boot_jwt_cqa.entity.User;
import com.quocan.spring_boot_jwt_cqa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public User createUser(User user) {
        return repository.saveAndFlush(user);
    }

    @Override
    public UserPrincipal findByUsername(String username) {
        return null;
    }
}
