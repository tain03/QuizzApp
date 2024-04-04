package com.example.demo.repository;

import com.example.demo.models.dashboard.LoginModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<LoginModel, Long> {
    LoginModel findByUsername(String username);
}
