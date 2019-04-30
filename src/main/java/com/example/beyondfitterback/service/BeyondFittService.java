package com.example.beyondfitterback.service;

import com.example.beyondfitterback.entity.BeyondFitt;
import com.example.beyondfitterback.repository.BeyondFittRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeyondFittService {

    private BeyondFittRepository beyondFittRepository;

    @Autowired
    public BeyondFittService(BeyondFittRepository beyondFittRepository) {
        this.beyondFittRepository = beyondFittRepository;
    }

    public List<BeyondFitt> findAll() {
        return beyondFittRepository.findAll();
    }

}
