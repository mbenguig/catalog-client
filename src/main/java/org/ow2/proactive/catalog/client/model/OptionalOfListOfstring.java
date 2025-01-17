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
 * OptionalOfListOfstring
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-26T17:28:06.013+01:00")
public class OptionalOfListOfstring {
  @JsonProperty("present")
  private Boolean present = null;

  public OptionalOfListOfstring present(Boolean present) {
    this.present = present;
    return this;
  }

   /**
   * Get present
   * @return present
  **/
  @ApiModelProperty(value = "")
  public Boolean isPresent() {
    return present;
  }

  public void setPresent(Boolean present) {
    this.present = present;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionalOfListOfstring optionalOfListOfstring = (OptionalOfListOfstring) o;
    return Objects.equals(this.present, optionalOfListOfstring.present);
  }

  @Override
  public int hashCode() {
    return Objects.hash(present);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionalOfListOfstring {\n");
    
    sb.append("    present: ").append(toIndentedString(present)).append("\n");
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

