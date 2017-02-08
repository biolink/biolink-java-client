# PubpubsApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFoo**](PubpubsApi.md#getFoo) | **GET** /pub/pubs/{term} | Returns list of matches


<a name="getFoo"></a>
# **getFoo**
> List&lt;Association&gt; getFoo(term)

Returns list of matches

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PubpubsApi;


PubpubsApi apiInstance = new PubpubsApi();
String term = "term_example"; // String | 
try {
    List<Association> result = apiInstance.getFoo(term);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PubpubsApi#getFoo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **String**|  |

### Return type

[**List&lt;Association&gt;**](Association.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

