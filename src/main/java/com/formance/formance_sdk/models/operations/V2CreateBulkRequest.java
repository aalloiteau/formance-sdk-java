/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.models.shared.V2BulkElement;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class V2CreateBulkRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends List<V2BulkElement>> requestBody;

    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    private String ledger;

    @JsonCreator
    public V2CreateBulkRequest(
            Optional<? extends List<V2BulkElement>> requestBody,
            String ledger) {
        Utils.checkNotNull(requestBody, "requestBody");
        Utils.checkNotNull(ledger, "ledger");
        this.requestBody = requestBody;
        this.ledger = ledger;
    }
    
    public V2CreateBulkRequest(
            String ledger) {
        this(Optional.empty(), ledger);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<V2BulkElement>> requestBody() {
        return (Optional<List<V2BulkElement>>) requestBody;
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

    public V2CreateBulkRequest withRequestBody(List<V2BulkElement> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = Optional.ofNullable(requestBody);
        return this;
    }

    public V2CreateBulkRequest withRequestBody(Optional<? extends List<V2BulkElement>> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    /**
     * Name of the ledger.
     */
    public V2CreateBulkRequest withLedger(String ledger) {
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
        V2CreateBulkRequest other = (V2CreateBulkRequest) o;
        return 
            Objects.deepEquals(this.requestBody, other.requestBody) &&
            Objects.deepEquals(this.ledger, other.ledger);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            requestBody,
            ledger);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2CreateBulkRequest.class,
                "requestBody", requestBody,
                "ledger", ledger);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<V2BulkElement>> requestBody = Optional.empty();
 
        private String ledger;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder requestBody(List<V2BulkElement> requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = Optional.ofNullable(requestBody);
            return this;
        }

        public Builder requestBody(Optional<? extends List<V2BulkElement>> requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
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
        
        public V2CreateBulkRequest build() {
            return new V2CreateBulkRequest(
                requestBody,
                ledger);
        }
    }
}

