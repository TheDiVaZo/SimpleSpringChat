package me.thedivazo.test.simplespringchat.repository;

import me.thedivazo.test.simplespringchat.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.HashMap;
import java.util.Optional;

/**
 * @author TheDiVaZo
 * created on 23.01.2024
 */
public interface UserRepo extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByEmail(String email);
}
