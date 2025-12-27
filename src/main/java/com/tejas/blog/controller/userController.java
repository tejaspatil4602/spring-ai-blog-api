package com.tejas.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tejas.blog.payload.ApisResponse;
import com.tejas.blog.payload.UserDto;
import com.tejas.blog.payload.apisResponse;
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
	 //Update User
	 @PutMapping("/{userId}")
	 public ResponseEntity<UserDto> updateUser (@RequestBody UserDto userDto ,@PathVariable Integer userId){
		 UserDto updatedUser =this.userService.updateUser(userDto, userId );
		 return ResponseEntity.ok(updatedUser);
	 }
	 
	 //delete User
	 @DeleteMapping("/{userId}")
	 public ResponseEntity<ApisResponse> deleteUser (@PathVariable Integer userId ){
		 this.userService.deleteUser(userId);
		 return new ResponseEntity< ApisResponse>(new ApisResponse("User delete Successfully ", true), HttpStatus.OK);
	 }
	 //getAllUser
	 @GetMapping("/")
	 public ResponseEntity<List<UserDto>> getAllUser(){
		 return ResponseEntity.ok(this.userService.getAllUser());
	 }
	 
	 //getUserById
	 @GetMapping("/{userId}") 
	 public ResponseEntity<UserDto> getBySingleId(@PathVariable Integer userId){
		 return ResponseEntity.ok(this.userService.getUserById(userId));
	 }
	 
	 
	 
	 
	 
	 
	 
	 
}
