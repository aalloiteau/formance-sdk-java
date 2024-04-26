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


public class OrchestrationPaymentMetadata {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    private Optional<? extends String> key;

    @JsonCreator
    public OrchestrationPaymentMetadata(
            @JsonProperty("key") Optional<? extends String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
    }
    
    public OrchestrationPaymentMetadata() {
        this(Optional.empty());
    }

    @JsonIgnore
    public Optional<? extends String> key() {
        return key;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public OrchestrationPaymentMetadata withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = Optional.ofNullable(key);
        return this;
    }

    public OrchestrationPaymentMetadata withKey(Optional<? extends String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
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
        OrchestrationPaymentMetadata other = (OrchestrationPaymentMetadata) o;
        return 
            java.util.Objects.deepEquals(this.key, other.key);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            key);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OrchestrationPaymentMetadata.class,
                "key", key);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> key = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder key(String key) {
            Utils.checkNotNull(key, "key");
            this.key = Optional.ofNullable(key);
            return this;
        }

        public Builder key(Optional<? extends String> key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
            return this;
        }
        
        public OrchestrationPaymentMetadata build() {
            return new OrchestrationPaymentMetadata(
                key);
        }
    }
}

