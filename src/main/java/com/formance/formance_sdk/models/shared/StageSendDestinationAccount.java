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
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class StageSendDestinationAccount {

    @JsonProperty("id")
    private String id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ledger")
    private Optional<? extends String> ledger;

    @JsonCreator
    public StageSendDestinationAccount(
            @JsonProperty("id") String id,
            @JsonProperty("ledger") Optional<? extends String> ledger) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(ledger, "ledger");
        this.id = id;
        this.ledger = ledger;
    }
    
    public StageSendDestinationAccount(
            String id) {
        this(id, Optional.empty());
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public Optional<? extends String> ledger() {
        return ledger;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public StageSendDestinationAccount withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public StageSendDestinationAccount withLedger(String ledger) {
        Utils.checkNotNull(ledger, "ledger");
        this.ledger = Optional.ofNullable(ledger);
        return this;
    }

    public StageSendDestinationAccount withLedger(Optional<? extends String> ledger) {
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
        StageSendDestinationAccount other = (StageSendDestinationAccount) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.ledger, other.ledger);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            ledger);
    }
    
    @Override
    public String toString() {
        return Utils.toString(StageSendDestinationAccount.class,
                "id", id,
                "ledger", ledger);
    }
    
    public final static class Builder {
 
        private String id;
 
        private Optional<? extends String> ledger = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder ledger(String ledger) {
            Utils.checkNotNull(ledger, "ledger");
            this.ledger = Optional.ofNullable(ledger);
            return this;
        }

        public Builder ledger(Optional<? extends String> ledger) {
            Utils.checkNotNull(ledger, "ledger");
            this.ledger = ledger;
            return this;
        }
        
        public StageSendDestinationAccount build() {
            return new StageSendDestinationAccount(
                id,
                ledger);
        }
    }
}

