package com.spring.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.model.Organisation;

public class OrganisationRowMapper implements RowMapper<Organisation> {

	@Override
	public Organisation mapRow(ResultSet rs, int rowNum) throws SQLException {

		Organisation org = new Organisation();
		org.setId(rs.getInt("ID"));
		org.setName(rs.getString("NAME"));
		org.setCode((rs.getString("code")));

		return org;
	}

}
