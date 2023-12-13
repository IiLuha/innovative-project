package com.itdev.innovativeproject.dao.repository;
import com.itdev.innovativeproject.dao.entity.Drive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

public interface DriveRepository extends JpaRepository<Drive, Long> {

}
