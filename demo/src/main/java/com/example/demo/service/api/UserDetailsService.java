package com.example.demo.service.api;


import com.example.demo.domain.User;

public interface UserDetailsService {

    User getUserDetails(Long id);
}
