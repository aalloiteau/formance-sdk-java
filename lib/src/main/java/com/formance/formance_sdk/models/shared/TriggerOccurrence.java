/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.formance.formance_sdk.utils.DateTimeDeserializer;
import com.formance.formance_sdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;


public class TriggerOccurrence {
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("date")
    public OffsetDateTime date;

    public TriggerOccurrence withDate(OffsetDateTime date) {
        this.date = date;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error")
    public String error;

    public TriggerOccurrence withError(String error) {
        this.error = error;
        return this;
    }
    
    @JsonProperty("event")
    public java.util.Map<String, Object> event;

    public TriggerOccurrence withEvent(java.util.Map<String, Object> event) {
        this.event = event;
        return this;
    }
    
    @JsonProperty("triggerID")
    public String triggerID;

    public TriggerOccurrence withTriggerID(String triggerID) {
        this.triggerID = triggerID;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("workflowInstance")
    public WorkflowInstance workflowInstance;

    public TriggerOccurrence withWorkflowInstance(WorkflowInstance workflowInstance) {
        this.workflowInstance = workflowInstance;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("workflowInstanceID")
    public String workflowInstanceID;

    public TriggerOccurrence withWorkflowInstanceID(String workflowInstanceID) {
        this.workflowInstanceID = workflowInstanceID;
        return this;
    }
    
    public TriggerOccurrence(@JsonProperty("date") OffsetDateTime date, @JsonProperty("event") java.util.Map<String, Object> event, @JsonProperty("triggerID") String triggerID) {
        this.date = date;
        this.event = event;
        this.triggerID = triggerID;
  }
}
