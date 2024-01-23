package me.thedivazo.test.simplespringchat.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @author TheDiVaZo
 * created on 22.01.2024
 */
@Data
@Builder
public class Chat {
    private Long id;
    private String name;
}
