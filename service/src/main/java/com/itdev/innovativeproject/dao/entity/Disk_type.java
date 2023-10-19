package com.itdev.innovativeproject.dao.entity;

import javax.persistence.*;

@Entity
@Table(name="Disk_type")
public class Disk_type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name ="ID")
    private int id;
    @Column(name="Name")
    private String name;
}
