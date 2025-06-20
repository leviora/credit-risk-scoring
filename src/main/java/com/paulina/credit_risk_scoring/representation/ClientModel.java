package com.paulina.credit_risk_scoring.representation;

import com.paulina.credit_risk_scoring.rest.enums.EmploymentStatus;
import com.paulina.credit_risk_scoring.rest.enums.MaritalStatus;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.hateoas.RepresentationModel;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClientModel extends RepresentationModel<ClientModel> {

    String name;
    String lastName;
    Integer age;
    Double income;
    MaritalStatus maritalStatus;
    EmploymentStatus employmentStatus;
}
