package com.edu.uco.ucodesk.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PROJECT")
public class Project implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column (name = "ID_PROJECT", nullable = false)
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer idProject;
	
	@Column (name = "NAME", nullable = false)
	private String name;
	
	@Column (name = "DESCRIPTION", nullable = true)
	private String description;
	
	@OneToMany
	@Column (name = "LEADER", nullable = true)
	private User leader;
	
	@ManyToOne
	@Column (name = "TASK", nullable = true)
	private Task task;
	
	public Project() {
		super();
	}
	
	public Project(Integer idProject, String name, String description, User leader, Task task) {
		super();
		this.idProject = idProject;
		this.name = name;
		this.description = description;
		this.leader = leader;
		this.task = task;
	}
	
	public Integer getId() {
		return idProject;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getLeader() {
		return leader;
	}

	public void setLeader(User leader) {
		this.leader = leader;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}	
}
