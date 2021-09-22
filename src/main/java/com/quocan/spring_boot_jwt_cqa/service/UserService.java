package com.quocan.spring_boot_jwt_cqa.service;

import com.quocan.spring_boot_jwt_cqa.authen.UserPrincipal;
import com.quocan.spring_boot_jwt_cqa.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
