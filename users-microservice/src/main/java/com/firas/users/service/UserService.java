package com.firas.users.service;

import java.util.List;

import com.firas.users.entities.Role;
import com.firas.users.entities.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	List<User> findAllUsers();

}
