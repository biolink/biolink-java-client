# EvidencegraphApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAssociationObject**](EvidencegraphApi.md#getAssociationObject) | **GET** /evidence/graph/{id} | Returns evidence graph object for a given association
[**getAssociationObject_0**](EvidencegraphApi.md#getAssociationObject_0) | **GET** /evidence/graph/{id}/image | Returns evidence graph as a png


<a name="getAssociationObject"></a>
# **getAssociationObject**
> List&lt;Graph&gt; getAssociationObject(id)

Returns evidence graph object for a given association

Note that every association is assumed to have a unique ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EvidencegraphApi;


EvidencegraphApi apiInstance = new EvidencegraphApi();
String id = "id_example"; // String | association id, e.g. cfef92b7-bfa3-44c2-a537-579078d2de37
try {
    List<Graph> result = apiInstance.getAssociationObject(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EvidencegraphApi#getAssociationObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| association id, e.g. cfef92b7-bfa3-44c2-a537-579078d2de37 |

### Return type

[**List&lt;Graph&gt;**](Graph.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAssociationObject_0"></a>
# **getAssociationObject_0**
> getAssociationObject_0(id)

Returns evidence graph as a png

TODO - requires matplotlib which is hard to install

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EvidencegraphApi;


EvidencegraphApi apiInstance = new EvidencegraphApi();
String id = "id_example"; // String | association id, e.g. cfef92b7-bfa3-44c2-a537-579078d2de37
try {
    apiInstance.getAssociationObject_0(id);
} catch (ApiException e) {
    System.err.println("Exception when calling EvidencegraphApi#getAssociationObject_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| association id, e.g. cfef92b7-bfa3-44c2-a537-579078d2de37 |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

