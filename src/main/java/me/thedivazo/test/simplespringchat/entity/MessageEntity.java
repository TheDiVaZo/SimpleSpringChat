package me.thedivazo.test.simplespringchat.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author TheDiVaZo
 * created on 22.01.2024
 */
@Entity
@Data
@NoArgsConstructor
public class MessageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(optional = false)
    private ChatEntity chat;
    @OneToOne(optional = false)
    private UserEntity user;

    private String text;
    private boolean isRemoved;
    private Date timestamp;
}
