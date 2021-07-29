package com.todo.todolistapp.controller;

import com.todo.todolistapp.model.Task;
import com.todo.todolistapp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Access;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public Task createTask(@RequestBody Task task){
        return taskService.createTask(task);
    }

    @GetMapping
    public List<Task> getTaskList(){
        return taskService.getTaskList();
    }

    @GetMapping("/{id}")
    public Task getTask(@PathVariable String id){
        return taskService.getTask(id);
    }

    @PutMapping("/{id}")
    public Task update(@PathVariable String id, @RequestBody Task updatedTask) {
        return taskService.updateTask(updatedTask);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        taskService.deleteTask(id);
    }
}
