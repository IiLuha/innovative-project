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
    @Column(name = "id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "production_id")
    private Production production;

    @ManyToOne
    @JoinColumn(name = "form_factor_id")
    private FormFactor formFactor;

    @ManyToOne
    @JoinColumn(name = "Computer_details_id")
    private ComputerDetails computerDetails;

    private String screen;
}
