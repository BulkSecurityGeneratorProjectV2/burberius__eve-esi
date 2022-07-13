/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * The version of the OpenAPI document: 1.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package net.troja.eve.esi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import net.troja.eve.esi.model.FactionWarfareStatsKills;
import net.troja.eve.esi.model.FactionWarfareStatsVictoryPoints;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FactionWarfareStatsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_FACTION_ID = "faction_id";
    @SerializedName(SERIALIZED_NAME_FACTION_ID)
    private Integer factionId;

    public static final String SERIALIZED_NAME_KILLS = "kills";
    @SerializedName(SERIALIZED_NAME_KILLS)
    private FactionWarfareStatsKills kills;

    public static final String SERIALIZED_NAME_PILOTS = "pilots";
    @SerializedName(SERIALIZED_NAME_PILOTS)
    private Integer pilots;

    public static final String SERIALIZED_NAME_SYSTEMS_CONTROLLED = "systems_controlled";
    @SerializedName(SERIALIZED_NAME_SYSTEMS_CONTROLLED)
    private Integer systemsControlled;

    public static final String SERIALIZED_NAME_VICTORY_POINTS = "victory_points";
    @SerializedName(SERIALIZED_NAME_VICTORY_POINTS)
    private FactionWarfareStatsVictoryPoints victoryPoints;

    public FactionWarfareStatsResponse() {
    }

    public FactionWarfareStatsResponse factionId(Integer factionId) {

        this.factionId = factionId;
        return this;
    }

    /**
     * faction_id integer
     * 
     * @return factionId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "faction_id integer")
    public Integer getFactionId() {
        return factionId;
    }

    public void setFactionId(Integer factionId) {
        this.factionId = factionId;
    }

    public FactionWarfareStatsResponse kills(FactionWarfareStatsKills kills) {

        this.kills = kills;
        return this;
    }

    /**
     * Get kills
     * 
     * @return kills
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public FactionWarfareStatsKills getKills() {
        return kills;
    }

    public void setKills(FactionWarfareStatsKills kills) {
        this.kills = kills;
    }

    public FactionWarfareStatsResponse pilots(Integer pilots) {

        this.pilots = pilots;
        return this;
    }

    /**
     * How many pilots fight for the given faction
     * 
     * @return pilots
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "How many pilots fight for the given faction")
    public Integer getPilots() {
        return pilots;
    }

    public void setPilots(Integer pilots) {
        this.pilots = pilots;
    }

    public FactionWarfareStatsResponse systemsControlled(Integer systemsControlled) {

        this.systemsControlled = systemsControlled;
        return this;
    }

    /**
     * The number of solar systems controlled by the given faction
     * 
     * @return systemsControlled
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "The number of solar systems controlled by the given faction")
    public Integer getSystemsControlled() {
        return systemsControlled;
    }

    public void setSystemsControlled(Integer systemsControlled) {
        this.systemsControlled = systemsControlled;
    }

    public FactionWarfareStatsResponse victoryPoints(FactionWarfareStatsVictoryPoints victoryPoints) {

        this.victoryPoints = victoryPoints;
        return this;
    }

    /**
     * Get victoryPoints
     * 
     * @return victoryPoints
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public FactionWarfareStatsVictoryPoints getVictoryPoints() {
        return victoryPoints;
    }

    public void setVictoryPoints(FactionWarfareStatsVictoryPoints victoryPoints) {
        this.victoryPoints = victoryPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FactionWarfareStatsResponse factionWarfareStatsResponse = (FactionWarfareStatsResponse) o;
        return Objects.equals(this.factionId, factionWarfareStatsResponse.factionId)
                && Objects.equals(this.kills, factionWarfareStatsResponse.kills)
                && Objects.equals(this.pilots, factionWarfareStatsResponse.pilots)
                && Objects.equals(this.systemsControlled, factionWarfareStatsResponse.systemsControlled)
                && Objects.equals(this.victoryPoints, factionWarfareStatsResponse.victoryPoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(factionId, kills, pilots, systemsControlled, victoryPoints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FactionWarfareStatsResponse {\n");
        sb.append("    factionId: ").append(toIndentedString(factionId)).append("\n");
        sb.append("    kills: ").append(toIndentedString(kills)).append("\n");
        sb.append("    pilots: ").append(toIndentedString(pilots)).append("\n");
        sb.append("    systemsControlled: ").append(toIndentedString(systemsControlled)).append("\n");
        sb.append("    victoryPoints: ").append(toIndentedString(victoryPoints)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
