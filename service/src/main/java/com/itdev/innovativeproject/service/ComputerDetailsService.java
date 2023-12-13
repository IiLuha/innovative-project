package com.itdev.innovativeproject.service;

import com.itdev.innovativeproject.dao.repository.ComputerDetailsRepository;
import com.itdev.innovativeproject.dto.createedit.ComputerDetailsCreateEditDto;
import com.itdev.innovativeproject.dto.read.ComputerDetailsReadDto;
import com.itdev.innovativeproject.mapper.ComputerDetailsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ComputerDetailsService {

    private final ComputerDetailsRepository computerDetailsRepository;
    private final ComputerDetailsMapper computerDetailsMapper;

    public Page<ComputerDetailsReadDto> findAll(Pageable pageable) {
        return computerDetailsRepository.findAll(pageable)
                .map(computerDetailsMapper::computerDetailsToDto);
    }
    public List<ComputerDetailsReadDto> findAll() {
        return computerDetailsRepository.findAll().stream()
                .map(computerDetailsMapper::computerDetailsToDto)
                .toList();
    }

    public Optional<ComputerDetailsReadDto> findById(Long id) {
        return computerDetailsRepository.findById(id)
                .map(computerDetailsMapper::computerDetailsToDto);
    }

    @Transactional
    public ComputerDetailsReadDto createComputerDetails (ComputerDetailsCreateEditDto computerDetailsDto) {
        return Optional.of(computerDetailsDto)
                .map(computerDetailsMapper::dtoToComputerDetails)
                .map(computerDetailsRepository::save)
                .map(computerDetailsMapper::computerDetailsToDto)
                .orElseThrow();
    }

    @Transactional
    public Optional<ComputerDetailsReadDto> updateComputerDetails (Long id, ComputerDetailsCreateEditDto computerDetailsDto) {
        if (computerDetailsRepository.findById(id).isEmpty()) return Optional.empty();
        return Optional.of(computerDetailsDto)
                .map(computerDetailsMapper::dtoToComputerDetails)
                .map(computerDetailsRepository::saveAndFlush)
                .map(computerDetailsMapper::computerDetailsToDto);
    }

    @Transactional
    public boolean deleteComputerDetails(Long id) {
        return computerDetailsRepository.findById(id)
                .map(entity -> {
                    computerDetailsRepository.delete(entity);
                    computerDetailsRepository.flush();
                    return true;
                })
                .orElse(false);
    }

}
