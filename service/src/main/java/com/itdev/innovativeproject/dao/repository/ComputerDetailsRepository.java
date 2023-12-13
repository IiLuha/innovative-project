package com.itdev.innovativeproject.dao.repository;

import com.itdev.innovativeproject.dao.entity.ComputerDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ComputerDetailsRepository extends JpaRepository<ComputerDetails, Long> {
}
