package com.edu.uco.ucodesk.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.edu.uco.ucodesk.entity.Project;
import com.edu.uco.ucodesk.entity.User;

@Repository
public interface ProjectRepository {
	public Project save(Project project);
	public Project delete(Project project);
	public void update(Project project);
	public List<Project> findAll();
	public List<Project> findByLeader(User leader);
}
