package com.todo.todolistapp.service;

import com.todo.todolistapp.model.Task;
import com.todo.todolistapp.repo.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public List<Task> getTaskList() {
        return taskRepository.findAll();
    }

    @Override
    public Task getTask(String id) {
        Optional<Task> task = taskRepository.findById(id);
        return task.orElse(null);
    }

    @Override
    public void deleteTask(String id) {
        boolean deleted = false;
        Optional<Task> task = taskRepository.findById(id);
        if (task.isPresent()){
            taskRepository.delete(taskRepository.getById(id));
            deleted = true;
        }
    }

    @Override
    public Task updateTask(Task task) {
        String taskId = task.getId();
        Optional<Task> savedTask = taskRepository.findById(taskId);
        task.setId(savedTask.get().getId());
        task.setTitle(savedTask.get().getTitle());
        task.setDescription(savedTask.get().getDescription());
        return taskRepository.save(task);
    }
}
