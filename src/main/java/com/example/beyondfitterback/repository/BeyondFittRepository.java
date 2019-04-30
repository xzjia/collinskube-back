package com.example.beyondfitterback.repository;

import com.example.beyondfitterback.entity.BeyondFitt;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BeyondFittRepository extends CrudRepository<BeyondFitt, Long> {

    List<BeyondFitt> findAll();

}
