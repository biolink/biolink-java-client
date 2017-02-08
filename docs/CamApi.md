# CamApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getActivityCollection**](CamApi.md#getActivityCollection) | **GET** /cam/activity/ | Returns list of models
[**getInstance**](CamApi.md#getInstance) | **GET** /cam/instance/{id} | Returns list of matches
[**getModel**](CamApi.md#getModel) | **GET** /cam/model/{id} | Returns a complete model
[**getModelCollection**](CamApi.md#getModelCollection) | **GET** /cam/model/ | Returns list of ALL models
[**getModelCollection_0**](CamApi.md#getModelCollection_0) | **GET** /cam/model/properties/ | Returns list of all properties used across all models
[**getModelCollection_1**](CamApi.md#getModelCollection_1) | **GET** /cam/model/property_values/ | Returns list property-values for all models
[**getModelCollection_2**](CamApi.md#getModelCollection_2) | **GET** /cam/model/query/ | Returns list of models matching query
[**getModelContibutors**](CamApi.md#getModelContibutors) | **GET** /cam/instances/ | Returns list of all instances
[**getModelContibutors_0**](CamApi.md#getModelContibutors_0) | **GET** /cam/model/contributors/ | Returns list of all contributors across all models
[**getPhysicalInteraction**](CamApi.md#getPhysicalInteraction) | **GET** /cam/physical_interaction/ | Returns list of models


<a name="getActivityCollection"></a>
# **getActivityCollection**
> getActivityCollection(contributor, title)

Returns list of models

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CamApi;


CamApi apiInstance = new CamApi();
String contributor = "contributor_example"; // String | string to search for in contributor of model
String title = "title_example"; // String | string to search for in title of model
try {
    apiInstance.getActivityCollection(contributor, title);
} catch (ApiException e) {
    System.err.println("Exception when calling CamApi#getActivityCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contributor** | **String**| string to search for in contributor of model | [optional]
 **title** | **String**| string to search for in title of model | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInstance"></a>
# **getInstance**
> List&lt;Association&gt; getInstance(id, contributor, title)

Returns list of matches

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CamApi;


CamApi apiInstance = new CamApi();
String id = "id_example"; // String | 
String contributor = "contributor_example"; // String | string to search for in contributor of model
String title = "title_example"; // String | string to search for in title of model
try {
    List<Association> result = apiInstance.getInstance(id, contributor, title);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CamApi#getInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **contributor** | **String**| string to search for in contributor of model | [optional]
 **title** | **String**| string to search for in title of model | [optional]

### Return type

[**List&lt;Association&gt;**](Association.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getModel"></a>
# **getModel**
> getModel(id)

Returns a complete model

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CamApi;


CamApi apiInstance = new CamApi();
String id = "id_example"; // String | 
try {
    apiInstance.getModel(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CamApi#getModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getModelCollection"></a>
# **getModelCollection**
> getModelCollection()

Returns list of ALL models

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CamApi;


CamApi apiInstance = new CamApi();
try {
    apiInstance.getModelCollection();
} catch (ApiException e) {
    System.err.println("Exception when calling CamApi#getModelCollection");
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

<a name="getModelCollection_0"></a>
# **getModelCollection_0**
> getModelCollection_0(contributor, title)

Returns list of all properties used across all models

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CamApi;


CamApi apiInstance = new CamApi();
String contributor = "contributor_example"; // String | string to search for in contributor of model
String title = "title_example"; // String | string to search for in title of model
try {
    apiInstance.getModelCollection_0(contributor, title);
} catch (ApiException e) {
    System.err.println("Exception when calling CamApi#getModelCollection_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contributor** | **String**| string to search for in contributor of model | [optional]
 **title** | **String**| string to search for in title of model | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getModelCollection_1"></a>
# **getModelCollection_1**
> getModelCollection_1(contributor, title)

Returns list property-values for all models

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CamApi;


CamApi apiInstance = new CamApi();
String contributor = "contributor_example"; // String | string to search for in contributor of model
String title = "title_example"; // String | string to search for in title of model
try {
    apiInstance.getModelCollection_1(contributor, title);
} catch (ApiException e) {
    System.err.println("Exception when calling CamApi#getModelCollection_1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contributor** | **String**| string to search for in contributor of model | [optional]
 **title** | **String**| string to search for in title of model | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getModelCollection_2"></a>
# **getModelCollection_2**
> getModelCollection_2(contributor, title)

Returns list of models matching query

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CamApi;


CamApi apiInstance = new CamApi();
String contributor = "contributor_example"; // String | string to search for in contributor of model
String title = "title_example"; // String | string to search for in title of model
try {
    apiInstance.getModelCollection_2(contributor, title);
} catch (ApiException e) {
    System.err.println("Exception when calling CamApi#getModelCollection_2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contributor** | **String**| string to search for in contributor of model | [optional]
 **title** | **String**| string to search for in title of model | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getModelContibutors"></a>
# **getModelContibutors**
> getModelContibutors()

Returns list of all instances

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CamApi;


CamApi apiInstance = new CamApi();
try {
    apiInstance.getModelContibutors();
} catch (ApiException e) {
    System.err.println("Exception when calling CamApi#getModelContibutors");
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

<a name="getModelContibutors_0"></a>
# **getModelContibutors_0**
> getModelContibutors_0()

Returns list of all contributors across all models

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CamApi;


CamApi apiInstance = new CamApi();
try {
    apiInstance.getModelContibutors_0();
} catch (ApiException e) {
    System.err.println("Exception when calling CamApi#getModelContibutors_0");
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

<a name="getPhysicalInteraction"></a>
# **getPhysicalInteraction**
> getPhysicalInteraction(contributor, title)

Returns list of models

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CamApi;


CamApi apiInstance = new CamApi();
String contributor = "contributor_example"; // String | string to search for in contributor of model
String title = "title_example"; // String | string to search for in title of model
try {
    apiInstance.getPhysicalInteraction(contributor, title);
} catch (ApiException e) {
    System.err.println("Exception when calling CamApi#getPhysicalInteraction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contributor** | **String**| string to search for in contributor of model | [optional]
 **title** | **String**| string to search for in title of model | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

