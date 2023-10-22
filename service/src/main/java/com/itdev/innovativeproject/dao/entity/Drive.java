package com.itdev.innovativeproject.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Drive")
@Data // Generates getters, setters, toString, equals, and hashCode
@NoArgsConstructor // Generates a no-argument constructor
@AllArgsConstructor // Generates a constructor with all parameters
public class Drive implements BaseEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @OneToOne
    @JoinColumn(name = "Production_ID")
    private Production production;

    @ManyToOne
    @JoinColumn(name = "DiskType_ID")
    private Disk_type disk_type;

    @Column(name = "Capacity")
    private int capacity;

    @Column(name = "REadSpeed")
    private int readSpeed;
}
