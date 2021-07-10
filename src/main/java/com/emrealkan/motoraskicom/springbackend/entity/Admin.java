package com.emrealkan.motoraskicom.springbackend.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tbl_admin")
@Data
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")

    private int id;
    @Column(name = "user_name",unique = true)
    private String userName;
    @Column(name = "email",unique = true)
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "status")
    private String status;
}
