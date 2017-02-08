# BioentitysethomologsApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEntitySetHomologs**](BioentitysethomologsApi.md#getEntitySetHomologs) | **GET** /bioentityset/homologs/homologs/ | Returns homology associations for a given input set of genes


<a name="getEntitySetHomologs"></a>
# **getEntitySetHomologs**
> List&lt;CompactAssociationSet&gt; getEntitySetHomologs(subject)

Returns homology associations for a given input set of genes

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentitysethomologsApi;


BioentitysethomologsApi apiInstance = new BioentitysethomologsApi();
List<String> subject = Arrays.asList("subject_example"); // List<String> | Entity ids to be examined, e.g. NCBIGene:9342, NCBIGene:7227, NCBIGene:8131, NCBIGene:157570, NCBIGene:51164, NCBIGene:6689, NCBIGene:6387
try {
    List<CompactAssociationSet> result = apiInstance.getEntitySetHomologs(subject);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentitysethomologsApi#getEntitySetHomologs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subject** | [**List&lt;String&gt;**](String.md)| Entity ids to be examined, e.g. NCBIGene:9342, NCBIGene:7227, NCBIGene:8131, NCBIGene:157570, NCBIGene:51164, NCBIGene:6689, NCBIGene:6387 | [optional]

### Return type

[**List&lt;CompactAssociationSet&gt;**](CompactAssociationSet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

