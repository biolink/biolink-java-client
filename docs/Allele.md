
# Allele

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **String** | RDFS Label |  [optional]
**id** | **String** | ID or CURIE e.g. MGI:1201606 |  [optional]
**categories** | **List&lt;String&gt;** |  |  [optional]
**xrefs** | **List&lt;String&gt;** | Database cross-references. These are usually CURIEs, but may also be URLs. E.g. ENSEMBL:ENSG00000099940  |  [optional]
**taxon** | [**Taxon**](Taxon.md) | Taxon to which the object belongs |  [optional]
**variantAssociations** | [**List&lt;Association&gt;**](Association.md) |  |  [optional]
**geneAssociations** | [**List&lt;Association&gt;**](Association.md) |  |  [optional]
**phenotypeAssociations** | [**List&lt;Association&gt;**](Association.md) |  |  [optional]
**diseaseAssociations** | [**List&lt;Association&gt;**](Association.md) |  |  [optional]
**sequenceFeatures** | [**List&lt;SequenceFeature&gt;**](SequenceFeature.md) | Sequence feature representing particular instance on a genome |  [optional]



