package com.spring.repository;

import java.util.List;

import com.spring.model.Organisation;
import com.spring.model.Role;

public interface IRoleRepo {
	public List<Role> getAll();

	public int addRole(Role rl);

	public Role getRoleById(int id);

	public int deleteRoleByID(int id);

	public int deleteAll();

	public int updateNameById(Role rl);
}
