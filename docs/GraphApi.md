# GraphApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEdgeResource**](GraphApi.md#getEdgeResource) | **GET** /graph/edges/from/{id} | Returns edges emanating from a node
[**getNodeResource**](GraphApi.md#getNodeResource) | **GET** /graph/node/{id} | Returns a graph node


<a name="getEdgeResource"></a>
# **getEdgeResource**
> List&lt;Graph&gt; getEdgeResource(id)

Returns edges emanating from a node

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GraphApi;


GraphApi apiInstance = new GraphApi();
String id = "id_example"; // String | CURIE e.g. HP:0000465
try {
    List<Graph> result = apiInstance.getEdgeResource(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GraphApi#getEdgeResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| CURIE e.g. HP:0000465 |

### Return type

[**List&lt;Graph&gt;**](Graph.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNodeResource"></a>
# **getNodeResource**
> List&lt;Graph&gt; getNodeResource(id)

Returns a graph node

A node is an abstract representation of some kind of entity. The entity may be a physical thing such as a patient, a molecular entity such as a gene or protein, or a conceptual entity such as a class from an ontology.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GraphApi;


GraphApi apiInstance = new GraphApi();
String id = "id_example"; // String | CURIE e.g. HP:0000465
try {
    List<Graph> result = apiInstance.getNodeResource(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GraphApi#getNodeResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| CURIE e.g. HP:0000465 |

### Return type

[**List&lt;Graph&gt;**](Graph.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

