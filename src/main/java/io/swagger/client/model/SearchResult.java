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
 * SearchResult
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-07T20:15:06.627-08:00")
public class SearchResult   {
  @SerializedName("numFound")
  private Integer numFound = null;

  @SerializedName("start")
  private Integer start = null;

  @SerializedName("facet_pivot")
  private Object facetPivot = null;

  @SerializedName("facet_counts")
  private Object facetCounts = null;

  public SearchResult numFound(Integer numFound) {
    this.numFound = numFound;
    return this;
  }

   /**
   * total number of associations matching query
   * @return numFound
  **/
  @ApiModelProperty(example = "null", value = "total number of associations matching query")
  public Integer getNumFound() {
    return numFound;
  }

  public void setNumFound(Integer numFound) {
    this.numFound = numFound;
  }

  public SearchResult start(Integer start) {
    this.start = start;
    return this;
  }

   /**
   * Cursor position
   * @return start
  **/
  @ApiModelProperty(example = "null", value = "Cursor position")
  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public SearchResult facetPivot(Object facetPivot) {
    this.facetPivot = facetPivot;
    return this;
  }

   /**
   * Populated in facet_pivots is passed
   * @return facetPivot
  **/
  @ApiModelProperty(example = "null", value = "Populated in facet_pivots is passed")
  public Object getFacetPivot() {
    return facetPivot;
  }

  public void setFacetPivot(Object facetPivot) {
    this.facetPivot = facetPivot;
  }

  public SearchResult facetCounts(Object facetCounts) {
    this.facetCounts = facetCounts;
    return this;
  }

   /**
   * Mapping between field names and association counts
   * @return facetCounts
  **/
  @ApiModelProperty(example = "null", value = "Mapping between field names and association counts")
  public Object getFacetCounts() {
    return facetCounts;
  }

  public void setFacetCounts(Object facetCounts) {
    this.facetCounts = facetCounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResult searchResult = (SearchResult) o;
    return Objects.equals(this.numFound, searchResult.numFound) &&
        Objects.equals(this.start, searchResult.start) &&
        Objects.equals(this.facetPivot, searchResult.facetPivot) &&
        Objects.equals(this.facetCounts, searchResult.facetCounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numFound, start, facetPivot, facetCounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResult {\n");
    
    sb.append("    numFound: ").append(toIndentedString(numFound)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    facetPivot: ").append(toIndentedString(facetPivot)).append("\n");
    sb.append("    facetCounts: ").append(toIndentedString(facetCounts)).append("\n");
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

