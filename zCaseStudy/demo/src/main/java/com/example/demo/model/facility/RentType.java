package com.example.demo.model.facility;

import com.example.demo.model.facility.Facility;

import javax.persistence.*;
import java.util.Set;

@Entity
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rentTypeId;
    private String rentTypeName;
    @OneToMany(mappedBy = "rentType", cascade = CascadeType.ALL)
    private Set<Facility> facilities;

    public RentType() {
    }

    public RentType(int rentTypeId, String rentTypeName, Set<Facility> facilities) {
        this.rentTypeId = rentTypeId;
        this.rentTypeName = rentTypeName;
        this.facilities = facilities;
    }

    public int getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(int rentTypeId) {
        this.rentTypeId = rentTypeId;
    }

    public String getRentTypeName() {
        return rentTypeName;
    }

    public void setRentTypeName(String rentTypeName) {
        this.rentTypeName = rentTypeName;
    }

    public Set<Facility> getFacilities() {
        return facilities;
    }

    public void setFacilities(Set<Facility> facilities) {
        this.facilities = facilities;
    }
}
