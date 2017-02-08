# GenomefeaturesApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFeaturesWithinResource**](GenomefeaturesApi.md#getFeaturesWithinResource) | **GET** /genome/features/within/{build}/{reference}/{begin}/{end} | Returns list of matches


<a name="getFeaturesWithinResource"></a>
# **getFeaturesWithinResource**
> List&lt;SequenceFeature&gt; getFeaturesWithinResource(begin, build, reference, end)

Returns list of matches

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GenomefeaturesApi;


GenomefeaturesApi apiInstance = new GenomefeaturesApi();
String begin = "begin_example"; // String | 
String build = "build_example"; // String | 
String reference = "reference_example"; // String | 
String end = "end_example"; // String | 
try {
    List<SequenceFeature> result = apiInstance.getFeaturesWithinResource(begin, build, reference, end);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GenomefeaturesApi#getFeaturesWithinResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **begin** | **String**|  |
 **build** | **String**|  |
 **reference** | **String**|  |
 **end** | **String**|  |

### Return type

[**List&lt;SequenceFeature&gt;**](SequenceFeature.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

