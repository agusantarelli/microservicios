package io.redbee.socialnetwork.feeds.postLikes.builder;

import io.redbee.socialnetwork.feeds.postLikes.model.PostLike;

public class PostLikeBuilder {
    private Integer postId;
    private Integer userId;

    public PostLikeBuilder post_id(Integer postId){
        this.postId = postId;
        return this;
    }

    public PostLikeBuilder user_id(Integer userId){
        this.userId = userId;
        return this;
    }

    public PostLikeBuilder basedOn(PostLike postLike){
        this.postId = postLike.getPostId();
        this.userId = postLike.getUserId();
        return this;

    }

    public PostLike build(){
        return new PostLike(
                postId,
                userId
        );
    }
}
