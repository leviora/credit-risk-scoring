package com.paulina.credit_risk_scoring.rest.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum RiskLevel {

    LOW,
    MEDIUM,
    HIGH;

    @JsonCreator
    public static RiskLevel fromString(String value) {
        try {
            return RiskLevel.valueOf(value.toUpperCase());
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid RiskLevel: " + value);
        }
    }

    @JsonValue
    public String toValue() {
        return this.name();
    }
}
