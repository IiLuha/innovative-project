package com.itdev.innovativeproject.dto.read;

import lombok.Data;

@Data
public class DesktopReadDto {

    private Long id;
    private Long productionId;
    private String formFactorName;
    private ComputerDetailsReadDto computerDetails;
    private String screen;
}
