package com.itdev.innovativeproject.dao.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DriveService {

    private final DriveRepository driveRepository;

    @Autowired
    public DriveService(DriveRepository driveRepository) {
        this.driveRepository = driveRepository;
    }

    public Drive createDrive(Drive drive) {
        return driveRepository.save(drive);
    }

    public List<Drive> getAllDrives() {
        return driveRepository.findAll();
    }

    public Drive getDriveById(Integer id) {
        return driveRepository.findByDriveId(id);
    }

    public void deleteDrive(Integer id) {
        driveRepository.deleteById(id);
    }
    //methods not in Repository
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

