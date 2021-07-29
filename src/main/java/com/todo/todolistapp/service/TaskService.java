package com.todo.todolistapp.service;

import com.todo.todolistapp.model.Task;

import java.util.List;

public interface TaskService {
    Task createTask(Task task);
    List<Task> getTaskList();
    Task getTask(String id);
    void deleteTask(String id);
    Task updateTask(Task task);
}
