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
import org.joda.time.DateTime;


/**
 * VariantSet
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-07T20:15:06.627-08:00")
public class VariantSet   {
  @SerializedName("body")
  private String body = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("category_id")
  private Integer categoryId = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("pub_date")
  private DateTime pubDate = null;

  @SerializedName("category")
  private String category = null;

  public VariantSet body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Article content
   * @return body
  **/
  @ApiModelProperty(example = "null", required = true, value = "Article content")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public VariantSet title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Article title
   * @return title
  **/
  @ApiModelProperty(example = "null", required = true, value = "Article title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public VariantSet categoryId(Integer categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Get categoryId
   * @return categoryId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public VariantSet id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of a variant set
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The unique identifier of a variant set")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public VariantSet pubDate(DateTime pubDate) {
    this.pubDate = pubDate;
    return this;
  }

   /**
   * Get pubDate
   * @return pubDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getPubDate() {
    return pubDate;
  }

  public void setPubDate(DateTime pubDate) {
    this.pubDate = pubDate;
  }

  public VariantSet category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariantSet variantSet = (VariantSet) o;
    return Objects.equals(this.body, variantSet.body) &&
        Objects.equals(this.title, variantSet.title) &&
        Objects.equals(this.categoryId, variantSet.categoryId) &&
        Objects.equals(this.id, variantSet.id) &&
        Objects.equals(this.pubDate, variantSet.pubDate) &&
        Objects.equals(this.category, variantSet.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, title, categoryId, id, pubDate, category);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariantSet {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pubDate: ").append(toIndentedString(pubDate)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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

