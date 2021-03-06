package com.spring.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.model.User;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {

		User user = new User();
		user.setUserId(rs.getInt("USER_ID"));
		user.setEmail(rs.getString("EMAIL"));
		user.setPassword((rs.getString("PASSWORD")));

		return user;
	}

}
