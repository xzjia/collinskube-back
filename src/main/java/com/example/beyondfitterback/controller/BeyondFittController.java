package com.example.beyondfitterback.controller;

import com.example.beyondfitterback.entity.BeyondFitt;
import com.example.beyondfitterback.service.BeyondFittService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@CrossOrigin(exposedHeaders = "Served-By")
public class BeyondFittController {

    private BeyondFittService beyondFittService;

    @Autowired
    public BeyondFittController(BeyondFittService beyondFittService) {
        this.beyondFittService = beyondFittService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/all")
    public List<BeyondFitt> findAll() {
        return beyondFittService.findAll();
    }

}
