package com.itdev.innovativeproject.dto.read;

import lombok.Data;

@Data
public class ComputerDetailsReadDto {

    private Long id;
    private String videoCard;
    private String diskTypeName;
    private Integer diskCapacity;
    private String processor;
    private Integer ram;
    private Integer weight;

}
