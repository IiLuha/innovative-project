package com.itdev.innovativeproject.dao.entity;

import lombok.Value;

@Value
public class ComputerDetailsReadDto {
    private Long id;
    private String videoCard;
    private Long diskTypeId;  // здесь по идее тоже dto раз это зависимая сущность?
    private Integer diskCapacity;
    private String processor;
    private Integer ram;
    private Integer weight;

}
