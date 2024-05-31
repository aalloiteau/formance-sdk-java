/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class AddMetadataToAccountRequest {

    /**
     * metadata
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends java.util.Map<String, java.lang.Object>> requestBody;

    /**
     * Exact address of the account. It must match the following regular expressions pattern:
     * ```
     * ^\w+(:\w+)*$
     * ```
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=address")
    private String address;

    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    private String ledger;

    @JsonCreator
    public AddMetadataToAccountRequest(
            Optional<? extends java.util.Map<String, java.lang.Object>> requestBody,
            String address,
            String ledger) {
        Utils.checkNotNull(requestBody, "requestBody");
        Utils.checkNotNull(address, "address");
        Utils.checkNotNull(ledger, "ledger");
        this.requestBody = requestBody;
        this.address = address;
        this.ledger = ledger;
    }
    
    public AddMetadataToAccountRequest(
            String address,
            String ledger) {
        this(Optional.empty(), address, ledger);
    }

    /**
     * metadata
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.Map<String, java.lang.Object>> requestBody() {
        return (Optional<java.util.Map<String, java.lang.Object>>) requestBody;
    }

    /**
     * Exact address of the account. It must match the following regular expressions pattern:
     * ```
     * ^\w+(:\w+)*$
     * ```
     * 
     */
    @JsonIgnore
    public String address() {
        return address;
    }

    /**
     * Name of the ledger.
     */
    @JsonIgnore
    public String ledger() {
        return ledger;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * metadata
     */
    public AddMetadataToAccountRequest withRequestBody(java.util.Map<String, java.lang.Object> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = Optional.ofNullable(requestBody);
        return this;
    }

    /**
     * metadata
     */
    public AddMetadataToAccountRequest withRequestBody(Optional<? extends java.util.Map<String, java.lang.Object>> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    /**
     * Exact address of the account. It must match the following regular expressions pattern:
     * ```
     * ^\w+(:\w+)*$
     * ```
     * 
     */
    public AddMetadataToAccountRequest withAddress(String address) {
        Utils.checkNotNull(address, "address");
        this.address = address;
        return this;
    }

    /**
     * Name of the ledger.
     */
    public AddMetadataToAccountRequest withLedger(String ledger) {
        Utils.checkNotNull(ledger, "ledger");
        this.ledger = ledger;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddMetadataToAccountRequest other = (AddMetadataToAccountRequest) o;
        return 
            java.util.Objects.deepEquals(this.requestBody, other.requestBody) &&
            java.util.Objects.deepEquals(this.address, other.address) &&
            java.util.Objects.deepEquals(this.ledger, other.ledger);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            requestBody,
            address,
            ledger);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AddMetadataToAccountRequest.class,
                "requestBody", requestBody,
                "address", address,
                "ledger", ledger);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.Map<String, java.lang.Object>> requestBody = Optional.empty();
 
        private String address;
 
        private String ledger;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * metadata
         */
        public Builder requestBody(java.util.Map<String, java.lang.Object> requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = Optional.ofNullable(requestBody);
            return this;
        }

        /**
         * metadata
         */
        public Builder requestBody(Optional<? extends java.util.Map<String, java.lang.Object>> requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }

        /**
         * Exact address of the account. It must match the following regular expressions pattern:
         * ```
         * ^\w+(:\w+)*$
         * ```
         * 
         */
        public Builder address(String address) {
            Utils.checkNotNull(address, "address");
            this.address = address;
            return this;
        }

        /**
         * Name of the ledger.
         */
        public Builder ledger(String ledger) {
            Utils.checkNotNull(ledger, "ledger");
            this.ledger = ledger;
            return this;
        }
        
        public AddMetadataToAccountRequest build() {
            return new AddMetadataToAccountRequest(
                requestBody,
                address,
                ledger);
        }
    }
}

