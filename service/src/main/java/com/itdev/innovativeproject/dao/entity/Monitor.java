package com.itdev.innovativeproject.dao.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Monitor")
public class Monitor implements BaseEntity<Integer> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @OneToOne
    @JoinColumn(name="Production_ID")
    private Production production;

    @ManyToOne
    @JoinColumn(name="DisplayType_ID")

    private Display_type displayType;
    @Column(name = "DiagonalMon")
    private int diagonalMon;


    @Column(name = "Frequency")
    private int frequency;

    // constructors
    public Monitor() {
    }


    public Monitor(Production production, int diagonalMon, Display_type displayType, int frequency) {
        this.production = production;
        this.diagonalMon = diagonalMon;
        this.displayType = displayType;
    }

    // methods
    @Override
    public Integer getId() {
        return id;
    }
    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Production getProduction() {
        return production;
    }

    public void setProduction(Production productionId) {
        this.production = productionId;
    }

    public int getDiagonalMon() {
        return diagonalMon;
    }

    public void setDiagonalMon(int diagonalMon) {
        this.diagonalMon = diagonalMon;
    }

    public Display_type getDisplayType() {
        return displayType;
    }

    public void setDisplayTypeId(Display_type DisplayType) {
        this.displayType = DisplayType;
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
                ", productionId=" + production +
                ", diagonalMon=" + diagonalMon +
                ", displayTypeId=" + displayType +
                ", frequency=" + frequency +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monitor)) return false;
        Monitor monitor = (Monitor) o;
        return diagonalMon == monitor.diagonalMon && frequency == monitor.frequency && Objects.equals(id, monitor.id) && Objects.equals(production, monitor.production) && Objects.equals(displayType, monitor.displayType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, production, displayType, diagonalMon, frequency);
    }
}
