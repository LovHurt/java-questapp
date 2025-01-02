package com.questapp_can.questapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.questapp_can.questapp.entities.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
