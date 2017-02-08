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
import io.swagger.client.model.Association;
import io.swagger.client.model.BioObject;
import io.swagger.client.model.Chromosome;
import io.swagger.client.model.NamedObject;
import io.swagger.client.model.SequenceFeature;
import io.swagger.client.model.SummaryPropertyValue;
import io.swagger.client.model.Taxon;
import io.swagger.client.model.Transcript;
import java.util.ArrayList;
import java.util.List;


/**
 * Gene
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-07T20:15:06.627-08:00")
public class Gene   {
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

  @SerializedName("pathway_associations")
  private List<Association> pathwayAssociations = new ArrayList<Association>();

  @SerializedName("genotype_associations")
  private List<Association> genotypeAssociations = new ArrayList<Association>();

  @SerializedName("full_name")
  private String fullName = null;

  @SerializedName("sequence_features")
  private List<SequenceFeature> sequenceFeatures = new ArrayList<SequenceFeature>();

  @SerializedName("function_associations")
  private List<Association> functionAssociations = new ArrayList<Association>();

  @SerializedName("interaction_associations")
  private List<Association> interactionAssociations = new ArrayList<Association>();

  @SerializedName("transcripts")
  private List<Transcript> transcripts = new ArrayList<Transcript>();

  @SerializedName("literature_associations")
  private List<Association> literatureAssociations = new ArrayList<Association>();

  @SerializedName("summaries")
  private List<SummaryPropertyValue> summaries = new ArrayList<SummaryPropertyValue>();

  @SerializedName("chromosome")
  private Chromosome chromosome = null;

  @SerializedName("disease_associations")
  private List<Association> diseaseAssociations = new ArrayList<Association>();

  @SerializedName("phenotype_associations")
  private List<Association> phenotypeAssociations = new ArrayList<Association>();

  @SerializedName("homology_associations")
  private List<Association> homologyAssociations = new ArrayList<Association>();

  @SerializedName("description")
  private String description = null;

  @SerializedName("systematic_name")
  private String systematicName = null;

  @SerializedName("families")
  private List<NamedObject> families = new ArrayList<NamedObject>();

  public Gene label(String label) {
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

  public Gene id(String id) {
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

  public Gene categories(List<String> categories) {
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

  public Gene xrefs(List<String> xrefs) {
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

  public Gene taxon(Taxon taxon) {
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

  public Gene pathwayAssociations(List<Association> pathwayAssociations) {
    this.pathwayAssociations = pathwayAssociations;
    return this;
  }

   /**
   * Assocations to pathways in which this gene is involved, including LEGO models
   * @return pathwayAssociations
  **/
  @ApiModelProperty(example = "null", value = "Assocations to pathways in which this gene is involved, including LEGO models")
  public List<Association> getPathwayAssociations() {
    return pathwayAssociations;
  }

  public void setPathwayAssociations(List<Association> pathwayAssociations) {
    this.pathwayAssociations = pathwayAssociations;
  }

  public Gene genotypeAssociations(List<Association> genotypeAssociations) {
    this.genotypeAssociations = genotypeAssociations;
    return this;
  }

   /**
   * associations to genotypes in which this gene is altered
   * @return genotypeAssociations
  **/
  @ApiModelProperty(example = "null", value = "associations to genotypes in which this gene is altered")
  public List<Association> getGenotypeAssociations() {
    return genotypeAssociations;
  }

  public void setGenotypeAssociations(List<Association> genotypeAssociations) {
    this.genotypeAssociations = genotypeAssociations;
  }

  public Gene fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * full name, e.g. Synaptosome Associated Protein 29
   * @return fullName
  **/
  @ApiModelProperty(example = "null", value = "full name, e.g. Synaptosome Associated Protein 29")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public Gene sequenceFeatures(List<SequenceFeature> sequenceFeatures) {
    this.sequenceFeatures = sequenceFeatures;
    return this;
  }

   /**
   * Sequence feature representing particular instance on a genome
   * @return sequenceFeatures
  **/
  @ApiModelProperty(example = "null", value = "Sequence feature representing particular instance on a genome")
  public List<SequenceFeature> getSequenceFeatures() {
    return sequenceFeatures;
  }

  public void setSequenceFeatures(List<SequenceFeature> sequenceFeatures) {
    this.sequenceFeatures = sequenceFeatures;
  }

  public Gene functionAssociations(List<Association> functionAssociations) {
    this.functionAssociations = functionAssociations;
    return this;
  }

   /**
   * GO assocations for wild type gene
   * @return functionAssociations
  **/
  @ApiModelProperty(example = "null", value = "GO assocations for wild type gene")
  public List<Association> getFunctionAssociations() {
    return functionAssociations;
  }

  public void setFunctionAssociations(List<Association> functionAssociations) {
    this.functionAssociations = functionAssociations;
  }

  public Gene interactionAssociations(List<Association> interactionAssociations) {
    this.interactionAssociations = interactionAssociations;
    return this;
  }

   /**
   * associations to genes that interact (may be physical or genetic)
   * @return interactionAssociations
  **/
  @ApiModelProperty(example = "null", value = "associations to genes that interact (may be physical or genetic)")
  public List<Association> getInteractionAssociations() {
    return interactionAssociations;
  }

  public void setInteractionAssociations(List<Association> interactionAssociations) {
    this.interactionAssociations = interactionAssociations;
  }

  public Gene transcripts(List<Transcript> transcripts) {
    this.transcripts = transcripts;
    return this;
  }

   /**
   * All transcripts belonging to this gene
   * @return transcripts
  **/
  @ApiModelProperty(example = "null", value = "All transcripts belonging to this gene")
  public List<Transcript> getTranscripts() {
    return transcripts;
  }

  public void setTranscripts(List<Transcript> transcripts) {
    this.transcripts = transcripts;
  }

  public Gene literatureAssociations(List<Association> literatureAssociations) {
    this.literatureAssociations = literatureAssociations;
    return this;
  }

   /**
   * publications for this gene
   * @return literatureAssociations
  **/
  @ApiModelProperty(example = "null", value = "publications for this gene")
  public List<Association> getLiteratureAssociations() {
    return literatureAssociations;
  }

  public void setLiteratureAssociations(List<Association> literatureAssociations) {
    this.literatureAssociations = literatureAssociations;
  }

  public Gene summaries(List<SummaryPropertyValue> summaries) {
    this.summaries = summaries;
    return this;
  }

   /**
   * Attributed textual summaries
   * @return summaries
  **/
  @ApiModelProperty(example = "null", value = "Attributed textual summaries")
  public List<SummaryPropertyValue> getSummaries() {
    return summaries;
  }

  public void setSummaries(List<SummaryPropertyValue> summaries) {
    this.summaries = summaries;
  }

  public Gene chromosome(Chromosome chromosome) {
    this.chromosome = chromosome;
    return this;
  }

   /**
   * chromosome on which this gene is located. This may be redundant with information in sequence_feature objects but is included here for convenience
   * @return chromosome
  **/
  @ApiModelProperty(example = "null", value = "chromosome on which this gene is located. This may be redundant with information in sequence_feature objects but is included here for convenience")
  public Chromosome getChromosome() {
    return chromosome;
  }

  public void setChromosome(Chromosome chromosome) {
    this.chromosome = chromosome;
  }

  public Gene diseaseAssociations(List<Association> diseaseAssociations) {
    this.diseaseAssociations = diseaseAssociations;
    return this;
  }

   /**
   * diseases associated with alterations of gene
   * @return diseaseAssociations
  **/
  @ApiModelProperty(example = "null", value = "diseases associated with alterations of gene")
  public List<Association> getDiseaseAssociations() {
    return diseaseAssociations;
  }

  public void setDiseaseAssociations(List<Association> diseaseAssociations) {
    this.diseaseAssociations = diseaseAssociations;
  }

  public Gene phenotypeAssociations(List<Association> phenotypeAssociations) {
    this.phenotypeAssociations = phenotypeAssociations;
    return this;
  }

   /**
   * phenotypes associated with alterations of gene
   * @return phenotypeAssociations
  **/
  @ApiModelProperty(example = "null", value = "phenotypes associated with alterations of gene")
  public List<Association> getPhenotypeAssociations() {
    return phenotypeAssociations;
  }

  public void setPhenotypeAssociations(List<Association> phenotypeAssociations) {
    this.phenotypeAssociations = phenotypeAssociations;
  }

  public Gene homologyAssociations(List<Association> homologyAssociations) {
    this.homologyAssociations = homologyAssociations;
    return this;
  }

   /**
   * orthology and paralogy assocations for this gene
   * @return homologyAssociations
  **/
  @ApiModelProperty(example = "null", value = "orthology and paralogy assocations for this gene")
  public List<Association> getHomologyAssociations() {
    return homologyAssociations;
  }

  public void setHomologyAssociations(List<Association> homologyAssociations) {
    this.homologyAssociations = homologyAssociations;
  }

  public Gene description(String description) {
    this.description = description;
    return this;
  }

   /**
   * full text description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "full text description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Gene systematicName(String systematicName) {
    this.systematicName = systematicName;
    return this;
  }

   /**
   * E.g. SPBC428.08c for clr4 in PomBase
   * @return systematicName
  **/
  @ApiModelProperty(example = "null", value = "E.g. SPBC428.08c for clr4 in PomBase")
  public String getSystematicName() {
    return systematicName;
  }

  public void setSystematicName(String systematicName) {
    this.systematicName = systematicName;
  }

  public Gene families(List<NamedObject> families) {
    this.families = families;
    return this;
  }

   /**
   * Families, superfamilies etc to which these gene belongs
   * @return families
  **/
  @ApiModelProperty(example = "null", value = "Families, superfamilies etc to which these gene belongs")
  public List<NamedObject> getFamilies() {
    return families;
  }

  public void setFamilies(List<NamedObject> families) {
    this.families = families;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Gene gene = (Gene) o;
    return Objects.equals(this.label, gene.label) &&
        Objects.equals(this.id, gene.id) &&
        Objects.equals(this.categories, gene.categories) &&
        Objects.equals(this.xrefs, gene.xrefs) &&
        Objects.equals(this.taxon, gene.taxon) &&
        Objects.equals(this.pathwayAssociations, gene.pathwayAssociations) &&
        Objects.equals(this.genotypeAssociations, gene.genotypeAssociations) &&
        Objects.equals(this.fullName, gene.fullName) &&
        Objects.equals(this.sequenceFeatures, gene.sequenceFeatures) &&
        Objects.equals(this.functionAssociations, gene.functionAssociations) &&
        Objects.equals(this.interactionAssociations, gene.interactionAssociations) &&
        Objects.equals(this.transcripts, gene.transcripts) &&
        Objects.equals(this.literatureAssociations, gene.literatureAssociations) &&
        Objects.equals(this.summaries, gene.summaries) &&
        Objects.equals(this.chromosome, gene.chromosome) &&
        Objects.equals(this.diseaseAssociations, gene.diseaseAssociations) &&
        Objects.equals(this.phenotypeAssociations, gene.phenotypeAssociations) &&
        Objects.equals(this.homologyAssociations, gene.homologyAssociations) &&
        Objects.equals(this.description, gene.description) &&
        Objects.equals(this.systematicName, gene.systematicName) &&
        Objects.equals(this.families, gene.families);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, id, categories, xrefs, taxon, pathwayAssociations, genotypeAssociations, fullName, sequenceFeatures, functionAssociations, interactionAssociations, transcripts, literatureAssociations, summaries, chromosome, diseaseAssociations, phenotypeAssociations, homologyAssociations, description, systematicName, families);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gene {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    xrefs: ").append(toIndentedString(xrefs)).append("\n");
    sb.append("    taxon: ").append(toIndentedString(taxon)).append("\n");
    sb.append("    pathwayAssociations: ").append(toIndentedString(pathwayAssociations)).append("\n");
    sb.append("    genotypeAssociations: ").append(toIndentedString(genotypeAssociations)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    sequenceFeatures: ").append(toIndentedString(sequenceFeatures)).append("\n");
    sb.append("    functionAssociations: ").append(toIndentedString(functionAssociations)).append("\n");
    sb.append("    interactionAssociations: ").append(toIndentedString(interactionAssociations)).append("\n");
    sb.append("    transcripts: ").append(toIndentedString(transcripts)).append("\n");
    sb.append("    literatureAssociations: ").append(toIndentedString(literatureAssociations)).append("\n");
    sb.append("    summaries: ").append(toIndentedString(summaries)).append("\n");
    sb.append("    chromosome: ").append(toIndentedString(chromosome)).append("\n");
    sb.append("    diseaseAssociations: ").append(toIndentedString(diseaseAssociations)).append("\n");
    sb.append("    phenotypeAssociations: ").append(toIndentedString(phenotypeAssociations)).append("\n");
    sb.append("    homologyAssociations: ").append(toIndentedString(homologyAssociations)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    systematicName: ").append(toIndentedString(systematicName)).append("\n");
    sb.append("    families: ").append(toIndentedString(families)).append("\n");
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

