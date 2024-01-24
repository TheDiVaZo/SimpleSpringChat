package me.thedivazo.test.simplespringchat.model;

import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;
import me.thedivazo.test.simplespringchat.entity.UserEntity;

import java.util.Date;
import java.util.Set;

/**
 * @author TheDiVaZo
 * created on 22.01.2024
 */
@Data
@Builder
public class Chat {
    private Long id;
    private String name;
    private UserEntity owner;
    private Set<UserEntity> members;
}
