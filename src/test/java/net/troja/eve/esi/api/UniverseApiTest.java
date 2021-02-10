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

import java.util.ArrayList;
import java.util.List;
import net.troja.eve.esi.ApiException;
import net.troja.eve.esi.model.BloodlinesResponse;
import net.troja.eve.esi.model.CategoryResponse;
import net.troja.eve.esi.model.ConstellationResponse;
import net.troja.eve.esi.model.FactionsResponse;
import net.troja.eve.esi.model.GraphicResponse;
import net.troja.eve.esi.model.GroupResponse;
import net.troja.eve.esi.model.MoonResponse;
import net.troja.eve.esi.model.PlanetResponse;
import net.troja.eve.esi.model.RacesResponse;
import net.troja.eve.esi.model.RegionResponse;
import net.troja.eve.esi.model.StarResponse;
import net.troja.eve.esi.model.StargateResponse;
import net.troja.eve.esi.model.StationResponse;
import net.troja.eve.esi.model.SystemJumpsResponse;
import net.troja.eve.esi.model.SystemKillsResponse;
import net.troja.eve.esi.model.SystemResponse;
import net.troja.eve.esi.model.TypeResponse;
import net.troja.eve.esi.model.UniverseAncestriesResponse;
import net.troja.eve.esi.model.UniverseAsteroidBeltsResponse;
import net.troja.eve.esi.model.UniverseIdsResponse;
import net.troja.eve.esi.model.UniverseNamesResponse;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for UniverseApi
 */
public class UniverseApiTest extends GeneralApiTest {

    private final UniverseApi api = new UniverseApi();

    /**
     * Get ancestries
     *
     * Get all character ancestries  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniverseAncestriesTest() throws ApiException {
        List<UniverseAncestriesResponse> response = api.getUniverseAncestries(LANGUAGE, DATASOURCE, null, LANGUAGE);

        assertThat(response.size(), equalTo(43));
        final UniverseAncestriesResponse ancestriesResponse = response.get(0);
        assertThat(ancestriesResponse.getBloodlineId(), greaterThan(0));
    }

    /**
     * Get asteroid belt information
     *
     * Get information on an asteroid belt  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniverseAsteroidBeltsAsteroidBeltIdTest() throws ApiException {
        Integer asteroidBeltId = 40000018;
        UniverseAsteroidBeltsResponse response = api.getUniverseAsteroidBeltsAsteroidBeltId(asteroidBeltId, DATASOURCE, null);
        assertThat(response, notNullValue());
        assertThat(response.getSystemId(), equalTo(30000001));
    }

    /**
     * Get bloodlines
     *
     * Get a list of bloodlines  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getUniverseBloodlinesTest() throws ApiException {
        final List<BloodlinesResponse> response = api.getUniverseBloodlines(LANGUAGE, DATASOURCE, null, LANGUAGE);

        assertThat(response.size(), equalTo(18));
        final BloodlinesResponse bloodlinesResponse = response.get(0);
        assertThat(bloodlinesResponse.getBloodlineId(), greaterThan(0));
    }

    /**
     * Get item categories
     *
     * Get a list of item categories  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getUniverseCategoriesTest() throws ApiException {
        final List<Integer> response = api.getUniverseCategories(DATASOURCE, null);

        assertThat(response.size(), equalTo(43));
    }

    /**
     * Get item category information
     *
     * Get information of an item category  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getUniverseCategoriesCategoryIdTest() throws ApiException {
        final Integer categoryId = 8;
        final CategoryResponse response = api.getUniverseCategoriesCategoryId(categoryId, LANGUAGE, DATASOURCE, null, LANGUAGE);

        assertThat(response.getName(), equalTo("Charge"));
    }

    /**
     * Get constellations
     *
     * Get a list of constellations  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getUniverseConstellationsTest() throws ApiException {
        final List<Integer> response = api.getUniverseConstellations(DATASOURCE, null);

        assertThat(response.size(), equalTo(1149));
    }

    /**
     * Get constellation information
     *
     * Get information on a constellation  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getUniverseConstellationsConstellationIdTest() throws ApiException {
        final Integer constellationId = 20000006;
        final ConstellationResponse response = api.getUniverseConstellationsConstellationId(constellationId, LANGUAGE, DATASOURCE, null, LANGUAGE);

        assertThat(response.getName(), equalTo("Sazdih"));
    }

    /**
     * Get factions
     *
     * Get a list of factions  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getUniverseFactionsTest() throws ApiException {
        final List<FactionsResponse> response = api.getUniverseFactions(LANGUAGE, DATASOURCE, null, LANGUAGE);

        assertThat(response.size(), equalTo(25));
        final FactionsResponse factionsResponse = response.get(0);
        assertThat(factionsResponse.getName(), equalTo("Minmatar Republic"));
    }

    /**
     * Get graphics
     *
     * Get a list of graphics  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getUniverseGraphicsTest() throws ApiException {
        final List<Integer> response = api.getUniverseGraphics(DATASOURCE, null);

        assertThat(response.size(), greaterThan(0));
    }

    /**
     * Get graphic information
     *
     * Get information on a graphic  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getUniverseGraphicsGraphicIdTest() throws ApiException {
        final Integer graphicId = 1843;
        final GraphicResponse response = api.getUniverseGraphicsGraphicId(graphicId, DATASOURCE, null);

        assertThat(response.getGraphicId(), equalTo(graphicId));
        assertThat(response.getSofFationName(), equalTo("creodron"));
    }

    /**
     * Get item groups
     *
     * Get a list of item groups  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getUniverseGroupsTest() throws ApiException {
        final Integer page = null;
        final List<Integer> response = api.getUniverseGroups(DATASOURCE, null, page);

        assertThat(response.size(), equalTo(1000));
    }

    /**
     * Get item group information
     *
     * Get information on an item group  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getUniverseGroupsGroupIdTest() throws ApiException {
        final Integer groupId = 5;
        final GroupResponse response = api.getUniverseGroupsGroupId(groupId, LANGUAGE, DATASOURCE, null, LANGUAGE);

        assertThat(response.getName(), equalTo("Solar System"));
    }

    /**
     * Get moon information
     *
     * Get information on a moon  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getUniverseMoonsMoonIdTest() throws ApiException {
        final Integer moonId = 40001588;
        final MoonResponse response = api.getUniverseMoonsMoonId(moonId, DATASOURCE, null);

        assertThat(response.getName(), equalTo("Fovihi III - Moon 2"));
    }

    /**
     * Get planet information
     *
     * Get information on a planet  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getUniversePlanetsPlanetIdTest() throws ApiException {
        final Integer planetId = 40001593;
        final PlanetResponse response = api.getUniversePlanetsPlanetId(planetId, DATASOURCE, null);

        assertThat(response.getName(), equalTo("Fovihi V"));
    }

    /**
     * Get character races
     *
     * Get a list of character races  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getUniverseRacesTest() throws ApiException {
        final List<RacesResponse> response = api.getUniverseRaces(LANGUAGE, DATASOURCE, null, LANGUAGE);

        assertThat(response.size(), equalTo(4));
        final RacesResponse racesResponse = response.get(0);
        assertThat(racesResponse.getName(), equalTo("Caldari"));
    }

    /**
     * Get regions
     *
     * Get a list of regions  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getUniverseRegionsTest() throws ApiException {
        final List<Integer> response = api.getUniverseRegions(DATASOURCE, null);

        assertThat(response.size(), equalTo(107));
    }

    /**
     * Get region information
     *
     * Get information on a region  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getUniverseRegionsRegionIdTest() throws ApiException {
        final Integer regionId = REGION_ID_THE_FORGE;
        final RegionResponse response = api.getUniverseRegionsRegionId(regionId, LANGUAGE, DATASOURCE, null, LANGUAGE);

        assertThat(response.getName(), equalTo("The Forge"));
    }

    /**
     * Get stargate information
     *
     * Get information on a stargate  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getUniverseStargatesStargateIdTest() throws ApiException {
        final Integer stargateId = 50000277;
        final StargateResponse response = api.getUniverseStargatesStargateId(stargateId, DATASOURCE, null);

        assertThat(response.getName(), equalTo("Stargate (Kiereend)"));
    }

    /**
     * Get star information
     *
     * Get information on a star  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getUniverseStarsStarIdTest() throws ApiException {
        final int starId = 40001581;
        final StarResponse response = api.getUniverseStarsStarId(starId, DATASOURCE, null);

        assertThat(response.getName(), equalTo("Fovihi - Star"));
    }

    /**
     * Get station information
     *
     * Get information on a station  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getUniverseStationsStationIdTest() throws ApiException {
        final Integer stationId = 60012541;
        final StationResponse response = api.getUniverseStationsStationId(stationId, DATASOURCE, null);

        assertThat(response.getName(), equalTo("Fovihi V - Ammatar Consulate Bureau"));
    }

    /**
     * List all public structures
     *
     * List all public structures  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getUniverseStructuresTest() throws ApiException {
        final List<Long> response = api.getUniverseStructures(DATASOURCE, null, null);

        assertThat(response.size(), greaterThan(0));
    }

    /**
     * Get structure information
     *
     * Returns information on requested structure if you are on the ACL. Otherwise, returns \&quot;Forbidden\&quot; for all inputs.  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    @Ignore("Can't be tested")
    public void getUniverseStructuresStructureIdTest() throws ApiException {
    }

    /**
     * Get system jumps
     *
     * Get the number of jumps in solar systems within the last hour ending at the timestamp of the Last-Modified header, excluding wormhole space. Only systems with jumps will be listed  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getUniverseSystemJumpsTest() throws ApiException {
        final List<SystemJumpsResponse> response = api.getUniverseSystemJumps(DATASOURCE, null);

        assertThat(response.size(), greaterThan(0));
        assertThat(response.get(0).getSystemId(), greaterThan(30000));
    }

    /**
     * Get system kills
     *
     * Get the number of ship, pod and NPC kills per solar system within the last hour ending at the timestamp of the Last-Modified header, excluding wormhole space. Only systems with kills will be listed  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getUniverseSystemKillsTest() throws ApiException {
        final List<SystemKillsResponse> response = api.getUniverseSystemKills(DATASOURCE, null);

        assertThat(response.size(), greaterThan(0));
        assertThat(response.get(0).getSystemId(), greaterThan(30000));
    }

    /**
     * Get solar systems
     *
     * Get a list of solar systems  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getUniverseSystemsTest() throws ApiException {
        final List<Integer> response = api.getUniverseSystems(DATASOURCE, null);

        assertThat(response.size(), equalTo(8285));
    }

    /**
     * Get solar system information
     *
     * Get information on a solar system.  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getUniverseSystemsSystemIdTest() throws ApiException {
        final Integer systemId = 30000023;
        final SystemResponse response = api.getUniverseSystemsSystemId(systemId, LANGUAGE, DATASOURCE, null, LANGUAGE);

        assertThat(response.getName(), equalTo("Fovihi"));
    }

    /**
     * Get types
     *
     * Get information on a solar system.  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getUniverseTypesTest() throws ApiException {
        final Integer page = null;
        final List<Integer> response = api.getUniverseTypes(DATASOURCE, null, page);

        assertThat(response.size(), equalTo(1000));
    }

    /**
     * Get type information
     *
     * Get information on a type  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getUniverseTypesTypeIdTest() throws ApiException {
        final Integer typeId = TYPE_ID_VELDSPAR;
        final TypeResponse response = api.getUniverseTypesTypeId(typeId, LANGUAGE, DATASOURCE, null, LANGUAGE);

        assertThat(response.getName(), equalTo(NAME_VELDSPAR));
    }

    /**
     * Bulk names to IDs
     *
     * Resolve a set of names to IDs in the following categories: agents, alliances, characters, constellations, corporations factions, inventory_types, regions, stations, and systems. Only exact matches will be returned. All names searched for are cached for 12 hours  ---
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postUniverseIdsTest() throws ApiException {
        List<String> names = new ArrayList<>();
        names.add("Aarnaras Wasken"); //Agents
        names.add(ALLIANCE_NAME_TRI); //Alliances
        names.add("GoldenGnu"); //Character
        names.add("Kimotoro"); //Constellations
        names.add(CORPORATION_NAME_TBD); //Corporations
        names.add("Caldari State"); //Factions
        names.add(NAME_VELDSPAR); //Inventory Types
        names.add("The Forge"); //Regions
        //names.add("Jita"); //Systems
        //names.add("Station - Jita IV - Moon 4 - Caldari Navy Assembly Plant"); //Stations

        UniverseIdsResponse response = api.postUniverseIds(names, LANGUAGE, DATASOURCE, LANGUAGE);
        assertThat(response.getAgents().size(), greaterThan(0));
        assertThat(response.getAlliances().size(), greaterThan(0));
        assertThat(response.getCharacters().size(), greaterThan(0));
        assertThat(response.getConstellations().size(), greaterThan(0));
        assertThat(response.getCorporations().size(), greaterThan(0));
        assertThat(response.getFactions().size(), greaterThan(0));
        assertThat(response.getInventoryTypes().size(), greaterThan(0));
        assertThat(response.getRegions().size(), greaterThan(0));
        //assertThat(response.getSystems().size(), greaterThan(0));
        //assertThat(response.getStations().size(), greaterThan(0));
    }

    /**
     * Get names and categories for a set of ID&#39;s
     *
     * Resolve a set of IDs to names and categories. Supported ID&#39;s for resolving are: Characters, Corporations, Alliances, Stations, Solar Systems, Constellations, Regions, Types  ---
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void postUniverseNamesTest() throws ApiException {
        final List<Integer> ids = new ArrayList<>();
        ids.add(CHARACTER_ID_CHRIBBA);
        final List<UniverseNamesResponse> response = api.postUniverseNames(ids, DATASOURCE);

        assertThat(response.size(), equalTo(1));
        final UniverseNamesResponse result = response.get(0);
        assertThat(result.getName(), equalTo(CHARACTER_NAME_CHRIBBA));
    }

}
