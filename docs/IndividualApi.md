# IndividualApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIndividual**](IndividualApi.md#getIndividual) | **GET** /individual/{id} | Returns list of matches
[**getPedigree**](IndividualApi.md#getPedigree) | **GET** /individual/pedigree/{id} | Returns list of matches


<a name="getIndividual"></a>
# **getIndividual**
> List&lt;Association&gt; getIndividual(id)

Returns list of matches

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IndividualApi;


IndividualApi apiInstance = new IndividualApi();
String id = "id_example"; // String | 
try {
    List<Association> result = apiInstance.getIndividual(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndividualApi#getIndividual");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**List&lt;Association&gt;**](Association.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPedigree"></a>
# **getPedigree**
> List&lt;Association&gt; getPedigree(id)

Returns list of matches

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IndividualApi;


IndividualApi apiInstance = new IndividualApi();
String id = "id_example"; // String | 
try {
    List<Association> result = apiInstance.getPedigree(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndividualApi#getPedigree");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**List&lt;Association&gt;**](Association.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

