# AssociationApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAssociationObject**](AssociationApi.md#getAssociationObject) | **GET** /association/{id} | Returns the association with a given identifier
[**getAssociationSearch**](AssociationApi.md#getAssociationSearch) | **GET** /association/find/ | Returns list of matching associations
[**getAssociationSearch_0**](AssociationApi.md#getAssociationSearch_0) | **GET** /association/find/{subject_category}/ | Returns list of matching associations
[**getAssociationSearch_1**](AssociationApi.md#getAssociationSearch_1) | **GET** /association/find/{subject_category}/{object_category}/ | Returns list of matching associations
[**getAssociationsFrom**](AssociationApi.md#getAssociationsFrom) | **GET** /association/between/{subject}/{object} | Returns associations connecting two entities
[**getAssociationsFrom_0**](AssociationApi.md#getAssociationsFrom_0) | **GET** /association/from/{subject} | Returns list of matching associations
[**getAssociationsTo**](AssociationApi.md#getAssociationsTo) | **GET** /association/to/{object} | Returns list of matching associations


<a name="getAssociationObject"></a>
# **getAssociationObject**
> List&lt;Association&gt; getAssociationObject(id, rows, flExcludesEvidence, evidence, page, object, subject, subjectTaxon, graphize, mapIdentifiers)

Returns the association with a given identifier

An association connects, at a minimum, two things, designated subject and object, via some relationship. Associations also include evidence, provenance etc.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssociationApi;


AssociationApi apiInstance = new AssociationApi();
String id = "id_example"; // String | 
Integer rows = 10; // Integer | number of rows
Boolean flExcludesEvidence = true; // Boolean | If set, excludes evidence objects in response
String evidence = "evidence_example"; // String | Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                     
Integer page = 1; // Integer | Page number
String object = "object_example"; // String | OBJECT id, e.g. HP:0011927. Includes inferred by default
String subject = "subject_example"; // String | SUBJECT id, e.g. NCBIGene:84570, ZFIN:ZDB-GENE-050417-357. Includes inferred by default
String subjectTaxon = "subjectTaxon_example"; // String | SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default
Boolean graphize = true; // Boolean | If set, includes graph object in response
String mapIdentifiers = "mapIdentifiers_example"; // String | Prefix to map all IDs to. E.g. NCBIGene
try {
    List<Association> result = apiInstance.getAssociationObject(id, rows, flExcludesEvidence, evidence, page, object, subject, subjectTaxon, graphize, mapIdentifiers);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssociationApi#getAssociationObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **rows** | **Integer**| number of rows | [optional] [default to 10]
 **flExcludesEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **evidence** | **String**| Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                      | [optional]
 **page** | **Integer**| Page number | [optional] [default to 1]
 **object** | **String**| OBJECT id, e.g. HP:0011927. Includes inferred by default | [optional]
 **subject** | **String**| SUBJECT id, e.g. NCBIGene:84570, ZFIN:ZDB-GENE-050417-357. Includes inferred by default | [optional]
 **subjectTaxon** | **String**| SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default | [optional]
 **graphize** | **Boolean**| If set, includes graph object in response | [optional]
 **mapIdentifiers** | **String**| Prefix to map all IDs to. E.g. NCBIGene | [optional]

### Return type

[**List&lt;Association&gt;**](Association.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAssociationSearch"></a>
# **getAssociationSearch**
> List&lt;AssociationResults&gt; getAssociationSearch(rows, flExcludesEvidence, evidence, page, object, subject, subjectTaxon, graphize, mapIdentifiers)

Returns list of matching associations

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssociationApi;


AssociationApi apiInstance = new AssociationApi();
Integer rows = 10; // Integer | number of rows
Boolean flExcludesEvidence = true; // Boolean | If set, excludes evidence objects in response
String evidence = "evidence_example"; // String | Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                     
Integer page = 1; // Integer | Page number
String object = "object_example"; // String | OBJECT id, e.g. HP:0011927. Includes inferred by default
String subject = "subject_example"; // String | SUBJECT id, e.g. NCBIGene:84570, ZFIN:ZDB-GENE-050417-357. Includes inferred by default
String subjectTaxon = "subjectTaxon_example"; // String | SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default
Boolean graphize = true; // Boolean | If set, includes graph object in response
String mapIdentifiers = "mapIdentifiers_example"; // String | Prefix to map all IDs to. E.g. NCBIGene
try {
    List<AssociationResults> result = apiInstance.getAssociationSearch(rows, flExcludesEvidence, evidence, page, object, subject, subjectTaxon, graphize, mapIdentifiers);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssociationApi#getAssociationSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rows** | **Integer**| number of rows | [optional] [default to 10]
 **flExcludesEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **evidence** | **String**| Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                      | [optional]
 **page** | **Integer**| Page number | [optional] [default to 1]
 **object** | **String**| OBJECT id, e.g. HP:0011927. Includes inferred by default | [optional]
 **subject** | **String**| SUBJECT id, e.g. NCBIGene:84570, ZFIN:ZDB-GENE-050417-357. Includes inferred by default | [optional]
 **subjectTaxon** | **String**| SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default | [optional]
 **graphize** | **Boolean**| If set, includes graph object in response | [optional]
 **mapIdentifiers** | **String**| Prefix to map all IDs to. E.g. NCBIGene | [optional]

### Return type

[**List&lt;AssociationResults&gt;**](AssociationResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAssociationSearch_0"></a>
# **getAssociationSearch_0**
> List&lt;AssociationResults&gt; getAssociationSearch_0(objectCategory, subjectCategory, rows, flExcludesEvidence, evidence, page, object, subject, subjectTaxon, graphize, mapIdentifiers)

Returns list of matching associations

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssociationApi;


AssociationApi apiInstance = new AssociationApi();
String objectCategory = "objectCategory_example"; // String | CATEGORY of entity at link OBJECT (target), e.g. phenotype, disease
String subjectCategory = "subjectCategory_example"; // String | CATEGORY of entity at link SUBJECT (source), e.g. gene, disease, genotype
Integer rows = 10; // Integer | number of rows
Boolean flExcludesEvidence = true; // Boolean | If set, excludes evidence objects in response
String evidence = "evidence_example"; // String | Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                     
Integer page = 1; // Integer | Page number
String object = "object_example"; // String | OBJECT id, e.g. HP:0011927. Includes inferred by default
String subject = "subject_example"; // String | SUBJECT id, e.g. NCBIGene:84570, ZFIN:ZDB-GENE-050417-357. Includes inferred by default
String subjectTaxon = "subjectTaxon_example"; // String | SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default
Boolean graphize = true; // Boolean | If set, includes graph object in response
String mapIdentifiers = "mapIdentifiers_example"; // String | Prefix to map all IDs to. E.g. NCBIGene
try {
    List<AssociationResults> result = apiInstance.getAssociationSearch_0(objectCategory, subjectCategory, rows, flExcludesEvidence, evidence, page, object, subject, subjectTaxon, graphize, mapIdentifiers);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssociationApi#getAssociationSearch_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectCategory** | **String**| CATEGORY of entity at link OBJECT (target), e.g. phenotype, disease |
 **subjectCategory** | **String**| CATEGORY of entity at link SUBJECT (source), e.g. gene, disease, genotype |
 **rows** | **Integer**| number of rows | [optional] [default to 10]
 **flExcludesEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **evidence** | **String**| Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                      | [optional]
 **page** | **Integer**| Page number | [optional] [default to 1]
 **object** | **String**| OBJECT id, e.g. HP:0011927. Includes inferred by default | [optional]
 **subject** | **String**| SUBJECT id, e.g. NCBIGene:84570, ZFIN:ZDB-GENE-050417-357. Includes inferred by default | [optional]
 **subjectTaxon** | **String**| SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default | [optional]
 **graphize** | **Boolean**| If set, includes graph object in response | [optional]
 **mapIdentifiers** | **String**| Prefix to map all IDs to. E.g. NCBIGene | [optional]

### Return type

[**List&lt;AssociationResults&gt;**](AssociationResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAssociationSearch_1"></a>
# **getAssociationSearch_1**
> List&lt;AssociationResults&gt; getAssociationSearch_1(objectCategory, subjectCategory, rows, flExcludesEvidence, evidence, page, object, subject, subjectTaxon, graphize, mapIdentifiers)

Returns list of matching associations

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssociationApi;


AssociationApi apiInstance = new AssociationApi();
String objectCategory = "objectCategory_example"; // String | CATEGORY of entity at link OBJECT (target), e.g. phenotype, disease
String subjectCategory = "subjectCategory_example"; // String | CATEGORY of entity at link SUBJECT (source), e.g. gene, disease, genotype
Integer rows = 10; // Integer | number of rows
Boolean flExcludesEvidence = true; // Boolean | If set, excludes evidence objects in response
String evidence = "evidence_example"; // String | Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                     
Integer page = 1; // Integer | Page number
String object = "object_example"; // String | OBJECT id, e.g. HP:0011927. Includes inferred by default
String subject = "subject_example"; // String | SUBJECT id, e.g. NCBIGene:84570, ZFIN:ZDB-GENE-050417-357. Includes inferred by default
String subjectTaxon = "subjectTaxon_example"; // String | SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default
Boolean graphize = true; // Boolean | If set, includes graph object in response
String mapIdentifiers = "mapIdentifiers_example"; // String | Prefix to map all IDs to. E.g. NCBIGene
try {
    List<AssociationResults> result = apiInstance.getAssociationSearch_1(objectCategory, subjectCategory, rows, flExcludesEvidence, evidence, page, object, subject, subjectTaxon, graphize, mapIdentifiers);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssociationApi#getAssociationSearch_1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectCategory** | **String**| CATEGORY of entity at link OBJECT (target), e.g. phenotype, disease |
 **subjectCategory** | **String**| CATEGORY of entity at link SUBJECT (source), e.g. gene, disease, genotype |
 **rows** | **Integer**| number of rows | [optional] [default to 10]
 **flExcludesEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **evidence** | **String**| Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                      | [optional]
 **page** | **Integer**| Page number | [optional] [default to 1]
 **object** | **String**| OBJECT id, e.g. HP:0011927. Includes inferred by default | [optional]
 **subject** | **String**| SUBJECT id, e.g. NCBIGene:84570, ZFIN:ZDB-GENE-050417-357. Includes inferred by default | [optional]
 **subjectTaxon** | **String**| SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default | [optional]
 **graphize** | **Boolean**| If set, includes graph object in response | [optional]
 **mapIdentifiers** | **String**| Prefix to map all IDs to. E.g. NCBIGene | [optional]

### Return type

[**List&lt;AssociationResults&gt;**](AssociationResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAssociationsFrom"></a>
# **getAssociationsFrom**
> List&lt;AssociationResults&gt; getAssociationsFrom(object, subject, objectCategory, mapIdentifiers, evidence, subjectCategory, page, flExcludesEvidence, subjectTaxon, graphize, rows, useCompactAssociations)

Returns associations connecting two entities

Given two entities (e.g. a particular gene and a particular disease), if these two entities are connected (directly or indirectly), then return the association objects describing the connection.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssociationApi;


AssociationApi apiInstance = new AssociationApi();
String object = "object_example"; // String | E.g. e.g. MP:0013765, can also be a biological entity such as a gene
String subject = "subject_example"; // String | E.g. e.g. MGI:1342287
String objectCategory = "objectCategory_example"; // String | e.g. disease, phenotype, gene
String mapIdentifiers = "mapIdentifiers_example"; // String | Prefix to map all IDs to. E.g. NCBIGene
String evidence = "evidence_example"; // String | Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                     
String subjectCategory = "subjectCategory_example"; // String | e.g. gene, genotype, disease
Integer page = 1; // Integer | Page number
Boolean flExcludesEvidence = true; // Boolean | If set, excludes evidence objects in response
String subjectTaxon = "subjectTaxon_example"; // String | SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default
Boolean graphize = true; // Boolean | If set, includes graph object in response
Integer rows = 10; // Integer | number of rows
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<AssociationResults> result = apiInstance.getAssociationsFrom(object, subject, objectCategory, mapIdentifiers, evidence, subjectCategory, page, flExcludesEvidence, subjectTaxon, graphize, rows, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssociationApi#getAssociationsFrom");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object** | **String**| E.g. e.g. MP:0013765, can also be a biological entity such as a gene |
 **subject** | **String**| E.g. e.g. MGI:1342287 |
 **objectCategory** | **String**| e.g. disease, phenotype, gene | [optional]
 **mapIdentifiers** | **String**| Prefix to map all IDs to. E.g. NCBIGene | [optional]
 **evidence** | **String**| Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                      | [optional]
 **subjectCategory** | **String**| e.g. gene, genotype, disease | [optional]
 **page** | **Integer**| Page number | [optional] [default to 1]
 **flExcludesEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **subjectTaxon** | **String**| SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default | [optional]
 **graphize** | **Boolean**| If set, includes graph object in response | [optional]
 **rows** | **Integer**| number of rows | [optional] [default to 10]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;AssociationResults&gt;**](AssociationResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAssociationsFrom_0"></a>
# **getAssociationsFrom_0**
> List&lt;AssociationResults&gt; getAssociationsFrom_0(subject, objectCategory, mapIdentifiers, evidence, subjectCategory, page, flExcludesEvidence, subjectTaxon, graphize, rows, useCompactAssociations)

Returns list of matching associations

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssociationApi;


AssociationApi apiInstance = new AssociationApi();
String subject = "subject_example"; // String | E.g. e.g. NCBIGene:84570
String objectCategory = "objectCategory_example"; // String | e.g. disease, phenotype, gene
String mapIdentifiers = "mapIdentifiers_example"; // String | Prefix to map all IDs to. E.g. NCBIGene
String evidence = "evidence_example"; // String | Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                     
String subjectCategory = "subjectCategory_example"; // String | e.g. gene, genotype, disease
Integer page = 1; // Integer | Page number
Boolean flExcludesEvidence = true; // Boolean | If set, excludes evidence objects in response
String subjectTaxon = "subjectTaxon_example"; // String | SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default
Boolean graphize = true; // Boolean | If set, includes graph object in response
Integer rows = 10; // Integer | number of rows
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<AssociationResults> result = apiInstance.getAssociationsFrom_0(subject, objectCategory, mapIdentifiers, evidence, subjectCategory, page, flExcludesEvidence, subjectTaxon, graphize, rows, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssociationApi#getAssociationsFrom_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subject** | **String**| E.g. e.g. NCBIGene:84570 |
 **objectCategory** | **String**| e.g. disease, phenotype, gene | [optional]
 **mapIdentifiers** | **String**| Prefix to map all IDs to. E.g. NCBIGene | [optional]
 **evidence** | **String**| Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                      | [optional]
 **subjectCategory** | **String**| e.g. gene, genotype, disease | [optional]
 **page** | **Integer**| Page number | [optional] [default to 1]
 **flExcludesEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **subjectTaxon** | **String**| SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default | [optional]
 **graphize** | **Boolean**| If set, includes graph object in response | [optional]
 **rows** | **Integer**| number of rows | [optional] [default to 10]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;AssociationResults&gt;**](AssociationResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAssociationsTo"></a>
# **getAssociationsTo**
> List&lt;AssociationResults&gt; getAssociationsTo(object, objectCategory, mapIdentifiers, evidence, subjectCategory, page, flExcludesEvidence, subjectTaxon, graphize, rows, useCompactAssociations)

Returns list of matching associations

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssociationApi;


AssociationApi apiInstance = new AssociationApi();
String object = "object_example"; // String | E.g. e.g. MP:0013765, can also be a biological entity such as a gene
String objectCategory = "objectCategory_example"; // String | e.g. disease, phenotype, gene
String mapIdentifiers = "mapIdentifiers_example"; // String | Prefix to map all IDs to. E.g. NCBIGene
String evidence = "evidence_example"; // String | Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                     
String subjectCategory = "subjectCategory_example"; // String | e.g. gene, genotype, disease
Integer page = 1; // Integer | Page number
Boolean flExcludesEvidence = true; // Boolean | If set, excludes evidence objects in response
String subjectTaxon = "subjectTaxon_example"; // String | SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default
Boolean graphize = true; // Boolean | If set, includes graph object in response
Integer rows = 10; // Integer | number of rows
Boolean useCompactAssociations = true; // Boolean | If true, returns results in compact associations format
try {
    List<AssociationResults> result = apiInstance.getAssociationsTo(object, objectCategory, mapIdentifiers, evidence, subjectCategory, page, flExcludesEvidence, subjectTaxon, graphize, rows, useCompactAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssociationApi#getAssociationsTo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object** | **String**| E.g. e.g. MP:0013765, can also be a biological entity such as a gene |
 **objectCategory** | **String**| e.g. disease, phenotype, gene | [optional]
 **mapIdentifiers** | **String**| Prefix to map all IDs to. E.g. NCBIGene | [optional]
 **evidence** | **String**| Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                      | [optional]
 **subjectCategory** | **String**| e.g. gene, genotype, disease | [optional]
 **page** | **Integer**| Page number | [optional] [default to 1]
 **flExcludesEvidence** | **Boolean**| If set, excludes evidence objects in response | [optional]
 **subjectTaxon** | **String**| SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default | [optional]
 **graphize** | **Boolean**| If set, includes graph object in response | [optional]
 **rows** | **Integer**| number of rows | [optional] [default to 10]
 **useCompactAssociations** | **Boolean**| If true, returns results in compact associations format | [optional]

### Return type

[**List&lt;AssociationResults&gt;**](AssociationResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

