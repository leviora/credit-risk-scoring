package com.paulina.credit_risk_scoring.rest.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum MaritalStatus {
    SINGLE,
    MARRIED,
    DIVORCED,
    WIDOWED;

    @JsonCreator
    public static MaritalStatus fromString(String value) {
        try {
            return MaritalStatus.valueOf(value.toUpperCase());
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid MaritalStatus: " + value);
        }
    }

    @JsonValue
    public String toValue() {
        return this.name();
    }
}
