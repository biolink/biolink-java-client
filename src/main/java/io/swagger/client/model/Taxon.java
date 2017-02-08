/**
 * BioLink API
 * API integration layer for linked biological objects.   __Source:__ https://github.com/monarch-initiative/biolink-api/
 *
 * OpenAPI spec version: 0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Taxon
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-07T20:15:06.627-08:00")
public class Taxon   {
  @SerializedName("label")
  private String label = null;

  @SerializedName("id")
  private String id = null;

  public Taxon label(String label) {
    this.label = label;
    return this;
  }

   /**
   * RDFS Label
   * @return label
  **/
  @ApiModelProperty(example = "null", value = "RDFS Label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Taxon id(String id) {
    this.id = id;
    return this;
  }

   /**
   * CURIE ID, e.g. NCBITaxon:9606
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "CURIE ID, e.g. NCBITaxon:9606")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Taxon taxon = (Taxon) o;
    return Objects.equals(this.label, taxon.label) &&
        Objects.equals(this.id, taxon.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Taxon {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

