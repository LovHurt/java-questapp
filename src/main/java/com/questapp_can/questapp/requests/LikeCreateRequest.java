package com.questapp_can.questapp.requests;

import lombok.Data;

@Data
public class LikeCreateRequest {
	
	Long id;
	Long userId;
	Long postId;
	
}
