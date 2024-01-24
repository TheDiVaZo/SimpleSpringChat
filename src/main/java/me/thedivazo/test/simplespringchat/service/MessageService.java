package me.thedivazo.test.simplespringchat.service;

import me.thedivazo.test.simplespringchat.entity.MessageEntity;
import me.thedivazo.test.simplespringchat.exception.ChatNotFoundException;
import me.thedivazo.test.simplespringchat.exception.MessageNotFoundException;
import me.thedivazo.test.simplespringchat.exception.UserNotFoundException;
import me.thedivazo.test.simplespringchat.model.Message;

import java.util.List;
import java.util.Set;
import java.util.SortedSet;

/**
 * @author TheDiVaZo
 * created on 23.01.2024
 */
public interface MessageService {
    MessageEntity create(MessageEntity message);
    MessageEntity findById(long messageId) throws MessageNotFoundException;
    Set<MessageEntity> findAllByChat(long chatId);
    Set<MessageEntity> findAllByChatAndUser(long chatId, long userId);

    void deleteById(long messageId);
    void deleteAllByChat(long chatId);
    void deleteAllByChatAndUser(long chatId, long userId);

    MessageEntity markAsRemoved(long messageId) throws MessageNotFoundException;
    MessageEntity markAsNotRemoved(long messageId) throws MessageNotFoundException;
}
