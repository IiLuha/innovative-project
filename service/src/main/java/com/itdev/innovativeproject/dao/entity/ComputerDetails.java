package com.itdev.innovativeproject.dao.entity;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "computer_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComputerDetails implements BaseEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "video_card")
    private String videoCard;

    @ManyToOne
    @JoinColumn(name = "disk_type_id")
    private DiskType diskType;

    @Column(name = "disk_capacity")
    private Integer diskCapacity;

    private String processor;
    private Integer ram;
    private Integer weight;
}
