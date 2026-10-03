package com.misho.springBoot_1.controller;

import com.misho.springBoot_1.DTO.RegisterRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping("/register")
    public String userResponse(@RequestBody RegisterRequest registerRequest) {
        return "user response : "+registerRequest.getUsername()+registerRequest.getEmail() ;
    }
}
