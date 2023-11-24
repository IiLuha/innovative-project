package com.itdev.innovativeproject.dao.entity;

import lombok.Value;

@Value
public class DesktopReadDto {
    private Long id;
    private Long productionId;
    private Long formFactorId;   // зависимая сущность readDto?
    private ComputerDetailsReadDto computerDetails; // readDto?
    private String screen;
}
