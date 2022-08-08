package com.example.demo.controller;

import com.example.demo.model.dto.StudentDto;
import com.example.demo.service.impl.StudentServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("students")
@AllArgsConstructor
public class StudentController {

    private final StudentServiceImpl studentServiceImpl;

    @GetMapping
    public List<StudentDto> getAllStudents(){
        return studentServiceImpl.getAllStudents();
    }
}
