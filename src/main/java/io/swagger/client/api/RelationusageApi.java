/**
 * BioLink API
 * API integration layer for linked biological objects.   __Source:__ https://github.com/monarch-initiative/biolink-api/
 *
 * OpenAPI spec version: 0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.swagger.client.model.AssociationResults;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RelationusageApi {
    private ApiClient apiClient;

    public RelationusageApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RelationusageApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getRelationUsageBetweenResource */
    private com.squareup.okhttp.Call getRelationUsageBetweenResourceCall(String objectCategory, String subjectCategory, String subjectTaxon, String evidence, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'objectCategory' is set
        if (objectCategory == null) {
            throw new ApiException("Missing the required parameter 'objectCategory' when calling getRelationUsageBetweenResource(Async)");
        }
        
        // verify the required parameter 'subjectCategory' is set
        if (subjectCategory == null) {
            throw new ApiException("Missing the required parameter 'subjectCategory' when calling getRelationUsageBetweenResource(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/relation/usage/between/{subject_category}/{object_category}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "object_category" + "\\}", apiClient.escapeString(objectCategory.toString()))
        .replaceAll("\\{" + "subject_category" + "\\}", apiClient.escapeString(subjectCategory.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (subjectTaxon != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "subject_taxon", subjectTaxon));
        if (evidence != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "evidence", evidence));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * All relations used plus count of associations
     * 
     * @param objectCategory  (required)
     * @param subjectCategory  (required)
     * @param subjectTaxon SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default (optional)
     * @param evidence Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                      (optional)
     * @return List&lt;AssociationResults&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<AssociationResults> getRelationUsageBetweenResource(String objectCategory, String subjectCategory, String subjectTaxon, String evidence) throws ApiException {
        ApiResponse<List<AssociationResults>> resp = getRelationUsageBetweenResourceWithHttpInfo(objectCategory, subjectCategory, subjectTaxon, evidence);
        return resp.getData();
    }

    /**
     * All relations used plus count of associations
     * 
     * @param objectCategory  (required)
     * @param subjectCategory  (required)
     * @param subjectTaxon SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default (optional)
     * @param evidence Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                      (optional)
     * @return ApiResponse&lt;List&lt;AssociationResults&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<AssociationResults>> getRelationUsageBetweenResourceWithHttpInfo(String objectCategory, String subjectCategory, String subjectTaxon, String evidence) throws ApiException {
        com.squareup.okhttp.Call call = getRelationUsageBetweenResourceCall(objectCategory, subjectCategory, subjectTaxon, evidence, null, null);
        Type localVarReturnType = new TypeToken<List<AssociationResults>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * All relations used plus count of associations (asynchronously)
     * 
     * @param objectCategory  (required)
     * @param subjectCategory  (required)
     * @param subjectTaxon SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default (optional)
     * @param evidence Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                      (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getRelationUsageBetweenResourceAsync(String objectCategory, String subjectCategory, String subjectTaxon, String evidence, final ApiCallback<List<AssociationResults>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getRelationUsageBetweenResourceCall(objectCategory, subjectCategory, subjectTaxon, evidence, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<AssociationResults>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getRelationUsagePivotLabelResource */
    private com.squareup.okhttp.Call getRelationUsagePivotLabelResourceCall(String subjectTaxon, String evidence, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/relation/usage/pivot/label".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (subjectTaxon != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "subject_taxon", subjectTaxon));
        if (evidence != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "evidence", evidence));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Relation usage count for all subj x obj category combinations, showing label
     * 
     * @param subjectTaxon SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default (optional)
     * @param evidence Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                      (optional)
     * @return List&lt;AssociationResults&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<AssociationResults> getRelationUsagePivotLabelResource(String subjectTaxon, String evidence) throws ApiException {
        ApiResponse<List<AssociationResults>> resp = getRelationUsagePivotLabelResourceWithHttpInfo(subjectTaxon, evidence);
        return resp.getData();
    }

    /**
     * Relation usage count for all subj x obj category combinations, showing label
     * 
     * @param subjectTaxon SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default (optional)
     * @param evidence Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                      (optional)
     * @return ApiResponse&lt;List&lt;AssociationResults&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<AssociationResults>> getRelationUsagePivotLabelResourceWithHttpInfo(String subjectTaxon, String evidence) throws ApiException {
        com.squareup.okhttp.Call call = getRelationUsagePivotLabelResourceCall(subjectTaxon, evidence, null, null);
        Type localVarReturnType = new TypeToken<List<AssociationResults>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Relation usage count for all subj x obj category combinations, showing label (asynchronously)
     * 
     * @param subjectTaxon SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default (optional)
     * @param evidence Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                      (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getRelationUsagePivotLabelResourceAsync(String subjectTaxon, String evidence, final ApiCallback<List<AssociationResults>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getRelationUsagePivotLabelResourceCall(subjectTaxon, evidence, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<AssociationResults>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getRelationUsagePivotResource */
    private com.squareup.okhttp.Call getRelationUsagePivotResourceCall(String subjectTaxon, String evidence, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/relation/usage/pivot/".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (subjectTaxon != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "subject_taxon", subjectTaxon));
        if (evidence != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "evidence", evidence));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Relation usage count for all subj x obj category combinations
     * 
     * @param subjectTaxon SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default (optional)
     * @param evidence Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                      (optional)
     * @return List&lt;AssociationResults&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<AssociationResults> getRelationUsagePivotResource(String subjectTaxon, String evidence) throws ApiException {
        ApiResponse<List<AssociationResults>> resp = getRelationUsagePivotResourceWithHttpInfo(subjectTaxon, evidence);
        return resp.getData();
    }

    /**
     * Relation usage count for all subj x obj category combinations
     * 
     * @param subjectTaxon SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default (optional)
     * @param evidence Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                      (optional)
     * @return ApiResponse&lt;List&lt;AssociationResults&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<AssociationResults>> getRelationUsagePivotResourceWithHttpInfo(String subjectTaxon, String evidence) throws ApiException {
        com.squareup.okhttp.Call call = getRelationUsagePivotResourceCall(subjectTaxon, evidence, null, null);
        Type localVarReturnType = new TypeToken<List<AssociationResults>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Relation usage count for all subj x obj category combinations (asynchronously)
     * 
     * @param subjectTaxon SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default (optional)
     * @param evidence Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                      (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getRelationUsagePivotResourceAsync(String subjectTaxon, String evidence, final ApiCallback<List<AssociationResults>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getRelationUsagePivotResourceCall(subjectTaxon, evidence, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<AssociationResults>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getRelationUsageResource */
    private com.squareup.okhttp.Call getRelationUsageResourceCall(String subjectTaxon, String evidence, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/relation/usage/".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (subjectTaxon != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "subject_taxon", subjectTaxon));
        if (evidence != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "evidence", evidence));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * All relations used plus count of associations
     * 
     * @param subjectTaxon SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default (optional)
     * @param evidence Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                      (optional)
     * @return List&lt;AssociationResults&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<AssociationResults> getRelationUsageResource(String subjectTaxon, String evidence) throws ApiException {
        ApiResponse<List<AssociationResults>> resp = getRelationUsageResourceWithHttpInfo(subjectTaxon, evidence);
        return resp.getData();
    }

    /**
     * All relations used plus count of associations
     * 
     * @param subjectTaxon SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default (optional)
     * @param evidence Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                      (optional)
     * @return ApiResponse&lt;List&lt;AssociationResults&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<AssociationResults>> getRelationUsageResourceWithHttpInfo(String subjectTaxon, String evidence) throws ApiException {
        com.squareup.okhttp.Call call = getRelationUsageResourceCall(subjectTaxon, evidence, null, null);
        Type localVarReturnType = new TypeToken<List<AssociationResults>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * All relations used plus count of associations (asynchronously)
     * 
     * @param subjectTaxon SUBJECT TAXON id, e.g. NCBITaxon:9606. Includes inferred by default (optional)
     * @param evidence Object id, e.g. ECO:0000501 (for IEA; Includes inferred by default)                     or a specific publication or other supporting ibject, e.g. ZFIN:ZDB-PUB-060503-2.                      (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getRelationUsageResourceAsync(String subjectTaxon, String evidence, final ApiCallback<List<AssociationResults>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getRelationUsageResourceCall(subjectTaxon, evidence, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<AssociationResults>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}