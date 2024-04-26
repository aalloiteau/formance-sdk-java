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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Optional;


public class WorkflowInstanceHistoryStage {

    @JsonProperty("attempt")
    private long attempt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error")
    private Optional<? extends String> error;

    @JsonProperty("input")
    private WorkflowInstanceHistoryStageInput input;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lastFailure")
    private Optional<? extends String> lastFailure;

    @JsonProperty("name")
    private String name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("nextExecution")
    private Optional<? extends OffsetDateTime> nextExecution;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("output")
    private Optional<? extends WorkflowInstanceHistoryStageOutput> output;

    @JsonProperty("startedAt")
    private OffsetDateTime startedAt;

    @JsonProperty("terminated")
    private boolean terminated;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("terminatedAt")
    private Optional<? extends OffsetDateTime> terminatedAt;

    @JsonCreator
    public WorkflowInstanceHistoryStage(
            @JsonProperty("attempt") long attempt,
            @JsonProperty("error") Optional<? extends String> error,
            @JsonProperty("input") WorkflowInstanceHistoryStageInput input,
            @JsonProperty("lastFailure") Optional<? extends String> lastFailure,
            @JsonProperty("name") String name,
            @JsonProperty("nextExecution") Optional<? extends OffsetDateTime> nextExecution,
            @JsonProperty("output") Optional<? extends WorkflowInstanceHistoryStageOutput> output,
            @JsonProperty("startedAt") OffsetDateTime startedAt,
            @JsonProperty("terminated") boolean terminated,
            @JsonProperty("terminatedAt") Optional<? extends OffsetDateTime> terminatedAt) {
        Utils.checkNotNull(attempt, "attempt");
        Utils.checkNotNull(error, "error");
        Utils.checkNotNull(input, "input");
        Utils.checkNotNull(lastFailure, "lastFailure");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(nextExecution, "nextExecution");
        Utils.checkNotNull(output, "output");
        Utils.checkNotNull(startedAt, "startedAt");
        Utils.checkNotNull(terminated, "terminated");
        Utils.checkNotNull(terminatedAt, "terminatedAt");
        this.attempt = attempt;
        this.error = error;
        this.input = input;
        this.lastFailure = lastFailure;
        this.name = name;
        this.nextExecution = nextExecution;
        this.output = output;
        this.startedAt = startedAt;
        this.terminated = terminated;
        this.terminatedAt = terminatedAt;
    }
    
    public WorkflowInstanceHistoryStage(
            long attempt,
            WorkflowInstanceHistoryStageInput input,
            String name,
            OffsetDateTime startedAt,
            boolean terminated) {
        this(attempt, Optional.empty(), input, Optional.empty(), name, Optional.empty(), Optional.empty(), startedAt, terminated, Optional.empty());
    }

    @JsonIgnore
    public long attempt() {
        return attempt;
    }

    @JsonIgnore
    public Optional<? extends String> error() {
        return error;
    }

    @JsonIgnore
    public WorkflowInstanceHistoryStageInput input() {
        return input;
    }

    @JsonIgnore
    public Optional<? extends String> lastFailure() {
        return lastFailure;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    @JsonIgnore
    public Optional<? extends OffsetDateTime> nextExecution() {
        return nextExecution;
    }

    @JsonIgnore
    public Optional<? extends WorkflowInstanceHistoryStageOutput> output() {
        return output;
    }

    @JsonIgnore
    public OffsetDateTime startedAt() {
        return startedAt;
    }

    @JsonIgnore
    public boolean terminated() {
        return terminated;
    }

    @JsonIgnore
    public Optional<? extends OffsetDateTime> terminatedAt() {
        return terminatedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public WorkflowInstanceHistoryStage withAttempt(long attempt) {
        Utils.checkNotNull(attempt, "attempt");
        this.attempt = attempt;
        return this;
    }

    public WorkflowInstanceHistoryStage withError(String error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }

    public WorkflowInstanceHistoryStage withError(Optional<? extends String> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    public WorkflowInstanceHistoryStage withInput(WorkflowInstanceHistoryStageInput input) {
        Utils.checkNotNull(input, "input");
        this.input = input;
        return this;
    }

    public WorkflowInstanceHistoryStage withLastFailure(String lastFailure) {
        Utils.checkNotNull(lastFailure, "lastFailure");
        this.lastFailure = Optional.ofNullable(lastFailure);
        return this;
    }

    public WorkflowInstanceHistoryStage withLastFailure(Optional<? extends String> lastFailure) {
        Utils.checkNotNull(lastFailure, "lastFailure");
        this.lastFailure = lastFailure;
        return this;
    }

    public WorkflowInstanceHistoryStage withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public WorkflowInstanceHistoryStage withNextExecution(OffsetDateTime nextExecution) {
        Utils.checkNotNull(nextExecution, "nextExecution");
        this.nextExecution = Optional.ofNullable(nextExecution);
        return this;
    }

    public WorkflowInstanceHistoryStage withNextExecution(Optional<? extends OffsetDateTime> nextExecution) {
        Utils.checkNotNull(nextExecution, "nextExecution");
        this.nextExecution = nextExecution;
        return this;
    }

    public WorkflowInstanceHistoryStage withOutput(WorkflowInstanceHistoryStageOutput output) {
        Utils.checkNotNull(output, "output");
        this.output = Optional.ofNullable(output);
        return this;
    }

    public WorkflowInstanceHistoryStage withOutput(Optional<? extends WorkflowInstanceHistoryStageOutput> output) {
        Utils.checkNotNull(output, "output");
        this.output = output;
        return this;
    }

    public WorkflowInstanceHistoryStage withStartedAt(OffsetDateTime startedAt) {
        Utils.checkNotNull(startedAt, "startedAt");
        this.startedAt = startedAt;
        return this;
    }

    public WorkflowInstanceHistoryStage withTerminated(boolean terminated) {
        Utils.checkNotNull(terminated, "terminated");
        this.terminated = terminated;
        return this;
    }

    public WorkflowInstanceHistoryStage withTerminatedAt(OffsetDateTime terminatedAt) {
        Utils.checkNotNull(terminatedAt, "terminatedAt");
        this.terminatedAt = Optional.ofNullable(terminatedAt);
        return this;
    }

    public WorkflowInstanceHistoryStage withTerminatedAt(Optional<? extends OffsetDateTime> terminatedAt) {
        Utils.checkNotNull(terminatedAt, "terminatedAt");
        this.terminatedAt = terminatedAt;
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
        WorkflowInstanceHistoryStage other = (WorkflowInstanceHistoryStage) o;
        return 
            java.util.Objects.deepEquals(this.attempt, other.attempt) &&
            java.util.Objects.deepEquals(this.error, other.error) &&
            java.util.Objects.deepEquals(this.input, other.input) &&
            java.util.Objects.deepEquals(this.lastFailure, other.lastFailure) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.nextExecution, other.nextExecution) &&
            java.util.Objects.deepEquals(this.output, other.output) &&
            java.util.Objects.deepEquals(this.startedAt, other.startedAt) &&
            java.util.Objects.deepEquals(this.terminated, other.terminated) &&
            java.util.Objects.deepEquals(this.terminatedAt, other.terminatedAt);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            attempt,
            error,
            input,
            lastFailure,
            name,
            nextExecution,
            output,
            startedAt,
            terminated,
            terminatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(WorkflowInstanceHistoryStage.class,
                "attempt", attempt,
                "error", error,
                "input", input,
                "lastFailure", lastFailure,
                "name", name,
                "nextExecution", nextExecution,
                "output", output,
                "startedAt", startedAt,
                "terminated", terminated,
                "terminatedAt", terminatedAt);
    }
    
    public final static class Builder {
 
        private Long attempt;
 
        private Optional<? extends String> error = Optional.empty();
 
        private WorkflowInstanceHistoryStageInput input;
 
        private Optional<? extends String> lastFailure = Optional.empty();
 
        private String name;
 
        private Optional<? extends OffsetDateTime> nextExecution = Optional.empty();
 
        private Optional<? extends WorkflowInstanceHistoryStageOutput> output = Optional.empty();
 
        private OffsetDateTime startedAt;
 
        private Boolean terminated;
 
        private Optional<? extends OffsetDateTime> terminatedAt = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder attempt(long attempt) {
            Utils.checkNotNull(attempt, "attempt");
            this.attempt = attempt;
            return this;
        }

        public Builder error(String error) {
            Utils.checkNotNull(error, "error");
            this.error = Optional.ofNullable(error);
            return this;
        }

        public Builder error(Optional<? extends String> error) {
            Utils.checkNotNull(error, "error");
            this.error = error;
            return this;
        }

        public Builder input(WorkflowInstanceHistoryStageInput input) {
            Utils.checkNotNull(input, "input");
            this.input = input;
            return this;
        }

        public Builder lastFailure(String lastFailure) {
            Utils.checkNotNull(lastFailure, "lastFailure");
            this.lastFailure = Optional.ofNullable(lastFailure);
            return this;
        }

        public Builder lastFailure(Optional<? extends String> lastFailure) {
            Utils.checkNotNull(lastFailure, "lastFailure");
            this.lastFailure = lastFailure;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder nextExecution(OffsetDateTime nextExecution) {
            Utils.checkNotNull(nextExecution, "nextExecution");
            this.nextExecution = Optional.ofNullable(nextExecution);
            return this;
        }

        public Builder nextExecution(Optional<? extends OffsetDateTime> nextExecution) {
            Utils.checkNotNull(nextExecution, "nextExecution");
            this.nextExecution = nextExecution;
            return this;
        }

        public Builder output(WorkflowInstanceHistoryStageOutput output) {
            Utils.checkNotNull(output, "output");
            this.output = Optional.ofNullable(output);
            return this;
        }

        public Builder output(Optional<? extends WorkflowInstanceHistoryStageOutput> output) {
            Utils.checkNotNull(output, "output");
            this.output = output;
            return this;
        }

        public Builder startedAt(OffsetDateTime startedAt) {
            Utils.checkNotNull(startedAt, "startedAt");
            this.startedAt = startedAt;
            return this;
        }

        public Builder terminated(boolean terminated) {
            Utils.checkNotNull(terminated, "terminated");
            this.terminated = terminated;
            return this;
        }

        public Builder terminatedAt(OffsetDateTime terminatedAt) {
            Utils.checkNotNull(terminatedAt, "terminatedAt");
            this.terminatedAt = Optional.ofNullable(terminatedAt);
            return this;
        }

        public Builder terminatedAt(Optional<? extends OffsetDateTime> terminatedAt) {
            Utils.checkNotNull(terminatedAt, "terminatedAt");
            this.terminatedAt = terminatedAt;
            return this;
        }
        
        public WorkflowInstanceHistoryStage build() {
            return new WorkflowInstanceHistoryStage(
                attempt,
                error,
                input,
                lastFailure,
                name,
                nextExecution,
                output,
                startedAt,
                terminated,
                terminatedAt);
        }
    }
}

