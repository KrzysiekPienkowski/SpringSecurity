package com.kp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
public class HelloController {

    @GetMapping
    public ResponseEntity<String> sayHallo(){
        return ResponseEntity.ok("Hi there");
    }


    @GetMapping("/bye")
    public ResponseEntity<String> sayBye(){
        return ResponseEntity.ok("Bye");
    }


}
