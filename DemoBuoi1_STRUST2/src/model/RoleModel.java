package model;

import java.util.ArrayList;
import java.util.List;

import entities.Language;
import entities.Role;

public class RoleModel {
	
	public List<Role> findAll() {
		List<Role> roles = new ArrayList<Role>();
		
		roles.add(new Role("r1", "Role 1"));
		roles.add(new Role("r2", "Role 2"));
		roles.add(new Role("r3", "Role 3"));
		roles.add(new Role("r4", "Role 4"));
		
		return roles;
		
	}
	
}
