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
import java.util.Optional;

public class V2ListInstancesRequest {

    /**
     * Parameter used in pagination requests.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=cursor")
    private Optional<? extends String> cursor;

    /**
     * The maximum number of results to return per page.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pageSize")
    private Optional<? extends Long> pageSize;

    /**
     * Filter running instances
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=running")
    private Optional<? extends Boolean> running;

    /**
     * A workflow id
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=workflowID")
    private Optional<? extends String> workflowID;

    @JsonCreator
    public V2ListInstancesRequest(
            Optional<? extends String> cursor,
            Optional<? extends Long> pageSize,
            Optional<? extends Boolean> running,
            Optional<? extends String> workflowID) {
        Utils.checkNotNull(cursor, "cursor");
        Utils.checkNotNull(pageSize, "pageSize");
        Utils.checkNotNull(running, "running");
        Utils.checkNotNull(workflowID, "workflowID");
        this.cursor = cursor;
        this.pageSize = pageSize;
        this.running = running;
        this.workflowID = workflowID;
    }
    
    public V2ListInstancesRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Parameter used in pagination requests.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> cursor() {
        return (Optional<String>) cursor;
    }

    /**
     * The maximum number of results to return per page.
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> pageSize() {
        return (Optional<Long>) pageSize;
    }

    /**
     * Filter running instances
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> running() {
        return (Optional<Boolean>) running;
    }

    /**
     * A workflow id
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> workflowID() {
        return (Optional<String>) workflowID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Parameter used in pagination requests.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * 
     */
    public V2ListInstancesRequest withCursor(String cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = Optional.ofNullable(cursor);
        return this;
    }

    /**
     * Parameter used in pagination requests.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * 
     */
    public V2ListInstancesRequest withCursor(Optional<? extends String> cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
        return this;
    }

    /**
     * The maximum number of results to return per page.
     * 
     */
    public V2ListInstancesRequest withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }

    /**
     * The maximum number of results to return per page.
     * 
     */
    public V2ListInstancesRequest withPageSize(Optional<? extends Long> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Filter running instances
     */
    public V2ListInstancesRequest withRunning(boolean running) {
        Utils.checkNotNull(running, "running");
        this.running = Optional.ofNullable(running);
        return this;
    }

    /**
     * Filter running instances
     */
    public V2ListInstancesRequest withRunning(Optional<? extends Boolean> running) {
        Utils.checkNotNull(running, "running");
        this.running = running;
        return this;
    }

    /**
     * A workflow id
     */
    public V2ListInstancesRequest withWorkflowID(String workflowID) {
        Utils.checkNotNull(workflowID, "workflowID");
        this.workflowID = Optional.ofNullable(workflowID);
        return this;
    }

    /**
     * A workflow id
     */
    public V2ListInstancesRequest withWorkflowID(Optional<? extends String> workflowID) {
        Utils.checkNotNull(workflowID, "workflowID");
        this.workflowID = workflowID;
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
        V2ListInstancesRequest other = (V2ListInstancesRequest) o;
        return 
            java.util.Objects.deepEquals(this.cursor, other.cursor) &&
            java.util.Objects.deepEquals(this.pageSize, other.pageSize) &&
            java.util.Objects.deepEquals(this.running, other.running) &&
            java.util.Objects.deepEquals(this.workflowID, other.workflowID);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            cursor,
            pageSize,
            running,
            workflowID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2ListInstancesRequest.class,
                "cursor", cursor,
                "pageSize", pageSize,
                "running", running,
                "workflowID", workflowID);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> cursor = Optional.empty();
 
        private Optional<? extends Long> pageSize = Optional.empty();
 
        private Optional<? extends Boolean> running = Optional.empty();
 
        private Optional<? extends String> workflowID = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Parameter used in pagination requests.
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
         * Parameter used in pagination requests.
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

        /**
         * Filter running instances
         */
        public Builder running(boolean running) {
            Utils.checkNotNull(running, "running");
            this.running = Optional.ofNullable(running);
            return this;
        }

        /**
         * Filter running instances
         */
        public Builder running(Optional<? extends Boolean> running) {
            Utils.checkNotNull(running, "running");
            this.running = running;
            return this;
        }

        /**
         * A workflow id
         */
        public Builder workflowID(String workflowID) {
            Utils.checkNotNull(workflowID, "workflowID");
            this.workflowID = Optional.ofNullable(workflowID);
            return this;
        }

        /**
         * A workflow id
         */
        public Builder workflowID(Optional<? extends String> workflowID) {
            Utils.checkNotNull(workflowID, "workflowID");
            this.workflowID = workflowID;
            return this;
        }
        
        public V2ListInstancesRequest build() {
            return new V2ListInstancesRequest(
                cursor,
                pageSize,
                running,
                workflowID);
        }
    }
}

