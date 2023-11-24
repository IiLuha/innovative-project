package com.itdev.innovativeproject.dao.entity;

import lombok.Value;

@Value
public class ProductionReadDto {
    private Long id;
    private String serialNumber;
    private String name;
    private Integer stockQuantity;
    private String manufacture;
    private Double price;
    private Integer guarantee;
    private String country;
}
