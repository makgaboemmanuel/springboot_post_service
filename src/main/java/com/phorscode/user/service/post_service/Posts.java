package com.phorscode.user.service.post_service;

public class Posts {
    private String postId;
    private String description;

    public Posts(String postId, String description) {
        this.postId = postId;
        this.description = description;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPostId() {
        return postId;
    }

    public String getDescription() {
        return description;
    }
}
