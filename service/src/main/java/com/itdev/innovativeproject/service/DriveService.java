package com.itdev.innovativeproject.service;

import com.itdev.innovativeproject.dao.repository.DriveRepository;
import com.itdev.innovativeproject.dto.createedit.DriveCreateEditDto;
import com.itdev.innovativeproject.dto.read.DriveReadDto;
import com.itdev.innovativeproject.mapper.DriveMapper;
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
public class DriveService {

    private final DriveRepository driveRepository;
    private final DriveMapper driveMapper;

    public Page<DriveReadDto> findAll(Pageable pageable) {
        return driveRepository.findAll(pageable)
                .map(driveMapper::driveToDto);
    }
    public List<DriveReadDto> findAll() {
        return driveRepository.findAll().stream()
                .map(driveMapper::driveToDto)
                .toList();
    }

    public Optional<DriveReadDto> findById(Long id) {
        return driveRepository.findById(id)
                .map(driveMapper::driveToDto);
    }

    @Transactional
    public DriveReadDto createDrive (DriveCreateEditDto driveDto) {
        return Optional.of(driveDto)
                .map(driveMapper::dtoToDrive)
                .map(driveRepository::save)
                .map(driveMapper::driveToDto)
                .orElseThrow();
    }

    @Transactional
    public Optional<DriveReadDto> updateDrive (Long id, DriveCreateEditDto driveDto) {
        if (driveRepository.findById(id).isEmpty()) return Optional.empty();
        return Optional.of(driveDto)
                .map(driveMapper::dtoToDrive)
                .map(driveRepository::saveAndFlush)
                .map(driveMapper::driveToDto);
    }

    @Transactional
    public boolean deleteDrive(Long id) {
        return driveRepository.findById(id)
                .map(entity -> {
                    driveRepository.delete(entity);
                    driveRepository.flush();
                    return true;
                })
                .orElse(false);
    }
}
