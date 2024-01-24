package me.thedivazo.test.simplespringchat.service;

import lombok.AllArgsConstructor;
import me.thedivazo.test.simplespringchat.entity.ChatEntity;
import me.thedivazo.test.simplespringchat.entity.UserEntity;
import me.thedivazo.test.simplespringchat.exception.ChatNotFoundException;
import me.thedivazo.test.simplespringchat.exception.UserNotFoundException;
import me.thedivazo.test.simplespringchat.repository.ChatRepo;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author TheDiVaZo
 * created on 23.01.2024
 */
@Service
@AllArgsConstructor
public class ChatServiceImpl implements ChatService {
    private ChatRepo chatRepo;
    private UserService userService;

    @Override
    public ChatEntity create(ChatEntity chatEntity) {
        return chatRepo.save(chatEntity);
    }

    @Override
    public ChatEntity findById(long chatId) throws ChatNotFoundException {
        return chatRepo.findById(chatId).orElseThrow(()->new ChatNotFoundException("Чат с id "+chatId+" не был найден"));
    }

    @Override
    public Set<ChatEntity> findByOwner(long ownerId) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(ownerId);
        return chatRepo.findChatEntitiesByOwner(userEntity);
    }

    @Override
    public Set<ChatEntity> findByMember(long memberId) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(memberId);
        return chatRepo.findChatEntitiesByUsersContains(userEntity);
    }

    @Override
    public void deleteById(long chatId) {
        chatRepo.deleteById(chatId);
    }
}
