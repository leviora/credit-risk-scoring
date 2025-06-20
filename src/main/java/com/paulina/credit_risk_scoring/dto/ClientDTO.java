package com.paulina.credit_risk_scoring.dto;

import com.paulina.credit_risk_scoring.rest.enums.EmploymentStatus;
import com.paulina.credit_risk_scoring.rest.enums.MaritalStatus;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClientDTO {

    String name;
    String lastName;
    Integer age;
    Double income;
    MaritalStatus maritalStatus;
    EmploymentStatus employmentStatus;
}
