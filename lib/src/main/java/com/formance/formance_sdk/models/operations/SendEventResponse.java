/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class SendEventResponse {
    
    public String contentType;

    public SendEventResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * General error
     */
    
    public com.formance.formance_sdk.models.shared.Error error;

    public SendEventResponse withError(com.formance.formance_sdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    
    public Integer statusCode;

    public SendEventResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public SendEventResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public SendEventResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
