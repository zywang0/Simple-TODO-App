package com.todo.todolistapp.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="username", length=25)
    private String username;

    @Column(name="password", length=25)
    private String password;

    @Column(name="email", length=64)
    private String email;
}
