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
import io.swagger.client.model.NamedObject;
import io.swagger.client.model.Taxon;
import java.util.ArrayList;
import java.util.List;


/**
 * BioObject
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-07T20:15:06.627-08:00")
public class BioObject   {
  @SerializedName("label")
  private String label = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("categories")
  private List<String> categories = new ArrayList<String>();

  @SerializedName("xrefs")
  private List<String> xrefs = new ArrayList<String>();

  @SerializedName("taxon")
  private Taxon taxon = null;

  public BioObject label(String label) {
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

  public BioObject id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID or CURIE e.g. MGI:1201606
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "ID or CURIE e.g. MGI:1201606")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BioObject categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getCategories() {
    return categories;
  }

  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

  public BioObject xrefs(List<String> xrefs) {
    this.xrefs = xrefs;
    return this;
  }

   /**
   * Database cross-references. These are usually CURIEs, but may also be URLs. E.g. ENSEMBL:ENSG00000099940 
   * @return xrefs
  **/
  @ApiModelProperty(example = "null", value = "Database cross-references. These are usually CURIEs, but may also be URLs. E.g. ENSEMBL:ENSG00000099940 ")
  public List<String> getXrefs() {
    return xrefs;
  }

  public void setXrefs(List<String> xrefs) {
    this.xrefs = xrefs;
  }

  public BioObject taxon(Taxon taxon) {
    this.taxon = taxon;
    return this;
  }

   /**
   * Taxon to which the object belongs
   * @return taxon
  **/
  @ApiModelProperty(example = "null", value = "Taxon to which the object belongs")
  public Taxon getTaxon() {
    return taxon;
  }

  public void setTaxon(Taxon taxon) {
    this.taxon = taxon;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BioObject bioObject = (BioObject) o;
    return Objects.equals(this.label, bioObject.label) &&
        Objects.equals(this.id, bioObject.id) &&
        Objects.equals(this.categories, bioObject.categories) &&
        Objects.equals(this.xrefs, bioObject.xrefs) &&
        Objects.equals(this.taxon, bioObject.taxon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, id, categories, xrefs, taxon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BioObject {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    xrefs: ").append(toIndentedString(xrefs)).append("\n");
    sb.append("    taxon: ").append(toIndentedString(taxon)).append("\n");
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

