package com.itdev.innovativeproject.mapper;

import com.itdev.innovativeproject.dao.entity.ComputerDetails;
import com.itdev.innovativeproject.dao.entity.Desktop;
import com.itdev.innovativeproject.dao.entity.DiskType;
import com.itdev.innovativeproject.dao.entity.FormFactor;
import com.itdev.innovativeproject.dao.entity.Notebook;
import com.itdev.innovativeproject.dao.entity.Production;
import com.itdev.innovativeproject.dao.repository.ComputerDetailsRepository;
import com.itdev.innovativeproject.dao.repository.FormFactorRepository;
import com.itdev.innovativeproject.dao.repository.ProductionRepository;
import com.itdev.innovativeproject.dto.createedit.DesktopCreateEditDto;
import com.itdev.innovativeproject.dto.createedit.NotebookCreateEditDto;
import com.itdev.innovativeproject.dto.read.ComputerDetailsReadDto;
import com.itdev.innovativeproject.dto.read.DesktopReadDto;
import com.itdev.innovativeproject.dto.read.ProductionReadDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(uses = {ComputerDetailsMapper.class},
        componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public abstract class DesktopMapper {

    @Autowired
    protected ProductionRepository productionRepository;
    @Autowired
    protected ComputerDetailsRepository computerDetailsRepository;
    @Autowired
    protected FormFactorRepository formFactorRepository;

    @Mappings({
            @Mapping(source = "production.id", target = "productionId"),
            @Mapping(source = "formFactor.name", target = "formFactorName")
    })
    public abstract DesktopReadDto desktopToDto(Desktop desktop);

    @Mappings({
            @Mapping(target = "production",
                    expression = "java(productionRepository.findById(desktop.getProductionId()).orElseThrow())"),
            @Mapping(target = "computerDetails",
                    expression = "java(computerDetailsRepository.findById(desktop.getComputerDetailsId()).orElseThrow())"),
            @Mapping(target = "formFactor",
                    expression = "java(formFactorRepository.findById(desktop.getFormFactorId()).orElseThrow())")
    })
    public abstract Desktop dtoToDesktop(DesktopCreateEditDto desktop);
}
