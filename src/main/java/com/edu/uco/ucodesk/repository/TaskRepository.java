package com.edu.uco.ucodesk.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.edu.uco.ucodesk.entity.Task;
import com.edu.uco.ucodesk.entity.User;

public interface TaskRepository {
	public Task save(Task task);
	public Task delete(Task task);
	public void update(Task task);
	public List<Task> findAll();
	public List<Task> findByAttendant(User attendant);
}
