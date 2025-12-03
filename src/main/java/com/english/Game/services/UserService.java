package com.english.Game.services;

import com.english.Game.dtos.UserDTO;
import com.english.Game.entities.UserEntity;
import com.english.Game.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserEntity createUser(UserDTO userDTO) {

        Optional<UserEntity> existing = userRepository.findByUserName(userDTO.getUserName());
        if (existing.isPresent()) {
            return existing.get();
        }

        UserEntity user = new UserEntity();
        user.setUserName(userDTO.getUserName());
        user.setCreatedAt(LocalDateTime.now());

        return userRepository.save(user);
    }

    public List<UserEntity> listUsers() {
        return userRepository.findAll();
    }
}
