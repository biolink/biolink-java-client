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

import io.swagger.client.model.Association;
import io.swagger.client.model.VariantSet;
import io.swagger.client.model.PageOfVariantSets;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VariationsetApi {
    private ApiClient apiClient;

    public VariationsetApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VariationsetApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for deleteVariantSetItem */
    private com.squareup.okhttp.Call deleteVariantSetItemCall(String id, String id2, String id3, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteVariantSetItem(Async)");
        }
        
        // verify the required parameter 'id2' is set
        if (id2 == null) {
            throw new ApiException("Missing the required parameter 'id2' when calling deleteVariantSetItem(Async)");
        }
        
        // verify the required parameter 'id3' is set
        if (id3 == null) {
            throw new ApiException("Missing the required parameter 'id3' when calling deleteVariantSetItem(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/variation/set/{id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id2.toString()))
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id3.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Deletes variant set
     * 
     * @param id  (required)
     * @param id2  (required)
     * @param id3  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteVariantSetItem(String id, String id2, String id3) throws ApiException {
        deleteVariantSetItemWithHttpInfo(id, id2, id3);
    }

    /**
     * Deletes variant set
     * 
     * @param id  (required)
     * @param id2  (required)
     * @param id3  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteVariantSetItemWithHttpInfo(String id, String id2, String id3) throws ApiException {
        com.squareup.okhttp.Call call = deleteVariantSetItemCall(id, id2, id3, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes variant set (asynchronously)
     * 
     * @param id  (required)
     * @param id2  (required)
     * @param id3  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteVariantSetItemAsync(String id, String id2, String id3, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteVariantSetItemCall(id, id2, id3, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getAnalyze */
    private com.squareup.okhttp.Call getAnalyzeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getAnalyze(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/variation/set/analyze/{id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

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
     * Returns list of matches
     * 
     * @param id  (required)
     * @return List&lt;Association&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Association> getAnalyze(String id) throws ApiException {
        ApiResponse<List<Association>> resp = getAnalyzeWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Returns list of matches
     * 
     * @param id  (required)
     * @return ApiResponse&lt;List&lt;Association&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Association>> getAnalyzeWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getAnalyzeCall(id, null, null);
        Type localVarReturnType = new TypeToken<List<Association>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns list of matches (asynchronously)
     * 
     * @param id  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAnalyzeAsync(String id, final ApiCallback<List<Association>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAnalyzeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Association>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getVariantSetItem */
    private com.squareup.okhttp.Call getVariantSetItemCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getVariantSetItem(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/variation/set/{id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

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
     * Returns a variant set
     * 
     * @param id  (required)
     * @return VariantSet
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VariantSet getVariantSetItem(String id) throws ApiException {
        ApiResponse<VariantSet> resp = getVariantSetItemWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Returns a variant set
     * 
     * @param id  (required)
     * @return ApiResponse&lt;VariantSet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VariantSet> getVariantSetItemWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getVariantSetItemCall(id, null, null);
        Type localVarReturnType = new TypeToken<VariantSet>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns a variant set (asynchronously)
     * 
     * @param id  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getVariantSetItemAsync(String id, final ApiCallback<VariantSet> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getVariantSetItemCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VariantSet>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getVariantSetsArchiveCollection */
    private com.squareup.okhttp.Call getVariantSetsArchiveCollectionCall(Integer day, Integer year, Integer month, Integer perPage, Integer page, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'day' is set
        if (day == null) {
            throw new ApiException("Missing the required parameter 'day' when calling getVariantSetsArchiveCollection(Async)");
        }
        
        // verify the required parameter 'year' is set
        if (year == null) {
            throw new ApiException("Missing the required parameter 'year' when calling getVariantSetsArchiveCollection(Async)");
        }
        
        // verify the required parameter 'month' is set
        if (month == null) {
            throw new ApiException("Missing the required parameter 'month' when calling getVariantSetsArchiveCollection(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/variation/set/archive/{year}/{month}/{day}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "day" + "\\}", apiClient.escapeString(day.toString()))
        .replaceAll("\\{" + "year" + "\\}", apiClient.escapeString(year.toString()))
        .replaceAll("\\{" + "month" + "\\}", apiClient.escapeString(month.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (perPage != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "per_page", perPage));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));

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
     * Returns list of variant sets from a specified time period
     * 
     * @param day  (required)
     * @param year  (required)
     * @param month  (required)
     * @param perPage Results per page {error_msg} (optional, default to 10)
     * @param page Page number (optional, default to 1)
     * @return PageOfVariantSets
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PageOfVariantSets getVariantSetsArchiveCollection(Integer day, Integer year, Integer month, Integer perPage, Integer page) throws ApiException {
        ApiResponse<PageOfVariantSets> resp = getVariantSetsArchiveCollectionWithHttpInfo(day, year, month, perPage, page);
        return resp.getData();
    }

    /**
     * Returns list of variant sets from a specified time period
     * 
     * @param day  (required)
     * @param year  (required)
     * @param month  (required)
     * @param perPage Results per page {error_msg} (optional, default to 10)
     * @param page Page number (optional, default to 1)
     * @return ApiResponse&lt;PageOfVariantSets&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PageOfVariantSets> getVariantSetsArchiveCollectionWithHttpInfo(Integer day, Integer year, Integer month, Integer perPage, Integer page) throws ApiException {
        com.squareup.okhttp.Call call = getVariantSetsArchiveCollectionCall(day, year, month, perPage, page, null, null);
        Type localVarReturnType = new TypeToken<PageOfVariantSets>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns list of variant sets from a specified time period (asynchronously)
     * 
     * @param day  (required)
     * @param year  (required)
     * @param month  (required)
     * @param perPage Results per page {error_msg} (optional, default to 10)
     * @param page Page number (optional, default to 1)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getVariantSetsArchiveCollectionAsync(Integer day, Integer year, Integer month, Integer perPage, Integer page, final ApiCallback<PageOfVariantSets> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getVariantSetsArchiveCollectionCall(day, year, month, perPage, page, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PageOfVariantSets>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getVariantSetsCollection */
    private com.squareup.okhttp.Call getVariantSetsCollectionCall(Integer perPage, Integer page, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/variation/set/".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (perPage != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "per_page", perPage));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));

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
     * Returns list of variant sets
     * 
     * @param perPage Results per page {error_msg} (optional, default to 10)
     * @param page Page number (optional, default to 1)
     * @return PageOfVariantSets
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PageOfVariantSets getVariantSetsCollection(Integer perPage, Integer page) throws ApiException {
        ApiResponse<PageOfVariantSets> resp = getVariantSetsCollectionWithHttpInfo(perPage, page);
        return resp.getData();
    }

    /**
     * Returns list of variant sets
     * 
     * @param perPage Results per page {error_msg} (optional, default to 10)
     * @param page Page number (optional, default to 1)
     * @return ApiResponse&lt;PageOfVariantSets&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PageOfVariantSets> getVariantSetsCollectionWithHttpInfo(Integer perPage, Integer page) throws ApiException {
        com.squareup.okhttp.Call call = getVariantSetsCollectionCall(perPage, page, null, null);
        Type localVarReturnType = new TypeToken<PageOfVariantSets>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns list of variant sets (asynchronously)
     * 
     * @param perPage Results per page {error_msg} (optional, default to 10)
     * @param page Page number (optional, default to 1)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getVariantSetsCollectionAsync(Integer perPage, Integer page, final ApiCallback<PageOfVariantSets> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getVariantSetsCollectionCall(perPage, page, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PageOfVariantSets>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for postVariantSetsCollection */
    private com.squareup.okhttp.Call postVariantSetsCollectionCall(VariantSet payload, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = payload;
        
        // verify the required parameter 'payload' is set
        if (payload == null) {
            throw new ApiException("Missing the required parameter 'payload' when calling postVariantSetsCollection(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/variation/set/".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Creates a new variant set
     * 
     * @param payload  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postVariantSetsCollection(VariantSet payload) throws ApiException {
        postVariantSetsCollectionWithHttpInfo(payload);
    }

    /**
     * Creates a new variant set
     * 
     * @param payload  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postVariantSetsCollectionWithHttpInfo(VariantSet payload) throws ApiException {
        com.squareup.okhttp.Call call = postVariantSetsCollectionCall(payload, null, null);
        return apiClient.execute(call);
    }

    /**
     * Creates a new variant set (asynchronously)
     * 
     * @param payload  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postVariantSetsCollectionAsync(VariantSet payload, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postVariantSetsCollectionCall(payload, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for putVariantSetItem */
    private com.squareup.okhttp.Call putVariantSetItemCall(String id, String id2, VariantSet payload, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = payload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling putVariantSetItem(Async)");
        }
        
        // verify the required parameter 'id2' is set
        if (id2 == null) {
            throw new ApiException("Missing the required parameter 'id2' when calling putVariantSetItem(Async)");
        }
        
        // verify the required parameter 'payload' is set
        if (payload == null) {
            throw new ApiException("Missing the required parameter 'payload' when calling putVariantSetItem(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/variation/set/{id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id2.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Updates a variant set
     * 
     * @param id  (required)
     * @param id2  (required)
     * @param payload  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void putVariantSetItem(String id, String id2, VariantSet payload) throws ApiException {
        putVariantSetItemWithHttpInfo(id, id2, payload);
    }

    /**
     * Updates a variant set
     * 
     * @param id  (required)
     * @param id2  (required)
     * @param payload  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> putVariantSetItemWithHttpInfo(String id, String id2, VariantSet payload) throws ApiException {
        com.squareup.okhttp.Call call = putVariantSetItemCall(id, id2, payload, null, null);
        return apiClient.execute(call);
    }

    /**
     * Updates a variant set (asynchronously)
     * 
     * @param id  (required)
     * @param id2  (required)
     * @param payload  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putVariantSetItemAsync(String id, String id2, VariantSet payload, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putVariantSetItemCall(id, id2, payload, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
