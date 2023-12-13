package com.itdev.innovativeproject.service;

import com.itdev.innovativeproject.dto.createedit.DesktopCreateEditDto;
import com.itdev.innovativeproject.dto.read.DesktopReadDto;
import com.itdev.innovativeproject.dao.repository.DesktopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class DesktopService {

    private final DesktopRepository desktopRepository;
    @Autowired
    public DesktopService(DesktopRepository desktopRepository) {
        this.desktopRepository = desktopRepository;
    }

    public List<DesktopReadDto> findAll() {
        return null;
    }

    public Optional<DesktopReadDto> findById(Long id) {
        return Optional.empty();
    }

    @Transactional
    public DesktopReadDto createDesktop (DesktopCreateEditDto desktopDto) {
        return null;
    }

    @Transactional
    public Optional<DesktopReadDto> updateDesktop(Long id, DesktopCreateEditDto desktopDto) {
        return Optional.empty();
    }

    @Transactional
    public boolean deleteDesktop(Long id) {
        return false;
    }


}
