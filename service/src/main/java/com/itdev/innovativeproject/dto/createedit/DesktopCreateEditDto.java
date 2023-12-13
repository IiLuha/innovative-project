package com.itdev.innovativeproject.dto.createedit;

import lombok.Data;
import lombok.Value;

@Data
public class DesktopCreateEditDto {

    private final Long productionId;
    private final Long formFactorId;
    private final Long computerDetailsId;
    private final String screen;
}
