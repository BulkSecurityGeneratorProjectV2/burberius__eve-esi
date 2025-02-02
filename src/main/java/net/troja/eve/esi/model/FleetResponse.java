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
public class FleetResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_IS_FREE_MOVE = "is_free_move";
    @SerializedName(SERIALIZED_NAME_IS_FREE_MOVE)
    private Boolean isFreeMove;

    public static final String SERIALIZED_NAME_IS_REGISTERED = "is_registered";
    @SerializedName(SERIALIZED_NAME_IS_REGISTERED)
    private Boolean isRegistered;

    public static final String SERIALIZED_NAME_IS_VOICE_ENABLED = "is_voice_enabled";
    @SerializedName(SERIALIZED_NAME_IS_VOICE_ENABLED)
    private Boolean isVoiceEnabled;

    public static final String SERIALIZED_NAME_MOTD = "motd";
    @SerializedName(SERIALIZED_NAME_MOTD)
    private String motd;

    public FleetResponse isFreeMove(Boolean isFreeMove) {

        this.isFreeMove = isFreeMove;
        return this;
    }

    /**
     * Is free-move enabled
     * 
     * @return isFreeMove
     **/
    @ApiModelProperty(required = true, value = "Is free-move enabled")
    public Boolean getIsFreeMove() {
        return isFreeMove;
    }

    public void setIsFreeMove(Boolean isFreeMove) {
        this.isFreeMove = isFreeMove;
    }

    public FleetResponse isRegistered(Boolean isRegistered) {

        this.isRegistered = isRegistered;
        return this;
    }

    /**
     * Does the fleet have an active fleet advertisement
     * 
     * @return isRegistered
     **/
    @ApiModelProperty(required = true, value = "Does the fleet have an active fleet advertisement")
    public Boolean getIsRegistered() {
        return isRegistered;
    }

    public void setIsRegistered(Boolean isRegistered) {
        this.isRegistered = isRegistered;
    }

    public FleetResponse isVoiceEnabled(Boolean isVoiceEnabled) {

        this.isVoiceEnabled = isVoiceEnabled;
        return this;
    }

    /**
     * Is EVE Voice enabled
     * 
     * @return isVoiceEnabled
     **/
    @ApiModelProperty(required = true, value = "Is EVE Voice enabled")
    public Boolean getIsVoiceEnabled() {
        return isVoiceEnabled;
    }

    public void setIsVoiceEnabled(Boolean isVoiceEnabled) {
        this.isVoiceEnabled = isVoiceEnabled;
    }

    public FleetResponse motd(String motd) {

        this.motd = motd;
        return this;
    }

    /**
     * Fleet MOTD in CCP flavoured HTML
     * 
     * @return motd
     **/
    @ApiModelProperty(required = true, value = "Fleet MOTD in CCP flavoured HTML")
    public String getMotd() {
        return motd;
    }

    public void setMotd(String motd) {
        this.motd = motd;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FleetResponse fleetResponse = (FleetResponse) o;
        return Objects.equals(this.isFreeMove, fleetResponse.isFreeMove)
                && Objects.equals(this.isRegistered, fleetResponse.isRegistered)
                && Objects.equals(this.isVoiceEnabled, fleetResponse.isVoiceEnabled)
                && Objects.equals(this.motd, fleetResponse.motd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isFreeMove, isRegistered, isVoiceEnabled, motd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FleetResponse {\n");
        sb.append("    isFreeMove: ").append(toIndentedString(isFreeMove)).append("\n");
        sb.append("    isRegistered: ").append(toIndentedString(isRegistered)).append("\n");
        sb.append("    isVoiceEnabled: ").append(toIndentedString(isVoiceEnabled)).append("\n");
        sb.append("    motd: ").append(toIndentedString(motd)).append("\n");
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
