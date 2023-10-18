package com.itdev.innovativeproject.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "Monitor")
public class Monitor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "Production_ID", unique = true, nullable = false)
    private int productionId;

    @Column(name = "DiagonalMon")
    private int diagonalMon;

    @Column(name = "DisplayType_ID")
    private String displayTypeId;

    @Column(name = "Frequency")
    private int frequency;

    // constructors
    public Monitor() {
    }


    public Monitor(int productionId, int diagonalMon, String displayTypeId, int frequency) {
        this.productionId = productionId;
        this.diagonalMon = diagonalMon;
        this.displayTypeId = displayTypeId;
        this.frequency = frequency;
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

    public int getDiagonalMon() {
        return diagonalMon;
    }

    public void setDiagonalMon(int diagonalMon) {
        this.diagonalMon = diagonalMon;
    }

    public String getDisplayTypeId() {
        return displayTypeId;
    }

    public void setDisplayTypeId(String displayTypeId) {
        this.displayTypeId = displayTypeId;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }


    @Override
    public String toString() {
        return "Monitor{" +
                "id=" + id +
                ", productionId=" + productionId +
                ", diagonalMon=" + diagonalMon +
                ", displayTypeId=" + displayTypeId +
                ", frequency=" + frequency +
                '}';
    }
}
