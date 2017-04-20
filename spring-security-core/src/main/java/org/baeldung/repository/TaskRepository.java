package org.nklkarthi.repository;

import org.nklkarthi.entity.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {

}
