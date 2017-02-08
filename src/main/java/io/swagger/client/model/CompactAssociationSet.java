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
import java.util.ArrayList;
import java.util.List;


/**
 * CompactAssociationSet
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-07T20:15:06.627-08:00")
public class CompactAssociationSet   {
  @SerializedName("objects")
  private List<String> objects = new ArrayList<String>();

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("relation")
  private String relation = null;

  public CompactAssociationSet objects(List<String> objects) {
    this.objects = objects;
    return this;
  }

   /**
   * List of O, for a given (S,R) pair, yielding (S,R,O) triples. E.g. list of MPs for (MGI:nnn, has_phenotype)
   * @return objects
  **/
  @ApiModelProperty(example = "null", value = "List of O, for a given (S,R) pair, yielding (S,R,O) triples. E.g. list of MPs for (MGI:nnn, has_phenotype)")
  public List<String> getObjects() {
    return objects;
  }

  public void setObjects(List<String> objects) {
    this.objects = objects;
  }

  public CompactAssociationSet subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Subject of association (what it is about), e.g. MGI:1201606
   * @return subject
  **/
  @ApiModelProperty(example = "null", value = "Subject of association (what it is about), e.g. MGI:1201606")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public CompactAssociationSet relation(String relation) {
    this.relation = relation;
    return this;
  }

   /**
   * Relationship type connecting subject and object list
   * @return relation
  **/
  @ApiModelProperty(example = "null", value = "Relationship type connecting subject and object list")
  public String getRelation() {
    return relation;
  }

  public void setRelation(String relation) {
    this.relation = relation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompactAssociationSet compactAssociationSet = (CompactAssociationSet) o;
    return Objects.equals(this.objects, compactAssociationSet.objects) &&
        Objects.equals(this.subject, compactAssociationSet.subject) &&
        Objects.equals(this.relation, compactAssociationSet.relation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objects, subject, relation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompactAssociationSet {\n");
    
    sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    relation: ").append(toIndentedString(relation)).append("\n");
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

