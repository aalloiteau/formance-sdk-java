/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class InstallConnectorRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private com.formance.formance_sdk.models.shared.ConnectorConfig connectorConfig;

    /**
     * The name of the connector.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connector")
    private com.formance.formance_sdk.models.shared.Connector connector;

    @JsonCreator
    public InstallConnectorRequest(
            com.formance.formance_sdk.models.shared.ConnectorConfig connectorConfig,
            com.formance.formance_sdk.models.shared.Connector connector) {
        Utils.checkNotNull(connectorConfig, "connectorConfig");
        Utils.checkNotNull(connector, "connector");
        this.connectorConfig = connectorConfig;
        this.connector = connector;
    }

    @JsonIgnore
    public com.formance.formance_sdk.models.shared.ConnectorConfig connectorConfig() {
        return connectorConfig;
    }

    /**
     * The name of the connector.
     */
    @JsonIgnore
    public com.formance.formance_sdk.models.shared.Connector connector() {
        return connector;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public InstallConnectorRequest withConnectorConfig(com.formance.formance_sdk.models.shared.ConnectorConfig connectorConfig) {
        Utils.checkNotNull(connectorConfig, "connectorConfig");
        this.connectorConfig = connectorConfig;
        return this;
    }

    /**
     * The name of the connector.
     */
    public InstallConnectorRequest withConnector(com.formance.formance_sdk.models.shared.Connector connector) {
        Utils.checkNotNull(connector, "connector");
        this.connector = connector;
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
        InstallConnectorRequest other = (InstallConnectorRequest) o;
        return 
            java.util.Objects.deepEquals(this.connectorConfig, other.connectorConfig) &&
            java.util.Objects.deepEquals(this.connector, other.connector);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            connectorConfig,
            connector);
    }
    
    @Override
    public String toString() {
        return Utils.toString(InstallConnectorRequest.class,
                "connectorConfig", connectorConfig,
                "connector", connector);
    }
    
    public final static class Builder {
 
        private com.formance.formance_sdk.models.shared.ConnectorConfig connectorConfig;
 
        private com.formance.formance_sdk.models.shared.Connector connector;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder connectorConfig(com.formance.formance_sdk.models.shared.ConnectorConfig connectorConfig) {
            Utils.checkNotNull(connectorConfig, "connectorConfig");
            this.connectorConfig = connectorConfig;
            return this;
        }

        /**
         * The name of the connector.
         */
        public Builder connector(com.formance.formance_sdk.models.shared.Connector connector) {
            Utils.checkNotNull(connector, "connector");
            this.connector = connector;
            return this;
        }
        
        public InstallConnectorRequest build() {
            return new InstallConnectorRequest(
                connectorConfig,
                connector);
        }
    }
}

