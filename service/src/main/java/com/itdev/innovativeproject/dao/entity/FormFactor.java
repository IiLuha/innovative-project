package com.itdev.innovativeproject.dao.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Form_factor")
@Data
public class FormFactor implements BaseEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
