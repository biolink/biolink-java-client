# PairsimApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPairSimJaccardResource**](PairsimApi.md#getPairSimJaccardResource) | **GET** /pair/sim/jaccard/{id1}/{id2}/ | Get pairwise similarity


<a name="getPairSimJaccardResource"></a>
# **getPairSimJaccardResource**
> getPairSimJaccardResource(id2, id1, objectCategory)

Get pairwise similarity

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PairsimApi;


PairsimApi apiInstance = new PairsimApi();
String id2 = "id2_example"; // String | id, e.g. NCBIGene:1200; ZFIN:ZDB-GENE-980528-2059; UniProtKB:P12644
String id1 = "id1_example"; // String | id, e.g. NCBIGene:10891; ZFIN:ZDB-GENE-980526-166; UniProtKB:Q15465
String objectCategory = "objectCategory_example"; // String | e.g. disease, phenotype, gene. Two subjects will be compared based on overlap between associations to objects in this category
try {
    apiInstance.getPairSimJaccardResource(id2, id1, objectCategory);
} catch (ApiException e) {
    System.err.println("Exception when calling PairsimApi#getPairSimJaccardResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id2** | **String**| id, e.g. NCBIGene:1200; ZFIN:ZDB-GENE-980528-2059; UniProtKB:P12644 |
 **id1** | **String**| id, e.g. NCBIGene:10891; ZFIN:ZDB-GENE-980526-166; UniProtKB:Q15465 |
 **objectCategory** | **String**| e.g. disease, phenotype, gene. Two subjects will be compared based on overlap between associations to objects in this category | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

