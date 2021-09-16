package io.redbee.socialnetwork.feeds.postLikes.service;

import io.redbee.socialnetwork.feeds.postLikes.dao.PostLikeDao;
import io.redbee.socialnetwork.feeds.posts.service.PostCreationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PostLikeCreationService {
    private final PostLikeDao dao;

    private static final Logger LOGGER = LoggerFactory.getLogger(PostLikeCreationService.class);

    public PostLikeCreationService(PostLikeDao dao){
        this.dao = dao;
    }
}
