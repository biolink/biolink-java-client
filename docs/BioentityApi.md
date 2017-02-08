# BioentityApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAlleleObject**](BioentityApi.md#getAlleleObject) | **GET** /bioentity/allele/{id} | TODO Returns allele object
[**getAnatomyGeneAssociations**](BioentityApi.md#getAnatomyGeneAssociations) | **GET** /bioentity/anatomy/{id}/genes/ | TODO Returns associations between anatomical entity and genes
[**getAnatomyObject**](BioentityApi.md#getAnatomyObject) | **GET** /bioentity/anatomy/{id} | TODO Returns anatomical entity
[**getAnatomyPhenotypeAssociations**](BioentityApi.md#getAnatomyPhenotypeAssociations) | **GET** /bioentity/anatomy/{id}/phenotypes/ | TODO Returns associations between anatomical entity and phenotypes
[**getDiseaseAnatomyAssociations**](BioentityApi.md#getDiseaseAnatomyAssociations) | **GET** /bioentity/disease/{id}/anatomy/ | TODO Returns anatomical locations associated with a disease
[**getDiseaseFunctionAssociations**](BioentityApi.md#getDiseaseFunctionAssociations) | **GET** /bioentity/disease/{id}/function/ | TODO Returns biological functions associated with a disease
[**getDiseaseGeneAssociations**](BioentityApi.md#getDiseaseGeneAssociations) | **GET** /bioentity/disease/{id}/genes/ | Returns genes associated with a disease
[**getDiseaseModelAssociations**](BioentityApi.md#getDiseaseModelAssociations) | **GET** /bioentity/disease/{id}/models/ | Returns associations to models of the disease
[**getDiseaseModelTaxonAssociations**](BioentityApi.md#getDiseaseModelTaxonAssociations) | **GET** /bioentity/disease/{id}/models/{taxon} | Same as &#x60;/disease/&lt;id&gt;/models&#x60; but constrain models by taxon
[**getDiseaseObject**](BioentityApi.md#getDiseaseObject) | **GET** /bioentity/disease/{id} | TODO Returns disease object
[**getDiseasePhenotypeAssociations**](BioentityApi.md#getDiseasePhenotypeAssociations) | **GET** /bioentity/disease/{id}/phenotypes/ | Returns phenotypes associated with disease
[**getDiseaseSubstanceAssociations**](BioentityApi.md#getDiseaseSubstanceAssociations) | **GET** /bioentity/disease/{id}/substance/ | Returns substances associated with a disease
[**getDiseaseSubstanceAssociations_0**](BioentityApi.md#getDiseaseSubstanceAssociations_0) | **GET** /bioentity/substance/{id}/treats/ | Returns substances associated with a disease
[**getEnvironmentObject**](BioentityApi.md#getEnvironmentObject) | **GET** /bioentity/environment/{id} | TODO Returns environment entity
[**getEnvironmentPhenotypeAssociations**](BioentityApi.md#getEnvironmentPhenotypeAssociations) | **GET** /bioentity/environment/{id}/phenotypes/ | TODO Returns list of associations
[**getGeneExpressionAssociations**](BioentityApi.md#getGeneExpressionAssociations) | **GET** /bioentity/gene/{id}/expressed/ | TODO Returns expression events for a gene
[**getGeneFunctionAssociations**](BioentityApi.md#getGeneFunctionAssociations) | **GET** /bioentity/gene/{id}/function/ | Returns function associations for a gene
[**getGeneHomologAssociations**](BioentityApi.md#getGeneHomologAssociations) | **GET** /bioentity/gene/{id}/homologs/ | Returns homologs for a gene
[**getGeneInteractions**](BioentityApi.md#getGeneInteractions) | **GET** /bioentity/gene/{id}/interactions/ | Returns interactions for a gene
[**getGeneObject**](BioentityApi.md#getGeneObject) | **GET** /bioentity/gene/{id} | Returns gene object
[**getGenePhenotypeAssociations**](BioentityApi.md#getGenePhenotypeAssociations) | **GET** /bioentity/gene/{id}/phenotypes/ | Returns phenotypes associated with gene
[**getGenePublicationList**](BioentityApi.md#getGenePublicationList) | **GET** /bioentity/gene/{id}/pubs/ | TODO Returns expression events for a gene
[**getGeneproductObject**](BioentityApi.md#getGeneproductObject) | **GET** /bioentity/geneproduct/{id} | TODO Returns gene product object
[**getGenericAssociations**](BioentityApi.md#getGenericAssociations) | **GET** /bioentity/{id}/associations/ | Returns associations for an entity regardless of the type
[**getGenericObject**](BioentityApi.md#getGenericObject) | **GET** /bioentity/{id} | TODO Returns object of any type
[**getGenotypeDiseaseAssociations**](BioentityApi.md#getGenotypeDiseaseAssociations) | **GET** /bioentity/genotype/{id}/diseases/ | Returns diseases associated with a genotype
[**getGenotypeGeneAssociations**](BioentityApi.md#getGenotypeGeneAssociations) | **GET** /bioentity/genotype/{id}/genes/ | Returns genes associated with a genotype
[**getGenotypeGenotypeAssociations**](BioentityApi.md#getGenotypeGenotypeAssociations) | **GET** /bioentity/genotype/{id}/genotypes/ | Returns genotypes-genotype associations
[**getGenotypeObject**](BioentityApi.md#getGenotypeObject) | **GET** /bioentity/genotype/{id} | Returns genotype object
[**getGenotypePhenotypeAssociations**](BioentityApi.md#getGenotypePhenotypeAssociations) | **GET** /bioentity/genotype/{id}/phenotypes/ | Returns phenotypes associated with a genotype
[**getGotermGeneAssociations**](BioentityApi.md#getGotermGeneAssociations) | **GET** /bioentity/goterm/{id}/genes/ | TODO Returns associated phenotypes
[**getGotermObject**](BioentityApi.md#getGotermObject) | **GET** /bioentity/goterm/{id} | TODO Returns GO class object
[**getGotermPhenotypeAssociations**](BioentityApi.md#getGotermPhenotypeAssociations) | **GET** /bioentity/goterm/{id}/phenotype/ | TODO Returns associated phenotypes
[**getLiteratureDiseaseAssociations**](BioentityApi.md#getLiteratureDiseaseAssociations) | **GET** /bioentity/literature/{id}/diseases/ | Returns associations between a lit entity and a disease
[**getLiteratureGeneAssociations**](BioentityApi.md#getLiteratureGeneAssociations) | **GET** /bioentity/literature/{id}/genes/ | Returns associations between a lit entity and a gene
[**getLiteratureGenotypeAssociations**](BioentityApi.md#getLiteratureGenotypeAssociations) | **GET** /bioentity/literature/{id}/genotypes/ | Returns associations between a lit entity and a genotype
[**getParentObject**](BioentityApi.md#getParentObject) | **GET** /bioentity/individual/{id} | TODO Returns individual
[**getParentObject_0**](BioentityApi.md#getParentObject_0) | **GET** /bioentity/investigation/{id} | TODO Returns investigation object
[**getPathwayGeneAssociations**](BioentityApi.md#getPathwayGeneAssociations) | **GET** /bioentity/pathway/{id}/genes/ | TODO Returns list of genes associated with a pathway
[**getPathwayObject**](BioentityApi.md#getPathwayObject) | **GET** /bioentity/pathway/{id} | TODO Returns pathway object
[**getPathwayParticipantAssociations**](BioentityApi.md#getPathwayParticipantAssociations) | **GET** /bioentity/pathway/{id}/participants/ | TODO Returns associations to participants (molecules, etc) for a pathway
[**getPhenotypeAnatomyAssociations**](BioentityApi.md#getPhenotypeAnatomyAssociations) | **GET** /bioentity/phenotype/{id}/anatomy/ | Returns anatomical entities associated with a phenotype
[**getPhenotypeFunctionAssociations**](BioentityApi.md#getPhenotypeFunctionAssociations) | **GET** /bioentity/phenotype/{id}/function/ | TODO Returns biological functions associated with a Phenotype
[**getPhenotypeGeneAssociations**](BioentityApi.md#getPhenotypeGeneAssociations) | **GET** /bioentity/phenotype/{id}/gene/{taxid}/ids | Returns gene ids for all genes for a particular phenotype in a taxon
[**getPhenotypeGeneAssociations_0**](BioentityApi.md#getPhenotypeGeneAssociations_0) | **GET** /bioentity/phenotype/{id}/genes/ | TODO Returns associated phenotypes
[**getPhenotypeObject**](BioentityApi.md#getPhenotypeObject) | **GET** /bioentity/phenotype/{id} | TODO Returns phenotype class object
[**getPhenotypePhenotypeAssociations**](BioentityApi.md#getPhenotypePhenotypeAssociations) | **GET** /bioentity/phenotype/{id}/phenotype/ | TODO Returns associated phenotypes
[**getPubObject**](BioentityApi.md#getPubObject) | **GET** /bioentity/literature/{id} | TODO Returns publication object
[**getSequenceFeatureObject**](BioentityApi.md#getSequenceFeatureObject) | **GET** /bioentity/sequence_feature/{id} | TODO Returns seqfeature
[**getSubstanceExposures**](BioentityApi.md#getSubstanceExposures) | **GET** /bioentity/substance/{id}/exposures/ | TODO Returns associations between a substance and related exposures
[**getSubstanceInteractions**](BioentityApi.md#getSubstanceInteractions) | **GET** /bioentity/substance/{id}/interactions/ | TODO Returns associations between given drug and interactions
[**getSubstanceObject**](BioentityApi.md#getSubstanceObject) | **GET** /bioentity/substance/{id} | TODO Returns substance entity
[**getSubstanceParticipantInAssociations**](BioentityApi.md#getSubstanceParticipantInAssociations) | **GET** /bioentity/substance/{id}/participant_in/ | Returns associations between an activity and process and the specified substance
[**getSubstanceRelationships**](BioentityApi.md#getSubstanceRelationships) | **GET** /bioentity/substance/{id}/substances/ | TODO Returns associations between a substance and other substances
[**getSubstanceRoleAssociations**](BioentityApi.md#getSubstanceRoleAssociations) | **GET** /bioentity/substance/{id}/roles/ | Returns associations between given drug and roles
[**getSubstanceTargetAssociations**](BioentityApi.md#getSubstanceTargetAssociations) | **GET** /bioentity/substance/{id}/targets/ | TODO Returns associations between given drug and targets
[**getVariantGeneAssociations**](BioentityApi.md#getVariantGeneAssociations) | **GET** /bioentity/variant/{id}/genes/ | Returns genes associated with a variant
[**getVariantGenotypeAssociations**](BioentityApi.md#getVariantGenotypeAssociations) | **GET** /bioentity/variant/{id}/genotypes/ | Returns genotypes associated with a variant
[**getVariantObject**](BioentityApi.md#getVariantObject) | **GET** /bioentity/variant/{id} | TODO Returns sequence variant entity
[**getVariantPhenotypeAssociations**](BioentityApi.md#getVariantPhenotypeAssociations) | **GET** /bioentity/variant/{id}/phenotypes/ | Returns phenotypes associated with a variant


<a name="getAlleleObject"></a>
# **getAlleleObject**
> List&lt;Allele&gt; getAlleleObject(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

TODO Returns allele object

This is a composition of multiple smaller operations, including fetching allele metadata, plus allele associations  TODO - should allele be subsumed into variant?

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | 
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<Allele> result = apiInstance.getAlleleObject(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getAlleleObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;Allele&gt;**](Allele.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAnatomyGeneAssociations"></a>
# **getAnatomyGeneAssociations**
> List&lt;Association&gt; getAnatomyGeneAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

TODO Returns associations between anatomical entity and genes

Typically encompasses genes expressed in a particular location.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | 
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<Association> result = apiInstance.getAnatomyGeneAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getAnatomyGeneAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;Association&gt;**](Association.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAnatomyObject"></a>
# **getAnatomyObject**
> getAnatomyObject(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

TODO Returns anatomical entity

Anatomical entities span ranges from the subcellular (e.g. nucleus) through cells to tissues, organs and organ systems.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | 
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    apiInstance.getAnatomyObject(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getAnatomyObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAnatomyPhenotypeAssociations"></a>
# **getAnatomyPhenotypeAssociations**
> List&lt;Association&gt; getAnatomyPhenotypeAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

TODO Returns associations between anatomical entity and phenotypes

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | 
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<Association> result = apiInstance.getAnatomyPhenotypeAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getAnatomyPhenotypeAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;Association&gt;**](Association.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDiseaseAnatomyAssociations"></a>
# **getDiseaseAnatomyAssociations**
> List&lt;Association&gt; getDiseaseAnatomyAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

TODO Returns anatomical locations associated with a disease

For example, neurodegeneratibe disease located in nervous system. For cancer, this may include both site of original and end location.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | 
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<Association> result = apiInstance.getDiseaseAnatomyAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getDiseaseAnatomyAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;Association&gt;**](Association.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDiseaseFunctionAssociations"></a>
# **getDiseaseFunctionAssociations**
> List&lt;Association&gt; getDiseaseFunctionAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

TODO Returns biological functions associated with a disease

This may come from a combination of asserted knowledge (e.g. Fanconi Anemia affects DNA repair) or from data-driven approach (cf Translator)  Results are typically represented as GO classes

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | 
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<Association> result = apiInstance.getDiseaseFunctionAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getDiseaseFunctionAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;Association&gt;**](Association.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDiseaseGeneAssociations"></a>
# **getDiseaseGeneAssociations**
> List&lt;AssociationResults&gt; getDiseaseGeneAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

Returns genes associated with a disease

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | CURIE identifier of disease, e.g. OMIM:605543, DOID:678. Equivalent IDs can be used with same results
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<AssociationResults> result = apiInstance.getDiseaseGeneAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getDiseaseGeneAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| CURIE identifier of disease, e.g. OMIM:605543, DOID:678. Equivalent IDs can be used with same results |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;AssociationResults&gt;**](AssociationResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDiseaseModelAssociations"></a>
# **getDiseaseModelAssociations**
> List&lt;AssociationResults&gt; getDiseaseModelAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

Returns associations to models of the disease

In the association object returned, the subject will be the disease, and the object will be the model. The model may be a gene or genetic element.  If the query disease is a general class, the association subject may be to a specific disease.  In some cases the association will be *direct*, for example if a paper asserts a genotype is a model of a disease.  In other cases, the association will be *indirect*, for example, chaining over orthology. In these cases the chain will be reflected in the *evidence graph*  * TODO: provide hook into owlsim for dynamic computation of models by similarity

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | CURIE identifier of disease, e.g. OMIM:605543, DOID:678. Equivalent IDs can be used with same results
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<AssociationResults> result = apiInstance.getDiseaseModelAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getDiseaseModelAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| CURIE identifier of disease, e.g. OMIM:605543, DOID:678. Equivalent IDs can be used with same results |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;AssociationResults&gt;**](AssociationResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDiseaseModelTaxonAssociations"></a>
# **getDiseaseModelTaxonAssociations**
> List&lt;AssociationResults&gt; getDiseaseModelTaxonAssociations(taxon, id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

Same as &#x60;/disease/&lt;id&gt;/models&#x60; but constrain models by taxon

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String taxon = "taxon_example"; // String | CURIE of organism taxonomy class to constrain models, e.g NCBITaxon:6239 (C elegans).   Higher level taxa may be used
String id = "id_example"; // String | CURIE identifier of disease, e.g. OMIM:605543, DOID:678. Equivalent IDs can be used with same results
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<AssociationResults> result = apiInstance.getDiseaseModelTaxonAssociations(taxon, id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getDiseaseModelTaxonAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxon** | **String**| CURIE of organism taxonomy class to constrain models, e.g NCBITaxon:6239 (C elegans).   Higher level taxa may be used |
 **id** | **String**| CURIE identifier of disease, e.g. OMIM:605543, DOID:678. Equivalent IDs can be used with same results |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;AssociationResults&gt;**](AssociationResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDiseaseObject"></a>
# **getDiseaseObject**
> getDiseaseObject(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

TODO Returns disease object

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | 
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    apiInstance.getDiseaseObject(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getDiseaseObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDiseasePhenotypeAssociations"></a>
# **getDiseasePhenotypeAssociations**
> List&lt;AssociationResults&gt; getDiseasePhenotypeAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

Returns phenotypes associated with disease

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | CURIE identifier of disease, e.g. OMIM:605543, DOID:678. Equivalent IDs can be used with same results
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<AssociationResults> result = apiInstance.getDiseasePhenotypeAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getDiseasePhenotypeAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| CURIE identifier of disease, e.g. OMIM:605543, DOID:678. Equivalent IDs can be used with same results |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;AssociationResults&gt;**](AssociationResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDiseaseSubstanceAssociations"></a>
# **getDiseaseSubstanceAssociations**
> getDiseaseSubstanceAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

Returns substances associated with a disease

e.g. drugs or small molecules used to treat

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | CURIE identifier of disease, e.g. DOID:2841 (asthma). Equivalent IDs not yet supported
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    apiInstance.getDiseaseSubstanceAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getDiseaseSubstanceAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| CURIE identifier of disease, e.g. DOID:2841 (asthma). Equivalent IDs not yet supported |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDiseaseSubstanceAssociations_0"></a>
# **getDiseaseSubstanceAssociations_0**
> getDiseaseSubstanceAssociations_0(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

Returns substances associated with a disease

e.g. drugs or small molecules used to treat

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | 
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    apiInstance.getDiseaseSubstanceAssociations_0(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getDiseaseSubstanceAssociations_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEnvironmentObject"></a>
# **getEnvironmentObject**
> getEnvironmentObject(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

TODO Returns environment entity

TODO consider renaming exposure

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | 
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    apiInstance.getEnvironmentObject(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getEnvironmentObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEnvironmentPhenotypeAssociations"></a>
# **getEnvironmentPhenotypeAssociations**
> List&lt;Association&gt; getEnvironmentPhenotypeAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

TODO Returns list of associations

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | 
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<Association> result = apiInstance.getEnvironmentPhenotypeAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getEnvironmentPhenotypeAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;Association&gt;**](Association.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGeneExpressionAssociations"></a>
# **getGeneExpressionAssociations**
> List&lt;AssociationResults&gt; getGeneExpressionAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

TODO Returns expression events for a gene

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | CURIE identifier of gene, e.g. NCBIGene:4750. Equivalent IDs can be used with same results
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<AssociationResults> result = apiInstance.getGeneExpressionAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getGeneExpressionAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| CURIE identifier of gene, e.g. NCBIGene:4750. Equivalent IDs can be used with same results |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;AssociationResults&gt;**](AssociationResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGeneFunctionAssociations"></a>
# **getGeneFunctionAssociations**
> List&lt;AssociationResults&gt; getGeneFunctionAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, type, homologTaxon, unselectEvidence, useCompactAssociations)

Returns function associations for a gene

Note: currently this is implemented as a query to the GO solr instance. A smaller set of identifiers may be supported:   - ZFIN e.g. ZFIN:ZDB-GENE-050417-357  - MGI e.g. MGI:1342287  - Use UniProt for human (TODO: map this)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | id, e.g. NCBIGene:3630. Equivalent IDs can be used with same results
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
String type = "type_example"; // String | P, O or LDO (paralog, ortholog or least-diverged).
String homologTaxon = "homologTaxon_example"; // String | Taxon CURIE of homolog, e.g. NCBITaxon:9606. Can be intermediate note, includes inferred by default
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<AssociationResults> result = apiInstance.getGeneFunctionAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, type, homologTaxon, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getGeneFunctionAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id, e.g. NCBIGene:3630. Equivalent IDs can be used with same results |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **type** | **String**| P, O or LDO (paralog, ortholog or least-diverged). | [optional] [enum: P, O, LDO]
 **homologTaxon** | **String**| Taxon CURIE of homolog, e.g. NCBITaxon:9606. Can be intermediate note, includes inferred by default | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;AssociationResults&gt;**](AssociationResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGeneHomologAssociations"></a>
# **getGeneHomologAssociations**
> List&lt;AssociationResults&gt; getGeneHomologAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, type, homologTaxon, unselectEvidence, useCompactAssociations)

Returns homologs for a gene

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | id, e.g. NCBIGene:3630. Equivalent IDs can be used with same results
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
String type = "type_example"; // String | P, O or LDO (paralog, ortholog or least-diverged).
String homologTaxon = "homologTaxon_example"; // String | Taxon CURIE of homolog, e.g. NCBITaxon:9606. Can be intermediate note, includes inferred by default
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<AssociationResults> result = apiInstance.getGeneHomologAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, type, homologTaxon, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getGeneHomologAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id, e.g. NCBIGene:3630. Equivalent IDs can be used with same results |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **type** | **String**| P, O or LDO (paralog, ortholog or least-diverged). | [optional] [enum: P, O, LDO]
 **homologTaxon** | **String**| Taxon CURIE of homolog, e.g. NCBITaxon:9606. Can be intermediate note, includes inferred by default | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;AssociationResults&gt;**](AssociationResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGeneInteractions"></a>
# **getGeneInteractions**
> List&lt;AssociationResults&gt; getGeneInteractions(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

Returns interactions for a gene

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | id, e.g. NCBIGene:3630. Equivalent IDs can be used with same results
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<AssociationResults> result = apiInstance.getGeneInteractions(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getGeneInteractions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id, e.g. NCBIGene:3630. Equivalent IDs can be used with same results |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;AssociationResults&gt;**](AssociationResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGeneObject"></a>
# **getGeneObject**
> List&lt;Gene&gt; getGeneObject(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

Returns gene object

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | id, e.g. NCBIGene:84570
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<Gene> result = apiInstance.getGeneObject(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getGeneObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id, e.g. NCBIGene:84570 |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;Gene&gt;**](Gene.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGenePhenotypeAssociations"></a>
# **getGenePhenotypeAssociations**
> getGenePhenotypeAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

Returns phenotypes associated with gene

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | CURIE identifier of gene, e.g. NCBIGene:4750. Equivalent IDs can be used with same results
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    apiInstance.getGenePhenotypeAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getGenePhenotypeAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| CURIE identifier of gene, e.g. NCBIGene:4750. Equivalent IDs can be used with same results |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGenePublicationList"></a>
# **getGenePublicationList**
> List&lt;AssociationResults&gt; getGenePublicationList(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

TODO Returns expression events for a gene

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | CURIE identifier of gene, e.g. NCBIGene:4750. Equivalent IDs can be used with same results
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<AssociationResults> result = apiInstance.getGenePublicationList(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getGenePublicationList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| CURIE identifier of gene, e.g. NCBIGene:4750. Equivalent IDs can be used with same results |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;AssociationResults&gt;**](AssociationResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGeneproductObject"></a>
# **getGeneproductObject**
> getGeneproductObject(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

TODO Returns gene product object

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | 
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    apiInstance.getGeneproductObject(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getGeneproductObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGenericAssociations"></a>
# **getGenericAssociations**
> List&lt;AssociationResults&gt; getGenericAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

Returns associations for an entity regardless of the type

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | 
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<AssociationResults> result = apiInstance.getGenericAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getGenericAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;AssociationResults&gt;**](AssociationResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGenericObject"></a>
# **getGenericObject**
> List&lt;BioObject&gt; getGenericObject(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

TODO Returns object of any type

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | id, e.g. NCBIGene:84570
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<BioObject> result = apiInstance.getGenericObject(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getGenericObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id, e.g. NCBIGene:84570 |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;BioObject&gt;**](BioObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGenotypeDiseaseAssociations"></a>
# **getGenotypeDiseaseAssociations**
> List&lt;AssociationResults&gt; getGenotypeDiseaseAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

Returns diseases associated with a genotype

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | CURIE identifier of genotype, e.g. ZFIN:ZDB-FISH-150901-4286 (if non-human will return models)
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<AssociationResults> result = apiInstance.getGenotypeDiseaseAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getGenotypeDiseaseAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| CURIE identifier of genotype, e.g. ZFIN:ZDB-FISH-150901-4286 (if non-human will return models) |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;AssociationResults&gt;**](AssociationResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGenotypeGeneAssociations"></a>
# **getGenotypeGeneAssociations**
> List&lt;AssociationResults&gt; getGenotypeGeneAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

Returns genes associated with a genotype

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | CURIE identifier of genotype, e.g. ZFIN:ZDB-FISH-150901-6607
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<AssociationResults> result = apiInstance.getGenotypeGeneAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getGenotypeGeneAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| CURIE identifier of genotype, e.g. ZFIN:ZDB-FISH-150901-6607 |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;AssociationResults&gt;**](AssociationResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGenotypeGenotypeAssociations"></a>
# **getGenotypeGenotypeAssociations**
> List&lt;AssociationResults&gt; getGenotypeGenotypeAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

Returns genotypes-genotype associations

Genotypes may be related to one another according to the GENO model

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | CURIE identifier of genotype, e.g. ZFIN:ZDB-FISH-150901-6607
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<AssociationResults> result = apiInstance.getGenotypeGenotypeAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getGenotypeGenotypeAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| CURIE identifier of genotype, e.g. ZFIN:ZDB-FISH-150901-6607 |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;AssociationResults&gt;**](AssociationResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGenotypeObject"></a>
# **getGenotypeObject**
> List&lt;Genotype&gt; getGenotypeObject(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

Returns genotype object

The genotype object will have the following association sets populated:   * gene  * phenotype  * disease

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | CURIE identifier of genotype, e.g. ZFIN:ZDB-FISH-150901-6607
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<Genotype> result = apiInstance.getGenotypeObject(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getGenotypeObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| CURIE identifier of genotype, e.g. ZFIN:ZDB-FISH-150901-6607 |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;Genotype&gt;**](Genotype.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGenotypePhenotypeAssociations"></a>
# **getGenotypePhenotypeAssociations**
> List&lt;AssociationResults&gt; getGenotypePhenotypeAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

Returns phenotypes associated with a genotype

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | CURIE identifier of genotype, e.g. ZFIN:ZDB-FISH-150901-4286
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<AssociationResults> result = apiInstance.getGenotypePhenotypeAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getGenotypePhenotypeAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| CURIE identifier of genotype, e.g. ZFIN:ZDB-FISH-150901-4286 |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;AssociationResults&gt;**](AssociationResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGotermGeneAssociations"></a>
# **getGotermGeneAssociations**
> List&lt;Association&gt; getGotermGeneAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

TODO Returns associated phenotypes

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | 
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<Association> result = apiInstance.getGotermGeneAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getGotermGeneAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;Association&gt;**](Association.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGotermObject"></a>
# **getGotermObject**
> getGotermObject(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

TODO Returns GO class object

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | GO class CURIE identifier, e.g GO:0016301 (kinase activity)
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    apiInstance.getGotermObject(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getGotermObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| GO class CURIE identifier, e.g GO:0016301 (kinase activity) |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGotermPhenotypeAssociations"></a>
# **getGotermPhenotypeAssociations**
> List&lt;Association&gt; getGotermPhenotypeAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

TODO Returns associated phenotypes

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | 
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<Association> result = apiInstance.getGotermPhenotypeAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getGotermPhenotypeAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;Association&gt;**](Association.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLiteratureDiseaseAssociations"></a>
# **getLiteratureDiseaseAssociations**
> List&lt;Association&gt; getLiteratureDiseaseAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

Returns associations between a lit entity and a disease

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | 
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<Association> result = apiInstance.getLiteratureDiseaseAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getLiteratureDiseaseAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;Association&gt;**](Association.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLiteratureGeneAssociations"></a>
# **getLiteratureGeneAssociations**
> List&lt;Association&gt; getLiteratureGeneAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

Returns associations between a lit entity and a gene

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | 
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<Association> result = apiInstance.getLiteratureGeneAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getLiteratureGeneAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;Association&gt;**](Association.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLiteratureGenotypeAssociations"></a>
# **getLiteratureGenotypeAssociations**
> List&lt;Association&gt; getLiteratureGenotypeAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

Returns associations between a lit entity and a genotype

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | 
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<Association> result = apiInstance.getLiteratureGenotypeAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getLiteratureGenotypeAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;Association&gt;**](Association.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getParentObject"></a>
# **getParentObject**
> getParentObject(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

TODO Returns individual

Individuals may typically encompass patients, but can be individuals of any species

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | 
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    apiInstance.getParentObject(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getParentObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getParentObject_0"></a>
# **getParentObject_0**
> getParentObject_0(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

TODO Returns investigation object

Investigations encompass clinical trials, molecular biology experiments or any kind of study

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | 
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    apiInstance.getParentObject_0(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getParentObject_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPathwayGeneAssociations"></a>
# **getPathwayGeneAssociations**
> List&lt;Association&gt; getPathwayGeneAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

TODO Returns list of genes associated with a pathway

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | 
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<Association> result = apiInstance.getPathwayGeneAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getPathwayGeneAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;Association&gt;**](Association.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPathwayObject"></a>
# **getPathwayObject**
> getPathwayObject(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

TODO Returns pathway object

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | CURIE any pathway element. May be a GO ID or a pathway database ID
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    apiInstance.getPathwayObject(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getPathwayObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| CURIE any pathway element. May be a GO ID or a pathway database ID |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPathwayParticipantAssociations"></a>
# **getPathwayParticipantAssociations**
> List&lt;Association&gt; getPathwayParticipantAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

TODO Returns associations to participants (molecules, etc) for a pathway

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | 
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<Association> result = apiInstance.getPathwayParticipantAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getPathwayParticipantAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;Association&gt;**](Association.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPhenotypeAnatomyAssociations"></a>
# **getPhenotypeAnatomyAssociations**
> List&lt;NamedObject&gt; getPhenotypeAnatomyAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

Returns anatomical entities associated with a phenotype

Example IDs:   * ZP:0004204   * MP:0008521 abnormal Bowman membrane  For example, *abnormal limb development* will map to *limb*

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | 
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<NamedObject> result = apiInstance.getPhenotypeAnatomyAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getPhenotypeAnatomyAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;NamedObject&gt;**](NamedObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPhenotypeFunctionAssociations"></a>
# **getPhenotypeFunctionAssociations**
> List&lt;Association&gt; getPhenotypeFunctionAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

TODO Returns biological functions associated with a Phenotype

This may come from a combination of asserted knowledge (e.g. abnormal levels of metabolite to corresponding GO activity) or from data-driven approach (cf Translator)  Results are typically represented as GO classes

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | 
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<Association> result = apiInstance.getPhenotypeFunctionAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getPhenotypeFunctionAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;Association&gt;**](Association.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPhenotypeGeneAssociations"></a>
# **getPhenotypeGeneAssociations**
> getPhenotypeGeneAssociations(taxid, id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

Returns gene ids for all genes for a particular phenotype in a taxon

For example, + NCBITaxon:10090 (mouse)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String taxid = "taxid_example"; // String | Species or high level taxon grouping, e.g  NCBITaxon:10090 (Mus musculus)
String id = "id_example"; // String | Pheno class CURIE identifier, e.g  MP:0001569 (abnormal circulating bilirubin level)
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    apiInstance.getPhenotypeGeneAssociations(taxid, id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getPhenotypeGeneAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxid** | **String**| Species or high level taxon grouping, e.g  NCBITaxon:10090 (Mus musculus) |
 **id** | **String**| Pheno class CURIE identifier, e.g  MP:0001569 (abnormal circulating bilirubin level) |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPhenotypeGeneAssociations_0"></a>
# **getPhenotypeGeneAssociations_0**
> List&lt;Association&gt; getPhenotypeGeneAssociations_0(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

TODO Returns associated phenotypes

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | 
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<Association> result = apiInstance.getPhenotypeGeneAssociations_0(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getPhenotypeGeneAssociations_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;Association&gt;**](Association.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPhenotypeObject"></a>
# **getPhenotypeObject**
> getPhenotypeObject(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

TODO Returns phenotype class object

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | 
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    apiInstance.getPhenotypeObject(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getPhenotypeObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPhenotypePhenotypeAssociations"></a>
# **getPhenotypePhenotypeAssociations**
> List&lt;Association&gt; getPhenotypePhenotypeAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

TODO Returns associated phenotypes

Includes phenologs, as well as equivalent phenotypes in other species

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | 
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<Association> result = apiInstance.getPhenotypePhenotypeAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getPhenotypePhenotypeAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;Association&gt;**](Association.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPubObject"></a>
# **getPubObject**
> getPubObject(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

TODO Returns publication object

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | 
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    apiInstance.getPubObject(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getPubObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSequenceFeatureObject"></a>
# **getSequenceFeatureObject**
> getSequenceFeatureObject(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

TODO Returns seqfeature

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | 
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    apiInstance.getSequenceFeatureObject(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getSequenceFeatureObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSubstanceExposures"></a>
# **getSubstanceExposures**
> List&lt;Association&gt; getSubstanceExposures(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

TODO Returns associations between a substance and related exposures

E.g. between pesticide and occupational exposure class

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | 
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<Association> result = apiInstance.getSubstanceExposures(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getSubstanceExposures");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;Association&gt;**](Association.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSubstanceInteractions"></a>
# **getSubstanceInteractions**
> List&lt;Association&gt; getSubstanceInteractions(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

TODO Returns associations between given drug and interactions

Interactions can encompass drugs or environments

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | 
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<Association> result = apiInstance.getSubstanceInteractions(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getSubstanceInteractions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;Association&gt;**](Association.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSubstanceObject"></a>
# **getSubstanceObject**
> List&lt;Substance&gt; getSubstanceObject(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

TODO Returns substance entity

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | 
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<Substance> result = apiInstance.getSubstanceObject(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getSubstanceObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;Substance&gt;**](Substance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSubstanceParticipantInAssociations"></a>
# **getSubstanceParticipantInAssociations**
> List&lt;Association&gt; getSubstanceParticipantInAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

Returns associations between an activity and process and the specified substance

Examples relationships:   * substance is a metabolite of a process  * substance is synthesized by a process  * substance is modified by an activity  * substance elicits a response program/pathway  * substance is transported by activity or pathway  For example, CHEBI:40036 (amitrole)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | 
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<Association> result = apiInstance.getSubstanceParticipantInAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getSubstanceParticipantInAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;Association&gt;**](Association.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSubstanceRelationships"></a>
# **getSubstanceRelationships**
> List&lt;Association&gt; getSubstanceRelationships(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

TODO Returns associations between a substance and other substances

E.g. metabolite-of, tautomer-of, parent-of, ...

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | 
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<Association> result = apiInstance.getSubstanceRelationships(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getSubstanceRelationships");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;Association&gt;**](Association.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSubstanceRoleAssociations"></a>
# **getSubstanceRoleAssociations**
> List&lt;Association&gt; getSubstanceRoleAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

Returns associations between given drug and roles

Roles may be human-oriented (e.g. pesticide) or molecular (e.g. enzyme inhibitor)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | 
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<Association> result = apiInstance.getSubstanceRoleAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getSubstanceRoleAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;Association&gt;**](Association.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSubstanceTargetAssociations"></a>
# **getSubstanceTargetAssociations**
> List&lt;Association&gt; getSubstanceTargetAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

TODO Returns associations between given drug and targets

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | 
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<Association> result = apiInstance.getSubstanceTargetAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getSubstanceTargetAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;Association&gt;**](Association.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVariantGeneAssociations"></a>
# **getVariantGeneAssociations**
> List&lt;AssociationResults&gt; getVariantGeneAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

Returns genes associated with a variant

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | CURIE identifier of variant, e.g. ZFIN:ZDB-ALT-010427-8, ClinVarVariant:39783
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<AssociationResults> result = apiInstance.getVariantGeneAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getVariantGeneAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| CURIE identifier of variant, e.g. ZFIN:ZDB-ALT-010427-8, ClinVarVariant:39783 |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;AssociationResults&gt;**](AssociationResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVariantGenotypeAssociations"></a>
# **getVariantGenotypeAssociations**
> List&lt;AssociationResults&gt; getVariantGenotypeAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

Returns genotypes associated with a variant

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | CURIE identifier of variant, e.g. ZFIN:ZDB-ALT-010427-8, ClinVarVariant:39783
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<AssociationResults> result = apiInstance.getVariantGenotypeAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getVariantGenotypeAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| CURIE identifier of variant, e.g. ZFIN:ZDB-ALT-010427-8, ClinVarVariant:39783 |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;AssociationResults&gt;**](AssociationResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVariantObject"></a>
# **getVariantObject**
> getVariantObject(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

TODO Returns sequence variant entity

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | CURIE identifier of variant, e.g. ZFIN:ZDB-ALT-010427-8, ClinVarVariant:39783
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    apiInstance.getVariantObject(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getVariantObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| CURIE identifier of variant, e.g. ZFIN:ZDB-ALT-010427-8, ClinVarVariant:39783 |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVariantPhenotypeAssociations"></a>
# **getVariantPhenotypeAssociations**
> List&lt;AssociationResults&gt; getVariantPhenotypeAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations)

Returns phenotypes associated with a variant

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentityApi;


BioentityApi apiInstance = new BioentityApi();
String id = "id_example"; // String | CURIE identifier of variant, e.g. ZFIN:ZDB-ALT-010427-8, ClinVarVariant:39783
Boolean fetchObjects = true; // Boolean | If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload
Integer rows = 20; // Integer | number of rows
Boolean excludeAutomaticAssertions = true; // Boolean | If set, excludes associations that involve IEAs (ECO:0000501)
Boolean unselectEvidence = true; // Boolean | If set, excludes evidence objects in response
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<AssociationResults> result = apiInstance.getVariantPhenotypeAssociations(id, fetchObjects, rows, excludeAutomaticAssertions, unselectEvidence, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentityApi#getVariantPhenotypeAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| CURIE identifier of variant, e.g. ZFIN:ZDB-ALT-010427-8, ClinVarVariant:39783 |
 **fetchObjects** | **Boolean**| If true, returns a distinct set of association.objects (typically ontology terms). This appears at the top level of the results payload | [optional] [default to true]
 **rows** | **Integer**| number of rows | [optional] [default to 20]
 **excludeAutomaticAssertions** | **Boolean**| If set, excludes associations that involve IEAs (ECO:0000501) | [optional]
 **unselectEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;AssociationResults&gt;**](AssociationResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

