/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;

public class UpdateClientRequestBuilder {

    private UpdateClientRequest request;
    private final SDKMethodInterfaces.MethodCallUpdateClient sdk;

    public UpdateClientRequestBuilder(SDKMethodInterfaces.MethodCallUpdateClient sdk) {
        this.sdk = sdk;
    }

    public UpdateClientRequestBuilder request(UpdateClientRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdateClientResponse call() throws Exception {

        return sdk.updateClient(
            request);
    }
}
