package com.example.demo.service;

import com.example.demo.dto.createUserDTO;
import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserEntity createUser(createUserDTO dto) {
        UserEntity user = new UserEntity();
        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());
        userRepository.save(user);
        return user;
    }

    public ArrayList<UserEntity> getUsers() {
        ArrayList<UserEntity> users = (ArrayList<UserEntity>) userRepository.findAll();
        return users;
    }

    public void deleteUser(createUserDTO dto) {
        List<UserEntity> users = userRepository.findByFirstName(dto.getFirstName());
        userRepository.delete(users.get(0));
    }
}
