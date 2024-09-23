/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;

public class ListConnectorTasksRequestBuilder {

    private ListConnectorTasksRequest request;
    private final SDKMethodInterfaces.MethodCallListConnectorTasks sdk;

    public ListConnectorTasksRequestBuilder(SDKMethodInterfaces.MethodCallListConnectorTasks sdk) {
        this.sdk = sdk;
    }

    public ListConnectorTasksRequestBuilder request(ListConnectorTasksRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListConnectorTasksResponse call() throws Exception {

        return sdk.listConnectorTasks(
            request);
    }
}
