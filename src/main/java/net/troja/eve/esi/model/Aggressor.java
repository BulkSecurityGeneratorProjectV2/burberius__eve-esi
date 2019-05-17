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
import java.io.Serializable;

/**
 * The aggressor corporation or alliance that declared this war, only contains
 * either corporation_id or alliance_id
 */
@ApiModel(description = "The aggressor corporation or alliance that declared this war, only contains either corporation_id or alliance_id")
public class Aggressor implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ALLIANCE_ID = "alliance_id";
    @SerializedName(SERIALIZED_NAME_ALLIANCE_ID)
    private Integer allianceId;

    public static final String SERIALIZED_NAME_CORPORATION_ID = "corporation_id";
    @SerializedName(SERIALIZED_NAME_CORPORATION_ID)
    private Integer corporationId;

    public static final String SERIALIZED_NAME_ISK_DESTROYED = "isk_destroyed";
    @SerializedName(SERIALIZED_NAME_ISK_DESTROYED)
    private Float iskDestroyed;

    public static final String SERIALIZED_NAME_SHIPS_KILLED = "ships_killed";
    @SerializedName(SERIALIZED_NAME_SHIPS_KILLED)
    private Integer shipsKilled;

    public Aggressor allianceId(Integer allianceId) {
        this.allianceId = allianceId;
        return this;
    }

    /**
     * Alliance ID if and only if the aggressor is an alliance
     * 
     * @return allianceId
     **/
    @ApiModelProperty(value = "Alliance ID if and only if the aggressor is an alliance")
    public Integer getAllianceId() {
        return allianceId;
    }

    public void setAllianceId(Integer allianceId) {
        this.allianceId = allianceId;
    }

    public Aggressor corporationId(Integer corporationId) {
        this.corporationId = corporationId;
        return this;
    }

    /**
     * Corporation ID if and only if the aggressor is a corporation
     * 
     * @return corporationId
     **/
    @ApiModelProperty(value = "Corporation ID if and only if the aggressor is a corporation")
    public Integer getCorporationId() {
        return corporationId;
    }

    public void setCorporationId(Integer corporationId) {
        this.corporationId = corporationId;
    }

    public Aggressor iskDestroyed(Float iskDestroyed) {
        this.iskDestroyed = iskDestroyed;
        return this;
    }

    /**
     * ISK value of ships the aggressor has destroyed
     * 
     * @return iskDestroyed
     **/
    @ApiModelProperty(required = true, value = "ISK value of ships the aggressor has destroyed")
    public Float getIskDestroyed() {
        return iskDestroyed;
    }

    public void setIskDestroyed(Float iskDestroyed) {
        this.iskDestroyed = iskDestroyed;
    }

    public Aggressor shipsKilled(Integer shipsKilled) {
        this.shipsKilled = shipsKilled;
        return this;
    }

    /**
     * The number of ships the aggressor has killed
     * 
     * @return shipsKilled
     **/
    @ApiModelProperty(required = true, value = "The number of ships the aggressor has killed")
    public Integer getShipsKilled() {
        return shipsKilled;
    }

    public void setShipsKilled(Integer shipsKilled) {
        this.shipsKilled = shipsKilled;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Aggressor aggressor = (Aggressor) o;
        return Objects.equals(this.allianceId, aggressor.allianceId)
                && Objects.equals(this.corporationId, aggressor.corporationId)
                && Objects.equals(this.iskDestroyed, aggressor.iskDestroyed)
                && Objects.equals(this.shipsKilled, aggressor.shipsKilled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allianceId, corporationId, iskDestroyed, shipsKilled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Aggressor {\n");
        sb.append("    allianceId: ").append(toIndentedString(allianceId)).append("\n");
        sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
        sb.append("    iskDestroyed: ").append(toIndentedString(iskDestroyed)).append("\n");
        sb.append("    shipsKilled: ").append(toIndentedString(shipsKilled)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
