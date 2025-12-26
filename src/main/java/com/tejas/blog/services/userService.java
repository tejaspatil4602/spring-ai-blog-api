package com.tejas.blog.services;

import java.util.List;


import com.tejas.blogpayLoad.UserDto;

public interface userService {
	
	 UserDto createUser(UserDto user);
	 UserDto updateUser(UserDto update, Integer userId);
	 UserDto getUserById(Integer userId);
	 List<UserDto> getAllUser();
	 void deleteUser(Integer userId);
}
