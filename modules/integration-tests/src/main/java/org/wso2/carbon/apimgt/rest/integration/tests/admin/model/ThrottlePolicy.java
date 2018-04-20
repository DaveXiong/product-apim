/*
 * WSO2 API Manager - Admin Portal API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Admin Portal.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.carbon.apimgt.rest.integration.tests.admin.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ThrottlePolicy
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T14:59:16.844+05:30")@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "id", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = CustomRule.class, name = "CustomRule"),
  @JsonSubTypes.Type(value = AdvancedThrottlePolicy.class, name = "AdvancedThrottlePolicy"),
  @JsonSubTypes.Type(value = AdvancedThrottlePolicyInfo.class, name = "AdvancedThrottlePolicyInfo"),
  @JsonSubTypes.Type(value = SubscriptionThrottlePolicy.class, name = "SubscriptionThrottlePolicy"),
  @JsonSubTypes.Type(value = ApplicationThrottlePolicy.class, name = "ApplicationThrottlePolicy"),
})

public class ThrottlePolicy {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("policyName")
  private String policyName = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("isDeployed")
  private Boolean isDeployed = false;

  @JsonProperty("type")
  private String type = null;

  public ThrottlePolicy id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ThrottlePolicy policyName(String policyName) {
    this.policyName = policyName;
    return this;
  }

   /**
   * Get policyName
   * @return policyName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPolicyName() {
    return policyName;
  }

  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }

  public ThrottlePolicy displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ThrottlePolicy description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ThrottlePolicy isDeployed(Boolean isDeployed) {
    this.isDeployed = isDeployed;
    return this;
  }

   /**
   * Get isDeployed
   * @return isDeployed
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsDeployed() {
    return isDeployed;
  }

  public void setIsDeployed(Boolean isDeployed) {
    this.isDeployed = isDeployed;
  }

  public ThrottlePolicy type(String type) {
    this.type = type;
    return this;
  }

   /**
   * ApplicationThrottlePolicy, SubscriptionThrottlePolicy and AdvancedThrottlePolicy are the supported values. 
   * @return type
  **/
  @ApiModelProperty(required = true, value = "ApplicationThrottlePolicy, SubscriptionThrottlePolicy and AdvancedThrottlePolicy are the supported values. ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThrottlePolicy throttlePolicy = (ThrottlePolicy) o;
    return Objects.equals(this.id, throttlePolicy.id) &&
        Objects.equals(this.policyName, throttlePolicy.policyName) &&
        Objects.equals(this.displayName, throttlePolicy.displayName) &&
        Objects.equals(this.description, throttlePolicy.description) &&
        Objects.equals(this.isDeployed, throttlePolicy.isDeployed) &&
        Objects.equals(this.type, throttlePolicy.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, policyName, displayName, description, isDeployed, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThrottlePolicy {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isDeployed: ").append(toIndentedString(isDeployed)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

