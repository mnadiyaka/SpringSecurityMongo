package com.example.demo.service.impl;

import com.example.demo.model.dto.StudentDto;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    @Override
    public List<StudentDto> getAllStudents(){
        return studentRepository.findAll().stream().map(StudentDto::toDtoStudent).collect(Collectors.toList());
    }
}
