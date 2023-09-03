package com.user.usermanagement.entity;

//import jakarta.persistence.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long userId;
    private String name;
    private String email;
    private String password;
//    private boolean enabled;
//    private String role;

//    @OneToMany(mappedBy = "user")
//    private List<Contact> contacts = new ArrayList<>();

    public User(Long userId, String name, String email, String password) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

//    public User(Long userId, String name, String email, String password, boolean enabled, String role) {
//        this.userId = userId;
//        this.name = name;
//        this.email = email;
//        this.password = password;
//        this.enabled = enabled;
//        this.role = role;
//    }

//    public boolean isEnabled() {
//        return enabled;
//    }
//
//    public void setEnabled(boolean enabled) {
//        this.enabled = enabled;
//    }
//
//    public String getRole() {
//        return role;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
    //}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password +
                '}';
    }

    public User() {
    }

}
