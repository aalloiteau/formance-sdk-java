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

public class StageSendSource {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account")
    private Optional<? extends StageSendSourceAccount> account;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment")
    private Optional<? extends StageSendSourcePayment> payment;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("wallet")
    private Optional<? extends StageSendSourceWallet> wallet;

    @JsonCreator
    public StageSendSource(
            @JsonProperty("account") Optional<? extends StageSendSourceAccount> account,
            @JsonProperty("payment") Optional<? extends StageSendSourcePayment> payment,
            @JsonProperty("wallet") Optional<? extends StageSendSourceWallet> wallet) {
        Utils.checkNotNull(account, "account");
        Utils.checkNotNull(payment, "payment");
        Utils.checkNotNull(wallet, "wallet");
        this.account = account;
        this.payment = payment;
        this.wallet = wallet;
    }
    
    public StageSendSource() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<StageSendSourceAccount> account() {
        return (Optional<StageSendSourceAccount>) account;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<StageSendSourcePayment> payment() {
        return (Optional<StageSendSourcePayment>) payment;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<StageSendSourceWallet> wallet() {
        return (Optional<StageSendSourceWallet>) wallet;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public StageSendSource withAccount(StageSendSourceAccount account) {
        Utils.checkNotNull(account, "account");
        this.account = Optional.ofNullable(account);
        return this;
    }

    public StageSendSource withAccount(Optional<? extends StageSendSourceAccount> account) {
        Utils.checkNotNull(account, "account");
        this.account = account;
        return this;
    }

    public StageSendSource withPayment(StageSendSourcePayment payment) {
        Utils.checkNotNull(payment, "payment");
        this.payment = Optional.ofNullable(payment);
        return this;
    }

    public StageSendSource withPayment(Optional<? extends StageSendSourcePayment> payment) {
        Utils.checkNotNull(payment, "payment");
        this.payment = payment;
        return this;
    }

    public StageSendSource withWallet(StageSendSourceWallet wallet) {
        Utils.checkNotNull(wallet, "wallet");
        this.wallet = Optional.ofNullable(wallet);
        return this;
    }

    public StageSendSource withWallet(Optional<? extends StageSendSourceWallet> wallet) {
        Utils.checkNotNull(wallet, "wallet");
        this.wallet = wallet;
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
        StageSendSource other = (StageSendSource) o;
        return 
            java.util.Objects.deepEquals(this.account, other.account) &&
            java.util.Objects.deepEquals(this.payment, other.payment) &&
            java.util.Objects.deepEquals(this.wallet, other.wallet);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            account,
            payment,
            wallet);
    }
    
    @Override
    public String toString() {
        return Utils.toString(StageSendSource.class,
                "account", account,
                "payment", payment,
                "wallet", wallet);
    }
    
    public final static class Builder {
 
        private Optional<? extends StageSendSourceAccount> account = Optional.empty();
 
        private Optional<? extends StageSendSourcePayment> payment = Optional.empty();
 
        private Optional<? extends StageSendSourceWallet> wallet = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder account(StageSendSourceAccount account) {
            Utils.checkNotNull(account, "account");
            this.account = Optional.ofNullable(account);
            return this;
        }

        public Builder account(Optional<? extends StageSendSourceAccount> account) {
            Utils.checkNotNull(account, "account");
            this.account = account;
            return this;
        }

        public Builder payment(StageSendSourcePayment payment) {
            Utils.checkNotNull(payment, "payment");
            this.payment = Optional.ofNullable(payment);
            return this;
        }

        public Builder payment(Optional<? extends StageSendSourcePayment> payment) {
            Utils.checkNotNull(payment, "payment");
            this.payment = payment;
            return this;
        }

        public Builder wallet(StageSendSourceWallet wallet) {
            Utils.checkNotNull(wallet, "wallet");
            this.wallet = Optional.ofNullable(wallet);
            return this;
        }

        public Builder wallet(Optional<? extends StageSendSourceWallet> wallet) {
            Utils.checkNotNull(wallet, "wallet");
            this.wallet = wallet;
            return this;
        }
        
        public StageSendSource build() {
            return new StageSendSource(
                account,
                payment,
                wallet);
        }
    }
}

