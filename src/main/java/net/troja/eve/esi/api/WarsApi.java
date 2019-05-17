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

import net.troja.eve.esi.model.WarKillmailsResponse;
import net.troja.eve.esi.model.WarResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WarsApi {
    private ApiClient localVarApiClient;

    public WarsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WarsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getWars
     * 
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param maxWarId
     *            Only return wars with ID smaller than this (optional)
     * @param _callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public okhttp3.Call getWarsCall(String datasource, String ifNoneMatch, Integer maxWarId, final ApiCallback _callback)
            throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v1/wars/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("datasource", datasource));
        }

        if (maxWarId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("max_war_id", maxWarId));
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
    private okhttp3.Call getWarsValidateBeforeCall(String datasource, String ifNoneMatch, Integer maxWarId,
            final ApiCallback _callback) throws ApiException {

        okhttp3.Call localVarCall = getWarsCall(datasource, ifNoneMatch, maxWarId, _callback);
        return localVarCall;

    }

    /**
     * List wars Return a list of wars --- This route is cached for up to 3600
     * seconds
     * 
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param maxWarId
     *            Only return wars with ID smaller than this (optional)
     * @return List&lt;Integer&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public List<Integer> getWars(String datasource, String ifNoneMatch, Integer maxWarId) throws ApiException {
        ApiResponse<List<Integer>> localVarResp = getWarsWithHttpInfo(datasource, ifNoneMatch, maxWarId);
        return localVarResp.getData();
    }

    /**
     * List wars Return a list of wars --- This route is cached for up to 3600
     * seconds
     * 
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param maxWarId
     *            Only return wars with ID smaller than this (optional)
     * @return ApiResponse&lt;List&lt;Integer&gt;&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<List<Integer>> getWarsWithHttpInfo(String datasource, String ifNoneMatch, Integer maxWarId)
            throws ApiException {
        okhttp3.Call localVarCall = getWarsValidateBeforeCall(datasource, ifNoneMatch, maxWarId, null);
        Type localVarReturnType = new TypeToken<List<Integer>>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List wars (asynchronously) Return a list of wars --- This route is cached
     * for up to 3600 seconds
     * 
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param maxWarId
     *            Only return wars with ID smaller than this (optional)
     * @param _callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public okhttp3.Call getWarsAsync(String datasource, String ifNoneMatch, Integer maxWarId,
            final ApiCallback<List<Integer>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getWarsValidateBeforeCall(datasource, ifNoneMatch, maxWarId, _callback);
        Type localVarReturnType = new TypeToken<List<Integer>>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for getWarsWarId
     * 
     * @param warId
     *            ID for a war (required)
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
    public okhttp3.Call getWarsWarIdCall(Integer warId, String datasource, String ifNoneMatch,
            final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v1/wars/{war_id}/".replaceAll("\\{" + "war_id" + "\\}",
                localVarApiClient.escapeString(warId.toString()));

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
    private okhttp3.Call getWarsWarIdValidateBeforeCall(Integer warId, String datasource, String ifNoneMatch,
            final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'warId' is set
        if (warId == null) {
            throw new ApiException("Missing the required parameter 'warId' when calling getWarsWarId(Async)");
        }

        okhttp3.Call localVarCall = getWarsWarIdCall(warId, datasource, ifNoneMatch, _callback);
        return localVarCall;

    }

    /**
     * Get war information Return details about a war --- This route is cached
     * for up to 3600 seconds
     * 
     * @param warId
     *            ID for a war (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @return WarResponse
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public WarResponse getWarsWarId(Integer warId, String datasource, String ifNoneMatch) throws ApiException {
        ApiResponse<WarResponse> localVarResp = getWarsWarIdWithHttpInfo(warId, datasource, ifNoneMatch);
        return localVarResp.getData();
    }

    /**
     * Get war information Return details about a war --- This route is cached
     * for up to 3600 seconds
     * 
     * @param warId
     *            ID for a war (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @return ApiResponse&lt;WarResponse&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<WarResponse> getWarsWarIdWithHttpInfo(Integer warId, String datasource, String ifNoneMatch)
            throws ApiException {
        okhttp3.Call localVarCall = getWarsWarIdValidateBeforeCall(warId, datasource, ifNoneMatch, null);
        Type localVarReturnType = new TypeToken<WarResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get war information (asynchronously) Return details about a war --- This
     * route is cached for up to 3600 seconds
     * 
     * @param warId
     *            ID for a war (required)
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
    public okhttp3.Call getWarsWarIdAsync(Integer warId, String datasource, String ifNoneMatch,
            final ApiCallback<WarResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getWarsWarIdValidateBeforeCall(warId, datasource, ifNoneMatch, _callback);
        Type localVarReturnType = new TypeToken<WarResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for getWarsWarIdKillmails
     * 
     * @param warId
     *            A valid war ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param page
     *            Which page of results to return (optional, default to 1)
     * @param _callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public okhttp3.Call getWarsWarIdKillmailsCall(Integer warId, String datasource, String ifNoneMatch, Integer page,
            final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v1/wars/{war_id}/killmails/".replaceAll("\\{" + "war_id" + "\\}",
                localVarApiClient.escapeString(warId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("datasource", datasource));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
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
    private okhttp3.Call getWarsWarIdKillmailsValidateBeforeCall(Integer warId, String datasource, String ifNoneMatch,
            Integer page, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'warId' is set
        if (warId == null) {
            throw new ApiException("Missing the required parameter 'warId' when calling getWarsWarIdKillmails(Async)");
        }

        okhttp3.Call localVarCall = getWarsWarIdKillmailsCall(warId, datasource, ifNoneMatch, page, _callback);
        return localVarCall;

    }

    /**
     * List kills for a war Return a list of kills related to a war --- This
     * route is cached for up to 3600 seconds
     * 
     * @param warId
     *            A valid war ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param page
     *            Which page of results to return (optional, default to 1)
     * @return List&lt;WarKillmailsResponse&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public List<WarKillmailsResponse> getWarsWarIdKillmails(Integer warId, String datasource, String ifNoneMatch,
            Integer page) throws ApiException {
        ApiResponse<List<WarKillmailsResponse>> localVarResp = getWarsWarIdKillmailsWithHttpInfo(warId, datasource,
                ifNoneMatch, page);
        return localVarResp.getData();
    }

    /**
     * List kills for a war Return a list of kills related to a war --- This
     * route is cached for up to 3600 seconds
     * 
     * @param warId
     *            A valid war ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param page
     *            Which page of results to return (optional, default to 1)
     * @return ApiResponse&lt;List&lt;WarKillmailsResponse&gt;&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<List<WarKillmailsResponse>> getWarsWarIdKillmailsWithHttpInfo(Integer warId, String datasource,
            String ifNoneMatch, Integer page) throws ApiException {
        okhttp3.Call localVarCall = getWarsWarIdKillmailsValidateBeforeCall(warId, datasource, ifNoneMatch, page, null);
        Type localVarReturnType = new TypeToken<List<WarKillmailsResponse>>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List kills for a war (asynchronously) Return a list of kills related to a
     * war --- This route is cached for up to 3600 seconds
     * 
     * @param warId
     *            A valid war ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param page
     *            Which page of results to return (optional, default to 1)
     * @param _callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public okhttp3.Call getWarsWarIdKillmailsAsync(Integer warId, String datasource, String ifNoneMatch, Integer page,
            final ApiCallback<List<WarKillmailsResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getWarsWarIdKillmailsValidateBeforeCall(warId, datasource, ifNoneMatch, page,
                _callback);
        Type localVarReturnType = new TypeToken<List<WarKillmailsResponse>>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
