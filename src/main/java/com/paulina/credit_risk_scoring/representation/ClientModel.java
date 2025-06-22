package com.paulina.credit_risk_scoring.representation;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.hateoas.RepresentationModel;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClientModel extends RepresentationModel<ClientModel> {

    String name;
    String lastName;
    LocalDate dateOfBirth;
    String email;
    String phoneNumber;
    String address;
    String city;
    String postalCode;
    String country;

}
