package com.paulina.credit_risk_scoring.rest.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum EmploymentStatus {
    EMPLOYED,
    UNEMPLOYED,
    SELF_EMPLOYED,
    RETIRED,
    STUDENT;

    @JsonCreator
    public static EmploymentStatus fromString(String value) {
        try {
            return EmploymentStatus.valueOf(value.toUpperCase());
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid EmploymentStatus: " + value);
        }
    }

    @JsonValue
    public String toValue() {
        return this.name();
    }
}
