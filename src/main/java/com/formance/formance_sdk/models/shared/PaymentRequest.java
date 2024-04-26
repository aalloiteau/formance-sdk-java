/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Optional;


public class PaymentRequest {

    @JsonProperty("amount")
    private BigInteger amount;

    @JsonProperty("asset")
    private String asset;

    @JsonProperty("connectorID")
    private String connectorID;

    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("destinationAccountID")
    private Optional<? extends String> destinationAccountID;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("scheme")
    private PaymentScheme scheme;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceAccountID")
    private Optional<? extends String> sourceAccountID;

    @JsonProperty("status")
    private PaymentStatus status;

    @JsonProperty("type")
    private PaymentType type;

    @JsonCreator
    public PaymentRequest(
            @JsonProperty("amount") BigInteger amount,
            @JsonProperty("asset") String asset,
            @JsonProperty("connectorID") String connectorID,
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("destinationAccountID") Optional<? extends String> destinationAccountID,
            @JsonProperty("reference") String reference,
            @JsonProperty("scheme") PaymentScheme scheme,
            @JsonProperty("sourceAccountID") Optional<? extends String> sourceAccountID,
            @JsonProperty("status") PaymentStatus status,
            @JsonProperty("type") PaymentType type) {
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(asset, "asset");
        Utils.checkNotNull(connectorID, "connectorID");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(destinationAccountID, "destinationAccountID");
        Utils.checkNotNull(reference, "reference");
        Utils.checkNotNull(scheme, "scheme");
        Utils.checkNotNull(sourceAccountID, "sourceAccountID");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(type, "type");
        this.amount = amount;
        this.asset = asset;
        this.connectorID = connectorID;
        this.createdAt = createdAt;
        this.destinationAccountID = destinationAccountID;
        this.reference = reference;
        this.scheme = scheme;
        this.sourceAccountID = sourceAccountID;
        this.status = status;
        this.type = type;
    }
    
    public PaymentRequest(
            BigInteger amount,
            String asset,
            String connectorID,
            OffsetDateTime createdAt,
            String reference,
            PaymentScheme scheme,
            PaymentStatus status,
            PaymentType type) {
        this(amount, asset, connectorID, createdAt, Optional.empty(), reference, scheme, Optional.empty(), status, type);
    }

    @JsonIgnore
    public BigInteger amount() {
        return amount;
    }

    @JsonIgnore
    public String asset() {
        return asset;
    }

    @JsonIgnore
    public String connectorID() {
        return connectorID;
    }

    @JsonIgnore
    public OffsetDateTime createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public Optional<? extends String> destinationAccountID() {
        return destinationAccountID;
    }

    @JsonIgnore
    public String reference() {
        return reference;
    }

    @JsonIgnore
    public PaymentScheme scheme() {
        return scheme;
    }

    @JsonIgnore
    public Optional<? extends String> sourceAccountID() {
        return sourceAccountID;
    }

    @JsonIgnore
    public PaymentStatus status() {
        return status;
    }

    @JsonIgnore
    public PaymentType type() {
        return type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PaymentRequest withAmount(long amount) {
        this.amount = BigInteger.valueOf(amount);
        return this;
    }

    public PaymentRequest withAmount(BigInteger amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    public PaymentRequest withAsset(String asset) {
        Utils.checkNotNull(asset, "asset");
        this.asset = asset;
        return this;
    }

    public PaymentRequest withConnectorID(String connectorID) {
        Utils.checkNotNull(connectorID, "connectorID");
        this.connectorID = connectorID;
        return this;
    }

    public PaymentRequest withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public PaymentRequest withDestinationAccountID(String destinationAccountID) {
        Utils.checkNotNull(destinationAccountID, "destinationAccountID");
        this.destinationAccountID = Optional.ofNullable(destinationAccountID);
        return this;
    }

    public PaymentRequest withDestinationAccountID(Optional<? extends String> destinationAccountID) {
        Utils.checkNotNull(destinationAccountID, "destinationAccountID");
        this.destinationAccountID = destinationAccountID;
        return this;
    }

    public PaymentRequest withReference(String reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = reference;
        return this;
    }

    public PaymentRequest withScheme(PaymentScheme scheme) {
        Utils.checkNotNull(scheme, "scheme");
        this.scheme = scheme;
        return this;
    }

    public PaymentRequest withSourceAccountID(String sourceAccountID) {
        Utils.checkNotNull(sourceAccountID, "sourceAccountID");
        this.sourceAccountID = Optional.ofNullable(sourceAccountID);
        return this;
    }

    public PaymentRequest withSourceAccountID(Optional<? extends String> sourceAccountID) {
        Utils.checkNotNull(sourceAccountID, "sourceAccountID");
        this.sourceAccountID = sourceAccountID;
        return this;
    }

    public PaymentRequest withStatus(PaymentStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public PaymentRequest withType(PaymentType type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
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
        PaymentRequest other = (PaymentRequest) o;
        return 
            java.util.Objects.deepEquals(this.amount, other.amount) &&
            java.util.Objects.deepEquals(this.asset, other.asset) &&
            java.util.Objects.deepEquals(this.connectorID, other.connectorID) &&
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.destinationAccountID, other.destinationAccountID) &&
            java.util.Objects.deepEquals(this.reference, other.reference) &&
            java.util.Objects.deepEquals(this.scheme, other.scheme) &&
            java.util.Objects.deepEquals(this.sourceAccountID, other.sourceAccountID) &&
            java.util.Objects.deepEquals(this.status, other.status) &&
            java.util.Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            amount,
            asset,
            connectorID,
            createdAt,
            destinationAccountID,
            reference,
            scheme,
            sourceAccountID,
            status,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PaymentRequest.class,
                "amount", amount,
                "asset", asset,
                "connectorID", connectorID,
                "createdAt", createdAt,
                "destinationAccountID", destinationAccountID,
                "reference", reference,
                "scheme", scheme,
                "sourceAccountID", sourceAccountID,
                "status", status,
                "type", type);
    }
    
    public final static class Builder {
 
        private BigInteger amount;
 
        private String asset;
 
        private String connectorID;
 
        private OffsetDateTime createdAt;
 
        private Optional<? extends String> destinationAccountID = Optional.empty();
 
        private String reference;
 
        private PaymentScheme scheme;
 
        private Optional<? extends String> sourceAccountID = Optional.empty();
 
        private PaymentStatus status;
 
        private PaymentType type;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder amount(long amount) {
            this.amount = BigInteger.valueOf(amount);
            return this;
        }

        public Builder amount(BigInteger amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
            return this;
        }

        public Builder asset(String asset) {
            Utils.checkNotNull(asset, "asset");
            this.asset = asset;
            return this;
        }

        public Builder connectorID(String connectorID) {
            Utils.checkNotNull(connectorID, "connectorID");
            this.connectorID = connectorID;
            return this;
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        public Builder destinationAccountID(String destinationAccountID) {
            Utils.checkNotNull(destinationAccountID, "destinationAccountID");
            this.destinationAccountID = Optional.ofNullable(destinationAccountID);
            return this;
        }

        public Builder destinationAccountID(Optional<? extends String> destinationAccountID) {
            Utils.checkNotNull(destinationAccountID, "destinationAccountID");
            this.destinationAccountID = destinationAccountID;
            return this;
        }

        public Builder reference(String reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = reference;
            return this;
        }

        public Builder scheme(PaymentScheme scheme) {
            Utils.checkNotNull(scheme, "scheme");
            this.scheme = scheme;
            return this;
        }

        public Builder sourceAccountID(String sourceAccountID) {
            Utils.checkNotNull(sourceAccountID, "sourceAccountID");
            this.sourceAccountID = Optional.ofNullable(sourceAccountID);
            return this;
        }

        public Builder sourceAccountID(Optional<? extends String> sourceAccountID) {
            Utils.checkNotNull(sourceAccountID, "sourceAccountID");
            this.sourceAccountID = sourceAccountID;
            return this;
        }

        public Builder status(PaymentStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        public Builder type(PaymentType type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public PaymentRequest build() {
            return new PaymentRequest(
                amount,
                asset,
                connectorID,
                createdAt,
                destinationAccountID,
                reference,
                scheme,
                sourceAccountID,
                status,
                type);
        }
    }
}

