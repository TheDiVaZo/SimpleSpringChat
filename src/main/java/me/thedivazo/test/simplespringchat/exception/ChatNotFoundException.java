package me.thedivazo.test.simplespringchat.exception;

/**
 * @author TheDiVaZo
 * created on 23.01.2024
 */
public class ChatNotFoundException extends Exception {
    public ChatNotFoundException(String message) {
        super(message);
    }
}
