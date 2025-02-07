package io.redbee.socialnetwork.feeds.postLikes.model;

import io.redbee.socialnetwork.feeds.postLikes.builder.PostLikeBuilder;

import java.util.Objects;

public class PostLike {
    private final Integer postId;
    private final Integer userId;

    public PostLike(Integer postId, Integer userId) {
        this.postId = postId;
        this.userId = userId;
    }

    public Integer getPostId() {
        return postId;
    }

    public Integer getUserId() {
        return userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostLike postLike = (PostLike) o;
        return Objects.equals(postId, postLike.postId) && Objects.equals(userId, postLike.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postId, userId);
    }

    @Override
    public String toString() {
        return "PostLike{" +
                "postId=" + postId +
                ", userId=" + userId +
                '}';
    }

    public PostLike copyPostId(Integer post_id){
        return new PostLikeBuilder()
                .basedOn(this)
                .post_id(postId)
                .build();
    }

    public PostLike copyUserId(Integer user_id){
        return new PostLikeBuilder()
                .basedOn(this)
                .post_id(user_id)
                .build();
    }
}
