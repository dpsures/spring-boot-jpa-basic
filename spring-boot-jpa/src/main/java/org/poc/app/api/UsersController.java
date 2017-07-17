package org.poc.app.api;

import java.util.List;

import org.poc.app.pojos.Users;
import org.poc.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class UsersController {

	@Autowired
	private UserService userService;
	
	@GetMapping("users")
	public ResponseEntity<List<Users>> getAllUsers(){
		List<Users> users = userService.getAllUsers();
		return new ResponseEntity<List<Users>>(users, HttpStatus.OK);
	}
}
