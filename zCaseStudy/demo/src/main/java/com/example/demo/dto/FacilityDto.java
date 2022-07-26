package com.example.demo.dto;

import com.example.demo.model.Contract;
import com.example.demo.model.FacilityType;
import com.example.demo.model.RentType;

import java.util.Set;

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
}
