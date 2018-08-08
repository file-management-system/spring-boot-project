package com.spring.repository;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.model.Organisation;

import com.spring.utils.QueryBuilder;

@Repository(value = "NJT1")
public class NamedOrganisationRepo implements IOrganisationRepo {
	@Autowired
	NamedParameterJdbcTemplate template;

	@Override
	public List<Organisation> getAll() {

		return template.query(QueryBuilder.NJT_GET_ALL, new OrganisationRowMapper());
	}

	@Override
	public int addOrganisation(Organisation org) {

		MapSqlParameterSource source = new MapSqlParameterSource();
		source.addValue("id", org.getId());
		source.addValue("name", org.getName());
		source.addValue("code", org.getCode());

		return template.update(QueryBuilder.NJT_INSERT, source);
	}

	@Override
	public Organisation getOrganisationById(int id) {

		MapSqlParameterSource source = new MapSqlParameterSource();
		source.addValue("id", id);
		return template.queryForObject(QueryBuilder.NJT_GET_ORGANISATION_BY_ID, source, new OrganisationRowMapper());

	}

	@Override
	public int deleteOrganisationByID(int id) {

		MapSqlParameterSource source = new MapSqlParameterSource();
		source.addValue("id", id);
		return template.update(QueryBuilder.NJT_DELETE_ORGANISATION_BY_ID, source);

	}

	@Override
	public int deleteAll() {

		return template.update(QueryBuilder.NJT_DELETE_ALL, new HashMap<>());
	}

	@Override
	public int updateNameById(Organisation org) {

		MapSqlParameterSource source = new MapSqlParameterSource();
		source.addValue("id", org.getId());
		source.addValue("name", org.getName());
		return template.update(QueryBuilder.NJT_UPDATE_NAME_BY_ID, source);
	}

}
