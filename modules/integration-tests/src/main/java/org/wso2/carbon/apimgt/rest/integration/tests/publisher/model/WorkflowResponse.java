/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.carbon.apimgt.rest.integration.tests.publisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * WorkflowResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T14:41:58.538+05:30")
public class WorkflowResponse {
  /**
   * This attribute declares whether this workflow task is approved or rejected. 
   */
  public enum WorkflowStatusEnum {
    CREATED("CREATED"),
    
    APPROVED("APPROVED"),
    
    REJECTED("REJECTED"),
    
    REGISTERED("REGISTERED");

    private String value;

    WorkflowStatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static WorkflowStatusEnum fromValue(String text) {
      for (WorkflowStatusEnum b : WorkflowStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("workflowStatus")
  private WorkflowStatusEnum workflowStatus = null;

  @JsonProperty("jsonPayload")
  private String jsonPayload = null;

  public WorkflowResponse workflowStatus(WorkflowStatusEnum workflowStatus) {
    this.workflowStatus = workflowStatus;
    return this;
  }

   /**
   * This attribute declares whether this workflow task is approved or rejected. 
   * @return workflowStatus
  **/
  @ApiModelProperty(example = "APPROVED", required = true, value = "This attribute declares whether this workflow task is approved or rejected. ")
  public WorkflowStatusEnum getWorkflowStatus() {
    return workflowStatus;
  }

  public void setWorkflowStatus(WorkflowStatusEnum workflowStatus) {
    this.workflowStatus = workflowStatus;
  }

  public WorkflowResponse jsonPayload(String jsonPayload) {
    this.jsonPayload = jsonPayload;
    return this;
  }

   /**
   * Attributes that returned after the workflow execution 
   * @return jsonPayload
  **/
  @ApiModelProperty(example = "null", value = "Attributes that returned after the workflow execution ")
  public String getJsonPayload() {
    return jsonPayload;
  }

  public void setJsonPayload(String jsonPayload) {
    this.jsonPayload = jsonPayload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowResponse workflowResponse = (WorkflowResponse) o;
    return Objects.equals(this.workflowStatus, workflowResponse.workflowStatus) &&
        Objects.equals(this.jsonPayload, workflowResponse.jsonPayload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflowStatus, jsonPayload);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowResponse {\n");
    
    sb.append("    workflowStatus: ").append(toIndentedString(workflowStatus)).append("\n");
    sb.append("    jsonPayload: ").append(toIndentedString(jsonPayload)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

