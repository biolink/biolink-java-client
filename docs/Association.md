
# Association

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**evidenceTypes** | [**List&lt;NamedObject&gt;**](NamedObject.md) | Evidence types (ECO classes) extracted from evidence graph |  [optional]
**evidenceGraph** | [**Graph**](Graph.md) | An indirect association is a join between two or more direct assocations, e.g. gene to disease via ortholog. We record the full set of associations as a graph object |  [optional]
**id** | **String** | Association/annotation unique ID |  [optional]
**relation** | [**Relation**](Relation.md) | Relationship type connecting subject and object |  [optional]
**providedBy** | **List&lt;String&gt;** | Provider of association, e.g. Orphanet, ClinVar |  [optional]
**publications** | [**List&lt;Publication&gt;**](Publication.md) | Publications supporting association, extracted from evidence graph |  [optional]
**objectExtension** | [**List&lt;AnnotationExtension&gt;**](AnnotationExtension.md) |  |  [optional]
**qualifiers** | [**List&lt;AssociationPropertyValue&gt;**](AssociationPropertyValue.md) |  |  [optional]
**object** | [**BioObject**](BioObject.md) | Object (sensu RDF), aka target, e.g. HP:0000448, MP:0002109, DOID:14330 |  [optional]
**subject** | [**BioObject**](BioObject.md) | Subject of association (what it is about), e.g. ClinVar:nnn, MGI:1201606 |  [optional]
**type** | **String** | Type of association, e.g. gene-phenotype |  [optional]
**subjectExtension** | [**List&lt;AnnotationExtension&gt;**](AnnotationExtension.md) |  |  [optional]



