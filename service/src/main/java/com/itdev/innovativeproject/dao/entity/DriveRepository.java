package com.itdev.innovativeproject.dao.entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface DriveRepository extends JpaRepository<Drive,Integer> {
    Drive save(Drive drive);
    List<Drive> findAll();

    Drive findByDriveId(Integer id);

    void deleteById(Integer id);

}
