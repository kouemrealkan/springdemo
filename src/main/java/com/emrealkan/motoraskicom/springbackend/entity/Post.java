package com.emrealkan.motoraskicom.springbackend.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tbl_post")
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "post_title")
    private String postTitle;
    @Column(name = "post_detail")
    private String postDetail;
    @Column(name = "image_url")
    private String imageUrl;
}
