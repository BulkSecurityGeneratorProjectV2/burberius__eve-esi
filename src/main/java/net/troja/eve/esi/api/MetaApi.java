/*
 * ESI Meta Spec
 * ESI specs and miscellaneous routes
 *
 * The version of the OpenAPI document: 0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package net.troja.eve.esi.api;

import net.troja.eve.esi.ApiCallback;
import net.troja.eve.esi.ApiClient;
import net.troja.eve.esi.ApiException;
import net.troja.eve.esi.ApiResponse;
import net.troja.eve.esi.Configuration;
import net.troja.eve.esi.Pair;
import net.troja.eve.esi.ProgressRequestBody;
import net.troja.eve.esi.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import net.troja.eve.esi.model.EsiStatusResponse;
import net.troja.eve.esi.model.EsiVerifyResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MetaApi {
    private ApiClient localVarApiClient;

    public MetaApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MetaApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getHeaders
     * 
     * @param _callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public okhttp3.Call getHeadersCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/headers/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {};
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getHeadersValidateBeforeCall(final ApiCallback _callback) throws ApiException {

        okhttp3.Call localVarCall = getHeadersCall(_callback);
        return localVarCall;

    }

    /**
     * Debug request headers Echo the request headers for debugging purposes.
     * Note that the &#39;Connection&#39; header and any &#39;X-&#39; headers
     * are not included
     * 
     * @return Map&lt;String, String&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public Map<String, String> getHeaders() throws ApiException {
        ApiResponse<Map<String, String>> localVarResp = getHeadersWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Debug request headers Echo the request headers for debugging purposes.
     * Note that the &#39;Connection&#39; header and any &#39;X-&#39; headers
     * are not included
     * 
     * @return ApiResponse&lt;Map&lt;String, String&gt;&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<Map<String, String>> getHeadersWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getHeadersValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<Map<String, String>>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Debug request headers (asynchronously) Echo the request headers for
     * debugging purposes. Note that the &#39;Connection&#39; header and any
     * &#39;X-&#39; headers are not included
     * 
     * @param _callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public okhttp3.Call getHeadersAsync(final ApiCallback<Map<String, String>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getHeadersValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<Map<String, String>>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for getPing
     * 
     * @param _callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public okhttp3.Call getPingCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/ping";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "text/plain; charset=utf-8" };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {};
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPingValidateBeforeCall(final ApiCallback _callback) throws ApiException {

        okhttp3.Call localVarCall = getPingCall(_callback);
        return localVarCall;

    }

    /**
     * Ping route Ping the ESI routers
     * 
     * @return String
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public String getPing() throws ApiException {
        ApiResponse<String> localVarResp = getPingWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Ping route Ping the ESI routers
     * 
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<String> getPingWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getPingValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<String>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Ping route (asynchronously) Ping the ESI routers
     * 
     * @param _callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public okhttp3.Call getPingAsync(final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPingValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<String>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for getStatus
     * 
     * @param version
     *            The version of metrics to request. Note that alternate
     *            versions are grouped together (optional, default to latest)
     * @param _callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public okhttp3.Call getStatusCall(String version, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/status.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (version != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("version", version));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {};
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getStatusValidateBeforeCall(String version, final ApiCallback _callback) throws ApiException {

        okhttp3.Call localVarCall = getStatusCall(version, _callback);
        return localVarCall;

    }

    /**
     * ESI health status Provides a general health indicator per route and
     * method
     * 
     * @param version
     *            The version of metrics to request. Note that alternate
     *            versions are grouped together (optional, default to latest)
     * @return List&lt;EsiStatusResponse&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public List<EsiStatusResponse> getStatus(String version) throws ApiException {
        ApiResponse<List<EsiStatusResponse>> localVarResp = getStatusWithHttpInfo(version);
        return localVarResp.getData();
    }

    /**
     * ESI health status Provides a general health indicator per route and
     * method
     * 
     * @param version
     *            The version of metrics to request. Note that alternate
     *            versions are grouped together (optional, default to latest)
     * @return ApiResponse&lt;List&lt;EsiStatusResponse&gt;&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<List<EsiStatusResponse>> getStatusWithHttpInfo(String version) throws ApiException {
        okhttp3.Call localVarCall = getStatusValidateBeforeCall(version, null);
        Type localVarReturnType = new TypeToken<List<EsiStatusResponse>>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * ESI health status (asynchronously) Provides a general health indicator
     * per route and method
     * 
     * @param version
     *            The version of metrics to request. Note that alternate
     *            versions are grouped together (optional, default to latest)
     * @param _callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public okhttp3.Call getStatusAsync(String version, final ApiCallback<List<EsiStatusResponse>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = getStatusValidateBeforeCall(version, _callback);
        Type localVarReturnType = new TypeToken<List<EsiStatusResponse>>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for getVerify
     * 
     * @param userAgent
     *            Client identifier, takes precedence over headers (optional)
     * @param xUserAgent
     *            Client identifier, takes precedence over User-Agent (optional)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param authorization
     *            Access token, in the format of \&quot;Bearer &lt;access
     *            token&gt;\&quot; (optional)
     * @param _callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public okhttp3.Call getVerifyCall(String userAgent, String xUserAgent, String datasource, String token,
            String authorization, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/verify/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (userAgent != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("user_agent", userAgent));
        }

        if (datasource != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("datasource", datasource));
        }

        if (token != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("token", token));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xUserAgent != null) {
            localVarHeaderParams.put("X-User-Agent", localVarApiClient.parameterToString(xUserAgent));
        }

        if (authorization != null) {
            localVarHeaderParams.put("Authorization", localVarApiClient.parameterToString(authorization));
        }

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "evesso" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getVerifyValidateBeforeCall(String userAgent, String xUserAgent, String datasource,
            String token, String authorization, final ApiCallback _callback) throws ApiException {

        okhttp3.Call localVarCall = getVerifyCall(userAgent, xUserAgent, datasource, token, authorization, _callback);
        return localVarCall;

    }

    /**
     * Verify access token Verify authorization tokens in ESI&#39;s auth cache
     * 
     * @param userAgent
     *            Client identifier, takes precedence over headers (optional)
     * @param xUserAgent
     *            Client identifier, takes precedence over User-Agent (optional)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param authorization
     *            Access token, in the format of \&quot;Bearer &lt;access
     *            token&gt;\&quot; (optional)
     * @return EsiVerifyResponse
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public EsiVerifyResponse getVerify(String userAgent, String xUserAgent, String datasource, String token,
            String authorization) throws ApiException {
        ApiResponse<EsiVerifyResponse> localVarResp = getVerifyWithHttpInfo(userAgent, xUserAgent, datasource, token,
                authorization);
        return localVarResp.getData();
    }

    /**
     * Verify access token Verify authorization tokens in ESI&#39;s auth cache
     * 
     * @param userAgent
     *            Client identifier, takes precedence over headers (optional)
     * @param xUserAgent
     *            Client identifier, takes precedence over User-Agent (optional)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param authorization
     *            Access token, in the format of \&quot;Bearer &lt;access
     *            token&gt;\&quot; (optional)
     * @return ApiResponse&lt;EsiVerifyResponse&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<EsiVerifyResponse> getVerifyWithHttpInfo(String userAgent, String xUserAgent, String datasource,
            String token, String authorization) throws ApiException {
        okhttp3.Call localVarCall = getVerifyValidateBeforeCall(userAgent, xUserAgent, datasource, token,
                authorization, null);
        Type localVarReturnType = new TypeToken<EsiVerifyResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Verify access token (asynchronously) Verify authorization tokens in
     * ESI&#39;s auth cache
     * 
     * @param userAgent
     *            Client identifier, takes precedence over headers (optional)
     * @param xUserAgent
     *            Client identifier, takes precedence over User-Agent (optional)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param authorization
     *            Access token, in the format of \&quot;Bearer &lt;access
     *            token&gt;\&quot; (optional)
     * @param _callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public okhttp3.Call getVerifyAsync(String userAgent, String xUserAgent, String datasource, String token,
            String authorization, final ApiCallback<EsiVerifyResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getVerifyValidateBeforeCall(userAgent, xUserAgent, datasource, token,
                authorization, _callback);
        Type localVarReturnType = new TypeToken<EsiVerifyResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for getVersions
     * 
     * @param userAgent
     *            Client identifier, takes precedence over headers (optional)
     * @param xUserAgent
     *            Client identifier, takes precedence over User-Agent (optional)
     * @param _callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public okhttp3.Call getVersionsCall(String userAgent, String xUserAgent, final ApiCallback _callback)
            throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/versions/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (userAgent != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("user_agent", userAgent));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xUserAgent != null) {
            localVarHeaderParams.put("X-User-Agent", localVarApiClient.parameterToString(xUserAgent));
        }

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {};
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getVersionsValidateBeforeCall(String userAgent, String xUserAgent, final ApiCallback _callback)
            throws ApiException {

        okhttp3.Call localVarCall = getVersionsCall(userAgent, xUserAgent, _callback);
        return localVarCall;

    }

    /**
     * List versions List all endpoint versions
     * 
     * @param userAgent
     *            Client identifier, takes precedence over headers (optional)
     * @param xUserAgent
     *            Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;String&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public List<String> getVersions(String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<String>> localVarResp = getVersionsWithHttpInfo(userAgent, xUserAgent);
        return localVarResp.getData();
    }

    /**
     * List versions List all endpoint versions
     * 
     * @param userAgent
     *            Client identifier, takes precedence over headers (optional)
     * @param xUserAgent
     *            Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<List<String>> getVersionsWithHttpInfo(String userAgent, String xUserAgent) throws ApiException {
        okhttp3.Call localVarCall = getVersionsValidateBeforeCall(userAgent, xUserAgent, null);
        Type localVarReturnType = new TypeToken<List<String>>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List versions (asynchronously) List all endpoint versions
     * 
     * @param userAgent
     *            Client identifier, takes precedence over headers (optional)
     * @param xUserAgent
     *            Client identifier, takes precedence over User-Agent (optional)
     * @param _callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public okhttp3.Call getVersionsAsync(String userAgent, String xUserAgent, final ApiCallback<List<String>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = getVersionsValidateBeforeCall(userAgent, xUserAgent, _callback);
        Type localVarReturnType = new TypeToken<List<String>>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
