/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class ConfigInfo {

    @JsonProperty("config")
    private Config config;

    @JsonProperty("server")
    private String server;

    @JsonProperty("version")
    private String version;

    @JsonCreator
    public ConfigInfo(
            @JsonProperty("config") Config config,
            @JsonProperty("server") String server,
            @JsonProperty("version") String version) {
        Utils.checkNotNull(config, "config");
        Utils.checkNotNull(server, "server");
        Utils.checkNotNull(version, "version");
        this.config = config;
        this.server = server;
        this.version = version;
    }

    @JsonIgnore
    public Config config() {
        return config;
    }

    @JsonIgnore
    public String server() {
        return server;
    }

    @JsonIgnore
    public String version() {
        return version;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ConfigInfo withConfig(Config config) {
        Utils.checkNotNull(config, "config");
        this.config = config;
        return this;
    }

    public ConfigInfo withServer(String server) {
        Utils.checkNotNull(server, "server");
        this.server = server;
        return this;
    }

    public ConfigInfo withVersion(String version) {
        Utils.checkNotNull(version, "version");
        this.version = version;
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
        ConfigInfo other = (ConfigInfo) o;
        return 
            java.util.Objects.deepEquals(this.config, other.config) &&
            java.util.Objects.deepEquals(this.server, other.server) &&
            java.util.Objects.deepEquals(this.version, other.version);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            config,
            server,
            version);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ConfigInfo.class,
                "config", config,
                "server", server,
                "version", version);
    }
    
    public final static class Builder {
 
        private Config config;
 
        private String server;
 
        private String version;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder config(Config config) {
            Utils.checkNotNull(config, "config");
            this.config = config;
            return this;
        }

        public Builder server(String server) {
            Utils.checkNotNull(server, "server");
            this.server = server;
            return this;
        }

        public Builder version(String version) {
            Utils.checkNotNull(version, "version");
            this.version = version;
            return this;
        }
        
        public ConfigInfo build() {
            return new ConfigInfo(
                config,
                server,
                version);
        }
    }
}

