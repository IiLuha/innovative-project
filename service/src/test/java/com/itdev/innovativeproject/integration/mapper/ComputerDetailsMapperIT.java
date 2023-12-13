package com.itdev.innovativeproject.integration.mapper;

import com.itdev.innovativeproject.dao.entity.ComputerDetails;
import com.itdev.innovativeproject.dao.entity.DiskType;
import com.itdev.innovativeproject.dto.read.ComputerDetailsReadDto;
import com.itdev.innovativeproject.integration.annotation.IT;
import com.itdev.innovativeproject.mapper.ComputerDetailsMapper;
import com.itdev.innovativeproject.util.DataTestUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

@IT
public class ComputerDetailsMapperIT {

    @Autowired
    ComputerDetailsMapper computerDetailsMapper;
    ComputerDetails computerDetails;

    @BeforeEach
    void beforeEach() {
        computerDetails = DataTestUtil.getComputerDetails();
    }

    @Test
    public void shouldMapComputerDetailsToDto() {
        //given

        //when
        ComputerDetailsReadDto computerDetailsDto = computerDetailsMapper.computerDetailsToDto(computerDetails);

        //then
        assertThat(computerDetailsDto).isNotNull();
        assertThat(computerDetailsDto.getId()).isEqualTo(computerDetails.getId());
        assertThat(computerDetailsDto.getVideoCard()).isEqualTo(computerDetails.getVideoCard());
        assertThat(computerDetailsDto.getDiskTypeName()).isEqualTo(computerDetails.getDiskType().getName());
        assertThat(computerDetailsDto.getDiskCapacity()).isEqualTo(computerDetails.getDiskCapacity());
        assertThat(computerDetailsDto.getProcessor()).isEqualTo(computerDetails.getProcessor());
        assertThat(computerDetailsDto.getRam()).isEqualTo(computerDetails.getRam());
        assertThat(computerDetailsDto.getWeight()).isEqualTo(computerDetails.getWeight());
    }
}
