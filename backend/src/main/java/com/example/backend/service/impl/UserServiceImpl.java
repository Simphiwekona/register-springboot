package com.example.backend.service.impl;

import com.example.backend.dto.UserDto;
import com.example.backend.entity.User;
import com.example.backend.repository.UserRepo;
import com.example.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder password;

    @Override
    public int addUser(UserDto userDto){


        User user = new User(
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmail(),

                this.password.encode(userDto.getPassword())

        );
        User savedUser = userRepo.save(user);
        return savedUser.getId();
    }

}
