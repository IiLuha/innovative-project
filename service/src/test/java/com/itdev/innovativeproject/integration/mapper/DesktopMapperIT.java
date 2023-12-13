package com.itdev.innovativeproject.integration.mapper;

import com.itdev.innovativeproject.dao.entity.ComputerDetails;
import com.itdev.innovativeproject.dao.entity.Desktop;
import com.itdev.innovativeproject.dao.entity.DiskType;
import com.itdev.innovativeproject.dao.entity.FormFactor;
import com.itdev.innovativeproject.dao.entity.Notebook;
import com.itdev.innovativeproject.dao.entity.Production;
import com.itdev.innovativeproject.dto.createedit.DesktopCreateEditDto;
import com.itdev.innovativeproject.dto.read.ComputerDetailsReadDto;
import com.itdev.innovativeproject.dto.read.DesktopReadDto;
import com.itdev.innovativeproject.integration.annotation.IT;
import com.itdev.innovativeproject.mapper.ComputerDetailsMapper;
import com.itdev.innovativeproject.mapper.DesktopMapper;
import com.itdev.innovativeproject.util.DataTestUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Column;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

@IT
public class DesktopMapperIT {

    @Autowired
    DesktopMapper desktopMapper;
    private Production production;
    private ComputerDetails computerDetails;
    Desktop desktop;
    DesktopCreateEditDto desktopDto;

    @BeforeEach
    void beforeEach() {
        production = DataTestUtil.getProduction();
        computerDetails = DataTestUtil.getComputerDetails();
        desktop = DataTestUtil.getDesktop();
        desktopDto = DataTestUtil.getDesktopCreateEditDto();
    }


    @Test
    public void shouldMapDesktopToDto() {
        //given

        //when
        DesktopReadDto desktopDto = desktopMapper.desktopToDto(desktop);

        //then
        assertThat(desktopDto).isNotNull();
        assertThat(desktopDto.getId()).isEqualTo(desktop.getId());

        assertThat(desktopDto.getProductionId()).isEqualTo(desktop.getProduction().getId());

        assertThat(desktopDto.getFormFactorName()).isEqualTo(desktop.getFormFactor().getName());

        assertThat(desktopDto.getComputerDetails()).isNotNull();
        assertThat(desktopDto.getComputerDetails().getDiskTypeName())
                .isEqualTo(desktop.getComputerDetails().getDiskType().getName());
        assertThat(desktopDto.getComputerDetails().getVideoCard())
                .isEqualTo(desktop.getComputerDetails().getVideoCard());
        assertThat(desktopDto.getComputerDetails().getRam()).isEqualTo(desktop.getComputerDetails().getRam());

        assertThat(desktopDto.getScreen()).isEqualTo(desktop.getScreen());
    }

    @Test
    public void shouldMapDtoToNotebook() {
        //given

        //when
        Desktop desktop = desktopMapper.dtoToDesktop(desktopDto);

        //then
        assertThat(desktop).isNotNull();
        assertThat(desktop.getId()).isNull();

        assertThat(desktop.getProduction()).isNotNull();
        assertThat(desktop.getProduction().getId()).isEqualTo(desktopDto.getProductionId());
        assertThat(desktop.getProduction().getManufacture()).isEqualTo(production.getManufacture());
        assertThat(desktop.getProduction().getGuarantee()).isEqualTo(production.getGuarantee());

        assertThat(desktop.getComputerDetails()).isNotNull();
        assertThat(desktop.getComputerDetails().getDiskType().getName())
                .isEqualTo(computerDetails.getDiskType().getName());
        assertThat(desktop.getComputerDetails().getVideoCard()).isEqualTo(computerDetails.getVideoCard());
        assertThat(desktop.getComputerDetails().getRam()).isEqualTo(computerDetails.getRam());

        assertThat(desktop.getScreen()).isEqualTo(desktopDto.getScreen());
    }
}
