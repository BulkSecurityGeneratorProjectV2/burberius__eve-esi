/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * The version of the OpenAPI document: 0.8.6
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

import net.troja.eve.esi.model.AllianceIconsResponse;
import net.troja.eve.esi.model.AllianceResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllianceApi {
    private ApiClient localVarApiClient;

    public AllianceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AllianceApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getAlliances
     * 
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param _callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public okhttp3.Call getAlliancesCall(String datasource, String ifNoneMatch, final ApiCallback _callback)
            throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v1/alliances/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("datasource", datasource));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifNoneMatch != null) {
            localVarHeaderParams.put("If-None-Match", localVarApiClient.parameterToString(ifNoneMatch));
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
    private okhttp3.Call getAlliancesValidateBeforeCall(String datasource, String ifNoneMatch,
            final ApiCallback _callback) throws ApiException {

        okhttp3.Call localVarCall = getAlliancesCall(datasource, ifNoneMatch, _callback);
        return localVarCall;

    }

    /**
     * List all alliances List all active player alliances --- This route is
     * cached for up to 3600 seconds
     * 
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @return List&lt;Integer&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public List<Integer> getAlliances(String datasource, String ifNoneMatch) throws ApiException {
        ApiResponse<List<Integer>> localVarResp = getAlliancesWithHttpInfo(datasource, ifNoneMatch);
        return localVarResp.getData();
    }

    /**
     * List all alliances List all active player alliances --- This route is
     * cached for up to 3600 seconds
     * 
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @return ApiResponse&lt;List&lt;Integer&gt;&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<List<Integer>> getAlliancesWithHttpInfo(String datasource, String ifNoneMatch)
            throws ApiException {
        okhttp3.Call localVarCall = getAlliancesValidateBeforeCall(datasource, ifNoneMatch, null);
        Type localVarReturnType = new TypeToken<List<Integer>>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List all alliances (asynchronously) List all active player alliances ---
     * This route is cached for up to 3600 seconds
     * 
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param _callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public okhttp3.Call getAlliancesAsync(String datasource, String ifNoneMatch,
            final ApiCallback<List<Integer>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAlliancesValidateBeforeCall(datasource, ifNoneMatch, _callback);
        Type localVarReturnType = new TypeToken<List<Integer>>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for getAlliancesAllianceId
     * 
     * @param allianceId
     *            An EVE alliance ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param _callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public okhttp3.Call getAlliancesAllianceIdCall(Integer allianceId, String datasource, String ifNoneMatch,
            final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v3/alliances/{alliance_id}/".replaceAll("\\{" + "alliance_id" + "\\}",
                localVarApiClient.escapeString(allianceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("datasource", datasource));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifNoneMatch != null) {
            localVarHeaderParams.put("If-None-Match", localVarApiClient.parameterToString(ifNoneMatch));
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
    private okhttp3.Call getAlliancesAllianceIdValidateBeforeCall(Integer allianceId, String datasource,
            String ifNoneMatch, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'allianceId' is set
        if (allianceId == null) {
            throw new ApiException(
                    "Missing the required parameter 'allianceId' when calling getAlliancesAllianceId(Async)");
        }

        okhttp3.Call localVarCall = getAlliancesAllianceIdCall(allianceId, datasource, ifNoneMatch, _callback);
        return localVarCall;

    }

    /**
     * Get alliance information Public information about an alliance --- This
     * route is cached for up to 3600 seconds
     * 
     * @param allianceId
     *            An EVE alliance ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @return AllianceResponse
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public AllianceResponse getAlliancesAllianceId(Integer allianceId, String datasource, String ifNoneMatch)
            throws ApiException {
        ApiResponse<AllianceResponse> localVarResp = getAlliancesAllianceIdWithHttpInfo(allianceId, datasource,
                ifNoneMatch);
        return localVarResp.getData();
    }

    /**
     * Get alliance information Public information about an alliance --- This
     * route is cached for up to 3600 seconds
     * 
     * @param allianceId
     *            An EVE alliance ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @return ApiResponse&lt;AllianceResponse&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<AllianceResponse> getAlliancesAllianceIdWithHttpInfo(Integer allianceId, String datasource,
            String ifNoneMatch) throws ApiException {
        okhttp3.Call localVarCall = getAlliancesAllianceIdValidateBeforeCall(allianceId, datasource, ifNoneMatch, null);
        Type localVarReturnType = new TypeToken<AllianceResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get alliance information (asynchronously) Public information about an
     * alliance --- This route is cached for up to 3600 seconds
     * 
     * @param allianceId
     *            An EVE alliance ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param _callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public okhttp3.Call getAlliancesAllianceIdAsync(Integer allianceId, String datasource, String ifNoneMatch,
            final ApiCallback<AllianceResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAlliancesAllianceIdValidateBeforeCall(allianceId, datasource, ifNoneMatch,
                _callback);
        Type localVarReturnType = new TypeToken<AllianceResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for getAlliancesAllianceIdCorporations
     * 
     * @param allianceId
     *            An EVE alliance ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param _callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public okhttp3.Call getAlliancesAllianceIdCorporationsCall(Integer allianceId, String datasource,
            String ifNoneMatch, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v1/alliances/{alliance_id}/corporations/".replaceAll("\\{" + "alliance_id" + "\\}",
                localVarApiClient.escapeString(allianceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("datasource", datasource));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifNoneMatch != null) {
            localVarHeaderParams.put("If-None-Match", localVarApiClient.parameterToString(ifNoneMatch));
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
    private okhttp3.Call getAlliancesAllianceIdCorporationsValidateBeforeCall(Integer allianceId, String datasource,
            String ifNoneMatch, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'allianceId' is set
        if (allianceId == null) {
            throw new ApiException(
                    "Missing the required parameter 'allianceId' when calling getAlliancesAllianceIdCorporations(Async)");
        }

        okhttp3.Call localVarCall = getAlliancesAllianceIdCorporationsCall(allianceId, datasource, ifNoneMatch,
                _callback);
        return localVarCall;

    }

    /**
     * List alliance&#39;s corporations List all current member corporations of
     * an alliance --- This route is cached for up to 3600 seconds
     * 
     * @param allianceId
     *            An EVE alliance ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @return List&lt;Integer&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public List<Integer> getAlliancesAllianceIdCorporations(Integer allianceId, String datasource, String ifNoneMatch)
            throws ApiException {
        ApiResponse<List<Integer>> localVarResp = getAlliancesAllianceIdCorporationsWithHttpInfo(allianceId,
                datasource, ifNoneMatch);
        return localVarResp.getData();
    }

    /**
     * List alliance&#39;s corporations List all current member corporations of
     * an alliance --- This route is cached for up to 3600 seconds
     * 
     * @param allianceId
     *            An EVE alliance ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @return ApiResponse&lt;List&lt;Integer&gt;&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<List<Integer>> getAlliancesAllianceIdCorporationsWithHttpInfo(Integer allianceId,
            String datasource, String ifNoneMatch) throws ApiException {
        okhttp3.Call localVarCall = getAlliancesAllianceIdCorporationsValidateBeforeCall(allianceId, datasource,
                ifNoneMatch, null);
        Type localVarReturnType = new TypeToken<List<Integer>>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List alliance&#39;s corporations (asynchronously) List all current member
     * corporations of an alliance --- This route is cached for up to 3600
     * seconds
     * 
     * @param allianceId
     *            An EVE alliance ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param _callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public okhttp3.Call getAlliancesAllianceIdCorporationsAsync(Integer allianceId, String datasource,
            String ifNoneMatch, final ApiCallback<List<Integer>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAlliancesAllianceIdCorporationsValidateBeforeCall(allianceId, datasource,
                ifNoneMatch, _callback);
        Type localVarReturnType = new TypeToken<List<Integer>>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for getAlliancesAllianceIdIcons
     * 
     * @param allianceId
     *            An EVE alliance ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param _callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public okhttp3.Call getAlliancesAllianceIdIconsCall(Integer allianceId, String datasource, String ifNoneMatch,
            final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v1/alliances/{alliance_id}/icons/".replaceAll("\\{" + "alliance_id" + "\\}",
                localVarApiClient.escapeString(allianceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("datasource", datasource));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifNoneMatch != null) {
            localVarHeaderParams.put("If-None-Match", localVarApiClient.parameterToString(ifNoneMatch));
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
    private okhttp3.Call getAlliancesAllianceIdIconsValidateBeforeCall(Integer allianceId, String datasource,
            String ifNoneMatch, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'allianceId' is set
        if (allianceId == null) {
            throw new ApiException(
                    "Missing the required parameter 'allianceId' when calling getAlliancesAllianceIdIcons(Async)");
        }

        okhttp3.Call localVarCall = getAlliancesAllianceIdIconsCall(allianceId, datasource, ifNoneMatch, _callback);
        return localVarCall;

    }

    /**
     * Get alliance icon Get the icon urls for a alliance --- This route expires
     * daily at 11:05
     * 
     * @param allianceId
     *            An EVE alliance ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @return AllianceIconsResponse
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public AllianceIconsResponse getAlliancesAllianceIdIcons(Integer allianceId, String datasource, String ifNoneMatch)
            throws ApiException {
        ApiResponse<AllianceIconsResponse> localVarResp = getAlliancesAllianceIdIconsWithHttpInfo(allianceId,
                datasource, ifNoneMatch);
        return localVarResp.getData();
    }

    /**
     * Get alliance icon Get the icon urls for a alliance --- This route expires
     * daily at 11:05
     * 
     * @param allianceId
     *            An EVE alliance ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @return ApiResponse&lt;AllianceIconsResponse&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<AllianceIconsResponse> getAlliancesAllianceIdIconsWithHttpInfo(Integer allianceId,
            String datasource, String ifNoneMatch) throws ApiException {
        okhttp3.Call localVarCall = getAlliancesAllianceIdIconsValidateBeforeCall(allianceId, datasource, ifNoneMatch,
                null);
        Type localVarReturnType = new TypeToken<AllianceIconsResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get alliance icon (asynchronously) Get the icon urls for a alliance ---
     * This route expires daily at 11:05
     * 
     * @param allianceId
     *            An EVE alliance ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param _callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public okhttp3.Call getAlliancesAllianceIdIconsAsync(Integer allianceId, String datasource, String ifNoneMatch,
            final ApiCallback<AllianceIconsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAlliancesAllianceIdIconsValidateBeforeCall(allianceId, datasource, ifNoneMatch,
                _callback);
        Type localVarReturnType = new TypeToken<AllianceIconsResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
