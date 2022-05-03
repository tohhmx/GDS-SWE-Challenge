package com.example.mingxuan.gds.swe.challenge.repository;

import com.example.mingxuan.gds.swe.challenge.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long>{
}
