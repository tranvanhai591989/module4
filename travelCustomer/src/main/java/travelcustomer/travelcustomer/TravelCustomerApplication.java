package travelcustomer.travelcustomer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import travelcustomer.travelcustomer.dto.FlightBookingAcknowledgement;
import travelcustomer.travelcustomer.dto.FlightBookingRequest;
import travelcustomer.travelcustomer.service.FlightBookingService;

@SpringBootApplication
@RestController
public class TravelCustomerApplication {
    @Autowired
    private FlightBookingService flightBookingService;

    @PostMapping("bookFlightTicket")
    public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest request) {
        return flightBookingService.bookingFlightTicket(request);
    }

    public static void main(String[] args) {
        SpringApplication.run(TravelCustomerApplication.class, args);
    }

}
