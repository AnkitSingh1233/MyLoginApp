package com.Curd.Operation.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpServerErrorException.InternalServerError;



//@CrossOrigin("*")

//@CrossOrigin("http://localhost:4200")
@CrossOrigin
@RestController
@RequestMapping("/user")

public class UserControllers {

	
	  @Autowired
	  private UserRepo repo;
	  
	  @PostMapping("/login")
	  public ResponseEntity<?> loginUser(@RequestBody User userData){
		  
		  System.out.println(userData);
		  
		  User user=repo.findByUserId(userData.getUserId());
		  
		 if(user.getPassword().equals(userData.getPassword()))
			  
			 return ResponseEntity.ok(user);
		 
		    return (ResponseEntity<?>) ResponseEntity.internalServerError();
		 
		  
	  }
	
}
