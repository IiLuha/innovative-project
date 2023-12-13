package com.itdev.innovativeproject.service;

import com.itdev.innovativeproject.dto.createedit.ComputerDetailsCreateEditDto;
import com.itdev.innovativeproject.dto.read.ComputerDetailsReadDto;
import com.itdev.innovativeproject.dao.repository.ComputerDetailsRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class ComputerDetailsService {
    private final ComputerDetailsRepository computerDetailsRepository;

    @Autowired
    public ComputerDetailsService(ComputerDetailsRepository driveRepository) {
        this.computerDetailsRepository = driveRepository;
    }

    public List<ComputerDetailsReadDto> findAll() {
        return null;
    }

    public Optional<ComputerDetailsReadDto> findById(Long id) {
        return Optional.empty();
    }

    @Transactional
    public ComputerDetailsReadDto createComputerDetails(ComputerDetailsCreateEditDto computerDetailsDto) {
        return null;
    }

    @Transactional
    public Optional<ComputerDetailsReadDto> updateComputerDetails(Long id, ComputerDetailsCreateEditDto computerDetailsDto) {
        return Optional.empty();
    }

    @Transactional
    public boolean deleteComputerDetails(Long id) {
        return false;
    }

}
