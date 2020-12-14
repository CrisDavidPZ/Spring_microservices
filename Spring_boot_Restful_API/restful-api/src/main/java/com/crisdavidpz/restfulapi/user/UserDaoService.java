package com.crisdavidpz.restfulapi.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static int usersCount = 3;
	
	private static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1, "Cris", new Date()));
		users.add(new User(2, "Sol", new Date()));
		users.add(new User(3, "Angélica", new Date()));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User save(User user) {
		if (user.getId() == null) {
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}
	
	public User findOneUser(int id) {
		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}
	
	public User deleteUser(int id) {
		Iterator<User> iterator = users.iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			if (user.getId() == id) {
				 iterator.remove();
				 return user;
			}
		}
		return null;
	}
}
