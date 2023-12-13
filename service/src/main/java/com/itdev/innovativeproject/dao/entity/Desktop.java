package com.itdev.innovativeproject.dao.entity;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "desktop_computer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Desktop implements BaseEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Production production;

    @ManyToOne
    private FormFactor formFactor;

    @OneToOne
    private ComputerDetails computerDetails;

    private String screen;
}
