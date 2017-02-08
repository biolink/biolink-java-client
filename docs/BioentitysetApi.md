# BioentitysetApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEntitySetAssociations**](BioentitysetApi.md#getEntitySetAssociations) | **GET** /bioentityset/associations/ | Returns compact associations for a given input set
[**getEntitySetGraphResource**](BioentitysetApi.md#getEntitySetGraphResource) | **GET** /bioentityset/graph/ | TODO Graph object spanning all entities
[**getEntitySetHomologsDeprecated**](BioentitysetApi.md#getEntitySetHomologsDeprecated) | **GET** /bioentityset/DEPRECATEDhomologs/ | Returns homology associations for a given input set of genes
[**getEntitySetOverRepresentationAnalysis**](BioentitysetApi.md#getEntitySetOverRepresentationAnalysis) | **GET** /bioentityset/ora/ | TODO Over-representation analysis
[**getEntitySetOverRepresentationAnalysis_0**](BioentitysetApi.md#getEntitySetOverRepresentationAnalysis_0) | **GET** /bioentityset/ora/{object_category}/ | TODO Over-representation analysis
[**getEntitySetSummary**](BioentitysetApi.md#getEntitySetSummary) | **GET** /bioentityset/descriptor/counts/ | Summary statistics for objects associated


<a name="getEntitySetAssociations"></a>
# **getEntitySetAssociations**
> List&lt;AssociationResults&gt; getEntitySetAssociations(objectSlim, objectCategory, subject, background)

Returns compact associations for a given input set

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentitysetApi;


BioentitysetApi apiInstance = new BioentitysetApi();
String objectSlim = "objectSlim_example"; // String | Slim or subset to which the descriptors are to be mapped, NOT IMPLEMENTED
String objectCategory = "objectCategory_example"; // String | E.g. phenotype, function
List<String> subject = Arrays.asList("subject_example"); // List<String> | Entity ids to be examined, e.g. NCBIGene:9342, NCBIGene:7227, NCBIGene:8131, NCBIGene:157570, NCBIGene:51164, NCBIGene:6689, NCBIGene:6387
List<String> background = Arrays.asList("background_example"); // List<String> | Entity ids in background set, e.g. NCBIGene:84570, NCBIGene:3630; used in over-representation tests
try {
    List<AssociationResults> result = apiInstance.getEntitySetAssociations(objectSlim, objectCategory, subject, background);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentitysetApi#getEntitySetAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectSlim** | **String**| Slim or subset to which the descriptors are to be mapped, NOT IMPLEMENTED | [optional]
 **objectCategory** | **String**| E.g. phenotype, function | [optional]
 **subject** | [**List&lt;String&gt;**](String.md)| Entity ids to be examined, e.g. NCBIGene:9342, NCBIGene:7227, NCBIGene:8131, NCBIGene:157570, NCBIGene:51164, NCBIGene:6689, NCBIGene:6387 | [optional]
 **background** | [**List&lt;String&gt;**](String.md)| Entity ids in background set, e.g. NCBIGene:84570, NCBIGene:3630; used in over-representation tests | [optional]

### Return type

[**List&lt;AssociationResults&gt;**](AssociationResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEntitySetGraphResource"></a>
# **getEntitySetGraphResource**
> getEntitySetGraphResource(objectSlim, objectCategory, subject, background)

TODO Graph object spanning all entities

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentitysetApi;


BioentitysetApi apiInstance = new BioentitysetApi();
String objectSlim = "objectSlim_example"; // String | Slim or subset to which the descriptors are to be mapped, NOT IMPLEMENTED
String objectCategory = "objectCategory_example"; // String | E.g. phenotype, function
List<String> subject = Arrays.asList("subject_example"); // List<String> | Entity ids to be examined, e.g. NCBIGene:9342, NCBIGene:7227, NCBIGene:8131, NCBIGene:157570, NCBIGene:51164, NCBIGene:6689, NCBIGene:6387
List<String> background = Arrays.asList("background_example"); // List<String> | Entity ids in background set, e.g. NCBIGene:84570, NCBIGene:3630; used in over-representation tests
try {
    apiInstance.getEntitySetGraphResource(objectSlim, objectCategory, subject, background);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentitysetApi#getEntitySetGraphResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectSlim** | **String**| Slim or subset to which the descriptors are to be mapped, NOT IMPLEMENTED | [optional]
 **objectCategory** | **String**| E.g. phenotype, function | [optional]
 **subject** | [**List&lt;String&gt;**](String.md)| Entity ids to be examined, e.g. NCBIGene:9342, NCBIGene:7227, NCBIGene:8131, NCBIGene:157570, NCBIGene:51164, NCBIGene:6689, NCBIGene:6387 | [optional]
 **background** | [**List&lt;String&gt;**](String.md)| Entity ids in background set, e.g. NCBIGene:84570, NCBIGene:3630; used in over-representation tests | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEntitySetHomologsDeprecated"></a>
# **getEntitySetHomologsDeprecated**
> List&lt;AssociationResults&gt; getEntitySetHomologsDeprecated(objectSlim, objectCategory, subject, background)

Returns homology associations for a given input set of genes

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentitysetApi;


BioentitysetApi apiInstance = new BioentitysetApi();
String objectSlim = "objectSlim_example"; // String | Slim or subset to which the descriptors are to be mapped, NOT IMPLEMENTED
String objectCategory = "objectCategory_example"; // String | E.g. phenotype, function
List<String> subject = Arrays.asList("subject_example"); // List<String> | Entity ids to be examined, e.g. NCBIGene:9342, NCBIGene:7227, NCBIGene:8131, NCBIGene:157570, NCBIGene:51164, NCBIGene:6689, NCBIGene:6387
List<String> background = Arrays.asList("background_example"); // List<String> | Entity ids in background set, e.g. NCBIGene:84570, NCBIGene:3630; used in over-representation tests
try {
    List<AssociationResults> result = apiInstance.getEntitySetHomologsDeprecated(objectSlim, objectCategory, subject, background);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentitysetApi#getEntitySetHomologsDeprecated");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectSlim** | **String**| Slim or subset to which the descriptors are to be mapped, NOT IMPLEMENTED | [optional]
 **objectCategory** | **String**| E.g. phenotype, function | [optional]
 **subject** | [**List&lt;String&gt;**](String.md)| Entity ids to be examined, e.g. NCBIGene:9342, NCBIGene:7227, NCBIGene:8131, NCBIGene:157570, NCBIGene:51164, NCBIGene:6689, NCBIGene:6387 | [optional]
 **background** | [**List&lt;String&gt;**](String.md)| Entity ids in background set, e.g. NCBIGene:84570, NCBIGene:3630; used in over-representation tests | [optional]

### Return type

[**List&lt;AssociationResults&gt;**](AssociationResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEntitySetOverRepresentationAnalysis"></a>
# **getEntitySetOverRepresentationAnalysis**
> getEntitySetOverRepresentationAnalysis(objectCategory, objectCategory2, objectSlim, subject, background)

TODO Over-representation analysis

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentitysetApi;


BioentitysetApi apiInstance = new BioentitysetApi();
String objectCategory = "objectCategory_example"; // String | CATEGORY of entity at link OBJECT (target), e.g. phenotype, disease
String objectCategory2 = "objectCategory_example"; // String | E.g. phenotype, function
String objectSlim = "objectSlim_example"; // String | Slim or subset to which the descriptors are to be mapped, NOT IMPLEMENTED
List<String> subject = Arrays.asList("subject_example"); // List<String> | Entity ids to be examined, e.g. NCBIGene:9342, NCBIGene:7227, NCBIGene:8131, NCBIGene:157570, NCBIGene:51164, NCBIGene:6689, NCBIGene:6387
List<String> background = Arrays.asList("background_example"); // List<String> | Entity ids in background set, e.g. NCBIGene:84570, NCBIGene:3630; used in over-representation tests
try {
    apiInstance.getEntitySetOverRepresentationAnalysis(objectCategory, objectCategory2, objectSlim, subject, background);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentitysetApi#getEntitySetOverRepresentationAnalysis");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectCategory** | **String**| CATEGORY of entity at link OBJECT (target), e.g. phenotype, disease |
 **objectCategory2** | **String**| E.g. phenotype, function |
 **objectSlim** | **String**| Slim or subset to which the descriptors are to be mapped, NOT IMPLEMENTED | [optional]
 **subject** | [**List&lt;String&gt;**](String.md)| Entity ids to be examined, e.g. NCBIGene:9342, NCBIGene:7227, NCBIGene:8131, NCBIGene:157570, NCBIGene:51164, NCBIGene:6689, NCBIGene:6387 | [optional]
 **background** | [**List&lt;String&gt;**](String.md)| Entity ids in background set, e.g. NCBIGene:84570, NCBIGene:3630; used in over-representation tests | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEntitySetOverRepresentationAnalysis_0"></a>
# **getEntitySetOverRepresentationAnalysis_0**
> getEntitySetOverRepresentationAnalysis_0(objectCategory, objectCategory2, objectSlim, subject, background)

TODO Over-representation analysis

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentitysetApi;


BioentitysetApi apiInstance = new BioentitysetApi();
String objectCategory = "objectCategory_example"; // String | CATEGORY of entity at link OBJECT (target), e.g. phenotype, disease
String objectCategory2 = "objectCategory_example"; // String | E.g. phenotype, function
String objectSlim = "objectSlim_example"; // String | Slim or subset to which the descriptors are to be mapped, NOT IMPLEMENTED
List<String> subject = Arrays.asList("subject_example"); // List<String> | Entity ids to be examined, e.g. NCBIGene:9342, NCBIGene:7227, NCBIGene:8131, NCBIGene:157570, NCBIGene:51164, NCBIGene:6689, NCBIGene:6387
List<String> background = Arrays.asList("background_example"); // List<String> | Entity ids in background set, e.g. NCBIGene:84570, NCBIGene:3630; used in over-representation tests
try {
    apiInstance.getEntitySetOverRepresentationAnalysis_0(objectCategory, objectCategory2, objectSlim, subject, background);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentitysetApi#getEntitySetOverRepresentationAnalysis_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectCategory** | **String**| CATEGORY of entity at link OBJECT (target), e.g. phenotype, disease |
 **objectCategory2** | **String**| E.g. phenotype, function |
 **objectSlim** | **String**| Slim or subset to which the descriptors are to be mapped, NOT IMPLEMENTED | [optional]
 **subject** | [**List&lt;String&gt;**](String.md)| Entity ids to be examined, e.g. NCBIGene:9342, NCBIGene:7227, NCBIGene:8131, NCBIGene:157570, NCBIGene:51164, NCBIGene:6689, NCBIGene:6387 | [optional]
 **background** | [**List&lt;String&gt;**](String.md)| Entity ids in background set, e.g. NCBIGene:84570, NCBIGene:3630; used in over-representation tests | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEntitySetSummary"></a>
# **getEntitySetSummary**
> getEntitySetSummary(objectSlim, objectCategory, subject, background)

Summary statistics for objects associated

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BioentitysetApi;


BioentitysetApi apiInstance = new BioentitysetApi();
String objectSlim = "objectSlim_example"; // String | Slim or subset to which the descriptors are to be mapped, NOT IMPLEMENTED
String objectCategory = "objectCategory_example"; // String | E.g. phenotype, function
List<String> subject = Arrays.asList("subject_example"); // List<String> | Entity ids to be examined, e.g. NCBIGene:9342, NCBIGene:7227, NCBIGene:8131, NCBIGene:157570, NCBIGene:51164, NCBIGene:6689, NCBIGene:6387
List<String> background = Arrays.asList("background_example"); // List<String> | Entity ids in background set, e.g. NCBIGene:84570, NCBIGene:3630; used in over-representation tests
try {
    apiInstance.getEntitySetSummary(objectSlim, objectCategory, subject, background);
} catch (ApiException e) {
    System.err.println("Exception when calling BioentitysetApi#getEntitySetSummary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectSlim** | **String**| Slim or subset to which the descriptors are to be mapped, NOT IMPLEMENTED | [optional]
 **objectCategory** | **String**| E.g. phenotype, function | [optional]
 **subject** | [**List&lt;String&gt;**](String.md)| Entity ids to be examined, e.g. NCBIGene:9342, NCBIGene:7227, NCBIGene:8131, NCBIGene:157570, NCBIGene:51164, NCBIGene:6689, NCBIGene:6387 | [optional]
 **background** | [**List&lt;String&gt;**](String.md)| Entity ids in background set, e.g. NCBIGene:84570, NCBIGene:3630; used in over-representation tests | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

