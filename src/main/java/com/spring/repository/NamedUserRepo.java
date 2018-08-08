package com.spring.repository;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.model.User;
import com.spring.utils.QueryBuilder;

@Repository(value = "NJT")
public class NamedUserRepo implements IUserRepo {
	@Autowired
	NamedParameterJdbcTemplate template;

	@Override
	public List<User> getAll() {

		return template.query(QueryBuilder.NJ_GET_ALL, new UserRowMapper());
	}

	@Override
	public int addUser(User user) {

		MapSqlParameterSource source = new MapSqlParameterSource();
		source.addValue("userid", user.getUserId());
		source.addValue("email", user.getEmail());
		source.addValue("password", user.getPassword());

		return template.update(QueryBuilder.NJ_INSERT, source);
	}

	@Override
	public User getUserById(int id) {

		MapSqlParameterSource source = new MapSqlParameterSource();
		source.addValue("id", id);
		return template.queryForObject(QueryBuilder.NJ_GET_USER_BY_ID, source, new UserRowMapper());

	}

	@Override
	public int deleteUserByID(int id) {

		MapSqlParameterSource source = new MapSqlParameterSource();
		source.addValue("id", id);
		return template.update(QueryBuilder.NJ_DELETE_USER_BY_ID, source);

	}

	@Override
	public int deleteAll() {

		return template.update(QueryBuilder.NJ_DELETE_ALL, new HashMap<>());
	}

	@Override
	public int updateUserPasswordById(User user) {

		MapSqlParameterSource source = new MapSqlParameterSource();
		source.addValue("id", user.getUserId());
		source.addValue("password", user.getPassword());
		return template.update(QueryBuilder.NJ_UPDATE_PASSWORD_BY_ID, source);
	}

}
