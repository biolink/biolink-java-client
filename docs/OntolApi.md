# OntolApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInformationContentResource**](OntolApi.md#getInformationContentResource) | **GET** /ontol/information_content/{subject_category}/{object_category}/{subject_taxon} | Calculates information content


<a name="getInformationContentResource"></a>
# **getInformationContentResource**
> getInformationContentResource(objectCategory, subjectTaxon, subjectCategory, evidence)

Calculates information content

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OntolApi;


OntolApi apiInstance = new OntolApi();
String objectCategory = "objectCategory_example"; // String | 
String subjectTaxon = "subjectTaxon_example"; // String | 
String subjectCategory = "subjectCategory_example"; // String | 
String evidence = "evidence_example"; // String | Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                     
try {
    apiInstance.getInformationContentResource(objectCategory, subjectTaxon, subjectCategory, evidence);
} catch (ApiException e) {
    System.err.println("Exception when calling OntolApi#getInformationContentResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectCategory** | **String**|  |
 **subjectTaxon** | **String**|  |
 **subjectCategory** | **String**|  |
 **evidence** | **String**| Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                      | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

