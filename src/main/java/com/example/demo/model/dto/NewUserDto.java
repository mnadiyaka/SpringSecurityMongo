package com.example.demo.model.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Setter
@Getter
public class NewUserDto {

    @NotNull
    private String username;

    @NotNull
    private String password;
}