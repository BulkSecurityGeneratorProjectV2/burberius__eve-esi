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

import net.troja.eve.esi.model.CharacterCalendarAttendeesResponse;
import net.troja.eve.esi.model.CharacterCalendarEvent;
import net.troja.eve.esi.model.CharacterCalendarEventResponse;
import net.troja.eve.esi.model.CharacterCalendarResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalendarApi {
    private ApiClient localVarApiClient;

    public CalendarApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CalendarApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getCharactersCharacterIdCalendar
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param fromEvent
     *            The event ID to retrieve events from (optional)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param _callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public okhttp3.Call getCharactersCharacterIdCalendarCall(Integer characterId, String datasource, Integer fromEvent,
            String ifNoneMatch, String token, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v1/characters/{character_id}/calendar/".replaceAll("\\{" + "character_id" + "\\}",
                localVarApiClient.escapeString(characterId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("datasource", datasource));
        }

        if (fromEvent != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("from_event", fromEvent));
        }

        if (token != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("token", token));
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

        String[] localVarAuthNames = new String[] { "evesso" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCharactersCharacterIdCalendarValidateBeforeCall(Integer characterId, String datasource,
            Integer fromEvent, String ifNoneMatch, String token, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException(
                    "Missing the required parameter 'characterId' when calling getCharactersCharacterIdCalendar(Async)");
        }

        okhttp3.Call localVarCall = getCharactersCharacterIdCalendarCall(characterId, datasource, fromEvent,
                ifNoneMatch, token, _callback);
        return localVarCall;

    }

    /**
     * List calendar event summaries Get 50 event summaries from the calendar.
     * If no from_event ID is given, the resource will return the next 50
     * chronological event summaries from now. If a from_event ID is specified,
     * it will return the next 50 chronological event summaries from after that
     * event --- This route is cached for up to 5 seconds SSO Scope:
     * esi-calendar.read_calendar_events.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param fromEvent
     *            The event ID to retrieve events from (optional)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @return List&lt;CharacterCalendarResponse&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public List<CharacterCalendarResponse> getCharactersCharacterIdCalendar(Integer characterId, String datasource,
            Integer fromEvent, String ifNoneMatch, String token) throws ApiException {
        ApiResponse<List<CharacterCalendarResponse>> localVarResp = getCharactersCharacterIdCalendarWithHttpInfo(
                characterId, datasource, fromEvent, ifNoneMatch, token);
        return localVarResp.getData();
    }

    /**
     * List calendar event summaries Get 50 event summaries from the calendar.
     * If no from_event ID is given, the resource will return the next 50
     * chronological event summaries from now. If a from_event ID is specified,
     * it will return the next 50 chronological event summaries from after that
     * event --- This route is cached for up to 5 seconds SSO Scope:
     * esi-calendar.read_calendar_events.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param fromEvent
     *            The event ID to retrieve events from (optional)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @return ApiResponse&lt;List&lt;CharacterCalendarResponse&gt;&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<List<CharacterCalendarResponse>> getCharactersCharacterIdCalendarWithHttpInfo(
            Integer characterId, String datasource, Integer fromEvent, String ifNoneMatch, String token)
            throws ApiException {
        okhttp3.Call localVarCall = getCharactersCharacterIdCalendarValidateBeforeCall(characterId, datasource,
                fromEvent, ifNoneMatch, token, null);
        Type localVarReturnType = new TypeToken<List<CharacterCalendarResponse>>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List calendar event summaries (asynchronously) Get 50 event summaries
     * from the calendar. If no from_event ID is given, the resource will return
     * the next 50 chronological event summaries from now. If a from_event ID is
     * specified, it will return the next 50 chronological event summaries from
     * after that event --- This route is cached for up to 5 seconds SSO Scope:
     * esi-calendar.read_calendar_events.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param fromEvent
     *            The event ID to retrieve events from (optional)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param _callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public okhttp3.Call getCharactersCharacterIdCalendarAsync(Integer characterId, String datasource,
            Integer fromEvent, String ifNoneMatch, String token,
            final ApiCallback<List<CharacterCalendarResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCharactersCharacterIdCalendarValidateBeforeCall(characterId, datasource,
                fromEvent, ifNoneMatch, token, _callback);
        Type localVarReturnType = new TypeToken<List<CharacterCalendarResponse>>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for getCharactersCharacterIdCalendarEventId
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param eventId
     *            The id of the event requested (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param _callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public okhttp3.Call getCharactersCharacterIdCalendarEventIdCall(Integer characterId, Integer eventId,
            String datasource, String ifNoneMatch, String token, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v3/characters/{character_id}/calendar/{event_id}/".replaceAll(
                "\\{" + "character_id" + "\\}", localVarApiClient.escapeString(characterId.toString())).replaceAll(
                "\\{" + "event_id" + "\\}", localVarApiClient.escapeString(eventId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("datasource", datasource));
        }

        if (token != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("token", token));
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

        String[] localVarAuthNames = new String[] { "evesso" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCharactersCharacterIdCalendarEventIdValidateBeforeCall(Integer characterId,
            Integer eventId, String datasource, String ifNoneMatch, String token, final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException(
                    "Missing the required parameter 'characterId' when calling getCharactersCharacterIdCalendarEventId(Async)");
        }

        // verify the required parameter 'eventId' is set
        if (eventId == null) {
            throw new ApiException(
                    "Missing the required parameter 'eventId' when calling getCharactersCharacterIdCalendarEventId(Async)");
        }

        okhttp3.Call localVarCall = getCharactersCharacterIdCalendarEventIdCall(characterId, eventId, datasource,
                ifNoneMatch, token, _callback);
        return localVarCall;

    }

    /**
     * Get an event Get all the information for a specific event --- This route
     * is cached for up to 5 seconds SSO Scope:
     * esi-calendar.read_calendar_events.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param eventId
     *            The id of the event requested (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @return CharacterCalendarEventResponse
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public CharacterCalendarEventResponse getCharactersCharacterIdCalendarEventId(Integer characterId, Integer eventId,
            String datasource, String ifNoneMatch, String token) throws ApiException {
        ApiResponse<CharacterCalendarEventResponse> localVarResp = getCharactersCharacterIdCalendarEventIdWithHttpInfo(
                characterId, eventId, datasource, ifNoneMatch, token);
        return localVarResp.getData();
    }

    /**
     * Get an event Get all the information for a specific event --- This route
     * is cached for up to 5 seconds SSO Scope:
     * esi-calendar.read_calendar_events.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param eventId
     *            The id of the event requested (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @return ApiResponse&lt;CharacterCalendarEventResponse&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<CharacterCalendarEventResponse> getCharactersCharacterIdCalendarEventIdWithHttpInfo(
            Integer characterId, Integer eventId, String datasource, String ifNoneMatch, String token)
            throws ApiException {
        okhttp3.Call localVarCall = getCharactersCharacterIdCalendarEventIdValidateBeforeCall(characterId, eventId,
                datasource, ifNoneMatch, token, null);
        Type localVarReturnType = new TypeToken<CharacterCalendarEventResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get an event (asynchronously) Get all the information for a specific
     * event --- This route is cached for up to 5 seconds SSO Scope:
     * esi-calendar.read_calendar_events.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param eventId
     *            The id of the event requested (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param _callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public okhttp3.Call getCharactersCharacterIdCalendarEventIdAsync(Integer characterId, Integer eventId,
            String datasource, String ifNoneMatch, String token,
            final ApiCallback<CharacterCalendarEventResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCharactersCharacterIdCalendarEventIdValidateBeforeCall(characterId, eventId,
                datasource, ifNoneMatch, token, _callback);
        Type localVarReturnType = new TypeToken<CharacterCalendarEventResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for getCharactersCharacterIdCalendarEventIdAttendees
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param eventId
     *            The id of the event requested (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param _callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public okhttp3.Call getCharactersCharacterIdCalendarEventIdAttendeesCall(Integer characterId, Integer eventId,
            String datasource, String ifNoneMatch, String token, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v1/characters/{character_id}/calendar/{event_id}/attendees/".replaceAll(
                "\\{" + "character_id" + "\\}", localVarApiClient.escapeString(characterId.toString())).replaceAll(
                "\\{" + "event_id" + "\\}", localVarApiClient.escapeString(eventId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("datasource", datasource));
        }

        if (token != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("token", token));
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

        String[] localVarAuthNames = new String[] { "evesso" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCharactersCharacterIdCalendarEventIdAttendeesValidateBeforeCall(Integer characterId,
            Integer eventId, String datasource, String ifNoneMatch, String token, final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException(
                    "Missing the required parameter 'characterId' when calling getCharactersCharacterIdCalendarEventIdAttendees(Async)");
        }

        // verify the required parameter 'eventId' is set
        if (eventId == null) {
            throw new ApiException(
                    "Missing the required parameter 'eventId' when calling getCharactersCharacterIdCalendarEventIdAttendees(Async)");
        }

        okhttp3.Call localVarCall = getCharactersCharacterIdCalendarEventIdAttendeesCall(characterId, eventId,
                datasource, ifNoneMatch, token, _callback);
        return localVarCall;

    }

    /**
     * Get attendees Get all invited attendees for a given event --- This route
     * is cached for up to 600 seconds SSO Scope:
     * esi-calendar.read_calendar_events.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param eventId
     *            The id of the event requested (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @return List&lt;CharacterCalendarAttendeesResponse&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public List<CharacterCalendarAttendeesResponse> getCharactersCharacterIdCalendarEventIdAttendees(
            Integer characterId, Integer eventId, String datasource, String ifNoneMatch, String token)
            throws ApiException {
        ApiResponse<List<CharacterCalendarAttendeesResponse>> localVarResp = getCharactersCharacterIdCalendarEventIdAttendeesWithHttpInfo(
                characterId, eventId, datasource, ifNoneMatch, token);
        return localVarResp.getData();
    }

    /**
     * Get attendees Get all invited attendees for a given event --- This route
     * is cached for up to 600 seconds SSO Scope:
     * esi-calendar.read_calendar_events.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param eventId
     *            The id of the event requested (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @return ApiResponse&lt;List&lt;CharacterCalendarAttendeesResponse&gt;&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<List<CharacterCalendarAttendeesResponse>> getCharactersCharacterIdCalendarEventIdAttendeesWithHttpInfo(
            Integer characterId, Integer eventId, String datasource, String ifNoneMatch, String token)
            throws ApiException {
        okhttp3.Call localVarCall = getCharactersCharacterIdCalendarEventIdAttendeesValidateBeforeCall(characterId,
                eventId, datasource, ifNoneMatch, token, null);
        Type localVarReturnType = new TypeToken<List<CharacterCalendarAttendeesResponse>>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get attendees (asynchronously) Get all invited attendees for a given
     * event --- This route is cached for up to 600 seconds SSO Scope:
     * esi-calendar.read_calendar_events.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param eventId
     *            The id of the event requested (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param _callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public okhttp3.Call getCharactersCharacterIdCalendarEventIdAttendeesAsync(Integer characterId, Integer eventId,
            String datasource, String ifNoneMatch, String token,
            final ApiCallback<List<CharacterCalendarAttendeesResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCharactersCharacterIdCalendarEventIdAttendeesValidateBeforeCall(characterId,
                eventId, datasource, ifNoneMatch, token, _callback);
        Type localVarReturnType = new TypeToken<List<CharacterCalendarAttendeesResponse>>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for putCharactersCharacterIdCalendarEventId
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param eventId
     *            The ID of the event requested (required)
     * @param response
     *            (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param _callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public okhttp3.Call putCharactersCharacterIdCalendarEventIdCall(Integer characterId, Integer eventId,
            CharacterCalendarEvent response, String datasource, String token, final ApiCallback _callback)
            throws ApiException {
        Object localVarPostBody = response;

        // create path and map variables
        String localVarPath = "/v3/characters/{character_id}/calendar/{event_id}/".replaceAll(
                "\\{" + "character_id" + "\\}", localVarApiClient.escapeString(characterId.toString())).replaceAll(
                "\\{" + "event_id" + "\\}", localVarApiClient.escapeString(eventId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("datasource", datasource));
        }

        if (token != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("token", token));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {

        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "evesso" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call putCharactersCharacterIdCalendarEventIdValidateBeforeCall(Integer characterId,
            Integer eventId, CharacterCalendarEvent response, String datasource, String token,
            final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException(
                    "Missing the required parameter 'characterId' when calling putCharactersCharacterIdCalendarEventId(Async)");
        }

        // verify the required parameter 'eventId' is set
        if (eventId == null) {
            throw new ApiException(
                    "Missing the required parameter 'eventId' when calling putCharactersCharacterIdCalendarEventId(Async)");
        }

        // verify the required parameter 'response' is set
        if (response == null) {
            throw new ApiException(
                    "Missing the required parameter 'response' when calling putCharactersCharacterIdCalendarEventId(Async)");
        }

        okhttp3.Call localVarCall = putCharactersCharacterIdCalendarEventIdCall(characterId, eventId, response,
                datasource, token, _callback);
        return localVarCall;

    }

    /**
     * Respond to an event Set your response status to an event --- SSO Scope:
     * esi-calendar.respond_calendar_events.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param eventId
     *            The ID of the event requested (required)
     * @param response
     *            (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public void putCharactersCharacterIdCalendarEventId(Integer characterId, Integer eventId,
            CharacterCalendarEvent response, String datasource, String token) throws ApiException {
        putCharactersCharacterIdCalendarEventIdWithHttpInfo(characterId, eventId, response, datasource, token);
    }

    /**
     * Respond to an event Set your response status to an event --- SSO Scope:
     * esi-calendar.respond_calendar_events.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param eventId
     *            The ID of the event requested (required)
     * @param response
     *            (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<Void> putCharactersCharacterIdCalendarEventIdWithHttpInfo(Integer characterId, Integer eventId,
            CharacterCalendarEvent response, String datasource, String token) throws ApiException {
        okhttp3.Call localVarCall = putCharactersCharacterIdCalendarEventIdValidateBeforeCall(characterId, eventId,
                response, datasource, token, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Respond to an event (asynchronously) Set your response status to an event
     * --- SSO Scope: esi-calendar.respond_calendar_events.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param eventId
     *            The ID of the event requested (required)
     * @param response
     *            (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param _callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public okhttp3.Call putCharactersCharacterIdCalendarEventIdAsync(Integer characterId, Integer eventId,
            CharacterCalendarEvent response, String datasource, String token, final ApiCallback<Void> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = putCharactersCharacterIdCalendarEventIdValidateBeforeCall(characterId, eventId,
                response, datasource, token, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
