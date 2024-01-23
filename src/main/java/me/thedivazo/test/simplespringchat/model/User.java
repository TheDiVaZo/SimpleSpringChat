package me.thedivazo.test.simplespringchat.model;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @author TheDiVaZo
 * created on 22.01.2024
 */
@Data
@Builder
public class User {
    private Long id;
    private String name;
    private String email;
    private Date regDate;
    private String password;
}
