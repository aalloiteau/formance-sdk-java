/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetMappingResponse {
    
    public String contentType;

    public GetMappingResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Error
     */
    
    public com.formance.formance_sdk.models.shared.ErrorResponse errorResponse;

    public GetMappingResponse withErrorResponse(com.formance.formance_sdk.models.shared.ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public com.formance.formance_sdk.models.shared.MappingResponse mappingResponse;

    public GetMappingResponse withMappingResponse(com.formance.formance_sdk.models.shared.MappingResponse mappingResponse) {
        this.mappingResponse = mappingResponse;
        return this;
    }
    
    
    public Integer statusCode;

    public GetMappingResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetMappingResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetMappingResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
