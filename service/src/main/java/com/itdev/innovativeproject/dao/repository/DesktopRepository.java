package com.itdev.innovativeproject.dao.repository;

import com.itdev.innovativeproject.dao.entity.Desktop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesktopRepository extends JpaRepository<Desktop,Long> {
}
