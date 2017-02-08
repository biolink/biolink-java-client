
# Gene

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **String** | RDFS Label |  [optional]
**id** | **String** | ID or CURIE e.g. MGI:1201606 |  [optional]
**categories** | **List&lt;String&gt;** |  |  [optional]
**xrefs** | **List&lt;String&gt;** | Database cross-references. These are usually CURIEs, but may also be URLs. E.g. ENSEMBL:ENSG00000099940  |  [optional]
**taxon** | [**Taxon**](Taxon.md) | Taxon to which the object belongs |  [optional]
**pathwayAssociations** | [**List&lt;Association&gt;**](Association.md) | Assocations to pathways in which this gene is involved, including LEGO models |  [optional]
**genotypeAssociations** | [**List&lt;Association&gt;**](Association.md) | associations to genotypes in which this gene is altered |  [optional]
**fullName** | **String** | full name, e.g. Synaptosome Associated Protein 29 |  [optional]
**sequenceFeatures** | [**List&lt;SequenceFeature&gt;**](SequenceFeature.md) | Sequence feature representing particular instance on a genome |  [optional]
**functionAssociations** | [**List&lt;Association&gt;**](Association.md) | GO assocations for wild type gene |  [optional]
**interactionAssociations** | [**List&lt;Association&gt;**](Association.md) | associations to genes that interact (may be physical or genetic) |  [optional]
**transcripts** | [**List&lt;Transcript&gt;**](Transcript.md) | All transcripts belonging to this gene |  [optional]
**literatureAssociations** | [**List&lt;Association&gt;**](Association.md) | publications for this gene |  [optional]
**summaries** | [**List&lt;SummaryPropertyValue&gt;**](SummaryPropertyValue.md) | Attributed textual summaries |  [optional]
**chromosome** | [**Chromosome**](Chromosome.md) | chromosome on which this gene is located. This may be redundant with information in sequence_feature objects but is included here for convenience |  [optional]
**diseaseAssociations** | [**List&lt;Association&gt;**](Association.md) | diseases associated with alterations of gene |  [optional]
**phenotypeAssociations** | [**List&lt;Association&gt;**](Association.md) | phenotypes associated with alterations of gene |  [optional]
**homologyAssociations** | [**List&lt;Association&gt;**](Association.md) | orthology and paralogy assocations for this gene |  [optional]
**description** | **String** | full text description |  [optional]
**systematicName** | **String** | E.g. SPBC428.08c for clr4 in PomBase |  [optional]
**families** | [**List&lt;NamedObject&gt;**](NamedObject.md) | Families, superfamilies etc to which these gene belongs |  [optional]



