package com.guiestephano.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guiestephano.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
