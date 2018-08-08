package com.spring.repository;

import java.util.List;

import com.spring.model.Organisation;


public interface IOrganisationRepo {
	public List<Organisation> getAll();

	public int addOrganisation(Organisation org);

	public Organisation getOrganisationById(int id);

	public int deleteOrganisationByID(int id);

	public int deleteAll();

	public int updateNameById(Organisation org);
}
