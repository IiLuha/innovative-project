package com.itdev.innovativeproject.dao.entity;

import lombok.Value;

@Value
public class ComputerDetailsCreateEditDto {
    private String videoCard;
    private Long diskTypeId;  // ?
    private Integer diskCapacity;
    private String processor;
    private Integer ram;
    private Integer weight;
}
