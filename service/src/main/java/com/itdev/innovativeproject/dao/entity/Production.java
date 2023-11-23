package com.itdev.innovativeproject.dao.entity;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "production")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Production implements BaseEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "serial_number", unique = true)
    private String serialNumber;

    @Column(unique = true)
    private String name;

    @Column(name = "stock_quantity")
    private Integer stockQuantity;

    private String manufacture;
    private Double price;
    private Integer guarantee;
    private String country;

}
