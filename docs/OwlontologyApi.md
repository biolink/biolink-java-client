# OwlontologyApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDlQuery**](OwlontologyApi.md#getDlQuery) | **GET** /owl/ontology/dlquery/{query} | Returns list of matches
[**getDlQuery_0**](OwlontologyApi.md#getDlQuery_0) | **GET** /owl/ontology/sparql/{query} | Returns list of matches


<a name="getDlQuery"></a>
# **getDlQuery**
> List&lt;Association&gt; getDlQuery(query)

Returns list of matches

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OwlontologyApi;


OwlontologyApi apiInstance = new OwlontologyApi();
String query = "query_example"; // String | 
try {
    List<Association> result = apiInstance.getDlQuery(query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OwlontologyApi#getDlQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**|  |

### Return type

[**List&lt;Association&gt;**](Association.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDlQuery_0"></a>
# **getDlQuery_0**
> List&lt;Association&gt; getDlQuery_0(query)

Returns list of matches

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OwlontologyApi;


OwlontologyApi apiInstance = new OwlontologyApi();
String query = "query_example"; // String | 
try {
    List<Association> result = apiInstance.getDlQuery_0(query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OwlontologyApi#getDlQuery_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**|  |

### Return type

[**List&lt;Association&gt;**](Association.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

