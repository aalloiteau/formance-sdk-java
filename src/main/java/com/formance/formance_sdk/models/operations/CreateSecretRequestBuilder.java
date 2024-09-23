/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;

public class CreateSecretRequestBuilder {

    private CreateSecretRequest request;
    private final SDKMethodInterfaces.MethodCallCreateSecret sdk;

    public CreateSecretRequestBuilder(SDKMethodInterfaces.MethodCallCreateSecret sdk) {
        this.sdk = sdk;
    }

    public CreateSecretRequestBuilder request(CreateSecretRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateSecretResponse call() throws Exception {

        return sdk.createSecret(
            request);
    }
}
