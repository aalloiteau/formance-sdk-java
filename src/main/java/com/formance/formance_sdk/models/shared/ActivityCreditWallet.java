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

public class ActivityCreditWallet {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    private Optional<? extends CreditWalletRequest> data;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends String> id;

    @JsonCreator
    public ActivityCreditWallet(
            @JsonProperty("data") Optional<? extends CreditWalletRequest> data,
            @JsonProperty("id") Optional<? extends String> id) {
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(id, "id");
        this.data = data;
        this.id = id;
    }
    
    public ActivityCreditWallet() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CreditWalletRequest> data() {
        return (Optional<CreditWalletRequest>) data;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> id() {
        return (Optional<String>) id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ActivityCreditWallet withData(CreditWalletRequest data) {
        Utils.checkNotNull(data, "data");
        this.data = Optional.ofNullable(data);
        return this;
    }

    public ActivityCreditWallet withData(Optional<? extends CreditWalletRequest> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    public ActivityCreditWallet withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public ActivityCreditWallet withId(Optional<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
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
        ActivityCreditWallet other = (ActivityCreditWallet) o;
        return 
            java.util.Objects.deepEquals(this.data, other.data) &&
            java.util.Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            data,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ActivityCreditWallet.class,
                "data", data,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends CreditWalletRequest> data = Optional.empty();
 
        private Optional<? extends String> id = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(CreditWalletRequest data) {
            Utils.checkNotNull(data, "data");
            this.data = Optional.ofNullable(data);
            return this;
        }

        public Builder data(Optional<? extends CreditWalletRequest> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<? extends String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public ActivityCreditWallet build() {
            return new ActivityCreditWallet(
                data,
                id);
        }
    }
}

