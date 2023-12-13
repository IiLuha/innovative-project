package com.itdev.innovativeproject.dto.read;

import lombok.Data;
import lombok.Value;

import java.math.BigDecimal;

@Data
public class ProductionReadDto {

    private Long id;
    private String serialNumber;
    private String name;
    private Integer stockQuantity;
    private String manufacture;
    private BigDecimal price;
    private Integer guarantee;
    private String country;
}
