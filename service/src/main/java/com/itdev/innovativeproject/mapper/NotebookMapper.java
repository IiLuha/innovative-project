package com.itdev.innovativeproject.mapper;

import com.itdev.innovativeproject.dao.entity.ComputerDetails;
import com.itdev.innovativeproject.dao.entity.Desktop;
import com.itdev.innovativeproject.dao.entity.DiskType;
import com.itdev.innovativeproject.dao.entity.FormFactor;
import com.itdev.innovativeproject.dao.entity.Notebook;
import com.itdev.innovativeproject.dao.entity.Production;
import com.itdev.innovativeproject.dao.repository.ComputerDetailsRepository;
import com.itdev.innovativeproject.dao.repository.DiskTypeRepository;
import com.itdev.innovativeproject.dao.repository.ProductionRepository;
import com.itdev.innovativeproject.dto.createedit.NotebookCreateEditDto;
import com.itdev.innovativeproject.dto.createedit.ProductionCreateEditDto;
import com.itdev.innovativeproject.dto.read.ComputerDetailsReadDto;
import com.itdev.innovativeproject.dto.read.DesktopReadDto;
import com.itdev.innovativeproject.dto.read.NotebookReadDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(uses = {ComputerDetailsMapper.class}, componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public abstract class NotebookMapper {

    @Autowired
    protected ProductionRepository productionRepository;
    @Autowired
    protected ComputerDetailsRepository computerDetailsRepository;

    @Mapping(source = "production.id", target = "productionId")
    public abstract NotebookReadDto notebookToDto(Notebook notebook);

    @Mappings({
            @Mapping(target = "production",
                    expression = "java(productionRepository.findById(notebook.getProductionId()).orElseThrow())"),
            @Mapping(target = "computerDetails",
                    expression = "java(computerDetailsRepository.findById(notebook.getComputerDetailsId()).orElseThrow())")
    })
    public abstract Notebook dtoToNotebook(NotebookCreateEditDto notebook);
}
