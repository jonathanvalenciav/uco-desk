package com.edu.uco.ucodesk.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TASK")
public class Task implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name = "ID_TASK", nullable = false)
	private Long idTask;

	@Column (name = "DESCRIPTION", nullable = true)
	private String description;
	
	@Column (name = "EXPIRATION_DATE", nullable = false)
	private Date expirationDate;
	
	@Column (name = "TASK_PROGRESS", nullable = false)
	private double progress;
	
	@Column (name = "PRIORITY", nullable = true)
	private int priority;

	@ManyToOne
	@JoinColumn(name = "ID_USER", nullable = true)
	private User attendant;
	
	public Task() {
		super();
	}	

	public Task(Long idTask, String description, Date expirationDate, double progress, User attendant, int priority) {
		super();
		this.idTask = idTask;
		this.description = description;
		this.expirationDate = expirationDate;
		this.progress = progress;
		this.attendant = attendant;
		this.priority = priority;
	}
	
	public Long getId() {
		return idTask;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setProgress(double progress) {
		this.progress = progress;
	}

	public double getProgress() {
		return progress;
	}

	public void setAttendant(User attendant) {
		this.attendant = attendant;
	}

	public User getAttendant() {
		return attendant;
	}
	
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public int getPriority() {
		return priority;
	}
}
