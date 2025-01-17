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
import java.util.ArrayList;
import java.util.List;
import org.ow2.proactive.catalog.client.model.CatalogObjectID;
import org.ow2.proactive.catalog.client.model.DequeOfModificationHistoryData;
import org.ow2.proactive.catalog.client.model.Link;

/**
 * CatalogObjectGrantMetadata
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-26T17:28:06.013+01:00")
public class CatalogObjectGrantMetadata {
  @JsonProperty("accessType")
  private String accessType = null;

  @JsonProperty("bucketName")
  private String bucketName = null;

  @JsonProperty("catalogObjectBucketId")
  private Long catalogObjectBucketId = null;

  @JsonProperty("catalogObjectId")
  private CatalogObjectID catalogObjectId = null;

  @JsonProperty("catalogObjectName")
  private String catalogObjectName = null;

  @JsonProperty("creationDate")
  private Long creationDate = null;

  @JsonProperty("creator")
  private String creator = null;

  @JsonProperty("grantee")
  private String grantee = null;

  @JsonProperty("granteeType")
  private String granteeType = null;

  @JsonProperty("links")
  private List<Link> links = null;

  @JsonProperty("modificationHistory")
  private DequeOfModificationHistoryData modificationHistory = null;

  @JsonProperty("priority")
  private Integer priority = null;

  public CatalogObjectGrantMetadata accessType(String accessType) {
    this.accessType = accessType;
    return this;
  }

   /**
   * Get accessType
   * @return accessType
  **/
  @ApiModelProperty(value = "")
  public String getAccessType() {
    return accessType;
  }

  public void setAccessType(String accessType) {
    this.accessType = accessType;
  }

  public CatalogObjectGrantMetadata bucketName(String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

   /**
   * Get bucketName
   * @return bucketName
  **/
  @ApiModelProperty(value = "")
  public String getBucketName() {
    return bucketName;
  }

  public void setBucketName(String bucketName) {
    this.bucketName = bucketName;
  }

  public CatalogObjectGrantMetadata catalogObjectBucketId(Long catalogObjectBucketId) {
    this.catalogObjectBucketId = catalogObjectBucketId;
    return this;
  }

   /**
   * Get catalogObjectBucketId
   * @return catalogObjectBucketId
  **/
  @ApiModelProperty(value = "")
  public Long getCatalogObjectBucketId() {
    return catalogObjectBucketId;
  }

  public void setCatalogObjectBucketId(Long catalogObjectBucketId) {
    this.catalogObjectBucketId = catalogObjectBucketId;
  }

  public CatalogObjectGrantMetadata catalogObjectId(CatalogObjectID catalogObjectId) {
    this.catalogObjectId = catalogObjectId;
    return this;
  }

   /**
   * Get catalogObjectId
   * @return catalogObjectId
  **/
  @ApiModelProperty(value = "")
  public CatalogObjectID getCatalogObjectId() {
    return catalogObjectId;
  }

  public void setCatalogObjectId(CatalogObjectID catalogObjectId) {
    this.catalogObjectId = catalogObjectId;
  }

  public CatalogObjectGrantMetadata catalogObjectName(String catalogObjectName) {
    this.catalogObjectName = catalogObjectName;
    return this;
  }

   /**
   * Get catalogObjectName
   * @return catalogObjectName
  **/
  @ApiModelProperty(value = "")
  public String getCatalogObjectName() {
    return catalogObjectName;
  }

  public void setCatalogObjectName(String catalogObjectName) {
    this.catalogObjectName = catalogObjectName;
  }

  public CatalogObjectGrantMetadata creationDate(Long creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @ApiModelProperty(value = "")
  public Long getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Long creationDate) {
    this.creationDate = creationDate;
  }

  public CatalogObjectGrantMetadata creator(String creator) {
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @ApiModelProperty(value = "")
  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public CatalogObjectGrantMetadata grantee(String grantee) {
    this.grantee = grantee;
    return this;
  }

   /**
   * Get grantee
   * @return grantee
  **/
  @ApiModelProperty(value = "")
  public String getGrantee() {
    return grantee;
  }

  public void setGrantee(String grantee) {
    this.grantee = grantee;
  }

  public CatalogObjectGrantMetadata granteeType(String granteeType) {
    this.granteeType = granteeType;
    return this;
  }

   /**
   * Get granteeType
   * @return granteeType
  **/
  @ApiModelProperty(value = "")
  public String getGranteeType() {
    return granteeType;
  }

  public void setGranteeType(String granteeType) {
    this.granteeType = granteeType;
  }

  public CatalogObjectGrantMetadata links(List<Link> links) {
    this.links = links;
    return this;
  }

  public CatalogObjectGrantMetadata addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }

  public CatalogObjectGrantMetadata modificationHistory(DequeOfModificationHistoryData modificationHistory) {
    this.modificationHistory = modificationHistory;
    return this;
  }

   /**
   * Get modificationHistory
   * @return modificationHistory
  **/
  @ApiModelProperty(value = "")
  public DequeOfModificationHistoryData getModificationHistory() {
    return modificationHistory;
  }

  public void setModificationHistory(DequeOfModificationHistoryData modificationHistory) {
    this.modificationHistory = modificationHistory;
  }

  public CatalogObjectGrantMetadata priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @ApiModelProperty(value = "")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogObjectGrantMetadata catalogObjectGrantMetadata = (CatalogObjectGrantMetadata) o;
    return Objects.equals(this.accessType, catalogObjectGrantMetadata.accessType) &&
        Objects.equals(this.bucketName, catalogObjectGrantMetadata.bucketName) &&
        Objects.equals(this.catalogObjectBucketId, catalogObjectGrantMetadata.catalogObjectBucketId) &&
        Objects.equals(this.catalogObjectId, catalogObjectGrantMetadata.catalogObjectId) &&
        Objects.equals(this.catalogObjectName, catalogObjectGrantMetadata.catalogObjectName) &&
        Objects.equals(this.creationDate, catalogObjectGrantMetadata.creationDate) &&
        Objects.equals(this.creator, catalogObjectGrantMetadata.creator) &&
        Objects.equals(this.grantee, catalogObjectGrantMetadata.grantee) &&
        Objects.equals(this.granteeType, catalogObjectGrantMetadata.granteeType) &&
        Objects.equals(this.links, catalogObjectGrantMetadata.links) &&
        Objects.equals(this.modificationHistory, catalogObjectGrantMetadata.modificationHistory) &&
        Objects.equals(this.priority, catalogObjectGrantMetadata.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessType, bucketName, catalogObjectBucketId, catalogObjectId, catalogObjectName, creationDate, creator, grantee, granteeType, links, modificationHistory, priority);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogObjectGrantMetadata {\n");
    
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    catalogObjectBucketId: ").append(toIndentedString(catalogObjectBucketId)).append("\n");
    sb.append("    catalogObjectId: ").append(toIndentedString(catalogObjectId)).append("\n");
    sb.append("    catalogObjectName: ").append(toIndentedString(catalogObjectName)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    grantee: ").append(toIndentedString(grantee)).append("\n");
    sb.append("    granteeType: ").append(toIndentedString(granteeType)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    modificationHistory: ").append(toIndentedString(modificationHistory)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

