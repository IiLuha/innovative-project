package com.itdev.innovativeproject.dao.repository;

import com.itdev.innovativeproject.dao.entity.Notebook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotebookRepository extends JpaRepository<Notebook,Long> {
}
