package com.itdev.innovativeproject.dao.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Disk_typeRepository extends JpaRepository<Disk_type,Integer> {
    Disk_type save(Disk_type disk_type);
    List<Disk_type> findAll();

    Drive findByDisk_typeId(Integer id);

    void deleteById(Integer id);
}
