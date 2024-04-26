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


public class V2ActivityGetAccountOutput {

    @JsonProperty("data")
    private V2Account data;

    @JsonCreator
    public V2ActivityGetAccountOutput(
            @JsonProperty("data") V2Account data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    @JsonIgnore
    public V2Account data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2ActivityGetAccountOutput withData(V2Account data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
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
        V2ActivityGetAccountOutput other = (V2ActivityGetAccountOutput) o;
        return 
            java.util.Objects.deepEquals(this.data, other.data);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            data);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2ActivityGetAccountOutput.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private V2Account data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(V2Account data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public V2ActivityGetAccountOutput build() {
            return new V2ActivityGetAccountOutput(
                data);
        }
    }
}

