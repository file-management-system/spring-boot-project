package com.spring.repository;

import java.util.List;

import com.spring.model.User;

public interface IUserRepo {
	public List<User> getAll();

	public int addUser(User user);

	public User getUserById(int id);

	public int deleteUserByID(int id);

	public int deleteAll();

	public int updateUserPasswordById(User user);
}



