package com.assum.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assum.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
