package com.itdev.innovativeproject.dao.entity;

import javax.persistence.*;

@Entity
@Table(name="Drive")
public class Drive implements BaseEntity<Integer> {
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto generate
    @Column (name ="ID")
    private Integer id;
    @OneToOne
    @JoinColumn(name="Production_ID")
    private Production production;
    @ManyToOne
    @JoinColumn(name="DiskType_ID")
    private Disk_type disk_type;
    @Column(name="Capacity")
    private int capacity;
    @Column(name="REadSpeed")
    private int readSpeed;
    // constructors
    public Drive()
    {

    }
    public Drive(Production productionId,Disk_type diskTypeId,int capacity,int readSpeed)
    {
        this.production = productionId;
        this.disk_type = diskTypeId;
        this.capacity = capacity;
        this.readSpeed = readSpeed;
    }
    // methods
    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id=id;
    }
    public Production getProductionId()
    {
        return production;
    }

    public void setProductionId(Production productionId) {
        this.production = productionId;
    }
    public Disk_type getDiskTypeId()
    {
        return disk_type;
    }
    public void setDiskTypeId(Disk_type diskTypeID)
    {
        this.disk_type =diskTypeID;
    }
    public int getCapacity()
    {
        return capacity;
    }
    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }
    public int getReadSpeed()
    {
        return readSpeed;
    }

    public void setReadSpeed(int readSpeed)
    {
        this.readSpeed = readSpeed;
    }
    @Override
    public String toString()
    {
        return "Drive{" +
                "id=" + id +
                ", production=" + production +
                ", disk_type=" + disk_type+
                ", capacity=" + capacity +
                ", readSpeed=" + readSpeed +
                '}';
    }

}