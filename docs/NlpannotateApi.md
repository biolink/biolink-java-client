# NlpannotateApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAnnotate**](NlpannotateApi.md#getAnnotate) | **GET** /nlp/annotate/{text} | Returns list of matches


<a name="getAnnotate"></a>
# **getAnnotate**
> List&lt;Association&gt; getAnnotate(text, category)

Returns list of matches

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NlpannotateApi;


NlpannotateApi apiInstance = new NlpannotateApi();
String text = "text_example"; // String | 
List<String> category = Arrays.asList("category_example"); // List<String> | E.g. phenotype
try {
    List<Association> result = apiInstance.getAnnotate(text, category);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NlpannotateApi#getAnnotate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **String**|  |
 **category** | [**List&lt;String&gt;**](String.md)| E.g. phenotype | [optional]

### Return type

[**List&lt;Association&gt;**](Association.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

