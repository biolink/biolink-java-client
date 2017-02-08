# OntolslimmerApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFoo**](OntolslimmerApi.md#getFoo) | **GET** /ontol/slimmer/{subset} | Maps to slim


<a name="getFoo"></a>
# **getFoo**
> List&lt;Association&gt; getFoo(subset)

Maps to slim

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OntolslimmerApi;


OntolslimmerApi apiInstance = new OntolslimmerApi();
String subset = "subset_example"; // String | 
try {
    List<Association> result = apiInstance.getFoo(subset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OntolslimmerApi#getFoo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subset** | **String**|  |

### Return type

[**List&lt;Association&gt;**](Association.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

