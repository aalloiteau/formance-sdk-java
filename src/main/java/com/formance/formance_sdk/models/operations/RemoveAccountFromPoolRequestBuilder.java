/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;

public class RemoveAccountFromPoolRequestBuilder {

    private RemoveAccountFromPoolRequest request;
    private final SDKMethodInterfaces.MethodCallRemoveAccountFromPool sdk;

    public RemoveAccountFromPoolRequestBuilder(SDKMethodInterfaces.MethodCallRemoveAccountFromPool sdk) {
        this.sdk = sdk;
    }

    public RemoveAccountFromPoolRequestBuilder request(RemoveAccountFromPoolRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RemoveAccountFromPoolResponse call() throws Exception {

        return sdk.removeAccountFromPool(
            request);
    }
}
