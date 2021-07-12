package com.emrealkan.motoraskicom.springbackend.service;

import com.emrealkan.motoraskicom.springbackend.dao.PostRepository;
import com.emrealkan.motoraskicom.springbackend.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    private PostRepository postRepository;
    @Autowired
    public PostServiceImpl(PostRepository thePostRepository){
        postRepository = thePostRepository;
    }
    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }
}
