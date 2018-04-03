package com.therealdanvega.tasks.dao;

import com.therealdanvega.tasks.entity.Task;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Philip Mark Gutierrez
 */
public interface TaskDao extends CrudRepository<Task, Long> {

}
