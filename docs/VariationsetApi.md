# VariationsetApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteVariantSetItem**](VariationsetApi.md#deleteVariantSetItem) | **DELETE** /variation/set/{id} | Deletes variant set
[**getAnalyze**](VariationsetApi.md#getAnalyze) | **GET** /variation/set/analyze/{id} | Returns list of matches
[**getVariantSetItem**](VariationsetApi.md#getVariantSetItem) | **GET** /variation/set/{id} | Returns a variant set
[**getVariantSetsArchiveCollection**](VariationsetApi.md#getVariantSetsArchiveCollection) | **GET** /variation/set/archive/{year}/{month}/{day}/ | Returns list of variant sets from a specified time period
[**getVariantSetsCollection**](VariationsetApi.md#getVariantSetsCollection) | **GET** /variation/set/ | Returns list of variant sets
[**postVariantSetsCollection**](VariationsetApi.md#postVariantSetsCollection) | **POST** /variation/set/ | Creates a new variant set
[**putVariantSetItem**](VariationsetApi.md#putVariantSetItem) | **PUT** /variation/set/{id} | Updates a variant set


<a name="deleteVariantSetItem"></a>
# **deleteVariantSetItem**
> deleteVariantSetItem(id, id2, id3)

Deletes variant set

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VariationsetApi;


VariationsetApi apiInstance = new VariationsetApi();
String id = "id_example"; // String | 
String id2 = "id_example"; // String | 
String id3 = "id_example"; // String | 
try {
    apiInstance.deleteVariantSetItem(id, id2, id3);
} catch (ApiException e) {
    System.err.println("Exception when calling VariationsetApi#deleteVariantSetItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **id2** | **String**|  |
 **id3** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAnalyze"></a>
# **getAnalyze**
> List&lt;Association&gt; getAnalyze(id)

Returns list of matches

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VariationsetApi;


VariationsetApi apiInstance = new VariationsetApi();
String id = "id_example"; // String | 
try {
    List<Association> result = apiInstance.getAnalyze(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VariationsetApi#getAnalyze");
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

<a name="getVariantSetItem"></a>
# **getVariantSetItem**
> VariantSet getVariantSetItem(id)

Returns a variant set

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VariationsetApi;


VariationsetApi apiInstance = new VariationsetApi();
String id = "id_example"; // String | 
try {
    VariantSet result = apiInstance.getVariantSetItem(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VariationsetApi#getVariantSetItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**VariantSet**](VariantSet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVariantSetsArchiveCollection"></a>
# **getVariantSetsArchiveCollection**
> PageOfVariantSets getVariantSetsArchiveCollection(day, year, month, perPage, page)

Returns list of variant sets from a specified time period

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VariationsetApi;


VariationsetApi apiInstance = new VariationsetApi();
Integer day = 56; // Integer | 
Integer year = 56; // Integer | 
Integer month = 56; // Integer | 
Integer perPage = 10; // Integer | Results per page {error_msg}
Integer page = 1; // Integer | Page number
try {
    PageOfVariantSets result = apiInstance.getVariantSetsArchiveCollection(day, year, month, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VariationsetApi#getVariantSetsArchiveCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **day** | **Integer**|  |
 **year** | **Integer**|  |
 **month** | **Integer**|  |
 **perPage** | **Integer**| Results per page {error_msg} | [optional] [default to 10]
 **page** | **Integer**| Page number | [optional] [default to 1]

### Return type

[**PageOfVariantSets**](PageOfVariantSets.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVariantSetsCollection"></a>
# **getVariantSetsCollection**
> PageOfVariantSets getVariantSetsCollection(perPage, page)

Returns list of variant sets

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VariationsetApi;


VariationsetApi apiInstance = new VariationsetApi();
Integer perPage = 10; // Integer | Results per page {error_msg}
Integer page = 1; // Integer | Page number
try {
    PageOfVariantSets result = apiInstance.getVariantSetsCollection(perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VariationsetApi#getVariantSetsCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **Integer**| Results per page {error_msg} | [optional] [default to 10]
 **page** | **Integer**| Page number | [optional] [default to 1]

### Return type

[**PageOfVariantSets**](PageOfVariantSets.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postVariantSetsCollection"></a>
# **postVariantSetsCollection**
> postVariantSetsCollection(payload)

Creates a new variant set

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VariationsetApi;


VariationsetApi apiInstance = new VariationsetApi();
VariantSet payload = new VariantSet(); // VariantSet | 
try {
    apiInstance.postVariantSetsCollection(payload);
} catch (ApiException e) {
    System.err.println("Exception when calling VariationsetApi#postVariantSetsCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**VariantSet**](VariantSet.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putVariantSetItem"></a>
# **putVariantSetItem**
> putVariantSetItem(id, id2, payload)

Updates a variant set

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VariationsetApi;


VariationsetApi apiInstance = new VariationsetApi();
String id = "id_example"; // String | 
String id2 = "id_example"; // String | 
VariantSet payload = new VariantSet(); // VariantSet | 
try {
    apiInstance.putVariantSetItem(id, id2, payload);
} catch (ApiException e) {
    System.err.println("Exception when calling VariationsetApi#putVariantSetItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **id2** | **String**|  |
 **payload** | [**VariantSet**](VariantSet.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

