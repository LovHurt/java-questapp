package com.questapp_can.questapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.questapp_can.questapp.entities.Like;

public interface LikeRepository extends JpaRepository<Like, Long> {

}
