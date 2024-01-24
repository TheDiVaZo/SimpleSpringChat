package me.thedivazo.test.simplespringchat.repository;

import me.thedivazo.test.simplespringchat.entity.ChatEntity;
import me.thedivazo.test.simplespringchat.entity.MessageEntity;
import me.thedivazo.test.simplespringchat.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.SortedSet;

/**
 * @author TheDiVaZo
 * created on 23.01.2024
 */
public interface MessageRepo extends JpaRepository<MessageEntity, Long> {
    SortedSet<MessageEntity> findAllByChatOrderByTimestampDesc(ChatEntity chat);
    SortedSet<MessageEntity> findAllByChatAndUserOrderByTimestampDesc(ChatEntity chat, UserEntity user);
    void deleteAllByChat(ChatEntity chat);
    void deleteAllByChatAndUser(ChatEntity chat, UserEntity user);
}
