package com.itdev.innovativeproject.dto.createedit;

import lombok.Data;
import lombok.Value;

@Data
public class ComputerDetailsCreateEditDto {

    private final String videoCard;
    private final Long diskTypeId;
    private final Integer diskCapacity;
    private final String processor;
    private final Integer ram;
    private final Integer weight;
}
