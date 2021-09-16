package io.redbee.socialnetwork.feeds.postLikes.controller;


import io.redbee.socialnetwork.feeds.postLikes.model.PostLikeResponse;
import io.redbee.socialnetwork.feeds.postLikes.service.PostLikeCreationService;
import io.redbee.socialnetwork.feeds.postLikes.service.PostLikeDeleteService;
import io.redbee.socialnetwork.feeds.postLikes.service.PostLikeSearchService;
import io.redbee.socialnetwork.shared.controller.SecuredController;
import io.redbee.socialnetwork.users.service.UserSearchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PreAuthorize("isAuthenticated()")
public class PostLikeController extends SecuredController {
    private final PostLikeCreationService creationService;
    private final PostLikeDeleteService deleteService;
    private final PostLikeSearchService searchService;

    private static final Logger LOGGER = LoggerFactory.getLogger(PostLikeController.class);

    public PostLikeController(
            UserSearchService userSearchService,
            PostLikeCreationService creationService,
            PostLikeDeleteService deleteService,
            PostLikeSearchService searchService
    ){
        super(userSearchService);
        this.creationService = creationService;
        this.searchService = searchService;
        this.deleteService = deleteService;
    }

    @GetMapping("/users/{userId}/post/{postId}/likes")
    public void getById(
            @PathVariable Integer userId,
            @PathVariable Integer postId
    ){
        LOGGER.info("getById: searching postLikes for user_id {} and post_id {}", userId, postId);
    }
}
