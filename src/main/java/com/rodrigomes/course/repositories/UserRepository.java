package com.rodrigomes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigomes.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
