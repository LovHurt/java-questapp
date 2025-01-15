package com.questapp_can.questapp.responses;

import java.util.List;

import com.questapp_can.questapp.entities.Like;
import com.questapp_can.questapp.entities.Post;

import lombok.Data;

@Data
public class PostResponse {

	Long id;
	Long userId;
	String userName;
	String text;
	String title;
	List<LikeResponse> postLikes;

	public PostResponse(Post entity, List<LikeResponse> likes) {
		this.id = entity.getId();
		this.userId = entity.getUser().getId();
		this.userName = entity.getTitle();
		this.text = entity.getText();
		this.title = entity.getTitle();
		this.postLikes = likes;
	}
}
