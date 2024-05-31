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

public class UpdateMappingRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends com.formance.formance_sdk.models.shared.Mapping> mapping;

    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    private String ledger;

    @JsonCreator
    public UpdateMappingRequest(
            Optional<? extends com.formance.formance_sdk.models.shared.Mapping> mapping,
            String ledger) {
        Utils.checkNotNull(mapping, "mapping");
        Utils.checkNotNull(ledger, "ledger");
        this.mapping = mapping;
        this.ledger = ledger;
    }
    
    public UpdateMappingRequest(
            String ledger) {
        this(Optional.empty(), ledger);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.formance.formance_sdk.models.shared.Mapping> mapping() {
        return (Optional<com.formance.formance_sdk.models.shared.Mapping>) mapping;
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

    public UpdateMappingRequest withMapping(com.formance.formance_sdk.models.shared.Mapping mapping) {
        Utils.checkNotNull(mapping, "mapping");
        this.mapping = Optional.ofNullable(mapping);
        return this;
    }

    public UpdateMappingRequest withMapping(Optional<? extends com.formance.formance_sdk.models.shared.Mapping> mapping) {
        Utils.checkNotNull(mapping, "mapping");
        this.mapping = mapping;
        return this;
    }

    /**
     * Name of the ledger.
     */
    public UpdateMappingRequest withLedger(String ledger) {
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
        UpdateMappingRequest other = (UpdateMappingRequest) o;
        return 
            java.util.Objects.deepEquals(this.mapping, other.mapping) &&
            java.util.Objects.deepEquals(this.ledger, other.ledger);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            mapping,
            ledger);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateMappingRequest.class,
                "mapping", mapping,
                "ledger", ledger);
    }
    
    public final static class Builder {
 
        private Optional<? extends com.formance.formance_sdk.models.shared.Mapping> mapping = Optional.empty();
 
        private String ledger;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder mapping(com.formance.formance_sdk.models.shared.Mapping mapping) {
            Utils.checkNotNull(mapping, "mapping");
            this.mapping = Optional.ofNullable(mapping);
            return this;
        }

        public Builder mapping(Optional<? extends com.formance.formance_sdk.models.shared.Mapping> mapping) {
            Utils.checkNotNull(mapping, "mapping");
            this.mapping = mapping;
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
        
        public UpdateMappingRequest build() {
            return new UpdateMappingRequest(
                mapping,
                ledger);
        }
    }
}

