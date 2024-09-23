/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;

public class V2GetAccountRequestBuilder {

    private V2GetAccountRequest request;
    private final SDKMethodInterfaces.MethodCallV2GetAccount sdk;

    public V2GetAccountRequestBuilder(SDKMethodInterfaces.MethodCallV2GetAccount sdk) {
        this.sdk = sdk;
    }

    public V2GetAccountRequestBuilder request(V2GetAccountRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V2GetAccountResponse call() throws Exception {

        return sdk.getAccount(
            request);
    }
}
