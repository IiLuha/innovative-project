package com.itdev.innovativeproject.dao.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Disk_type")
@Data
public class DiskType implements BaseEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
}

