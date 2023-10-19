package com.itdev.innovativeproject.dao.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface NotebookRepository extends JpaRepository<Notebook,Integer> {
    Notebook save(Notebook notebook);
    List<Notebook> findAll();
    Notebook findByNotebookId(Integer id);
    void deleteById(Integer id);
}
