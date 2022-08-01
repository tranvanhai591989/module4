package travelcustomer.travelcustomer.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PassengerInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long passengerId;
    private  String name;
    private  String email;
    private  String source;
    private  String destination;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-mm-yyy")
    private Date travelDate;
    private  String pickupTime;
    private  String arrivalTime;
    private  double fare;
}
