# SearchentityApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAuthocomplete**](SearchentityApi.md#getAuthocomplete) | **GET** /search/entity/autocomplete/{term} | Returns list of matches
[**getAuthocomplete_0**](SearchentityApi.md#getAuthocomplete_0) | **GET** /search/entity/query/ | Returns list of matches
[**getSearchEntities**](SearchentityApi.md#getSearchEntities) | **GET** /search/entity/{term} | Returns list of matches


<a name="getAuthocomplete"></a>
# **getAuthocomplete**
> List&lt;Association&gt; getAuthocomplete(term, weightedAttribute, attribute, noise, subjectTaxon, negativeAttribute)

Returns list of matches

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SearchentityApi;


SearchentityApi apiInstance = new SearchentityApi();
String term = "term_example"; // String | 
List<String> weightedAttribute = Arrays.asList("weightedAttribute_example"); // List<String> | weighted attributes, specified as a range from 0 to 1 plus an ontology term, e.g. 0.3*HP:0000001
List<String> attribute = Arrays.asList("attribute_example"); // List<String> | positive attributes, e.g. ontology terms, to include in query
Boolean noise = true; // Boolean | If set, uses noise-tolerant querying, e.g owlsim, boqa
String subjectTaxon = "subjectTaxon_example"; // String | SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default
List<String> negativeAttribute = Arrays.asList("negativeAttribute_example"); // List<String> | negative attributes, e.g. ontology terms, to exclude in query
try {
    List<Association> result = apiInstance.getAuthocomplete(term, weightedAttribute, attribute, noise, subjectTaxon, negativeAttribute);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchentityApi#getAuthocomplete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **String**|  |
 **weightedAttribute** | [**List&lt;String&gt;**](String.md)| weighted attributes, specified as a range from 0 to 1 plus an ontology term, e.g. 0.3*HP:0000001 | [optional]
 **attribute** | [**List&lt;String&gt;**](String.md)| positive attributes, e.g. ontology terms, to include in query | [optional]
 **noise** | **Boolean**| If set, uses noise-tolerant querying, e.g owlsim, boqa | [optional]
 **subjectTaxon** | **String**| SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default | [optional]
 **negativeAttribute** | [**List&lt;String&gt;**](String.md)| negative attributes, e.g. ontology terms, to exclude in query | [optional]

### Return type

[**List&lt;Association&gt;**](Association.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAuthocomplete_0"></a>
# **getAuthocomplete_0**
> List&lt;Association&gt; getAuthocomplete_0(weightedAttribute, attribute, noise, subjectTaxon, negativeAttribute)

Returns list of matches

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SearchentityApi;


SearchentityApi apiInstance = new SearchentityApi();
List<String> weightedAttribute = Arrays.asList("weightedAttribute_example"); // List<String> | weighted attributes, specified as a range from 0 to 1 plus an ontology term, e.g. 0.3*HP:0000001
List<String> attribute = Arrays.asList("attribute_example"); // List<String> | positive attributes, e.g. ontology terms, to include in query
Boolean noise = true; // Boolean | If set, uses noise-tolerant querying, e.g owlsim, boqa
String subjectTaxon = "subjectTaxon_example"; // String | SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default
List<String> negativeAttribute = Arrays.asList("negativeAttribute_example"); // List<String> | negative attributes, e.g. ontology terms, to exclude in query
try {
    List<Association> result = apiInstance.getAuthocomplete_0(weightedAttribute, attribute, noise, subjectTaxon, negativeAttribute);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchentityApi#getAuthocomplete_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **weightedAttribute** | [**List&lt;String&gt;**](String.md)| weighted attributes, specified as a range from 0 to 1 plus an ontology term, e.g. 0.3*HP:0000001 | [optional]
 **attribute** | [**List&lt;String&gt;**](String.md)| positive attributes, e.g. ontology terms, to include in query | [optional]
 **noise** | **Boolean**| If set, uses noise-tolerant querying, e.g owlsim, boqa | [optional]
 **subjectTaxon** | **String**| SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default | [optional]
 **negativeAttribute** | [**List&lt;String&gt;**](String.md)| negative attributes, e.g. ontology terms, to exclude in query | [optional]

### Return type

[**List&lt;Association&gt;**](Association.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSearchEntities"></a>
# **getSearchEntities**
> List&lt;Association&gt; getSearchEntities(term, weightedAttribute, attribute, noise, subjectTaxon, negativeAttribute)

Returns list of matches

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SearchentityApi;


SearchentityApi apiInstance = new SearchentityApi();
String term = "term_example"; // String | 
List<String> weightedAttribute = Arrays.asList("weightedAttribute_example"); // List<String> | weighted attributes, specified as a range from 0 to 1 plus an ontology term, e.g. 0.3*HP:0000001
List<String> attribute = Arrays.asList("attribute_example"); // List<String> | positive attributes, e.g. ontology terms, to include in query
Boolean noise = true; // Boolean | If set, uses noise-tolerant querying, e.g owlsim, boqa
String subjectTaxon = "subjectTaxon_example"; // String | SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default
List<String> negativeAttribute = Arrays.asList("negativeAttribute_example"); // List<String> | negative attributes, e.g. ontology terms, to exclude in query
try {
    List<Association> result = apiInstance.getSearchEntities(term, weightedAttribute, attribute, noise, subjectTaxon, negativeAttribute);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchentityApi#getSearchEntities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **String**|  |
 **weightedAttribute** | [**List&lt;String&gt;**](String.md)| weighted attributes, specified as a range from 0 to 1 plus an ontology term, e.g. 0.3*HP:0000001 | [optional]
 **attribute** | [**List&lt;String&gt;**](String.md)| positive attributes, e.g. ontology terms, to include in query | [optional]
 **noise** | **Boolean**| If set, uses noise-tolerant querying, e.g owlsim, boqa | [optional]
 **subjectTaxon** | **String**| SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default | [optional]
 **negativeAttribute** | [**List&lt;String&gt;**](String.md)| negative attributes, e.g. ontology terms, to exclude in query | [optional]

### Return type

[**List&lt;Association&gt;**](Association.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

