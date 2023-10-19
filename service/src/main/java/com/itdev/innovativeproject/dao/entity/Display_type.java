package com.itdev.innovativeproject.dao.entity;

import javax.persistence.*;

@Entity
@Table(name="Display_type")
public class Display_type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name ="ID")
    private int id;
    @Column(name="Name")
    private String name;
}
