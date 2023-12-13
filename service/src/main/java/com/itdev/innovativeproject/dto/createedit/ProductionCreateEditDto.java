package com.itdev.innovativeproject.dto.createedit;

import lombok.Data;
import lombok.Value;

@Data
public class ProductionCreateEditDto {

    private final String serialNumber;
    private final String name;
    private final Integer stockQuantity;
    private final String manufacture;
    private final Double price;
    private final Integer guarantee;
    private final String country;
}
