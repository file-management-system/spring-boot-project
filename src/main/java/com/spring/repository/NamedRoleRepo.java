package com.spring.repository;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.model.Role;
import com.spring.utils.QueryBuilder;

@Repository(value = "NJT2")
public class NamedRoleRepo implements IRoleRepo {
	@Autowired
	NamedParameterJdbcTemplate template;

	@Override
	public List<Role> getAll() {

		return template.query(QueryBuilder.NJTT_GET_ALL, new RoleRowMapper());
	}

	@Override
	public int addRole(Role rl) {

		MapSqlParameterSource source = new MapSqlParameterSource();
		source.addValue("id", rl.getId());
		source.addValue("name", rl.getName());
		source.addValue("code", rl.getCode());

		return template.update(QueryBuilder.NJTT_INSERT, source);
	}

	@Override
	public Role getRoleById(int id) {

		MapSqlParameterSource source = new MapSqlParameterSource();
		source.addValue("id", id);
		return template.queryForObject(QueryBuilder.NJTT_GET_ROLE_BY_ID, source, new RoleRowMapper());

	}

	@Override
	public int deleteRoleByID(int id) {

		MapSqlParameterSource source = new MapSqlParameterSource();
		source.addValue("id", id);
		return template.update(QueryBuilder.NJT_DELETE_ORGANISATION_BY_ID, source);

	}

	@Override
	public int deleteAll() {

		return template.update(QueryBuilder.NJT_DELETE_ALL, new HashMap<>());
	}

	@Override
	public int updateNameById(Role rl) {

		MapSqlParameterSource source = new MapSqlParameterSource();
		source.addValue("id", rl.getId());
		source.addValue("name", rl.getName());
		return template.update(QueryBuilder.NJT_UPDATE_NAME_BY_ID, source);
	}

}
