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


public class V2StageSendSource {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account")
    private Optional<? extends V2StageSendSourceAccount> account;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment")
    private Optional<? extends V2StageSendSourcePayment> payment;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("wallet")
    private Optional<? extends V2StageSendSourceWallet> wallet;

    @JsonCreator
    public V2StageSendSource(
            @JsonProperty("account") Optional<? extends V2StageSendSourceAccount> account,
            @JsonProperty("payment") Optional<? extends V2StageSendSourcePayment> payment,
            @JsonProperty("wallet") Optional<? extends V2StageSendSourceWallet> wallet) {
        Utils.checkNotNull(account, "account");
        Utils.checkNotNull(payment, "payment");
        Utils.checkNotNull(wallet, "wallet");
        this.account = account;
        this.payment = payment;
        this.wallet = wallet;
    }
    
    public V2StageSendSource() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<? extends V2StageSendSourceAccount> account() {
        return account;
    }

    @JsonIgnore
    public Optional<? extends V2StageSendSourcePayment> payment() {
        return payment;
    }

    @JsonIgnore
    public Optional<? extends V2StageSendSourceWallet> wallet() {
        return wallet;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2StageSendSource withAccount(V2StageSendSourceAccount account) {
        Utils.checkNotNull(account, "account");
        this.account = Optional.ofNullable(account);
        return this;
    }

    public V2StageSendSource withAccount(Optional<? extends V2StageSendSourceAccount> account) {
        Utils.checkNotNull(account, "account");
        this.account = account;
        return this;
    }

    public V2StageSendSource withPayment(V2StageSendSourcePayment payment) {
        Utils.checkNotNull(payment, "payment");
        this.payment = Optional.ofNullable(payment);
        return this;
    }

    public V2StageSendSource withPayment(Optional<? extends V2StageSendSourcePayment> payment) {
        Utils.checkNotNull(payment, "payment");
        this.payment = payment;
        return this;
    }

    public V2StageSendSource withWallet(V2StageSendSourceWallet wallet) {
        Utils.checkNotNull(wallet, "wallet");
        this.wallet = Optional.ofNullable(wallet);
        return this;
    }

    public V2StageSendSource withWallet(Optional<? extends V2StageSendSourceWallet> wallet) {
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
        V2StageSendSource other = (V2StageSendSource) o;
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
        return Utils.toString(V2StageSendSource.class,
                "account", account,
                "payment", payment,
                "wallet", wallet);
    }
    
    public final static class Builder {
 
        private Optional<? extends V2StageSendSourceAccount> account = Optional.empty();
 
        private Optional<? extends V2StageSendSourcePayment> payment = Optional.empty();
 
        private Optional<? extends V2StageSendSourceWallet> wallet = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder account(V2StageSendSourceAccount account) {
            Utils.checkNotNull(account, "account");
            this.account = Optional.ofNullable(account);
            return this;
        }

        public Builder account(Optional<? extends V2StageSendSourceAccount> account) {
            Utils.checkNotNull(account, "account");
            this.account = account;
            return this;
        }

        public Builder payment(V2StageSendSourcePayment payment) {
            Utils.checkNotNull(payment, "payment");
            this.payment = Optional.ofNullable(payment);
            return this;
        }

        public Builder payment(Optional<? extends V2StageSendSourcePayment> payment) {
            Utils.checkNotNull(payment, "payment");
            this.payment = payment;
            return this;
        }

        public Builder wallet(V2StageSendSourceWallet wallet) {
            Utils.checkNotNull(wallet, "wallet");
            this.wallet = Optional.ofNullable(wallet);
            return this;
        }

        public Builder wallet(Optional<? extends V2StageSendSourceWallet> wallet) {
            Utils.checkNotNull(wallet, "wallet");
            this.wallet = wallet;
            return this;
        }
        
        public V2StageSendSource build() {
            return new V2StageSendSource(
                account,
                payment,
                wallet);
        }
    }
}

