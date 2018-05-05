/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package net.troja.eve.esi.api;

import net.troja.eve.esi.ApiException;
import net.troja.eve.esi.model.CharacterFleetResponse;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for FleetsApi
 */
public class FleetsApiTest extends GeneralApiTest {

    private final FleetsApi api = new FleetsApi();

    @Before
    public void setUp() {
        api.setApiClient(apiClient);
    }

    /**
     * Kick fleet member
     *
     * Kick a fleet member --- Alternate route:
     * &#x60;/v1/fleets/{fleet_id}/members/{member_id}/&#x60; Alternate route:
     * &#x60;/legacy/fleets/{fleet_id}/members/{member_id}/&#x60; Alternate
     * route: &#x60;/dev/fleets/{fleet_id}/members/{member_id}/&#x60; SSO Scope:
     * esi-fleets.write_fleet.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    @Ignore("Delete can't be tested")
    public void deleteFleetsFleetIdMembersMemberIdTest() throws ApiException {
    }

    /**
     * Delete fleet squad
     *
     * Delete a fleet squad, only empty squads can be deleted --- Alternate
     * route: &#x60;/v1/fleets/{fleet_id}/squads/{squad_id}/&#x60; Alternate
     * route: &#x60;/legacy/fleets/{fleet_id}/squads/{squad_id}/&#x60; Alternate
     * route: &#x60;/dev/fleets/{fleet_id}/squads/{squad_id}/&#x60; SSO Scope:
     * esi-fleets.write_fleet.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    @Ignore("Delete can't be tested")
    public void deleteFleetsFleetIdSquadsSquadIdTest() throws ApiException {
    }

    /**
     * Delete fleet wing
     *
     * Delete a fleet wing, only empty wings can be deleted. The wing may
     * contain squads, but the squads must be empty --- Alternate route:
     * &#x60;/v1/fleets/{fleet_id}/wings/{wing_id}/&#x60; Alternate route:
     * &#x60;/legacy/fleets/{fleet_id}/wings/{wing_id}/&#x60; Alternate route:
     * &#x60;/dev/fleets/{fleet_id}/wings/{wing_id}/&#x60; SSO Scope:
     * esi-fleets.write_fleet.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    @Ignore("Delete can't be tested")
    public void deleteFleetsFleetIdWingsWingIdTest() throws ApiException {
    }

    /**
     * Get character fleet info
     *
     * Return the fleet ID the character is in, if any.  ---  This route is cached for up to 60 seconds  SSO Scope: esi-fleets.read_fleet.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Can't test because you need to be in fleet")
    public void getCharactersCharacterIdFleetTest() throws ApiException {
        CharacterFleetResponse response = api.getCharactersCharacterIdFleet(characterId, DATASOURCE, null, null, null, null);

        // TODO: test validations
    }

    /**
     * Get fleet information
     *
     * Return details about a fleet --- Alternate route:
     * &#x60;/v1/fleets/{fleet_id}/&#x60; Alternate route:
     * &#x60;/legacy/fleets/{fleet_id}/&#x60; Alternate route:
     * &#x60;/dev/fleets/{fleet_id}/&#x60; --- This route is cached for up to 5
     * seconds SSO Scope: esi-fleets.read_fleet.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    @Ignore("Can't test because of missing fleet id")
    public void getFleetsFleetIdTest() throws ApiException {
    }

    /**
     * Get fleet members
     *
     * Return information about fleet members --- Alternate route:
     * &#x60;/v1/fleets/{fleet_id}/members/&#x60; Alternate route:
     * &#x60;/legacy/fleets/{fleet_id}/members/&#x60; Alternate route:
     * &#x60;/dev/fleets/{fleet_id}/members/&#x60; --- This route is cached for
     * up to 5 seconds SSO Scope: esi-fleets.read_fleet.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    @Ignore("Can't test because of missing fleet id")
    public void getFleetsFleetIdMembersTest() throws ApiException {
    }

    /**
     * Get fleet wings
     *
     * Return information about wings in a fleet --- Alternate route:
     * &#x60;/v1/fleets/{fleet_id}/wings/&#x60; Alternate route:
     * &#x60;/legacy/fleets/{fleet_id}/wings/&#x60; Alternate route:
     * &#x60;/dev/fleets/{fleet_id}/wings/&#x60; --- This route is cached for up
     * to 5 seconds SSO Scope: esi-fleets.read_fleet.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    @Ignore("Can't test because of missing fleet id")
    public void getFleetsFleetIdWingsTest() throws ApiException {
    }

    /**
     * Create fleet invitation
     *
     * Invite a character into the fleet, if a character has a CSPA charge set,
     * it is not possible to invite them to the fleet using ESI --- Alternate
     * route: &#x60;/v1/fleets/{fleet_id}/members/&#x60; Alternate route:
     * &#x60;/legacy/fleets/{fleet_id}/members/&#x60; Alternate route:
     * &#x60;/dev/fleets/{fleet_id}/members/&#x60; SSO Scope:
     * esi-fleets.write_fleet.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    @Ignore("Created can't be tested")
    public void postFleetsFleetIdMembersTest() throws ApiException {
    }

    /**
     * Create fleet wing
     *
     * Create a new wing in a fleet --- Alternate route:
     * &#x60;/v1/fleets/{fleet_id}/wings/&#x60; Alternate route:
     * &#x60;/legacy/fleets/{fleet_id}/wings/&#x60; Alternate route:
     * &#x60;/dev/fleets/{fleet_id}/wings/&#x60; SSO Scope:
     * esi-fleets.write_fleet.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    @Ignore("Created can't be tested")
    public void postFleetsFleetIdWingsTest() throws ApiException {
    }

    /**
     * Create fleet squad
     *
     * Create a new squad in a fleet --- Alternate route:
     * &#x60;/v1/fleets/{fleet_id}/wings/{wing_id}/squads/&#x60; Alternate
     * route: &#x60;/legacy/fleets/{fleet_id}/wings/{wing_id}/squads/&#x60;
     * Alternate route:
     * &#x60;/dev/fleets/{fleet_id}/wings/{wing_id}/squads/&#x60; SSO Scope:
     * esi-fleets.write_fleet.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    @Ignore("Created can't be tested")
    public void postFleetsFleetIdWingsWingIdSquadsTest() throws ApiException {
    }

    /**
     * Update fleet
     *
     * Update settings about a fleet --- Alternate route:
     * &#x60;/v1/fleets/{fleet_id}/&#x60; Alternate route:
     * &#x60;/legacy/fleets/{fleet_id}/&#x60; Alternate route:
     * &#x60;/dev/fleets/{fleet_id}/&#x60; SSO Scope: esi-fleets.write_fleet.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    @Ignore("Update can't be tested")
    public void putFleetsFleetIdTest() throws ApiException {
    }

    /**
     * Move fleet member
     *
     * Move a fleet member around --- Alternate route:
     * &#x60;/v1/fleets/{fleet_id}/members/{member_id}/&#x60; Alternate route:
     * &#x60;/legacy/fleets/{fleet_id}/members/{member_id}/&#x60; Alternate
     * route: &#x60;/dev/fleets/{fleet_id}/members/{member_id}/&#x60; SSO Scope:
     * esi-fleets.write_fleet.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    @Ignore("Move can't be tested")
    public void putFleetsFleetIdMembersMemberIdTest() throws ApiException {
    }

    /**
     * Rename fleet squad
     *
     * Rename a fleet squad --- Alternate route:
     * &#x60;/v1/fleets/{fleet_id}/squads/{squad_id}/&#x60; Alternate route:
     * &#x60;/legacy/fleets/{fleet_id}/squads/{squad_id}/&#x60; Alternate route:
     * &#x60;/dev/fleets/{fleet_id}/squads/{squad_id}/&#x60; SSO Scope:
     * esi-fleets.write_fleet.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    @Ignore("Rename can't be tested")
    public void putFleetsFleetIdSquadsSquadIdTest() throws ApiException {
    }

    /**
     * Rename fleet wing
     *
     * Rename a fleet wing --- Alternate route:
     * &#x60;/v1/fleets/{fleet_id}/wings/{wing_id}/&#x60; Alternate route:
     * &#x60;/legacy/fleets/{fleet_id}/wings/{wing_id}/&#x60; Alternate route:
     * &#x60;/dev/fleets/{fleet_id}/wings/{wing_id}/&#x60; SSO Scope:
     * esi-fleets.write_fleet.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    @Ignore("Rename can't be tested")
    public void putFleetsFleetIdWingsWingIdTest() throws ApiException {
    }

}
