package com.paulina.credit_risk_scoring.dto;

import jakarta.validation.constraints.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

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

    @NotNull(message = "Date of birth is mandatory")
    @Past(message = "Date of birth must be in the past")
    LocalDate dateOfBirth;

    @Email(message = "Email should be valid")
    String email;

    @Pattern(regexp = "\\+?[0-9]{7,15}", message = "Phone number should be valid")
    String phoneNumber;

    @NotBlank(message = "Address is mandatory")
    String address;

    @NotBlank(message = "City is mandatory")
    String city;

    @NotBlank(message = "Postal code is mandatory")
    String postalCode;

    @NotBlank(message = "Country is mandatory")
    String country;
}
