package me.thedivazo.test.simplespringchat.service;

import me.thedivazo.test.simplespringchat.entity.ChatEntity;
import me.thedivazo.test.simplespringchat.exception.ChatNotFoundException;

import java.util.Set;

/**
 * @author TheDiVaZo
 * created on 23.01.2024
 */
public interface ChatService {
    ChatEntity create(ChatEntity chatEntity);
    ChatEntity findById(long chatId) throws ChatNotFoundException;

    Set<ChatEntity> findByOwner(long ownerId);
    Set<ChatEntity> findByMember(long memberId);
    void deleteById(long chatId);
}
