/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;


public class V2GetVolumesWithBalancesRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends Map<String, Object>> requestBody;

    /**
     * Parameter used in pagination requests. Maximum page size is set to 15.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=cursor")
    private Optional<String> cursor;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=endTime")
    private Optional<String> endTime;

    /**
     * Group volumes and balance by the level of the segment of the address
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=groupBy")
    private Optional<Long> groupBy;

    /**
     * Use insertion date instead of effective date
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=insertionDate")
    private Optional<Boolean> insertionDate;

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
    private Optional<Long> pageSize;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=startTime")
    private Optional<String> startTime;

    @JsonCreator
    public V2GetVolumesWithBalancesRequest(
            Optional<? extends Map<String, Object>> requestBody,
            Optional<String> cursor,
            Optional<String> endTime,
            Optional<Long> groupBy,
            Optional<Boolean> insertionDate,
            String ledger,
            Optional<Long> pageSize,
            Optional<String> startTime) {
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

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> requestBody() {
        return (Optional<Map<String, Object>>) requestBody;
    }

    /**
     * Parameter used in pagination requests. Maximum page size is set to 15.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * 
     */
    @JsonIgnore
    public Optional<String> cursor() {
        return cursor;
    }

    @JsonIgnore
    public Optional<String> endTime() {
        return endTime;
    }

    /**
     * Group volumes and balance by the level of the segment of the address
     */
    @JsonIgnore
    public Optional<Long> groupBy() {
        return groupBy;
    }

    /**
     * Use insertion date instead of effective date
     */
    @JsonIgnore
    public Optional<Boolean> insertionDate() {
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
    public Optional<Long> pageSize() {
        return pageSize;
    }

    @JsonIgnore
    public Optional<String> startTime() {
        return startTime;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2GetVolumesWithBalancesRequest withRequestBody(Map<String, Object> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = Optional.ofNullable(requestBody);
        return this;
    }

    public V2GetVolumesWithBalancesRequest withRequestBody(Optional<? extends Map<String, Object>> requestBody) {
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
    public V2GetVolumesWithBalancesRequest withCursor(Optional<String> cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
        return this;
    }

    public V2GetVolumesWithBalancesRequest withEndTime(String endTime) {
        Utils.checkNotNull(endTime, "endTime");
        this.endTime = Optional.ofNullable(endTime);
        return this;
    }

    public V2GetVolumesWithBalancesRequest withEndTime(Optional<String> endTime) {
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
    public V2GetVolumesWithBalancesRequest withGroupBy(Optional<Long> groupBy) {
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
    public V2GetVolumesWithBalancesRequest withInsertionDate(Optional<Boolean> insertionDate) {
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
    public V2GetVolumesWithBalancesRequest withPageSize(Optional<Long> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    public V2GetVolumesWithBalancesRequest withStartTime(String startTime) {
        Utils.checkNotNull(startTime, "startTime");
        this.startTime = Optional.ofNullable(startTime);
        return this;
    }

    public V2GetVolumesWithBalancesRequest withStartTime(Optional<String> startTime) {
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
            Objects.deepEquals(this.requestBody, other.requestBody) &&
            Objects.deepEquals(this.cursor, other.cursor) &&
            Objects.deepEquals(this.endTime, other.endTime) &&
            Objects.deepEquals(this.groupBy, other.groupBy) &&
            Objects.deepEquals(this.insertionDate, other.insertionDate) &&
            Objects.deepEquals(this.ledger, other.ledger) &&
            Objects.deepEquals(this.pageSize, other.pageSize) &&
            Objects.deepEquals(this.startTime, other.startTime);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
 
        private Optional<? extends Map<String, Object>> requestBody = Optional.empty();
 
        private Optional<String> cursor = Optional.empty();
 
        private Optional<String> endTime = Optional.empty();
 
        private Optional<Long> groupBy = Optional.empty();
 
        private Optional<Boolean> insertionDate = Optional.empty();
 
        private String ledger;
 
        private Optional<Long> pageSize = Optional.empty();
 
        private Optional<String> startTime = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder requestBody(Map<String, Object> requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = Optional.ofNullable(requestBody);
            return this;
        }

        public Builder requestBody(Optional<? extends Map<String, Object>> requestBody) {
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
        public Builder cursor(Optional<String> cursor) {
            Utils.checkNotNull(cursor, "cursor");
            this.cursor = cursor;
            return this;
        }

        public Builder endTime(String endTime) {
            Utils.checkNotNull(endTime, "endTime");
            this.endTime = Optional.ofNullable(endTime);
            return this;
        }

        public Builder endTime(Optional<String> endTime) {
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
        public Builder groupBy(Optional<Long> groupBy) {
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
        public Builder insertionDate(Optional<Boolean> insertionDate) {
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
        public Builder pageSize(Optional<Long> pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = pageSize;
            return this;
        }

        public Builder startTime(String startTime) {
            Utils.checkNotNull(startTime, "startTime");
            this.startTime = Optional.ofNullable(startTime);
            return this;
        }

        public Builder startTime(Optional<String> startTime) {
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

