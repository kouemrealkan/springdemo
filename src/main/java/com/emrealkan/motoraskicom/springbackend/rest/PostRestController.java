package com.emrealkan.motoraskicom.springbackend.rest;
import com.emrealkan.motoraskicom.springbackend.entity.Post;
import com.emrealkan.motoraskicom.springbackend.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PostRestController {
    private PostService postService;
    @Autowired
    public PostRestController(PostService thePostService){
        postService = thePostService;
    }

    @GetMapping("/posts")
    public List<Post> findAll(){
        return postService.findAll();
    }

}
