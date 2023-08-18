package com.example.demo.service.impl;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.api.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private UserRepository userRepository;

    @Override
    public User getUserDetails(Long id) {
        return userRepository.findById(id).get();
    }
}
