package com.spring.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.model.Role;

public class RoleRowMapper implements RowMapper<Role> {

	@Override
	public Role mapRow(ResultSet rs, int rowNum) throws SQLException {

		Role rl = new Role();
		rl.setId(rs.getInt("ID"));
		rl.setName(rs.getString("NAME"));
		rl.setCode((rs.getString("code")));

		return rl;
	}

}
