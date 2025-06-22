package com.paulina.credit_risk_scoring.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LoanApplicationDTO {

    @NotNull
    Long clientId;

    @NotNull
    @Min(value = 1000, message = "Minimalna kwota kredytu to 1000")
    Double requestedAmount;

    @NotNull
    @Min(value = 6, message = "Minimalny okres to 6 miesięcy")
    Integer requestedTermInMonths;

    @NotNull
    LocalDate applicationDate;
}
