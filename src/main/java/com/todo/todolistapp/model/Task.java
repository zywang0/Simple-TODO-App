package com.todo.todolistapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;

    @Column(name = "title", length = 50, nullable = false)
    public String title;

    @Column(name = "description", length = 200, nullable = false)
    private String description;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
