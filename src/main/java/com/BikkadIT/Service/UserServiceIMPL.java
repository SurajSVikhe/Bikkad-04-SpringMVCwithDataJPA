package com.BikkadIT.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.Model.User;
import com.BikkadIT.Repository.UserRepository;
@Service
public class UserServiceIMPL implements UserServiceI {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User SaveUser(User user) {
	User user1 = userRepository.save( user);
		return user1;
	}

}
