package com.example.demo.model.entity;

import com.google.common.collect.Sets;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Getter
public enum Role {

    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(Permission.COURSE_READ, Permission.COURSE_WRITE, Permission.STUDENT_READ, Permission.STUDENT_WRITE)),
    ADMINTRAINEE(Sets.newHashSet(Permission.COURSE_READ, Permission.STUDENT_READ));

    private final Set<Permission> permissions;

    public Set<SimpleGrantedAuthority> getGrantedAuthorities() {
        Set<SimpleGrantedAuthority> permissions = getPermissions().stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toSet());
        permissions.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return permissions;
    }
}
