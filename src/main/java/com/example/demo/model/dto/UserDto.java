package com.example.demo.model.dto;

import com.example.demo.model.entity.Role;
import com.example.demo.model.entity.User;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.security.core.GrantedAuthority;

import javax.validation.constraints.NotNull;
import java.util.Set;

@Data
@Accessors(chain = true)
public class UserDto {

    private String id;

    @NotNull
    private String username;

    private Set<? extends GrantedAuthority> role;

    public static UserDto fromUser(User user) {
        return new UserDto()
                .setId(user.getId())
                .setUsername(user.getUsername())
                .setRole(user.getRole());
    }
}