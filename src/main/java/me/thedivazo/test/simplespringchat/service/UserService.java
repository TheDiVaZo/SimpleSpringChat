package me.thedivazo.test.simplespringchat.service;

import me.thedivazo.test.simplespringchat.entity.UserEntity;
import me.thedivazo.test.simplespringchat.exception.UserNotFoundException;

/**
 * @author TheDiVaZo
 * created on 23.01.2024
 */
public interface UserService {
    UserEntity create(UserEntity user);
    UserEntity findById(long userId) throws UserNotFoundException;
    UserEntity findByEmail(String email) throws UserNotFoundException;
}
