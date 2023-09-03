//package com.user.usermanagement.entity;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "contact")
//public class Contact {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String name;
//    private String work;
//    private String email;
//
//    private String number;
//
//    @ManyToOne
//    private User user;
//
//    public Contact(Long id, String name, String work, String email, String number, User user) {
//        this.id = id;
//        this.name = name;
//        this.work = work;
//        this.email = email;
//        this.number = number;
//        this.user = user;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getWork() {
//        return work;
//    }
//
//    public void setWork(String work) {
//        this.work = work;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getNumber() {
//        return number;
//    }
//
//    public void setNumber(String number) {
//        this.number = number;
//    }
//
//    @Override
//    public String toString() {
//        return "Contact{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", work='" + work + '\'' +
//                ", email='" + email + '\'' +
//                ", number='" + number + '\'' +
//                '}';
//    }
//
//    public Contact() {
//    }
//}
