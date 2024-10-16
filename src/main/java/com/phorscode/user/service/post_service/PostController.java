package com.phorscode.user.service.post_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostController {
    @GetMapping(value="/{postId}")
    public Posts getPost(@PathVariable("postId") String postId){
        return new Posts(postId, "Description " + "for: " +  postId);
    }
}
