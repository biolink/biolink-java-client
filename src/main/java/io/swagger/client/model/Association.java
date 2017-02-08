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
import io.swagger.client.model.AnnotationExtension;
import io.swagger.client.model.AssociationPropertyValue;
import io.swagger.client.model.BioObject;
import io.swagger.client.model.Graph;
import io.swagger.client.model.NamedObject;
import io.swagger.client.model.Publication;
import io.swagger.client.model.Relation;
import java.util.ArrayList;
import java.util.List;


/**
 * Association
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-07T20:15:06.627-08:00")
public class Association   {
  @SerializedName("evidence_types")
  private List<NamedObject> evidenceTypes = new ArrayList<NamedObject>();

  @SerializedName("evidence_graph")
  private Graph evidenceGraph = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("relation")
  private Relation relation = null;

  @SerializedName("provided_by")
  private List<String> providedBy = new ArrayList<String>();

  @SerializedName("publications")
  private List<Publication> publications = new ArrayList<Publication>();

  @SerializedName("object_extension")
  private List<AnnotationExtension> objectExtension = new ArrayList<AnnotationExtension>();

  @SerializedName("qualifiers")
  private List<AssociationPropertyValue> qualifiers = new ArrayList<AssociationPropertyValue>();

  @SerializedName("object")
  private BioObject object = null;

  @SerializedName("subject")
  private BioObject subject = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("subject_extension")
  private List<AnnotationExtension> subjectExtension = new ArrayList<AnnotationExtension>();

  public Association evidenceTypes(List<NamedObject> evidenceTypes) {
    this.evidenceTypes = evidenceTypes;
    return this;
  }

   /**
   * Evidence types (ECO classes) extracted from evidence graph
   * @return evidenceTypes
  **/
  @ApiModelProperty(example = "null", value = "Evidence types (ECO classes) extracted from evidence graph")
  public List<NamedObject> getEvidenceTypes() {
    return evidenceTypes;
  }

  public void setEvidenceTypes(List<NamedObject> evidenceTypes) {
    this.evidenceTypes = evidenceTypes;
  }

  public Association evidenceGraph(Graph evidenceGraph) {
    this.evidenceGraph = evidenceGraph;
    return this;
  }

   /**
   * An indirect association is a join between two or more direct assocations, e.g. gene to disease via ortholog. We record the full set of associations as a graph object
   * @return evidenceGraph
  **/
  @ApiModelProperty(example = "null", value = "An indirect association is a join between two or more direct assocations, e.g. gene to disease via ortholog. We record the full set of associations as a graph object")
  public Graph getEvidenceGraph() {
    return evidenceGraph;
  }

  public void setEvidenceGraph(Graph evidenceGraph) {
    this.evidenceGraph = evidenceGraph;
  }

  public Association id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Association/annotation unique ID
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Association/annotation unique ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Association relation(Relation relation) {
    this.relation = relation;
    return this;
  }

   /**
   * Relationship type connecting subject and object
   * @return relation
  **/
  @ApiModelProperty(example = "null", value = "Relationship type connecting subject and object")
  public Relation getRelation() {
    return relation;
  }

  public void setRelation(Relation relation) {
    this.relation = relation;
  }

  public Association providedBy(List<String> providedBy) {
    this.providedBy = providedBy;
    return this;
  }

   /**
   * Provider of association, e.g. Orphanet, ClinVar
   * @return providedBy
  **/
  @ApiModelProperty(example = "null", value = "Provider of association, e.g. Orphanet, ClinVar")
  public List<String> getProvidedBy() {
    return providedBy;
  }

  public void setProvidedBy(List<String> providedBy) {
    this.providedBy = providedBy;
  }

  public Association publications(List<Publication> publications) {
    this.publications = publications;
    return this;
  }

   /**
   * Publications supporting association, extracted from evidence graph
   * @return publications
  **/
  @ApiModelProperty(example = "null", value = "Publications supporting association, extracted from evidence graph")
  public List<Publication> getPublications() {
    return publications;
  }

  public void setPublications(List<Publication> publications) {
    this.publications = publications;
  }

  public Association objectExtension(List<AnnotationExtension> objectExtension) {
    this.objectExtension = objectExtension;
    return this;
  }

   /**
   * Get objectExtension
   * @return objectExtension
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<AnnotationExtension> getObjectExtension() {
    return objectExtension;
  }

  public void setObjectExtension(List<AnnotationExtension> objectExtension) {
    this.objectExtension = objectExtension;
  }

  public Association qualifiers(List<AssociationPropertyValue> qualifiers) {
    this.qualifiers = qualifiers;
    return this;
  }

   /**
   * Get qualifiers
   * @return qualifiers
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<AssociationPropertyValue> getQualifiers() {
    return qualifiers;
  }

  public void setQualifiers(List<AssociationPropertyValue> qualifiers) {
    this.qualifiers = qualifiers;
  }

  public Association object(BioObject object) {
    this.object = object;
    return this;
  }

   /**
   * Object (sensu RDF), aka target, e.g. HP:0000448, MP:0002109, DOID:14330
   * @return object
  **/
  @ApiModelProperty(example = "null", value = "Object (sensu RDF), aka target, e.g. HP:0000448, MP:0002109, DOID:14330")
  public BioObject getObject() {
    return object;
  }

  public void setObject(BioObject object) {
    this.object = object;
  }

  public Association subject(BioObject subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Subject of association (what it is about), e.g. ClinVar:nnn, MGI:1201606
   * @return subject
  **/
  @ApiModelProperty(example = "null", value = "Subject of association (what it is about), e.g. ClinVar:nnn, MGI:1201606")
  public BioObject getSubject() {
    return subject;
  }

  public void setSubject(BioObject subject) {
    this.subject = subject;
  }

  public Association type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of association, e.g. gene-phenotype
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Type of association, e.g. gene-phenotype")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Association subjectExtension(List<AnnotationExtension> subjectExtension) {
    this.subjectExtension = subjectExtension;
    return this;
  }

   /**
   * Get subjectExtension
   * @return subjectExtension
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<AnnotationExtension> getSubjectExtension() {
    return subjectExtension;
  }

  public void setSubjectExtension(List<AnnotationExtension> subjectExtension) {
    this.subjectExtension = subjectExtension;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Association association = (Association) o;
    return Objects.equals(this.evidenceTypes, association.evidenceTypes) &&
        Objects.equals(this.evidenceGraph, association.evidenceGraph) &&
        Objects.equals(this.id, association.id) &&
        Objects.equals(this.relation, association.relation) &&
        Objects.equals(this.providedBy, association.providedBy) &&
        Objects.equals(this.publications, association.publications) &&
        Objects.equals(this.objectExtension, association.objectExtension) &&
        Objects.equals(this.qualifiers, association.qualifiers) &&
        Objects.equals(this.object, association.object) &&
        Objects.equals(this.subject, association.subject) &&
        Objects.equals(this.type, association.type) &&
        Objects.equals(this.subjectExtension, association.subjectExtension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evidenceTypes, evidenceGraph, id, relation, providedBy, publications, objectExtension, qualifiers, object, subject, type, subjectExtension);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Association {\n");
    
    sb.append("    evidenceTypes: ").append(toIndentedString(evidenceTypes)).append("\n");
    sb.append("    evidenceGraph: ").append(toIndentedString(evidenceGraph)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    relation: ").append(toIndentedString(relation)).append("\n");
    sb.append("    providedBy: ").append(toIndentedString(providedBy)).append("\n");
    sb.append("    publications: ").append(toIndentedString(publications)).append("\n");
    sb.append("    objectExtension: ").append(toIndentedString(objectExtension)).append("\n");
    sb.append("    qualifiers: ").append(toIndentedString(qualifiers)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subjectExtension: ").append(toIndentedString(subjectExtension)).append("\n");
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
