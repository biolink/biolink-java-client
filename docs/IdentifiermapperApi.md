# IdentifiermapperApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPrefixCollection**](IdentifiermapperApi.md#getPrefixCollection) | **GET** /identifier/mapper/{source}/{target}/ | TODO maps a list of identifiers from a source to a target


<a name="getPrefixCollection"></a>
# **getPrefixCollection**
> List&lt;Association&gt; getPrefixCollection(source, target)

TODO maps a list of identifiers from a source to a target

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IdentifiermapperApi;


IdentifiermapperApi apiInstance = new IdentifiermapperApi();
String source = "source_example"; // String | 
String target = "target_example"; // String | 
try {
    List<Association> result = apiInstance.getPrefixCollection(source, target);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentifiermapperApi#getPrefixCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | **String**|  |
 **target** | **String**|  |

### Return type

[**List&lt;Association&gt;**](Association.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

