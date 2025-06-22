package com.paulina.credit_risk_scoring.dto;

import com.paulina.credit_risk_scoring.rest.enums.EmploymentStatus;
import com.paulina.credit_risk_scoring.rest.enums.MaritalStatus;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClientDTO {

    @NotBlank(message = "Name is mandatory")
    String name;

    @NotBlank(message = "Last name is mandatory")
    String lastName;

    @NotNull(message = "Age is mandatory")
    @Min(value = 18, message = "Age must be at least 18")
    Integer age;

    @NotNull(message = "Income is mandatory")
    @Min(value = 0, message = "Income must be positive")
    Double income;

    @NotNull(message = "Marital status is mandatory")
    MaritalStatus maritalStatus;

    @NotNull(message = "Employment status is mandatory")
    EmploymentStatus employmentStatus;
}
