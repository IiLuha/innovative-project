package com.itdev.innovativeproject.dao.repository;

import com.itdev.innovativeproject.dao.entity.DiskType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiskTypeRepository extends JpaRepository<DiskType,Long> {
}
