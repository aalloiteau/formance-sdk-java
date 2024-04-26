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
import com.formance.formance_sdk.utils.LazySingletonValue;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class V2ActivityStripeTransfer {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amount")
    private Optional<? extends BigInteger> amount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("asset")
    private Optional<? extends String> asset;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("connectorID")
    private Optional<? extends String> connectorID;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("destination")
    private Optional<? extends String> destination;

    /**
     * A set of key/value pairs that you can attach to a transfer object.
     * It can be useful for storing additional information about the transfer in a structured format.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<? extends V2ActivityStripeTransferMetadata> metadata;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("waitingValidation")
    private Optional<? extends Boolean> waitingValidation;

    @JsonCreator
    public V2ActivityStripeTransfer(
            @JsonProperty("amount") Optional<? extends BigInteger> amount,
            @JsonProperty("asset") Optional<? extends String> asset,
            @JsonProperty("connectorID") Optional<? extends String> connectorID,
            @JsonProperty("destination") Optional<? extends String> destination,
            @JsonProperty("metadata") Optional<? extends V2ActivityStripeTransferMetadata> metadata,
            @JsonProperty("waitingValidation") Optional<? extends Boolean> waitingValidation) {
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(asset, "asset");
        Utils.checkNotNull(connectorID, "connectorID");
        Utils.checkNotNull(destination, "destination");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(waitingValidation, "waitingValidation");
        this.amount = amount;
        this.asset = asset;
        this.connectorID = connectorID;
        this.destination = destination;
        this.metadata = metadata;
        this.waitingValidation = waitingValidation;
    }
    
    public V2ActivityStripeTransfer() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<? extends BigInteger> amount() {
        return amount;
    }

    @JsonIgnore
    public Optional<? extends String> asset() {
        return asset;
    }

    @JsonIgnore
    public Optional<? extends String> connectorID() {
        return connectorID;
    }

    @JsonIgnore
    public Optional<? extends String> destination() {
        return destination;
    }

    /**
     * A set of key/value pairs that you can attach to a transfer object.
     * It can be useful for storing additional information about the transfer in a structured format.
     * 
     */
    @JsonIgnore
    public Optional<? extends V2ActivityStripeTransferMetadata> metadata() {
        return metadata;
    }

    @JsonIgnore
    public Optional<? extends Boolean> waitingValidation() {
        return waitingValidation;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2ActivityStripeTransfer withAmount(BigInteger amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = Optional.ofNullable(amount);
        return this;
    }

    public V2ActivityStripeTransfer withAmount(long amount) {
        this.amount = Optional.of(BigInteger.valueOf(amount));
        return this;
    }

    public V2ActivityStripeTransfer withAmount(Optional<? extends BigInteger> amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    public V2ActivityStripeTransfer withAsset(String asset) {
        Utils.checkNotNull(asset, "asset");
        this.asset = Optional.ofNullable(asset);
        return this;
    }

    public V2ActivityStripeTransfer withAsset(Optional<? extends String> asset) {
        Utils.checkNotNull(asset, "asset");
        this.asset = asset;
        return this;
    }

    public V2ActivityStripeTransfer withConnectorID(String connectorID) {
        Utils.checkNotNull(connectorID, "connectorID");
        this.connectorID = Optional.ofNullable(connectorID);
        return this;
    }

    public V2ActivityStripeTransfer withConnectorID(Optional<? extends String> connectorID) {
        Utils.checkNotNull(connectorID, "connectorID");
        this.connectorID = connectorID;
        return this;
    }

    public V2ActivityStripeTransfer withDestination(String destination) {
        Utils.checkNotNull(destination, "destination");
        this.destination = Optional.ofNullable(destination);
        return this;
    }

    public V2ActivityStripeTransfer withDestination(Optional<? extends String> destination) {
        Utils.checkNotNull(destination, "destination");
        this.destination = destination;
        return this;
    }

    /**
     * A set of key/value pairs that you can attach to a transfer object.
     * It can be useful for storing additional information about the transfer in a structured format.
     * 
     */
    public V2ActivityStripeTransfer withMetadata(V2ActivityStripeTransferMetadata metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    /**
     * A set of key/value pairs that you can attach to a transfer object.
     * It can be useful for storing additional information about the transfer in a structured format.
     * 
     */
    public V2ActivityStripeTransfer withMetadata(Optional<? extends V2ActivityStripeTransferMetadata> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public V2ActivityStripeTransfer withWaitingValidation(boolean waitingValidation) {
        Utils.checkNotNull(waitingValidation, "waitingValidation");
        this.waitingValidation = Optional.ofNullable(waitingValidation);
        return this;
    }

    public V2ActivityStripeTransfer withWaitingValidation(Optional<? extends Boolean> waitingValidation) {
        Utils.checkNotNull(waitingValidation, "waitingValidation");
        this.waitingValidation = waitingValidation;
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
        V2ActivityStripeTransfer other = (V2ActivityStripeTransfer) o;
        return 
            java.util.Objects.deepEquals(this.amount, other.amount) &&
            java.util.Objects.deepEquals(this.asset, other.asset) &&
            java.util.Objects.deepEquals(this.connectorID, other.connectorID) &&
            java.util.Objects.deepEquals(this.destination, other.destination) &&
            java.util.Objects.deepEquals(this.metadata, other.metadata) &&
            java.util.Objects.deepEquals(this.waitingValidation, other.waitingValidation);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            amount,
            asset,
            connectorID,
            destination,
            metadata,
            waitingValidation);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2ActivityStripeTransfer.class,
                "amount", amount,
                "asset", asset,
                "connectorID", connectorID,
                "destination", destination,
                "metadata", metadata,
                "waitingValidation", waitingValidation);
    }
    
    public final static class Builder {
 
        private Optional<? extends BigInteger> amount = Optional.empty();
 
        private Optional<? extends String> asset = Optional.empty();
 
        private Optional<? extends String> connectorID = Optional.empty();
 
        private Optional<? extends String> destination = Optional.empty();
 
        private Optional<? extends V2ActivityStripeTransferMetadata> metadata = Optional.empty();
 
        private Optional<? extends Boolean> waitingValidation;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder amount(BigInteger amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = Optional.ofNullable(amount);
            return this;
        }

        public Builder amount(long amount) {
            this.amount = Optional.of(BigInteger.valueOf(amount));
            return this;
        }

        public Builder amount(Optional<? extends BigInteger> amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
            return this;
        }

        public Builder asset(String asset) {
            Utils.checkNotNull(asset, "asset");
            this.asset = Optional.ofNullable(asset);
            return this;
        }

        public Builder asset(Optional<? extends String> asset) {
            Utils.checkNotNull(asset, "asset");
            this.asset = asset;
            return this;
        }

        public Builder connectorID(String connectorID) {
            Utils.checkNotNull(connectorID, "connectorID");
            this.connectorID = Optional.ofNullable(connectorID);
            return this;
        }

        public Builder connectorID(Optional<? extends String> connectorID) {
            Utils.checkNotNull(connectorID, "connectorID");
            this.connectorID = connectorID;
            return this;
        }

        public Builder destination(String destination) {
            Utils.checkNotNull(destination, "destination");
            this.destination = Optional.ofNullable(destination);
            return this;
        }

        public Builder destination(Optional<? extends String> destination) {
            Utils.checkNotNull(destination, "destination");
            this.destination = destination;
            return this;
        }

        /**
         * A set of key/value pairs that you can attach to a transfer object.
         * It can be useful for storing additional information about the transfer in a structured format.
         * 
         */
        public Builder metadata(V2ActivityStripeTransferMetadata metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        /**
         * A set of key/value pairs that you can attach to a transfer object.
         * It can be useful for storing additional information about the transfer in a structured format.
         * 
         */
        public Builder metadata(Optional<? extends V2ActivityStripeTransferMetadata> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        public Builder waitingValidation(boolean waitingValidation) {
            Utils.checkNotNull(waitingValidation, "waitingValidation");
            this.waitingValidation = Optional.ofNullable(waitingValidation);
            return this;
        }

        public Builder waitingValidation(Optional<? extends Boolean> waitingValidation) {
            Utils.checkNotNull(waitingValidation, "waitingValidation");
            this.waitingValidation = waitingValidation;
            return this;
        }
        
        public V2ActivityStripeTransfer build() {
            if (waitingValidation == null) {
                waitingValidation = _SINGLETON_VALUE_WaitingValidation.value();
            }
            return new V2ActivityStripeTransfer(
                amount,
                asset,
                connectorID,
                destination,
                metadata,
                waitingValidation);
        }

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_WaitingValidation =
                new LazySingletonValue<>(
                        "waitingValidation",
                        "false",
                        new TypeReference<Optional<? extends Boolean>>() {});
    }
}

