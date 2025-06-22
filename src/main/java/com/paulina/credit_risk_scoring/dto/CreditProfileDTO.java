package com.paulina.credit_risk_scoring.dto;

import com.paulina.credit_risk_scoring.rest.enums.EmploymentStatus;
import com.paulina.credit_risk_scoring.rest.enums.MaritalStatus;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreditProfileDTO {

    @NotNull(message = "clientId is required")
    Long clientId;

    @NotNull(message = "Monthly gross income is required")
    @Positive(message = "Monthly gross income must be positive")
    Double monthlyGrossIncome;

    @NotNull(message = "Employment status is required")
    EmploymentStatus employmentStatus;

    @NotNull(message = "Marital status is required")
    MaritalStatus maritalStatus;

    @NotNull(message = "Number of dependents is required")
    @Min(value = 0, message = "Number of dependents cannot be negative")
    Integer numberOfDependents;

    @NotNull(message = "Property ownership is required")
    Boolean ownsProperty;

    @NotNull(message = "Information about other loans is required")
    Boolean hasOtherLoans;

    @NotNull(message = "Credit history length is required")
    @Min(value = 0, message = "Credit history length cannot be negative")
    Integer creditHistoryLengthMonths;
}
