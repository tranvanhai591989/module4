package travelcustomer.travelcustomer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import travelcustomer.travelcustomer.dto.FlightBookingAcknowledgement;
import travelcustomer.travelcustomer.dto.FlightBookingRequest;
import travelcustomer.travelcustomer.model.PassengerInfo;
import travelcustomer.travelcustomer.model.PaymentInfo;
import travelcustomer.travelcustomer.repository.PassengerInfoRepository;
import travelcustomer.travelcustomer.repository.PaymentInfoRepository;
import travelcustomer.travelcustomer.utils.PaymentUtils;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
public class FlightBookingService {
    @Autowired
    private PassengerInfoRepository passengerInfoRepository;

    @Autowired
    private PaymentInfoRepository paymentInfoRepository;

    @Transactional
    public FlightBookingAcknowledgement bookingFlightTicket(FlightBookingRequest request) {

        PassengerInfo passengerInfo = request.getPassengerInfo();
        passengerInfoRepository.save(passengerInfo);

        PaymentInfo paymentInfo = request.getPaymentInfo();

        PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(), passengerInfo.getFare());

        passengerInfo.setPassengerId(passengerInfo.getPassengerId());
        paymentInfo.setAmount(passengerInfo.getFare());
        paymentInfoRepository.save(paymentInfo);
        return new FlightBookingAcknowledgement("success", passengerInfo.getFare(),
                UUID.randomUUID().toString().split("_")[0], passengerInfo);

    }
}
