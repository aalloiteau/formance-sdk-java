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

public class GenericConfig {

    @JsonProperty("apiKey")
    private String apiKey;

    @JsonProperty("endpoint")
    private String endpoint;

    @JsonProperty("name")
    private String name;

    /**
     * The frequency at which the connector will try to fetch new BalanceTransaction objects from the API.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pollingPeriod")
    private Optional<? extends String> pollingPeriod;

    @JsonCreator
    public GenericConfig(
            @JsonProperty("apiKey") String apiKey,
            @JsonProperty("endpoint") String endpoint,
            @JsonProperty("name") String name,
            @JsonProperty("pollingPeriod") Optional<? extends String> pollingPeriod) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(endpoint, "endpoint");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(pollingPeriod, "pollingPeriod");
        this.apiKey = apiKey;
        this.endpoint = endpoint;
        this.name = name;
        this.pollingPeriod = pollingPeriod;
    }
    
    public GenericConfig(
            String apiKey,
            String endpoint,
            String name) {
        this(apiKey, endpoint, name, Optional.empty());
    }

    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    @JsonIgnore
    public String endpoint() {
        return endpoint;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    /**
     * The frequency at which the connector will try to fetch new BalanceTransaction objects from the API.
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

    public GenericConfig withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    public GenericConfig withEndpoint(String endpoint) {
        Utils.checkNotNull(endpoint, "endpoint");
        this.endpoint = endpoint;
        return this;
    }

    public GenericConfig withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The frequency at which the connector will try to fetch new BalanceTransaction objects from the API.
     * 
     */
    public GenericConfig withPollingPeriod(String pollingPeriod) {
        Utils.checkNotNull(pollingPeriod, "pollingPeriod");
        this.pollingPeriod = Optional.ofNullable(pollingPeriod);
        return this;
    }

    /**
     * The frequency at which the connector will try to fetch new BalanceTransaction objects from the API.
     * 
     */
    public GenericConfig withPollingPeriod(Optional<? extends String> pollingPeriod) {
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
        GenericConfig other = (GenericConfig) o;
        return 
            java.util.Objects.deepEquals(this.apiKey, other.apiKey) &&
            java.util.Objects.deepEquals(this.endpoint, other.endpoint) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.pollingPeriod, other.pollingPeriod);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiKey,
            endpoint,
            name,
            pollingPeriod);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GenericConfig.class,
                "apiKey", apiKey,
                "endpoint", endpoint,
                "name", name,
                "pollingPeriod", pollingPeriod);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private String endpoint;
 
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

        public Builder endpoint(String endpoint) {
            Utils.checkNotNull(endpoint, "endpoint");
            this.endpoint = endpoint;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * The frequency at which the connector will try to fetch new BalanceTransaction objects from the API.
         * 
         */
        public Builder pollingPeriod(String pollingPeriod) {
            Utils.checkNotNull(pollingPeriod, "pollingPeriod");
            this.pollingPeriod = Optional.ofNullable(pollingPeriod);
            return this;
        }

        /**
         * The frequency at which the connector will try to fetch new BalanceTransaction objects from the API.
         * 
         */
        public Builder pollingPeriod(Optional<? extends String> pollingPeriod) {
            Utils.checkNotNull(pollingPeriod, "pollingPeriod");
            this.pollingPeriod = pollingPeriod;
            return this;
        }
        
        public GenericConfig build() {
            if (pollingPeriod == null) {
                pollingPeriod = _SINGLETON_VALUE_PollingPeriod.value();
            }
            return new GenericConfig(
                apiKey,
                endpoint,
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

