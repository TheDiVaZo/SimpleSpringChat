package me.thedivazo.test.simplespringchat.exception;

/**
 * @author TheDiVaZo
 * created on 24.01.2024
 */
public class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
    }
}
