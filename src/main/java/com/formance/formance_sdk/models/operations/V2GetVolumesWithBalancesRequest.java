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
import java.time.OffsetDateTime;
import java.util.Optional;


public class V2GetVolumesWithBalancesRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends java.util.Map<String, java.lang.Object>> requestBody;

    /**
     * Parameter used in pagination requests. Maximum page size is set to 15.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=cursor")
    private Optional<? extends String> cursor;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=endTime")
    private Optional<? extends OffsetDateTime> endTime;

    /**
     * Group volumes and balance by the level of the segment of the address
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=groupBy")
    private Optional<? extends Long> groupBy;

    /**
     * Use insertion date instead of effective date
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=insertionDate")
    private Optional<? extends Boolean> insertionDate;

    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    private String ledger;

    /**
     * The maximum number of results to return per page.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pageSize")
    private Optional<? extends Long> pageSize;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=startTime")
    private Optional<? extends OffsetDateTime> startTime;

    @JsonCreator
    public V2GetVolumesWithBalancesRequest(
            Optional<? extends java.util.Map<String, java.lang.Object>> requestBody,
            Optional<? extends String> cursor,
            Optional<? extends OffsetDateTime> endTime,
            Optional<? extends Long> groupBy,
            Optional<? extends Boolean> insertionDate,
            String ledger,
            Optional<? extends Long> pageSize,
            Optional<? extends OffsetDateTime> startTime) {
        Utils.checkNotNull(requestBody, "requestBody");
        Utils.checkNotNull(cursor, "cursor");
        Utils.checkNotNull(endTime, "endTime");
        Utils.checkNotNull(groupBy, "groupBy");
        Utils.checkNotNull(insertionDate, "insertionDate");
        Utils.checkNotNull(ledger, "ledger");
        Utils.checkNotNull(pageSize, "pageSize");
        Utils.checkNotNull(startTime, "startTime");
        this.requestBody = requestBody;
        this.cursor = cursor;
        this.endTime = endTime;
        this.groupBy = groupBy;
        this.insertionDate = insertionDate;
        this.ledger = ledger;
        this.pageSize = pageSize;
        this.startTime = startTime;
    }
    
    public V2GetVolumesWithBalancesRequest(
            String ledger) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), ledger, Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<? extends java.util.Map<String, java.lang.Object>> requestBody() {
        return requestBody;
    }

    /**
     * Parameter used in pagination requests. Maximum page size is set to 15.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * 
     */
    @JsonIgnore
    public Optional<? extends String> cursor() {
        return cursor;
    }

    @JsonIgnore
    public Optional<? extends OffsetDateTime> endTime() {
        return endTime;
    }

    /**
     * Group volumes and balance by the level of the segment of the address
     */
    @JsonIgnore
    public Optional<? extends Long> groupBy() {
        return groupBy;
    }

    /**
     * Use insertion date instead of effective date
     */
    @JsonIgnore
    public Optional<? extends Boolean> insertionDate() {
        return insertionDate;
    }

    /**
     * Name of the ledger.
     */
    @JsonIgnore
    public String ledger() {
        return ledger;
    }

    /**
     * The maximum number of results to return per page.
     * 
     */
    @JsonIgnore
    public Optional<? extends Long> pageSize() {
        return pageSize;
    }

    @JsonIgnore
    public Optional<? extends OffsetDateTime> startTime() {
        return startTime;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2GetVolumesWithBalancesRequest withRequestBody(java.util.Map<String, java.lang.Object> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = Optional.ofNullable(requestBody);
        return this;
    }

    public V2GetVolumesWithBalancesRequest withRequestBody(Optional<? extends java.util.Map<String, java.lang.Object>> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    /**
     * Parameter used in pagination requests. Maximum page size is set to 15.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * 
     */
    public V2GetVolumesWithBalancesRequest withCursor(String cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = Optional.ofNullable(cursor);
        return this;
    }

    /**
     * Parameter used in pagination requests. Maximum page size is set to 15.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * 
     */
    public V2GetVolumesWithBalancesRequest withCursor(Optional<? extends String> cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
        return this;
    }

    public V2GetVolumesWithBalancesRequest withEndTime(OffsetDateTime endTime) {
        Utils.checkNotNull(endTime, "endTime");
        this.endTime = Optional.ofNullable(endTime);
        return this;
    }

    public V2GetVolumesWithBalancesRequest withEndTime(Optional<? extends OffsetDateTime> endTime) {
        Utils.checkNotNull(endTime, "endTime");
        this.endTime = endTime;
        return this;
    }

    /**
     * Group volumes and balance by the level of the segment of the address
     */
    public V2GetVolumesWithBalancesRequest withGroupBy(long groupBy) {
        Utils.checkNotNull(groupBy, "groupBy");
        this.groupBy = Optional.ofNullable(groupBy);
        return this;
    }

    /**
     * Group volumes and balance by the level of the segment of the address
     */
    public V2GetVolumesWithBalancesRequest withGroupBy(Optional<? extends Long> groupBy) {
        Utils.checkNotNull(groupBy, "groupBy");
        this.groupBy = groupBy;
        return this;
    }

    /**
     * Use insertion date instead of effective date
     */
    public V2GetVolumesWithBalancesRequest withInsertionDate(boolean insertionDate) {
        Utils.checkNotNull(insertionDate, "insertionDate");
        this.insertionDate = Optional.ofNullable(insertionDate);
        return this;
    }

    /**
     * Use insertion date instead of effective date
     */
    public V2GetVolumesWithBalancesRequest withInsertionDate(Optional<? extends Boolean> insertionDate) {
        Utils.checkNotNull(insertionDate, "insertionDate");
        this.insertionDate = insertionDate;
        return this;
    }

    /**
     * Name of the ledger.
     */
    public V2GetVolumesWithBalancesRequest withLedger(String ledger) {
        Utils.checkNotNull(ledger, "ledger");
        this.ledger = ledger;
        return this;
    }

    /**
     * The maximum number of results to return per page.
     * 
     */
    public V2GetVolumesWithBalancesRequest withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }

    /**
     * The maximum number of results to return per page.
     * 
     */
    public V2GetVolumesWithBalancesRequest withPageSize(Optional<? extends Long> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    public V2GetVolumesWithBalancesRequest withStartTime(OffsetDateTime startTime) {
        Utils.checkNotNull(startTime, "startTime");
        this.startTime = Optional.ofNullable(startTime);
        return this;
    }

    public V2GetVolumesWithBalancesRequest withStartTime(Optional<? extends OffsetDateTime> startTime) {
        Utils.checkNotNull(startTime, "startTime");
        this.startTime = startTime;
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
        V2GetVolumesWithBalancesRequest other = (V2GetVolumesWithBalancesRequest) o;
        return 
            java.util.Objects.deepEquals(this.requestBody, other.requestBody) &&
            java.util.Objects.deepEquals(this.cursor, other.cursor) &&
            java.util.Objects.deepEquals(this.endTime, other.endTime) &&
            java.util.Objects.deepEquals(this.groupBy, other.groupBy) &&
            java.util.Objects.deepEquals(this.insertionDate, other.insertionDate) &&
            java.util.Objects.deepEquals(this.ledger, other.ledger) &&
            java.util.Objects.deepEquals(this.pageSize, other.pageSize) &&
            java.util.Objects.deepEquals(this.startTime, other.startTime);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            requestBody,
            cursor,
            endTime,
            groupBy,
            insertionDate,
            ledger,
            pageSize,
            startTime);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2GetVolumesWithBalancesRequest.class,
                "requestBody", requestBody,
                "cursor", cursor,
                "endTime", endTime,
                "groupBy", groupBy,
                "insertionDate", insertionDate,
                "ledger", ledger,
                "pageSize", pageSize,
                "startTime", startTime);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.Map<String, java.lang.Object>> requestBody = Optional.empty();
 
        private Optional<? extends String> cursor = Optional.empty();
 
        private Optional<? extends OffsetDateTime> endTime = Optional.empty();
 
        private Optional<? extends Long> groupBy = Optional.empty();
 
        private Optional<? extends Boolean> insertionDate = Optional.empty();
 
        private String ledger;
 
        private Optional<? extends Long> pageSize = Optional.empty();
 
        private Optional<? extends OffsetDateTime> startTime = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder requestBody(java.util.Map<String, java.lang.Object> requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = Optional.ofNullable(requestBody);
            return this;
        }

        public Builder requestBody(Optional<? extends java.util.Map<String, java.lang.Object>> requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }

        /**
         * Parameter used in pagination requests. Maximum page size is set to 15.
         * Set to the value of next for the next page of results.
         * Set to the value of previous for the previous page of results.
         * No other parameters can be set when this parameter is set.
         * 
         */
        public Builder cursor(String cursor) {
            Utils.checkNotNull(cursor, "cursor");
            this.cursor = Optional.ofNullable(cursor);
            return this;
        }

        /**
         * Parameter used in pagination requests. Maximum page size is set to 15.
         * Set to the value of next for the next page of results.
         * Set to the value of previous for the previous page of results.
         * No other parameters can be set when this parameter is set.
         * 
         */
        public Builder cursor(Optional<? extends String> cursor) {
            Utils.checkNotNull(cursor, "cursor");
            this.cursor = cursor;
            return this;
        }

        public Builder endTime(OffsetDateTime endTime) {
            Utils.checkNotNull(endTime, "endTime");
            this.endTime = Optional.ofNullable(endTime);
            return this;
        }

        public Builder endTime(Optional<? extends OffsetDateTime> endTime) {
            Utils.checkNotNull(endTime, "endTime");
            this.endTime = endTime;
            return this;
        }

        /**
         * Group volumes and balance by the level of the segment of the address
         */
        public Builder groupBy(long groupBy) {
            Utils.checkNotNull(groupBy, "groupBy");
            this.groupBy = Optional.ofNullable(groupBy);
            return this;
        }

        /**
         * Group volumes and balance by the level of the segment of the address
         */
        public Builder groupBy(Optional<? extends Long> groupBy) {
            Utils.checkNotNull(groupBy, "groupBy");
            this.groupBy = groupBy;
            return this;
        }

        /**
         * Use insertion date instead of effective date
         */
        public Builder insertionDate(boolean insertionDate) {
            Utils.checkNotNull(insertionDate, "insertionDate");
            this.insertionDate = Optional.ofNullable(insertionDate);
            return this;
        }

        /**
         * Use insertion date instead of effective date
         */
        public Builder insertionDate(Optional<? extends Boolean> insertionDate) {
            Utils.checkNotNull(insertionDate, "insertionDate");
            this.insertionDate = insertionDate;
            return this;
        }

        /**
         * Name of the ledger.
         */
        public Builder ledger(String ledger) {
            Utils.checkNotNull(ledger, "ledger");
            this.ledger = ledger;
            return this;
        }

        /**
         * The maximum number of results to return per page.
         * 
         */
        public Builder pageSize(long pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = Optional.ofNullable(pageSize);
            return this;
        }

        /**
         * The maximum number of results to return per page.
         * 
         */
        public Builder pageSize(Optional<? extends Long> pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = pageSize;
            return this;
        }

        public Builder startTime(OffsetDateTime startTime) {
            Utils.checkNotNull(startTime, "startTime");
            this.startTime = Optional.ofNullable(startTime);
            return this;
        }

        public Builder startTime(Optional<? extends OffsetDateTime> startTime) {
            Utils.checkNotNull(startTime, "startTime");
            this.startTime = startTime;
            return this;
        }
        
        public V2GetVolumesWithBalancesRequest build() {
            return new V2GetVolumesWithBalancesRequest(
                requestBody,
                cursor,
                endTime,
                groupBy,
                insertionDate,
                ledger,
                pageSize,
                startTime);
        }
    }
}

