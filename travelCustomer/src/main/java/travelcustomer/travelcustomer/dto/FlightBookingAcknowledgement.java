package travelcustomer.travelcustomer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import travelcustomer.travelcustomer.model.PassengerInfo;
@Data
@AllArgsConstructor
@NoArgsConstructor  
public class FlightBookingAcknowledgement {
    private String status;
    private double totalFare;
    private String pnrNo;
    private PassengerInfo passengerInfo;
}
