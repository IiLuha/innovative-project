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
public class Notebook implements BaseEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "Production_ID")
    private Production production;

    @ManyToOne
    @JoinColumn(name = "ComputerDetails_ID")
    private ComputerDetails computerDetails;

    private int diagonal;
}

