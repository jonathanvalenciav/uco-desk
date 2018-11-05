package com.edu.uco.ucodesk.repository;

import org.springframework.stereotype.Repository;

import com.edu.uco.ucodesk.entity.User;

public interface UserRepository {
	public User save(User user);
}
