/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum V2PaymentStatus {
    PENDING("PENDING"),
    ACTIVE("ACTIVE"),
    TERMINATED("TERMINATED"),
    FAILED("FAILED"),
    SUCCEEDED("SUCCEEDED"),
    CANCELLED("CANCELLED");

    @JsonValue
    private final String value;

    private V2PaymentStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
