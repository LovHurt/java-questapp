package com.questapp_can.questapp.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.questapp_can.questapp.entities.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

	List<Post> findByUserId(Long userId);
}
