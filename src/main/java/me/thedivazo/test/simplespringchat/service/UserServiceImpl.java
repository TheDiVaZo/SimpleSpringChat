package me.thedivazo.test.simplespringchat.service;

import lombok.AllArgsConstructor;
import me.thedivazo.test.simplespringchat.entity.UserEntity;
import me.thedivazo.test.simplespringchat.exception.UserNotFoundException;
import me.thedivazo.test.simplespringchat.repository.UserRepo;
import org.springframework.stereotype.Service;

/**
 * @author TheDiVaZo
 * created on 24.01.2024
 */
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepo userRepo;

    @Override
    public UserEntity create(UserEntity user) {
        return userRepo.save(user);
    }

    @Override
    public UserEntity findById(long userId) throws UserNotFoundException {
        return userRepo.findById(userId).orElseThrow(()->new UserNotFoundException("Пользователь не был найден"));
    }

    @Override
    public UserEntity findByEmail(String email) throws UserNotFoundException {
        return userRepo.findByEmail(email).orElseThrow(()->new UserNotFoundException("Пользователь не был найден"));
    }
}
