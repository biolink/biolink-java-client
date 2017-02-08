# IdentifierprefixesApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPrefixCollection**](IdentifierprefixesApi.md#getPrefixCollection) | **GET** /identifier/prefixes/ | Returns list of prefixes
[**getPrefixCollection_0**](IdentifierprefixesApi.md#getPrefixCollection_0) | **GET** /identifier/prefixes/contract/{uri} | Returns contracted URI
[**getPrefixCollection_1**](IdentifierprefixesApi.md#getPrefixCollection_1) | **GET** /identifier/prefixes/expand/{id} | Returns expanded URI


<a name="getPrefixCollection"></a>
# **getPrefixCollection**
> getPrefixCollection()

Returns list of prefixes

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IdentifierprefixesApi;


IdentifierprefixesApi apiInstance = new IdentifierprefixesApi();
try {
    apiInstance.getPrefixCollection();
} catch (ApiException e) {
    System.err.println("Exception when calling IdentifierprefixesApi#getPrefixCollection");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPrefixCollection_0"></a>
# **getPrefixCollection_0**
> getPrefixCollection_0(uri)

Returns contracted URI

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IdentifierprefixesApi;


IdentifierprefixesApi apiInstance = new IdentifierprefixesApi();
String uri = "uri_example"; // String | URI of entity to be contracted to identifier/CURIE, e.g \"http://www.informatics.jax.org/accession/MGI:1\"
try {
    apiInstance.getPrefixCollection_0(uri);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentifierprefixesApi#getPrefixCollection_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uri** | **String**| URI of entity to be contracted to identifier/CURIE, e.g \&quot;http://www.informatics.jax.org/accession/MGI:1\&quot; |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPrefixCollection_1"></a>
# **getPrefixCollection_1**
> getPrefixCollection_1(id)

Returns expanded URI

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IdentifierprefixesApi;


IdentifierprefixesApi apiInstance = new IdentifierprefixesApi();
String id = "id_example"; // String | ID of entity to be contracted to URI, e.g \"MGI:1\"
try {
    apiInstance.getPrefixCollection_1(id);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentifierprefixesApi#getPrefixCollection_1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of entity to be contracted to URI, e.g \&quot;MGI:1\&quot; |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

