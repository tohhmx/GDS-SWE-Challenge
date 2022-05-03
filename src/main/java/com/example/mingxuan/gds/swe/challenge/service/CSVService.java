package com.example.mingxuan.gds.swe.challenge.service;

import java.io.IOException;
import java.util.List;

import com.example.mingxuan.gds.swe.challenge.helper.CSVHelper;
import com.example.mingxuan.gds.swe.challenge.model.User;
import com.example.mingxuan.gds.swe.challenge.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
@Service
public class CSVService {
    @Autowired
    UserRepository repository;
    public void save(MultipartFile file) {
        try {
            List<User> users = CSVHelper.csvToUsers(file.getInputStream());
            repository.saveAll(users);
        } catch (IOException e) {
            throw new RuntimeException("fail to store csv data: " + e.getMessage());
        }
    }
    public List<User> getAllUsers() {
        return repository.findAll();
    }
}
