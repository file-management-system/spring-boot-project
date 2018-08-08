package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Role;
import com.spring.repository.IRoleRepo;

@RestController
@RequestMapping("/rl")
public class RoleController {

	@Autowired
	@Qualifier(value = "NJT2")
	IRoleRepo repo;

	@GetMapping("/data")
	public List<Role> displayAll() {
		return repo.getAll();
	}

	@PostMapping("/")
	public int createRole(@RequestBody Role rl) {

		return repo.addRole(rl);

	}

	@GetMapping("/{id}")
	public Role getRoleById(@PathVariable("id") int id) {
		return repo.getRoleById(id);
	}

	@DeleteMapping("/{id}")
	public int deleteRoleById(@PathVariable("id") int id) {
		return repo.deleteRoleByID(id);
	}

	@DeleteMapping
	public int deleteAll() {
		return repo.deleteAll();
	}

	@PutMapping("/{id}")
	public int updateRolePasswordById(@PathVariable("id") int id, @RequestBody Role rl) {
		rl.setId(id);
		return repo.updateNameById(rl);

	}
}

