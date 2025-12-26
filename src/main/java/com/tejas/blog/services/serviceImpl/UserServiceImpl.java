package com.tejas.blog.services.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tejas.blog.entities.User;
import com.tejas.blog.repositories.UserRepo;
import com.tejas.blog.services.userService;
import com.tejas.blogpayLoad.UserDto;

public class UserServiceImpl implements userService {

	@Autowired
	private UserRepo userRepo;
	@Override
	public UserDto createUser(UserDto user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto updateUser(UserDto update, Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto getUserById(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Integer userId) {
		// TODO Auto-generated method stub

	}
	public User dtoToUser(UserDto userDto) {
		User user = new User();
		user.setId(userDto.getUserId());
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setAbout(userDto.getAbout());
		user.setPassword(userDto.getPassword());
		return user;
		}
	public UserDto userToDto(User user) {
		UserDto userDto= new UserDto();
		UserDto.setId(user.getUserId());
		UserDto.setName(user.getName());
		UserDto.setEmail(user.getEmail());
		UserDto.setAbout(user.getAbout());
		UserDto.setPassword(user.getPassword());
		return userDto;
	}

}
