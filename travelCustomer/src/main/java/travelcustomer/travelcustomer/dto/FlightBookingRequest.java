package travelcustomer.travelcustomer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import travelcustomer.travelcustomer.model.PassengerInfo;
import travelcustomer.travelcustomer.model.PaymentInfo;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {
    private PassengerInfo passengerInfo;
    private PaymentInfo paymentInfo;
}
