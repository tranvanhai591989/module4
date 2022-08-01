package com.example.demo.dto;

import com.example.demo.model.facility.FacilityType;
import com.example.demo.model.facility.RentType;

public class FacilityDto {
    private int facilityId;
    private String facilityName;
    private int facilityArea;
    private double facilityCost;
    private int facilityMaxPeople;
    private RentType rentType;
    private FacilityType facilityType;
    private String facilityStandardRoom;
    private String facilityDescriptionOtherConvenience;
    private String facilityPoolArea;
    private String facilityNumberOfFloors;
    private String facilityFreeService;
//    private Set<Contract> contracts;

    public FacilityDto() {
    }

    public FacilityDto(int facilityId, String facilityName, int facilityArea, double facilityCost, int facilityMaxPeople, RentType rentType, FacilityType facilityType, String facilityStandardRoom, String facilityDescriptionOtherConvenience, String facilityPoolArea, String facilityNumberOfFloors, String facilityFreeService) {

        this.facilityId = facilityId;
        this.facilityName = facilityName;
        this.facilityArea = facilityArea;
        this.facilityCost = facilityCost;
        this.facilityMaxPeople = facilityMaxPeople;
        this.rentType = rentType;
        this.facilityType = facilityType;
        this.facilityStandardRoom = facilityStandardRoom;
        this.facilityDescriptionOtherConvenience = facilityDescriptionOtherConvenience;
        this.facilityPoolArea = facilityPoolArea;
        this.facilityNumberOfFloors = facilityNumberOfFloors;
        this.facilityFreeService = facilityFreeService;
    }

    public int getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(int facilityId) {
        this.facilityId = facilityId;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public int getFacilityArea() {
        return facilityArea;
    }

    public void setFacilityArea(int facilityArea) {
        this.facilityArea = facilityArea;
    }

    public double getFacilityCost() {
        return facilityCost;
    }

    public void setFacilityCost(double facilityCost) {
        this.facilityCost = facilityCost;
    }

    public int getFacilityMaxPeople() {
        return facilityMaxPeople;
    }

    public void setFacilityMaxPeople(int facilityMaxPeople) {
        this.facilityMaxPeople = facilityMaxPeople;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public FacilityType getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(FacilityType facilityType) {
        this.facilityType = facilityType;
    }

    public String getFacilityStandardRoom() {
        return facilityStandardRoom;
    }

    public void setFacilityStandardRoom(String facilityStandardRoom) {
        this.facilityStandardRoom = facilityStandardRoom;
    }

    public String getFacilityDescriptionOtherConvenience() {
        return facilityDescriptionOtherConvenience;
    }

    public void setFacilityDescriptionOtherConvenience(String facilityDescriptionOtherConvenience) {
        this.facilityDescriptionOtherConvenience = facilityDescriptionOtherConvenience;
    }

    public String getFacilityPoolArea() {
        return facilityPoolArea;
    }

    public void setFacilityPoolArea(String facilityPoolArea) {
        this.facilityPoolArea = facilityPoolArea;
    }

    public String getFacilityNumberOfFloors() {
        return facilityNumberOfFloors;
    }

    public void setFacilityNumberOfFloors(String facilityNumberOfFloors) {
        this.facilityNumberOfFloors = facilityNumberOfFloors;
    }

    public String getFacilityFreeService() {
        return facilityFreeService;
    }

    public void setFacilityFreeService(String facilityFreeService) {
        this.facilityFreeService = facilityFreeService;
    }
}
