package com.therealdanvega.tasks.rest;

import com.therealdanvega.tasks.entity.Task;
import com.therealdanvega.tasks.service.TaskService;
import org.springframework.web.bind.annotation.*;

/**
 * @author Philip Mark Gutierrez
 */
@RestController
@RequestMapping("/api/tasks")
public class TaskRest {
    private final TaskService taskService;

    public TaskRest(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public Iterable<Task> list() {
        return taskService.list();
    }

    @PutMapping
    public Task saveTask(@RequestBody Task task) {
        return taskService.save(task);
    }

    @PostMapping
    public Task addTask(@RequestBody Task task) {
        return taskService.update(task);
    }
}
