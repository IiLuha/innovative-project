package com.itdev.innovativeproject.dao.entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional; // Import the @Transactional annotation

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional // Add @Transactional at the class level
public class NotebookService {

    private final NotebookRepository notebookRepository;

    @Autowired
    public NotebookService(NotebookRepository notebookRepository) {
        this.notebookRepository = notebookRepository;
    }

    public Notebook createNotebook(Notebook notebook) {
        return notebookRepository.save(notebook);
    }

    public List<Notebook> getAllNotebooks() {
        return notebookRepository.findAll();
    }

    public Notebook getNotebookById(Integer id) {
        return notebookRepository.findByNotebookId(id);
    }

    public void deleteNotebook(Integer id) {
        notebookRepository.deleteById(id);
    }
    //methods not in the Repository
    public List<Notebook> findNotebooksWithDiagonalGreaterThan(int minimumDiagonal) {
        List<Notebook> notebooks = notebookRepository.findAll();
        List<Notebook> result = new ArrayList<>();

        for (Notebook notebook : notebooks) {
            if (notebook.getDiagonal() > minimumDiagonal) {
                result.add(notebook);
            }
        }

        return result;
    }
}

