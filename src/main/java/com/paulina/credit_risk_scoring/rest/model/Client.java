package com.paulina.credit_risk_scoring.rest.model;

import com.paulina.credit_risk_scoring.rest.enums.EmploymentStatus;
import com.paulina.credit_risk_scoring.rest.enums.MaritalStatus;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    String lastName;

    Integer age;

    Double income;

    MaritalStatus maritalStatus;

    EmploymentStatus employmentStatus;
}
