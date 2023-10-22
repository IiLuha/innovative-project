package com.itdev.innovativeproject.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Monitor")
@Data // Generates getters, setters, toString, equals, and hashCode
@NoArgsConstructor // Generates a no-argument constructor
@AllArgsConstructor // Generates a constructor with all parameters
public class Monitor implements BaseEntity<Integer> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @OneToOne
    @JoinColumn(name = "Production_ID")
    private Production production;

    @ManyToOne
    @JoinColumn(name = "DisplayType_ID")
    private Display_type displayType;

    @Column(name = "DiagonalMon")
    private int diagonalMon;

    @Column(name = "Frequency")
    private int frequency;
}
