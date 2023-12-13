package com.itdev.innovativeproject.integration.mapper;

import com.itdev.innovativeproject.dao.entity.ComputerDetails;
import com.itdev.innovativeproject.dao.entity.Notebook;
import com.itdev.innovativeproject.dao.entity.DiskType;
import com.itdev.innovativeproject.dao.entity.FormFactor;
import com.itdev.innovativeproject.dao.entity.Production;
import com.itdev.innovativeproject.dto.createedit.NotebookCreateEditDto;
import com.itdev.innovativeproject.dto.read.NotebookReadDto;
import com.itdev.innovativeproject.integration.annotation.IT;
import com.itdev.innovativeproject.mapper.NotebookMapper;
import com.itdev.innovativeproject.mapper.NotebookMapperImpl;
import com.itdev.innovativeproject.util.DataTestUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

@IT
public class NotebookMapperIT {

    @Autowired
    NotebookMapper notebookMapper;
    private Production production;
    private ComputerDetails computerDetails;
    private Notebook notebook;
    private NotebookCreateEditDto notebookDto;

    @BeforeEach
    void beforeEach() {
        production = DataTestUtil.getProduction();
        computerDetails = DataTestUtil.getComputerDetails();
        notebook = DataTestUtil.getNotebook();
        notebookDto = DataTestUtil.getNotebookCreateEditDto();
    }

    @Test
    public void shouldMapCNotebookToDto() {
        //given

        //when
        NotebookReadDto notebookDto = notebookMapper.notebookToDto(notebook);
//        NotebookReadDto notebookDto = NotebookMapper.INSTANCE.notebookToDto(notebook);

        //then
        assertThat(notebookDto).isNotNull();
        assertThat(notebookDto.getId()).isEqualTo(notebook.getId());

        assertThat(notebookDto.getProductionId()).isEqualTo(notebook.getProduction().getId());

        assertThat(notebookDto.getComputerDetails()).isNotNull();
        assertThat(notebookDto.getComputerDetails().getDiskTypeName())
                .isEqualTo(notebook.getComputerDetails().getDiskType().getName());
        assertThat(notebookDto.getComputerDetails().getVideoCard())
                .isEqualTo(notebook.getComputerDetails().getVideoCard());
        assertThat(notebookDto.getComputerDetails().getRam()).isEqualTo(notebook.getComputerDetails().getRam());

        assertThat(notebookDto.getDiagonal()).isEqualTo(notebook.getDiagonal());
    }

    @Test
    public void shouldMapDtoToNotebook() {
        //given

        //when
        Notebook notebook = notebookMapper.dtoToNotebook(notebookDto);

        //then
        assertThat(notebook).isNotNull();
        assertThat(notebook.getId()).isNull();

        assertThat(notebook.getProduction()).isNotNull();
        assertThat(notebook.getProduction().getId()).isEqualTo(notebookDto.getProductionId());
        assertThat(notebook.getProduction().getManufacture()).isEqualTo(production.getManufacture());
        assertThat(notebook.getProduction().getGuarantee()).isEqualTo(production.getGuarantee());

        assertThat(notebook.getComputerDetails()).isNotNull();
        assertThat(notebook.getComputerDetails().getDiskType().getName())
                .isEqualTo(computerDetails.getDiskType().getName());
        assertThat(notebook.getComputerDetails().getVideoCard()).isEqualTo(computerDetails.getVideoCard());
        assertThat(notebook.getComputerDetails().getRam()).isEqualTo(computerDetails.getRam());

        assertThat(notebook.getDiagonal()).isEqualTo(notebookDto.getDiagonal());
    }
}
