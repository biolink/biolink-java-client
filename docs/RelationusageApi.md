# RelationusageApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRelationUsageBetweenResource**](RelationusageApi.md#getRelationUsageBetweenResource) | **GET** /relation/usage/between/{subject_category}/{object_category} | All relations used plus count of associations
[**getRelationUsagePivotLabelResource**](RelationusageApi.md#getRelationUsagePivotLabelResource) | **GET** /relation/usage/pivot/label | Relation usage count for all subj x obj category combinations, showing label
[**getRelationUsagePivotResource**](RelationusageApi.md#getRelationUsagePivotResource) | **GET** /relation/usage/pivot/ | Relation usage count for all subj x obj category combinations
[**getRelationUsageResource**](RelationusageApi.md#getRelationUsageResource) | **GET** /relation/usage/ | All relations used plus count of associations


<a name="getRelationUsageBetweenResource"></a>
# **getRelationUsageBetweenResource**
> List&lt;AssociationResults&gt; getRelationUsageBetweenResource(objectCategory, subjectCategory, subjectTaxon, evidence)

All relations used plus count of associations

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RelationusageApi;


RelationusageApi apiInstance = new RelationusageApi();
String objectCategory = "objectCategory_example"; // String | 
String subjectCategory = "subjectCategory_example"; // String | 
String subjectTaxon = "subjectTaxon_example"; // String | SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default
String evidence = "evidence_example"; // String | Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                     
try {
    List<AssociationResults> result = apiInstance.getRelationUsageBetweenResource(objectCategory, subjectCategory, subjectTaxon, evidence);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RelationusageApi#getRelationUsageBetweenResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectCategory** | **String**|  |
 **subjectCategory** | **String**|  |
 **subjectTaxon** | **String**| SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default | [optional]
 **evidence** | **String**| Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                      | [optional]

### Return type

[**List&lt;AssociationResults&gt;**](AssociationResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRelationUsagePivotLabelResource"></a>
# **getRelationUsagePivotLabelResource**
> List&lt;AssociationResults&gt; getRelationUsagePivotLabelResource(subjectTaxon, evidence)

Relation usage count for all subj x obj category combinations, showing label

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RelationusageApi;


RelationusageApi apiInstance = new RelationusageApi();
String subjectTaxon = "subjectTaxon_example"; // String | SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default
String evidence = "evidence_example"; // String | Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                     
try {
    List<AssociationResults> result = apiInstance.getRelationUsagePivotLabelResource(subjectTaxon, evidence);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RelationusageApi#getRelationUsagePivotLabelResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subjectTaxon** | **String**| SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default | [optional]
 **evidence** | **String**| Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                      | [optional]

### Return type

[**List&lt;AssociationResults&gt;**](AssociationResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRelationUsagePivotResource"></a>
# **getRelationUsagePivotResource**
> List&lt;AssociationResults&gt; getRelationUsagePivotResource(subjectTaxon, evidence)

Relation usage count for all subj x obj category combinations

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RelationusageApi;


RelationusageApi apiInstance = new RelationusageApi();
String subjectTaxon = "subjectTaxon_example"; // String | SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default
String evidence = "evidence_example"; // String | Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                     
try {
    List<AssociationResults> result = apiInstance.getRelationUsagePivotResource(subjectTaxon, evidence);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RelationusageApi#getRelationUsagePivotResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subjectTaxon** | **String**| SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default | [optional]
 **evidence** | **String**| Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                      | [optional]

### Return type

[**List&lt;AssociationResults&gt;**](AssociationResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRelationUsageResource"></a>
# **getRelationUsageResource**
> List&lt;AssociationResults&gt; getRelationUsageResource(subjectTaxon, evidence)

All relations used plus count of associations

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RelationusageApi;


RelationusageApi apiInstance = new RelationusageApi();
String subjectTaxon = "subjectTaxon_example"; // String | SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default
String evidence = "evidence_example"; // String | Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                     
try {
    List<AssociationResults> result = apiInstance.getRelationUsageResource(subjectTaxon, evidence);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RelationusageApi#getRelationUsageResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subjectTaxon** | **String**| SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default | [optional]
 **evidence** | **String**| Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                      | [optional]

### Return type

[**List&lt;AssociationResults&gt;**](AssociationResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

