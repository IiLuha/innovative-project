package com.itdev.innovativeproject.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Drive")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Drive implements BaseEntity<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Production production;

    @ManyToOne
    private DiskType diskType;

    private int capacity;

    private int readSpeed;
}

