package com.emrealkan.motoraskicom.springbackend.dao;

import com.emrealkan.motoraskicom.springbackend.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
