package com.itdev.innovativeproject.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Monitor")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Monitor implements BaseEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "Production_ID")
    private Production production;

    @ManyToOne
    @JoinColumn(name = "DisplayType_ID")
    private DisplayType displayType;

    private int diagonalMon;

    private int frequency;
}

