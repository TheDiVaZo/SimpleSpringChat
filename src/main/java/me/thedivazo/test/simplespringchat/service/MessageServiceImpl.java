package me.thedivazo.test.simplespringchat.service;

import lombok.AllArgsConstructor;
import me.thedivazo.test.simplespringchat.entity.ChatEntity;
import me.thedivazo.test.simplespringchat.entity.MessageEntity;
import me.thedivazo.test.simplespringchat.entity.UserEntity;
import me.thedivazo.test.simplespringchat.exception.ChatNotFoundException;
import me.thedivazo.test.simplespringchat.exception.MessageNotFoundException;
import me.thedivazo.test.simplespringchat.exception.UserNotFoundException;
import me.thedivazo.test.simplespringchat.repository.MessageRepo;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author TheDiVaZo
 * created on 24.01.2024
 */
@Service
@AllArgsConstructor
public class MessageServiceImpl implements MessageService {
    private MessageRepo messageRepo;

    @Override
    public MessageEntity create(MessageEntity message) {
        return messageRepo.save(message);
    }

    @Override
    public MessageEntity findById(long messageId) throws MessageNotFoundException {
        return messageRepo.findById(messageId).orElseThrow(()->new MessageNotFoundException("Сообщение не было найдено"));
    }

    @Override
    public Set<MessageEntity> findAllByChat(long chatId) {
        ChatEntity chatEntity = new ChatEntity();
        chatEntity.setId(chatId);
        return messageRepo.findAllByChatOrderByTimestampDesc(chatEntity);
    }

    @Override
    public Set<MessageEntity> findAllByChatAndUser(long chatId, long userId) {
        ChatEntity chatEntity = new ChatEntity();
        chatEntity.setId(chatId);
        UserEntity userEntity = new UserEntity();
        userEntity.setId(userId);
        return messageRepo.findAllByChatAndUserOrderByTimestampDesc(chatEntity, userEntity);
    }

    @Override
    public void deleteById(long messageId) {
        messageRepo.deleteById(messageId);
    }

    @Override
    public void deleteAllByChat(long chatId) {
        ChatEntity chatEntity = new ChatEntity();
        chatEntity.setId(chatId);
        messageRepo.deleteAllByChat(chatEntity);
    }

    @Override
    public void deleteAllByChatAndUser(long chatId, long userId) {
        ChatEntity chatEntity = new ChatEntity();
        chatEntity.setId(chatId);
        UserEntity userEntity = new UserEntity();
        userEntity.setId(userId);
        messageRepo.deleteAllByChatAndUser(chatEntity, userEntity);
    }

    @Override
    public MessageEntity markAsRemoved(long messageId) throws MessageNotFoundException {
        MessageEntity message = findById(messageId);
        message.setRemoved(true);
        return messageRepo.save(message);
    }

    @Override
    public MessageEntity markAsNotRemoved(long messageId) throws MessageNotFoundException {
        MessageEntity message = findById(messageId);
        message.setRemoved(false);
        return messageRepo.save(message);
    }


}
