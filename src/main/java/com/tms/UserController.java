package com.tms;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tms.model.User;
import com.tms.respository.UserRepository;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	@PostMapping
	public ResponseEntity<?> createUser(@RequestBody User user){
		
		 userRepo.save(user);
		
		 return new ResponseEntity<String>("User saved successfully!!", HttpStatus.OK);
		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> getuser(@PathVariable Long id){
		Optional<User> persistedObj = userRepo.findById(id);
		
		return new ResponseEntity<User>(persistedObj.orElseThrow(),HttpStatus.OK);
	}

}
