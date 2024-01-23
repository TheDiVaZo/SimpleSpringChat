package me.thedivazo.test.simplespringchat.model;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Builder;
import lombok.Data;
import me.thedivazo.test.simplespringchat.entity.ChatEntity;
import me.thedivazo.test.simplespringchat.entity.UserEntity;

import java.util.Date;

/**
 * @author TheDiVaZo
 * created on 22.01.2024
 */
@Data
@Builder
public class Message {
    private Long id;
    private ChatEntity chat;
    private UserEntity user;

    private String text;
    private boolean isRemoved;
    private Date timestamp;
}
