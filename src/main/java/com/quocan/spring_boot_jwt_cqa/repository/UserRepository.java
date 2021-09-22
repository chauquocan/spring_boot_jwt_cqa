package com.quocan.spring_boot_jwt_cqa.repository;

import com.quocan.spring_boot_jwt_cqa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);

}
