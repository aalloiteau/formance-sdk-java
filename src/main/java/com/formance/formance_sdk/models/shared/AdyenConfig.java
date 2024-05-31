/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.LazySingletonValue;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class AdyenConfig {

    @JsonProperty("apiKey")
    private String apiKey;

    @JsonProperty("hmacKey")
    private String hmacKey;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("liveEndpointPrefix")
    private Optional<? extends String> liveEndpointPrefix;

    @JsonProperty("name")
    private String name;

    /**
     * The frequency at which the connector will try to fetch new BalanceTransaction objects from Adyen API.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pollingPeriod")
    private Optional<? extends String> pollingPeriod;

    @JsonCreator
    public AdyenConfig(
            @JsonProperty("apiKey") String apiKey,
            @JsonProperty("hmacKey") String hmacKey,
            @JsonProperty("liveEndpointPrefix") Optional<? extends String> liveEndpointPrefix,
            @JsonProperty("name") String name,
            @JsonProperty("pollingPeriod") Optional<? extends String> pollingPeriod) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(hmacKey, "hmacKey");
        Utils.checkNotNull(liveEndpointPrefix, "liveEndpointPrefix");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(pollingPeriod, "pollingPeriod");
        this.apiKey = apiKey;
        this.hmacKey = hmacKey;
        this.liveEndpointPrefix = liveEndpointPrefix;
        this.name = name;
        this.pollingPeriod = pollingPeriod;
    }
    
    public AdyenConfig(
            String apiKey,
            String hmacKey,
            String name) {
        this(apiKey, hmacKey, Optional.empty(), name, Optional.empty());
    }

    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    @JsonIgnore
    public String hmacKey() {
        return hmacKey;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> liveEndpointPrefix() {
        return (Optional<String>) liveEndpointPrefix;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    /**
     * The frequency at which the connector will try to fetch new BalanceTransaction objects from Adyen API.
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> pollingPeriod() {
        return (Optional<String>) pollingPeriod;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public AdyenConfig withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    public AdyenConfig withHmacKey(String hmacKey) {
        Utils.checkNotNull(hmacKey, "hmacKey");
        this.hmacKey = hmacKey;
        return this;
    }

    public AdyenConfig withLiveEndpointPrefix(String liveEndpointPrefix) {
        Utils.checkNotNull(liveEndpointPrefix, "liveEndpointPrefix");
        this.liveEndpointPrefix = Optional.ofNullable(liveEndpointPrefix);
        return this;
    }

    public AdyenConfig withLiveEndpointPrefix(Optional<? extends String> liveEndpointPrefix) {
        Utils.checkNotNull(liveEndpointPrefix, "liveEndpointPrefix");
        this.liveEndpointPrefix = liveEndpointPrefix;
        return this;
    }

    public AdyenConfig withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The frequency at which the connector will try to fetch new BalanceTransaction objects from Adyen API.
     * 
     */
    public AdyenConfig withPollingPeriod(String pollingPeriod) {
        Utils.checkNotNull(pollingPeriod, "pollingPeriod");
        this.pollingPeriod = Optional.ofNullable(pollingPeriod);
        return this;
    }

    /**
     * The frequency at which the connector will try to fetch new BalanceTransaction objects from Adyen API.
     * 
     */
    public AdyenConfig withPollingPeriod(Optional<? extends String> pollingPeriod) {
        Utils.checkNotNull(pollingPeriod, "pollingPeriod");
        this.pollingPeriod = pollingPeriod;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdyenConfig other = (AdyenConfig) o;
        return 
            java.util.Objects.deepEquals(this.apiKey, other.apiKey) &&
            java.util.Objects.deepEquals(this.hmacKey, other.hmacKey) &&
            java.util.Objects.deepEquals(this.liveEndpointPrefix, other.liveEndpointPrefix) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.pollingPeriod, other.pollingPeriod);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiKey,
            hmacKey,
            liveEndpointPrefix,
            name,
            pollingPeriod);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AdyenConfig.class,
                "apiKey", apiKey,
                "hmacKey", hmacKey,
                "liveEndpointPrefix", liveEndpointPrefix,
                "name", name,
                "pollingPeriod", pollingPeriod);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private String hmacKey;
 
        private Optional<? extends String> liveEndpointPrefix = Optional.empty();
 
        private String name;
 
        private Optional<? extends String> pollingPeriod;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        public Builder hmacKey(String hmacKey) {
            Utils.checkNotNull(hmacKey, "hmacKey");
            this.hmacKey = hmacKey;
            return this;
        }

        public Builder liveEndpointPrefix(String liveEndpointPrefix) {
            Utils.checkNotNull(liveEndpointPrefix, "liveEndpointPrefix");
            this.liveEndpointPrefix = Optional.ofNullable(liveEndpointPrefix);
            return this;
        }

        public Builder liveEndpointPrefix(Optional<? extends String> liveEndpointPrefix) {
            Utils.checkNotNull(liveEndpointPrefix, "liveEndpointPrefix");
            this.liveEndpointPrefix = liveEndpointPrefix;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * The frequency at which the connector will try to fetch new BalanceTransaction objects from Adyen API.
         * 
         */
        public Builder pollingPeriod(String pollingPeriod) {
            Utils.checkNotNull(pollingPeriod, "pollingPeriod");
            this.pollingPeriod = Optional.ofNullable(pollingPeriod);
            return this;
        }

        /**
         * The frequency at which the connector will try to fetch new BalanceTransaction objects from Adyen API.
         * 
         */
        public Builder pollingPeriod(Optional<? extends String> pollingPeriod) {
            Utils.checkNotNull(pollingPeriod, "pollingPeriod");
            this.pollingPeriod = pollingPeriod;
            return this;
        }
        
        public AdyenConfig build() {
            if (pollingPeriod == null) {
                pollingPeriod = _SINGLETON_VALUE_PollingPeriod.value();
            }
            return new AdyenConfig(
                apiKey,
                hmacKey,
                liveEndpointPrefix,
                name,
                pollingPeriod);
        }

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_PollingPeriod =
                new LazySingletonValue<>(
                        "pollingPeriod",
                        "\"120s\"",
                        new TypeReference<Optional<? extends String>>() {});
    }
}

