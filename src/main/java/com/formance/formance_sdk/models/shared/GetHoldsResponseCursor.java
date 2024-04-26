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


public class GetHoldsResponseCursor {

    @JsonProperty("data")
    private java.util.List<Hold> data;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hasMore")
    private Optional<? extends Boolean> hasMore;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next")
    private Optional<? extends String> next;

    @JsonProperty("pageSize")
    private long pageSize;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("previous")
    private Optional<? extends String> previous;

    @JsonCreator
    public GetHoldsResponseCursor(
            @JsonProperty("data") java.util.List<Hold> data,
            @JsonProperty("hasMore") Optional<? extends Boolean> hasMore,
            @JsonProperty("next") Optional<? extends String> next,
            @JsonProperty("pageSize") long pageSize,
            @JsonProperty("previous") Optional<? extends String> previous) {
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(hasMore, "hasMore");
        Utils.checkNotNull(next, "next");
        Utils.checkNotNull(pageSize, "pageSize");
        Utils.checkNotNull(previous, "previous");
        this.data = data;
        this.hasMore = hasMore;
        this.next = next;
        this.pageSize = pageSize;
        this.previous = previous;
    }
    
    public GetHoldsResponseCursor(
            java.util.List<Hold> data,
            long pageSize) {
        this(data, Optional.empty(), Optional.empty(), pageSize, Optional.empty());
    }

    @JsonIgnore
    public java.util.List<Hold> data() {
        return data;
    }

    @JsonIgnore
    public Optional<? extends Boolean> hasMore() {
        return hasMore;
    }

    @JsonIgnore
    public Optional<? extends String> next() {
        return next;
    }

    @JsonIgnore
    public long pageSize() {
        return pageSize;
    }

    @JsonIgnore
    public Optional<? extends String> previous() {
        return previous;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetHoldsResponseCursor withData(java.util.List<Hold> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    public GetHoldsResponseCursor withHasMore(boolean hasMore) {
        Utils.checkNotNull(hasMore, "hasMore");
        this.hasMore = Optional.ofNullable(hasMore);
        return this;
    }

    public GetHoldsResponseCursor withHasMore(Optional<? extends Boolean> hasMore) {
        Utils.checkNotNull(hasMore, "hasMore");
        this.hasMore = hasMore;
        return this;
    }

    public GetHoldsResponseCursor withNext(String next) {
        Utils.checkNotNull(next, "next");
        this.next = Optional.ofNullable(next);
        return this;
    }

    public GetHoldsResponseCursor withNext(Optional<? extends String> next) {
        Utils.checkNotNull(next, "next");
        this.next = next;
        return this;
    }

    public GetHoldsResponseCursor withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    public GetHoldsResponseCursor withPrevious(String previous) {
        Utils.checkNotNull(previous, "previous");
        this.previous = Optional.ofNullable(previous);
        return this;
    }

    public GetHoldsResponseCursor withPrevious(Optional<? extends String> previous) {
        Utils.checkNotNull(previous, "previous");
        this.previous = previous;
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
        GetHoldsResponseCursor other = (GetHoldsResponseCursor) o;
        return 
            java.util.Objects.deepEquals(this.data, other.data) &&
            java.util.Objects.deepEquals(this.hasMore, other.hasMore) &&
            java.util.Objects.deepEquals(this.next, other.next) &&
            java.util.Objects.deepEquals(this.pageSize, other.pageSize) &&
            java.util.Objects.deepEquals(this.previous, other.previous);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            data,
            hasMore,
            next,
            pageSize,
            previous);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetHoldsResponseCursor.class,
                "data", data,
                "hasMore", hasMore,
                "next", next,
                "pageSize", pageSize,
                "previous", previous);
    }
    
    public final static class Builder {
 
        private java.util.List<Hold> data;
 
        private Optional<? extends Boolean> hasMore = Optional.empty();
 
        private Optional<? extends String> next = Optional.empty();
 
        private Long pageSize;
 
        private Optional<? extends String> previous = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(java.util.List<Hold> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        public Builder hasMore(boolean hasMore) {
            Utils.checkNotNull(hasMore, "hasMore");
            this.hasMore = Optional.ofNullable(hasMore);
            return this;
        }

        public Builder hasMore(Optional<? extends Boolean> hasMore) {
            Utils.checkNotNull(hasMore, "hasMore");
            this.hasMore = hasMore;
            return this;
        }

        public Builder next(String next) {
            Utils.checkNotNull(next, "next");
            this.next = Optional.ofNullable(next);
            return this;
        }

        public Builder next(Optional<? extends String> next) {
            Utils.checkNotNull(next, "next");
            this.next = next;
            return this;
        }

        public Builder pageSize(long pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = pageSize;
            return this;
        }

        public Builder previous(String previous) {
            Utils.checkNotNull(previous, "previous");
            this.previous = Optional.ofNullable(previous);
            return this;
        }

        public Builder previous(Optional<? extends String> previous) {
            Utils.checkNotNull(previous, "previous");
            this.previous = previous;
            return this;
        }
        
        public GetHoldsResponseCursor build() {
            return new GetHoldsResponseCursor(
                data,
                hasMore,
                next,
                pageSize,
                previous);
        }
    }
}

