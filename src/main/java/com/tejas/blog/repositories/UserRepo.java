package com.tejas.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tejas.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
