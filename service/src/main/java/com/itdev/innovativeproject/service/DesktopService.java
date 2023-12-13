package com.itdev.innovativeproject.service;

import com.itdev.innovativeproject.dao.repository.DesktopRepository;
import com.itdev.innovativeproject.dto.createedit.DesktopCreateEditDto;
import com.itdev.innovativeproject.dto.read.DesktopReadDto;
import com.itdev.innovativeproject.mapper.DesktopMapper;
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
public class DesktopService {

    private final DesktopRepository desktopRepository;
    private final DesktopMapper desktopMapper;

    public Page<DesktopReadDto> findAll(Pageable pageable) {
        return desktopRepository.findAll(pageable)
                .map(desktopMapper::desktopToDto);
    }
    public List<DesktopReadDto> findAll() {
        return desktopRepository.findAll().stream()
                .map(desktopMapper::desktopToDto)
                .toList();
    }

    public Optional<DesktopReadDto> findById(Long id) {
        return desktopRepository.findById(id)
                .map(desktopMapper::desktopToDto);
    }

    @Transactional
    public DesktopReadDto createDesktop (DesktopCreateEditDto desktopDto) {
        return Optional.of(desktopDto)
                .map(desktopMapper::dtoToDesktop)
                .map(desktopRepository::save)
                .map(desktopMapper::desktopToDto)
                .orElseThrow();
    }

    @Transactional
    public Optional<DesktopReadDto> updateDesktop (Long id, DesktopCreateEditDto desktopDto) {
        if (desktopRepository.findById(id).isEmpty()) return Optional.empty();
        return Optional.of(desktopDto)
                .map(desktopMapper::dtoToDesktop)
                .map(desktopRepository::saveAndFlush)
                .map(desktopMapper::desktopToDto);
    }

    @Transactional
    public boolean deleteDesktop(Long id) {
        return desktopRepository.findById(id)
                .map(entity -> {
                    desktopRepository.delete(entity);
                    desktopRepository.flush();
                    return true;
                })
                .orElse(false);
    }
}
