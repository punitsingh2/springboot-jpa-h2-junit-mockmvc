package com.tms.service;

import java.text.MessageFormat;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tms.exception.BadRequestInputException;
import com.tms.exception.UserCustomeException;
import com.tms.message.ERROR;
import com.tms.model.User;
import com.tms.respository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public User createUser(User user) {
		
		if(!user.getUserName().contains("@")) {
			throw new UserCustomeException(ERROR.USER_NAME_INCORRECT.getCode(), MessageFormat.format(ERROR.USER_NAME_INCORRECT.getErrorMessage(), user.getUserName()));
		}
		
		return userRepo.save(user);
		
	}
	
	public User getUser(long id) {
			Optional<User> user = userRepo.findById(id);
			
			return user.orElseThrow(() ->
			new BadRequestInputException(ERROR.USER_NOT_FOUND.getCode(),MessageFormat.format(ERROR.USER_NOT_FOUND.getErrorMessage(), Long.toString(id)))
					);

	}

}
