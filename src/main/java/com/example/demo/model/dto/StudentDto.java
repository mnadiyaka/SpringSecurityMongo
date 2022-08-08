package com.example.demo.model.dto;

import com.example.demo.model.entity.Gender;
import com.example.demo.model.entity.Student;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.List;

@Data
@Accessors(chain = true)
public class StudentDto {

    private int id;

    private String name;

    private String email;

    private Gender gender;

    private int addressId;

    private List<String> subjects;

    private BigDecimal totalSpent;

    public static StudentDto toDtoStudent(Student student){
        return new StudentDto()
                .setId(student.getId())
                .setName(student.getName())
                .setEmail(student.getEmail())
                .setAddressId(student.getAddress().getId())
                .setGender(student.getGender())
                .setSubjects(student.getSubjects())
                .setTotalSpent(student.getTotalSpent());
    }
}
