package com.itdev.innovativeproject.service;

import com.itdev.innovativeproject.dao.entity.ComputerDetailsCreateEditDto;
import com.itdev.innovativeproject.dao.entity.ComputerDetailsReadDto;
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
    }

    public Optional<ComputerDetailsReadDto> findById(Long id) {
    }

    @Transactional
    public ComputerDetailsReadDto createComputerDetails(ComputerDetailsCreateEditDto computerDetailsDto) {
    }

    @Transactional
    public Optional<ComputerDetailsReadDto> updateComputerDetails(Long id, ComputerDetailsCreateEditDto computerDetailsDto) {
    }

    @Transactional
    public boolean deleteComputerDetails(Long id) {
    }

}
