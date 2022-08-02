package com.example.demo.dto;

import com.example.demo.model.facility.FacilityType;
import com.example.demo.model.facility.RentType;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class FacilityDto {
    private Integer facilityId;
    @NotEmpty
    @Pattern(regexp = "^[a-zA-ZàáâäãåąčćęèéêëėįìíîïłńòóôöõøùúûüųūÿýżźñçčšžÀÁÂÄÃÅĄĆČĖĘÈÉÊËÌÍÎÏĮŁŃÒ\n" +
            "        ÓÔÖÕØÙÚÛÜŲŪŸÝŻŹÑßÇŒÆČŠŽ∂ð ,.'-]+$", message = "Wrong format")
    private String facilityName;
    @Pattern(regexp = "^[0-9]+$", message = "Has plus")
    private Integer facilityArea;
    @Pattern(regexp = "^[0-9]+$", message = "Has plus")
    private Double facilityCost;
    @Pattern(regexp = "^[0-9]+$", message = "Has plus")
    private Integer facilityMaxPeople;
    private RentType rentType;
    private FacilityType facilityType;
    private String facilityStandardRoom;
    private String facilityDescriptionOtherConvenience;
    @Pattern(regexp = "^[0-9]+$", message = "Has plus")
    private String facilityPoolArea;
    @Pattern(regexp = "^[0-9]+$", message = "Has plus")
    private String facilityNumberOfFloors;
    private String facilityFreeService;
//    private Set<Contract> contracts;

    public FacilityDto() {
    }

    public FacilityDto(Integer facilityId, String facilityName, Integer facilityArea, Double facilityCost, Integer facilityMaxPeople, RentType rentType, FacilityType facilityType, String facilityStandardRoom, String facilityDescriptionOtherConvenience, String facilityPoolArea, String facilityNumberOfFloors, String facilityFreeService) {
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

    public Integer getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Integer facilityId) {
        this.facilityId = facilityId;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public Integer getFacilityArea() {
        return facilityArea;
    }

    public void setFacilityArea(Integer facilityArea) {
        this.facilityArea = facilityArea;
    }

    public Double getFacilityCost() {
        return facilityCost;
    }

    public void setFacilityCost(Double facilityCost) {
        this.facilityCost = facilityCost;
    }

    public Integer getFacilityMaxPeople() {
        return facilityMaxPeople;
    }

    public void setFacilityMaxPeople(Integer facilityMaxPeople) {
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
