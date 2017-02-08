
# AssociationResults

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**numFound** | **Integer** | total number of associations matching query |  [optional]
**start** | **Integer** | Cursor position |  [optional]
**facetPivot** | **Object** | Populated in facet_pivots is passed |  [optional]
**facetCounts** | **Object** | Mapping between field names and association counts |  [optional]
**objects** | **List&lt;String&gt;** | List of distinct objects used |  [optional]
**compactAssociations** | [**List&lt;CompactAssociationSet&gt;**](CompactAssociationSet.md) | Compact representation in which objects (e.g. phenotypes) are collected for subject-predicate pairs |  [optional]
**associations** | [**List&lt;Association&gt;**](Association.md) | Complete representation of full association object, plus evidence |  [optional]



