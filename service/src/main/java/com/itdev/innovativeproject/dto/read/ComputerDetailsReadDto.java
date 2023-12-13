package com.itdev.innovativeproject.dto.read;

import lombok.Data;
import lombok.Value;

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
