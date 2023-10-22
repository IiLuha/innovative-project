package com.itdev.innovativeproject.dao.entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class DriveService {

    private final DriveRepository driveRepository;

    @Autowired
    public DriveService(DriveRepository driveRepository) {
        this.driveRepository = driveRepository;
    }

    @Transactional
    public Drive createDrive(Drive drive) {
        return driveRepository.save(drive);
    }

    @Transactional
    public List<Drive> getAllDrives() {
        return driveRepository.findAll();
    }

    @Transactional
    public Drive getDriveById(Integer id) {
        return driveRepository.findByDriveId(id);
    }

    @Transactional
    public void deleteDrive(Integer id) {
        driveRepository.deleteById(id);
    }

    @Transactional
    public List<Drive> findDrivesByCapacityRange(int minCapacity, int maxCapacity) {
        List<Drive> drives = driveRepository.findAll();
        List<Drive> result = new ArrayList<>();

        for (Drive drive : drives) {
            int capacity = drive.getCapacity();
            if (capacity >= minCapacity && capacity <= maxCapacity) {
                result.add(drive);
            }
        }

        return result;
    }

    @Transactional
    public List<Drive> findDrivesByReadSpeedGreaterThan(int minReadSpeed) {
        List<Drive> drives = driveRepository.findAll();
        List<Drive> result = new ArrayList<>();

        for (Drive drive : drives) {
            int readSpeed = drive.getReadSpeed();
            if (readSpeed > minReadSpeed) {
                result.add(drive);
            }
        }

        return result;
    }
}


