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
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class FactionWarfareWarsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_AGAINST_ID = "against_id";
    @SerializedName(SERIALIZED_NAME_AGAINST_ID)
    private Integer againstId;

    public static final String SERIALIZED_NAME_FACTION_ID = "faction_id";
    @SerializedName(SERIALIZED_NAME_FACTION_ID)
    private Integer factionId;

    public FactionWarfareWarsResponse againstId(Integer againstId) {

        this.againstId = againstId;
        return this;
    }

    /**
     * The faction ID of the enemy faction.
     * 
     * @return againstId
     **/
    @ApiModelProperty(required = true, value = "The faction ID of the enemy faction.")
    public Integer getAgainstId() {
        return againstId;
    }

    public void setAgainstId(Integer againstId) {
        this.againstId = againstId;
    }

    public FactionWarfareWarsResponse factionId(Integer factionId) {

        this.factionId = factionId;
        return this;
    }

    /**
     * faction_id integer
     * 
     * @return factionId
     **/
    @ApiModelProperty(required = true, value = "faction_id integer")
    public Integer getFactionId() {
        return factionId;
    }

    public void setFactionId(Integer factionId) {
        this.factionId = factionId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FactionWarfareWarsResponse factionWarfareWarsResponse = (FactionWarfareWarsResponse) o;
        return Objects.equals(this.againstId, factionWarfareWarsResponse.againstId)
                && Objects.equals(this.factionId, factionWarfareWarsResponse.factionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(againstId, factionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FactionWarfareWarsResponse {\n");
        sb.append("    againstId: ").append(toIndentedString(againstId)).append("\n");
        sb.append("    factionId: ").append(toIndentedString(factionId)).append("\n");
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
