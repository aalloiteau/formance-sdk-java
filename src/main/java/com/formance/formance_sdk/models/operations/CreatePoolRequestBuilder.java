/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.models.shared.PoolRequest;
import com.formance.formance_sdk.utils.Utils;

public class CreatePoolRequestBuilder {

    private PoolRequest request;
    private final SDKMethodInterfaces.MethodCallCreatePool sdk;

    public CreatePoolRequestBuilder(SDKMethodInterfaces.MethodCallCreatePool sdk) {
        this.sdk = sdk;
    }

    public CreatePoolRequestBuilder request(PoolRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreatePoolResponse call() throws Exception {

        return sdk.createPool(
            request);
    }
}
