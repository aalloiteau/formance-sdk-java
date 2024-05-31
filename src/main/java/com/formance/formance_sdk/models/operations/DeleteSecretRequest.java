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

public class DeleteSecretRequest {

    /**
     * Client ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=clientId")
    private String clientId;

    /**
     * Secret ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=secretId")
    private String secretId;

    @JsonCreator
    public DeleteSecretRequest(
            String clientId,
            String secretId) {
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(secretId, "secretId");
        this.clientId = clientId;
        this.secretId = secretId;
    }

    /**
     * Client ID
     */
    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    /**
     * Secret ID
     */
    @JsonIgnore
    public String secretId() {
        return secretId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Client ID
     */
    public DeleteSecretRequest withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * Secret ID
     */
    public DeleteSecretRequest withSecretId(String secretId) {
        Utils.checkNotNull(secretId, "secretId");
        this.secretId = secretId;
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
        DeleteSecretRequest other = (DeleteSecretRequest) o;
        return 
            java.util.Objects.deepEquals(this.clientId, other.clientId) &&
            java.util.Objects.deepEquals(this.secretId, other.secretId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            clientId,
            secretId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeleteSecretRequest.class,
                "clientId", clientId,
                "secretId", secretId);
    }
    
    public final static class Builder {
 
        private String clientId;
 
        private String secretId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Client ID
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * Secret ID
         */
        public Builder secretId(String secretId) {
            Utils.checkNotNull(secretId, "secretId");
            this.secretId = secretId;
            return this;
        }
        
        public DeleteSecretRequest build() {
            return new DeleteSecretRequest(
                clientId,
                secretId);
        }
    }
}

