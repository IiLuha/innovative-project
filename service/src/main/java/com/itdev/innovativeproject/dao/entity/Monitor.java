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
public class Monitor implements BaseEntity<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Production production;

    @ManyToOne
    private DisplayType displayType;

    private int diagonalMon;

    private int frequency;
}

