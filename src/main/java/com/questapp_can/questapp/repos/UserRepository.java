package com.questapp_can.questapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.questapp_can.questapp.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
