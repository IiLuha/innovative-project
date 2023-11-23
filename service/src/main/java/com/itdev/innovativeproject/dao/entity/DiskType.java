package com.itdev.innovativeproject.dao.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Disk_type")
@Data
public class DiskType implements BaseEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}