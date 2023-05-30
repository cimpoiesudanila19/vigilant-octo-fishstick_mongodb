package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private Gender gender;
    private Address address;
    private List<String> favouriteSubject;
    private BigDecimal totalSpentInBooks;
    private LocalDateTime created;

    public Student() {
    }

    public Student(String firstname, String lastname, String email, Gender gender, Address address, List<String> favouriteSubject, BigDecimal totalSpentInBooks, LocalDateTime created) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.favouriteSubject = favouriteSubject;
        this.totalSpentInBooks = totalSpentInBooks;
        this.created = created;
    }
}
