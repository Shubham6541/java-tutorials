package org.nklkarthi.service;

import org.nklkarthi.entity.Task;
import org.nklkarthi.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreFilter;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @PostFilter("hasRole('MANAGER') or filterObject.assignee == authentication.name")
    public Iterable<Task> findAll() {
        return taskRepository.findAll();
    }

    @PreFilter("hasRole('MANAGER') or filterObject.assignee == authentication.name")
    public Iterable<Task> save(Iterable<Task> entities) {
        return taskRepository.save(entities);
    }

}
