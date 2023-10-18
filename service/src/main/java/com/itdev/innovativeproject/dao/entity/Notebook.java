package com.itdev.innovativeproject.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "Notebook")
public class Notebook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "Production_ID", unique = true, nullable = false)
    private int productionId;

    @Column(name = "ComputerDetails_ID")
    private int computerDetailsId;

    @Column(name = "Diagonal")
    private int diagonal;

    // Constructors


    public Notebook() {
    }


    public Notebook(int productionId, int computerDetailsId, int diagonal) {
        this.productionId = productionId;
        this.computerDetailsId = computerDetailsId;
        this.diagonal = diagonal;
    }

    // methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductionId() {
        return productionId;
    }

    public void setProductionId(int productionId) {
        this.productionId = productionId;
    }

    public int getComputerDetailsId() {
        return computerDetailsId;
    }

    public void setComputerDetailsId(int computerDetailsId) {
        this.computerDetailsId = computerDetailsId;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    // toString method for easy debugging
    @Override
    public String toString() {
        return "Notebook{" +
                "id=" + id +
                ", productionId=" + productionId +
                ", computerDetailsId=" + computerDetailsId +
                ", diagonal=" + diagonal +
                '}';
    }
}