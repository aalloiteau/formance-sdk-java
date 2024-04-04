/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk;

import com.formance.formance_sdk.utils.HTTPClient;
import com.formance.formance_sdk.utils.RetryConfig;
import com.formance.formance_sdk.models.shared.Security;
import java.util.Optional;

class SDKConfiguration {
    public SecuritySource securitySource;
    public HTTPClient defaultClient;
	  public String serverUrl;
    public int serverIdx = 0;
  	public String language = "java";
  	public String openapiDocVersion = "v2.0.0-rc.19";
  	public String sdkVersion = "2.2.3";
  	public String genVersion = "2.298.2";
  	public String userAgent = "speakeasy-sdk/java 2.2.3 2.298.2 v2.0.0-rc.19 com.formance.formance_sdk";
  	
  	
    public Optional<RetryConfig> retryConfig = Optional.empty();
}
