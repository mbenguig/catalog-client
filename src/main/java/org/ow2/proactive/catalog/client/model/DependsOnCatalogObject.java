/*
 * CatalogObjectEntity Catalog API
 * The purpose of the catalog is to store ProActive objects.  A catalog is subdivided into buckets.   Each bucket manages zero, one or more versioned ProActive objects.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.ow2.proactive.catalog.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DependsOnCatalogObject
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-26T17:28:06.013+01:00")
public class DependsOnCatalogObject {
  @JsonProperty("bucket_and_object_name")
  private String bucketAndObjectName = null;

  @JsonProperty("is_in_catalog")
  private Boolean isInCatalog = null;

  @JsonProperty("kind")
  private String kind = null;

  @JsonProperty("revision_commit_time")
  private String revisionCommitTime = null;

  public DependsOnCatalogObject bucketAndObjectName(String bucketAndObjectName) {
    this.bucketAndObjectName = bucketAndObjectName;
    return this;
  }

   /**
   * Get bucketAndObjectName
   * @return bucketAndObjectName
  **/
  @ApiModelProperty(value = "")
  public String getBucketAndObjectName() {
    return bucketAndObjectName;
  }

  public void setBucketAndObjectName(String bucketAndObjectName) {
    this.bucketAndObjectName = bucketAndObjectName;
  }

  public DependsOnCatalogObject isInCatalog(Boolean isInCatalog) {
    this.isInCatalog = isInCatalog;
    return this;
  }

   /**
   * Get isInCatalog
   * @return isInCatalog
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsInCatalog() {
    return isInCatalog;
  }

  public void setIsInCatalog(Boolean isInCatalog) {
    this.isInCatalog = isInCatalog;
  }

  public DependsOnCatalogObject kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @ApiModelProperty(value = "")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public DependsOnCatalogObject revisionCommitTime(String revisionCommitTime) {
    this.revisionCommitTime = revisionCommitTime;
    return this;
  }

   /**
   * Get revisionCommitTime
   * @return revisionCommitTime
  **/
  @ApiModelProperty(value = "")
  public String getRevisionCommitTime() {
    return revisionCommitTime;
  }

  public void setRevisionCommitTime(String revisionCommitTime) {
    this.revisionCommitTime = revisionCommitTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DependsOnCatalogObject dependsOnCatalogObject = (DependsOnCatalogObject) o;
    return Objects.equals(this.bucketAndObjectName, dependsOnCatalogObject.bucketAndObjectName) &&
        Objects.equals(this.isInCatalog, dependsOnCatalogObject.isInCatalog) &&
        Objects.equals(this.kind, dependsOnCatalogObject.kind) &&
        Objects.equals(this.revisionCommitTime, dependsOnCatalogObject.revisionCommitTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketAndObjectName, isInCatalog, kind, revisionCommitTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DependsOnCatalogObject {\n");
    
    sb.append("    bucketAndObjectName: ").append(toIndentedString(bucketAndObjectName)).append("\n");
    sb.append("    isInCatalog: ").append(toIndentedString(isInCatalog)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    revisionCommitTime: ").append(toIndentedString(revisionCommitTime)).append("\n");
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

