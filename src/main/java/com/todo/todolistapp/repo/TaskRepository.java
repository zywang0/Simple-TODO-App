package com.todo.todolistapp.repo;

import com.todo.todolistapp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TaskRepository extends JpaRepository<Task, String>{
}
