/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class DeactivateConfigResponse {
    /**
     * Config successfully deactivated.
     */
    
    public com.formance.formance_sdk.models.shared.ConfigResponse configResponse;

    public DeactivateConfigResponse withConfigResponse(com.formance.formance_sdk.models.shared.ConfigResponse configResponse) {
        this.configResponse = configResponse;
        return this;
    }
    
    
    public String contentType;

    public DeactivateConfigResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public DeactivateConfigResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public DeactivateConfigResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Error
     */
    
    public com.formance.formance_sdk.models.shared.WebhooksErrorResponse webhooksErrorResponse;

    public DeactivateConfigResponse withWebhooksErrorResponse(com.formance.formance_sdk.models.shared.WebhooksErrorResponse webhooksErrorResponse) {
        this.webhooksErrorResponse = webhooksErrorResponse;
        return this;
    }
    
    public DeactivateConfigResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
