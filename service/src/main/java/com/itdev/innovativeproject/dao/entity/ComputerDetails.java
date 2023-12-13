package com.itdev.innovativeproject.dao.entity;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComputerDetails implements BaseEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String videoCard;

    @ManyToOne
    private DiskType diskType;
    private Integer diskCapacity;
    private String processor;
    private Integer ram;
    private Integer weight;
}
