package com.itdev.innovativeproject.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Notebook")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notebook implements BaseEntity<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Production production;

    @ManyToOne
    private ComputerDetails computerDetails;

    private int diagonal;
}

