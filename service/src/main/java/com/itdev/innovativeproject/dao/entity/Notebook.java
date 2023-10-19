package com.itdev.innovativeproject.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "Notebook")
public class Notebook implements BaseEntity<Integer> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @OneToOne
    @JoinColumn(name="Production_ID")
    private Production production;

    @ManyToOne
    @JoinColumn(name="ComputerDetails_ID")
    private ComputerDetails computerDetails;

    @Column(name = "Diagonal")
    private int diagonal;

    // Constructors


    public Notebook() {
    }


    public Notebook(Production production, ComputerDetails computerDetails, int diagonal) {
        this.production = production;
        this.computerDetails = computerDetails;
        this.diagonal = diagonal;
    }

    // methods

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Production getProduction() {
        return production;
    }

    public void setProduction(Production production) {
        this.production = production;
    }

    public ComputerDetails getComputerDetails() {
        return computerDetails;
    }

    public void setComputerDetails(ComputerDetails computerDetails) {
        this.computerDetails = computerDetails;
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
                ", productionId=" + production +
                ", computerDetailsId=" + computerDetails +
                ", diagonal=" + diagonal +
                '}';
    }
}