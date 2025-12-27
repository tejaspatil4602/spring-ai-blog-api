package com.tejas.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tejas.blog.payload.UserDto;
import com.tejas.blog.services.UserService;

@RestController
@RequestMapping("/api/user")
public class userController {
	
	 @Autowired
	private UserService userService;
	 
	 // post Create User
	 @PostMapping("/")
	 
	 public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
		 UserDto createUserDto = this.userService.createUser(userDto);
		 return new ResponseEntity<>(createUserDto,HttpStatus.CREATED);
	 }
} 
