/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;

public class V2ListAccountsResponse implements com.formance.formance_sdk.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * OK
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.V2AccountsCursorResponse> v2AccountsCursorResponse;

    @JsonCreator
    public V2ListAccountsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.formance.formance_sdk.models.shared.V2AccountsCursorResponse> v2AccountsCursorResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(v2AccountsCursorResponse, "v2AccountsCursorResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.v2AccountsCursorResponse = v2AccountsCursorResponse;
    }
    
    public V2ListAccountsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, Optional.empty());
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    /**
     * OK
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.formance.formance_sdk.models.shared.V2AccountsCursorResponse> v2AccountsCursorResponse() {
        return (Optional<com.formance.formance_sdk.models.shared.V2AccountsCursorResponse>) v2AccountsCursorResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public V2ListAccountsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public V2ListAccountsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public V2ListAccountsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * OK
     */
    public V2ListAccountsResponse withV2AccountsCursorResponse(com.formance.formance_sdk.models.shared.V2AccountsCursorResponse v2AccountsCursorResponse) {
        Utils.checkNotNull(v2AccountsCursorResponse, "v2AccountsCursorResponse");
        this.v2AccountsCursorResponse = Optional.ofNullable(v2AccountsCursorResponse);
        return this;
    }

    /**
     * OK
     */
    public V2ListAccountsResponse withV2AccountsCursorResponse(Optional<? extends com.formance.formance_sdk.models.shared.V2AccountsCursorResponse> v2AccountsCursorResponse) {
        Utils.checkNotNull(v2AccountsCursorResponse, "v2AccountsCursorResponse");
        this.v2AccountsCursorResponse = v2AccountsCursorResponse;
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
        V2ListAccountsResponse other = (V2ListAccountsResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.v2AccountsCursorResponse, other.v2AccountsCursorResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            v2AccountsCursorResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2ListAccountsResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "v2AccountsCursorResponse", v2AccountsCursorResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.V2AccountsCursorResponse> v2AccountsCursorResponse = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }

        /**
         * OK
         */
        public Builder v2AccountsCursorResponse(com.formance.formance_sdk.models.shared.V2AccountsCursorResponse v2AccountsCursorResponse) {
            Utils.checkNotNull(v2AccountsCursorResponse, "v2AccountsCursorResponse");
            this.v2AccountsCursorResponse = Optional.ofNullable(v2AccountsCursorResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder v2AccountsCursorResponse(Optional<? extends com.formance.formance_sdk.models.shared.V2AccountsCursorResponse> v2AccountsCursorResponse) {
            Utils.checkNotNull(v2AccountsCursorResponse, "v2AccountsCursorResponse");
            this.v2AccountsCursorResponse = v2AccountsCursorResponse;
            return this;
        }
        
        public V2ListAccountsResponse build() {
            return new V2ListAccountsResponse(
                contentType,
                statusCode,
                rawResponse,
                v2AccountsCursorResponse);
        }
    }
}

