/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class Transactions {

    @JsonProperty("transactions")
    private java.util.List<TransactionData> transactions;

    @JsonCreator
    public Transactions(
            @JsonProperty("transactions") java.util.List<TransactionData> transactions) {
        Utils.checkNotNull(transactions, "transactions");
        this.transactions = transactions;
    }

    @JsonIgnore
    public java.util.List<TransactionData> transactions() {
        return transactions;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Transactions withTransactions(java.util.List<TransactionData> transactions) {
        Utils.checkNotNull(transactions, "transactions");
        this.transactions = transactions;
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
        Transactions other = (Transactions) o;
        return 
            java.util.Objects.deepEquals(this.transactions, other.transactions);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            transactions);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Transactions.class,
                "transactions", transactions);
    }
    
    public final static class Builder {
 
        private java.util.List<TransactionData> transactions;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder transactions(java.util.List<TransactionData> transactions) {
            Utils.checkNotNull(transactions, "transactions");
            this.transactions = transactions;
            return this;
        }
        
        public Transactions build() {
            return new Transactions(
                transactions);
        }
    }
}

