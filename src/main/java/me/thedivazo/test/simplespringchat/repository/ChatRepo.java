package me.thedivazo.test.simplespringchat.repository;

import me.thedivazo.test.simplespringchat.entity.ChatEntity;
import me.thedivazo.test.simplespringchat.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

/**
 * @author TheDiVaZo
 * created on 23.01.2024
 */
public interface ChatRepo extends JpaRepository<ChatEntity, Long> {
    Set<ChatEntity> findChatEntitiesByOwner(UserEntity owner);
    Set<ChatEntity> findChatEntitiesByUsersContains(UserEntity user);

}
