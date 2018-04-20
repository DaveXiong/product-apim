/*
 * WSO2 API Manager - Store
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Store.  It is written with [swagger 2](http://swagger.io/). 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.carbon.apimgt.rest.integration.tests.store.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.apimgt.rest.integration.tests.store.model.Rating;

/**
 * RatingList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T14:42:47.879+05:30")
public class RatingList {
  @JsonProperty("avgRating")
  private String avgRating = null;

  @JsonProperty("userRating")
  private String userRating = null;

  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("next")
  private String next = null;

  @JsonProperty("previous")
  private String previous = null;

  @JsonProperty("list")
  private List<Rating> list = new ArrayList<Rating>();

  public RatingList avgRating(String avgRating) {
    this.avgRating = avgRating;
    return this;
  }

   /**
   * Average Rating of the API 
   * @return avgRating
  **/
  @ApiModelProperty(example = "null", value = "Average Rating of the API ")
  public String getAvgRating() {
    return avgRating;
  }

  public void setAvgRating(String avgRating) {
    this.avgRating = avgRating;
  }

  public RatingList userRating(String userRating) {
    this.userRating = userRating;
    return this;
  }

   /**
   * Rating given by the user 
   * @return userRating
  **/
  @ApiModelProperty(example = "null", value = "Rating given by the user ")
  public String getUserRating() {
    return userRating;
  }

  public void setUserRating(String userRating) {
    this.userRating = userRating;
  }

  public RatingList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of Subscriber Ratings returned. 
   * @return count
  **/
  @ApiModelProperty(example = "null", value = "Number of Subscriber Ratings returned. ")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public RatingList next(String next) {
    this.next = next;
    return this;
  }

   /**
   * Link to the next subset of resources qualified. Empty if no more resources are to be returned. 
   * @return next
  **/
  @ApiModelProperty(example = "null", value = "Link to the next subset of resources qualified. Empty if no more resources are to be returned. ")
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public RatingList previous(String previous) {
    this.previous = previous;
    return this;
  }

   /**
   * Link to the previous subset of resources qualified. Empty if current subset is the first subset returned. 
   * @return previous
  **/
  @ApiModelProperty(example = "null", value = "Link to the previous subset of resources qualified. Empty if current subset is the first subset returned. ")
  public String getPrevious() {
    return previous;
  }

  public void setPrevious(String previous) {
    this.previous = previous;
  }

  public RatingList list(List<Rating> list) {
    this.list = list;
    return this;
  }

  public RatingList addListItem(Rating listItem) {
    this.list.add(listItem);
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Rating> getList() {
    return list;
  }

  public void setList(List<Rating> list) {
    this.list = list;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RatingList ratingList = (RatingList) o;
    return Objects.equals(this.avgRating, ratingList.avgRating) &&
        Objects.equals(this.userRating, ratingList.userRating) &&
        Objects.equals(this.count, ratingList.count) &&
        Objects.equals(this.next, ratingList.next) &&
        Objects.equals(this.previous, ratingList.previous) &&
        Objects.equals(this.list, ratingList.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avgRating, userRating, count, next, previous, list);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatingList {\n");
    
    sb.append("    avgRating: ").append(toIndentedString(avgRating)).append("\n");
    sb.append("    userRating: ").append(toIndentedString(userRating)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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

