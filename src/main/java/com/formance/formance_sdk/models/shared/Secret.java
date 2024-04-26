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
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class Secret {

    @JsonProperty("clear")
    private String clear;

    @JsonProperty("id")
    private String id;

    @JsonProperty("lastDigits")
    private String lastDigits;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<? extends java.util.Map<String, java.lang.Object>> metadata;

    @JsonProperty("name")
    private String name;

    @JsonCreator
    public Secret(
            @JsonProperty("clear") String clear,
            @JsonProperty("id") String id,
            @JsonProperty("lastDigits") String lastDigits,
            @JsonProperty("metadata") Optional<? extends java.util.Map<String, java.lang.Object>> metadata,
            @JsonProperty("name") String name) {
        Utils.checkNotNull(clear, "clear");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(lastDigits, "lastDigits");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(name, "name");
        this.clear = clear;
        this.id = id;
        this.lastDigits = lastDigits;
        this.metadata = metadata;
        this.name = name;
    }
    
    public Secret(
            String clear,
            String id,
            String lastDigits,
            String name) {
        this(clear, id, lastDigits, Optional.empty(), name);
    }

    @JsonIgnore
    public String clear() {
        return clear;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public String lastDigits() {
        return lastDigits;
    }

    @JsonIgnore
    public Optional<? extends java.util.Map<String, java.lang.Object>> metadata() {
        return metadata;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Secret withClear(String clear) {
        Utils.checkNotNull(clear, "clear");
        this.clear = clear;
        return this;
    }

    public Secret withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public Secret withLastDigits(String lastDigits) {
        Utils.checkNotNull(lastDigits, "lastDigits");
        this.lastDigits = lastDigits;
        return this;
    }

    public Secret withMetadata(java.util.Map<String, java.lang.Object> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    public Secret withMetadata(Optional<? extends java.util.Map<String, java.lang.Object>> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public Secret withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
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
        Secret other = (Secret) o;
        return 
            java.util.Objects.deepEquals(this.clear, other.clear) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.lastDigits, other.lastDigits) &&
            java.util.Objects.deepEquals(this.metadata, other.metadata) &&
            java.util.Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            clear,
            id,
            lastDigits,
            metadata,
            name);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Secret.class,
                "clear", clear,
                "id", id,
                "lastDigits", lastDigits,
                "metadata", metadata,
                "name", name);
    }
    
    public final static class Builder {
 
        private String clear;
 
        private String id;
 
        private String lastDigits;
 
        private Optional<? extends java.util.Map<String, java.lang.Object>> metadata = Optional.empty();
 
        private String name;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder clear(String clear) {
            Utils.checkNotNull(clear, "clear");
            this.clear = clear;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder lastDigits(String lastDigits) {
            Utils.checkNotNull(lastDigits, "lastDigits");
            this.lastDigits = lastDigits;
            return this;
        }

        public Builder metadata(java.util.Map<String, java.lang.Object> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        public Builder metadata(Optional<? extends java.util.Map<String, java.lang.Object>> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }
        
        public Secret build() {
            return new Secret(
                clear,
                id,
                lastDigits,
                metadata,
                name);
        }
    }
}

