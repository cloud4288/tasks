package com.therealdanvega.tasks.service;

import com.therealdanvega.tasks.dao.TaskDao;
import com.therealdanvega.tasks.entity.Task;
import org.springframework.stereotype.Service;

/**
 * @author Philip Mark Gutierrez
 */
@Service
public class TaskServiceImpl implements TaskService {
    private final TaskDao taskDao;

    public TaskServiceImpl(TaskDao taskDao) {
        this.taskDao = taskDao;
    }

    @Override
    public Iterable<Task> list() {
        return taskDao.findAll();
    }
}
