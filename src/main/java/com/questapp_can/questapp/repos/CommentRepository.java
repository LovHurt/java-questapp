package com.questapp_can.questapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.questapp_can.questapp.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
