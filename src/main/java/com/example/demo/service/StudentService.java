package com.example.demo.service;

import com.example.demo.model.dto.StudentDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {

    List<StudentDto> getAllStudents();
}
