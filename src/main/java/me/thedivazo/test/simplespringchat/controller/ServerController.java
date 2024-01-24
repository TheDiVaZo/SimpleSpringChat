package me.thedivazo.test.simplespringchat.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TheDiVaZo
 * created on 24.01.2024
 */
@RestController
@RequestMapping("/server")
public class ServerController {

    @GetMapping
    public ResponseEntity<String> ping() {
        try {
            return ResponseEntity.ok("Сервер работает");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
