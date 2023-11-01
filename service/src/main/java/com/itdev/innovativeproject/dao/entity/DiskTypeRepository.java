package com.itdev.innovativeproject.dao.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiskTypeRepository extends JpaRepository<DiskType,Integer> {
    DiskType save(DiskType disk_type);
    List<DiskType> findAll();

    Drive findByDisk_typeId(Integer id);

    void deleteById(Integer id);
}
