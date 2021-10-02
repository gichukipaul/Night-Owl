package dev.gichukipaul.nightowl.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/api/v1/status")
    public String main(){
        return "Its working";
    }

}