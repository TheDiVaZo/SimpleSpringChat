package me.thedivazo.test.simplespringchat.exception;

/**
 * @author TheDiVaZo
 * created on 24.01.2024
 */
public class MessageNotFoundException extends Exception {
    public MessageNotFoundException(String message) {
        super(message);
    }
}
