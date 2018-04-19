package com.therealdanvega.tasks.controller;

import com.therealdanvega.tasks.entity.Task;
import com.therealdanvega.tasks.service.TaskService;
import org.springframework.web.bind.annotation.*;

/**
 * @author Philip Mark Gutierrez
 */
@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = {"", "/"})
    public Iterable<Task> list() {
        return taskService.list();
    }

    @PostMapping("/save")
    public Task saveTask(@RequestBody Task task) {
        return taskService.save(task);
    }
}
