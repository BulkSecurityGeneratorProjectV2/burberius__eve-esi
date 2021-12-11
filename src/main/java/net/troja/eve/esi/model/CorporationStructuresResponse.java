/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * The version of the OpenAPI document: 1.10.1
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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import net.troja.eve.esi.model.StructureService;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CorporationStructuresResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_CORPORATION_ID = "corporation_id";
    @SerializedName(SERIALIZED_NAME_CORPORATION_ID)
    private Integer corporationId;

    public static final String SERIALIZED_NAME_FUEL_EXPIRES = "fuel_expires";
    @SerializedName(SERIALIZED_NAME_FUEL_EXPIRES)
    private OffsetDateTime fuelExpires;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NEXT_REINFORCE_APPLY = "next_reinforce_apply";
    @SerializedName(SERIALIZED_NAME_NEXT_REINFORCE_APPLY)
    private OffsetDateTime nextReinforceApply;

    public static final String SERIALIZED_NAME_NEXT_REINFORCE_HOUR = "next_reinforce_hour";
    @SerializedName(SERIALIZED_NAME_NEXT_REINFORCE_HOUR)
    private Integer nextReinforceHour;

    public static final String SERIALIZED_NAME_PROFILE_ID = "profile_id";
    @SerializedName(SERIALIZED_NAME_PROFILE_ID)
    private Integer profileId;

    public static final String SERIALIZED_NAME_REINFORCE_HOUR = "reinforce_hour";
    @SerializedName(SERIALIZED_NAME_REINFORCE_HOUR)
    private Integer reinforceHour;

    public static final String SERIALIZED_NAME_SERVICES = "services";
    @SerializedName(SERIALIZED_NAME_SERVICES)
    private List<StructureService> services = null;

    /**
     * state string
     */
    @JsonAdapter(StateEnum.Adapter.class)
    public enum StateEnum {
        ANCHOR_VULNERABLE("anchor_vulnerable"),

        ANCHORING("anchoring"),

        ARMOR_REINFORCE("armor_reinforce"),

        ARMOR_VULNERABLE("armor_vulnerable"),

        DEPLOY_VULNERABLE("deploy_vulnerable"),

        FITTING_INVULNERABLE("fitting_invulnerable"),

        HULL_REINFORCE("hull_reinforce"),

        HULL_VULNERABLE("hull_vulnerable"),

        ONLINE_DEPRECATED("online_deprecated"),

        ONLINING_VULNERABLE("onlining_vulnerable"),

        SHIELD_VULNERABLE("shield_vulnerable"),

        UNANCHORED("unanchored"),

        UNKNOWN("unknown");

        private String value;

        StateEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StateEnum fromValue(String value) {
            for (StateEnum b : StateEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<StateEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StateEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StateEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_STATE = "state";
    @SerializedName(SERIALIZED_NAME_STATE)
    private String state;
    private StateEnum stateEnum;

    public static final String SERIALIZED_NAME_STATE_TIMER_END = "state_timer_end";
    @SerializedName(SERIALIZED_NAME_STATE_TIMER_END)
    private OffsetDateTime stateTimerEnd;

    public static final String SERIALIZED_NAME_STATE_TIMER_START = "state_timer_start";
    @SerializedName(SERIALIZED_NAME_STATE_TIMER_START)
    private OffsetDateTime stateTimerStart;

    public static final String SERIALIZED_NAME_STRUCTURE_ID = "structure_id";
    @SerializedName(SERIALIZED_NAME_STRUCTURE_ID)
    private Long structureId;

    public static final String SERIALIZED_NAME_SYSTEM_ID = "system_id";
    @SerializedName(SERIALIZED_NAME_SYSTEM_ID)
    private Integer systemId;

    public static final String SERIALIZED_NAME_TYPE_ID = "type_id";
    @SerializedName(SERIALIZED_NAME_TYPE_ID)
    private Integer typeId;

    public static final String SERIALIZED_NAME_UNANCHORS_AT = "unanchors_at";
    @SerializedName(SERIALIZED_NAME_UNANCHORS_AT)
    private OffsetDateTime unanchorsAt;

    public CorporationStructuresResponse corporationId(Integer corporationId) {

        this.corporationId = corporationId;
        return this;
    }

    /**
     * ID of the corporation that owns the structure
     * 
     * @return corporationId
     **/
    @ApiModelProperty(required = true, value = "ID of the corporation that owns the structure")
    public Integer getCorporationId() {
        return corporationId;
    }

    public void setCorporationId(Integer corporationId) {
        this.corporationId = corporationId;
    }

    public CorporationStructuresResponse fuelExpires(OffsetDateTime fuelExpires) {

        this.fuelExpires = fuelExpires;
        return this;
    }

    /**
     * Date on which the structure will run out of fuel
     * 
     * @return fuelExpires
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Date on which the structure will run out of fuel")
    public OffsetDateTime getFuelExpires() {
        return fuelExpires;
    }

    public void setFuelExpires(OffsetDateTime fuelExpires) {
        this.fuelExpires = fuelExpires;
    }

    public CorporationStructuresResponse name(String name) {

        this.name = name;
        return this;
    }

    /**
     * The structure name
     * 
     * @return name
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The structure name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CorporationStructuresResponse nextReinforceApply(OffsetDateTime nextReinforceApply) {

        this.nextReinforceApply = nextReinforceApply;
        return this;
    }

    /**
     * The date and time when the structure&#39;s newly requested reinforcement
     * times (e.g. next_reinforce_hour and next_reinforce_day) will take effect
     * 
     * @return nextReinforceApply
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The date and time when the structure's newly requested reinforcement times (e.g. next_reinforce_hour and next_reinforce_day) will take effect")
    public OffsetDateTime getNextReinforceApply() {
        return nextReinforceApply;
    }

    public void setNextReinforceApply(OffsetDateTime nextReinforceApply) {
        this.nextReinforceApply = nextReinforceApply;
    }

    public CorporationStructuresResponse nextReinforceHour(Integer nextReinforceHour) {

        this.nextReinforceHour = nextReinforceHour;
        return this;
    }

    /**
     * The requested change to reinforce_hour that will take effect at the time
     * shown by next_reinforce_apply minimum: 0 maximum: 23
     * 
     * @return nextReinforceHour
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The requested change to reinforce_hour that will take effect at the time shown by next_reinforce_apply")
    public Integer getNextReinforceHour() {
        return nextReinforceHour;
    }

    public void setNextReinforceHour(Integer nextReinforceHour) {
        this.nextReinforceHour = nextReinforceHour;
    }

    public CorporationStructuresResponse profileId(Integer profileId) {

        this.profileId = profileId;
        return this;
    }

    /**
     * The id of the ACL profile for this citadel
     * 
     * @return profileId
     **/
    @ApiModelProperty(required = true, value = "The id of the ACL profile for this citadel")
    public Integer getProfileId() {
        return profileId;
    }

    public void setProfileId(Integer profileId) {
        this.profileId = profileId;
    }

    public CorporationStructuresResponse reinforceHour(Integer reinforceHour) {

        this.reinforceHour = reinforceHour;
        return this;
    }

    /**
     * The hour of day that determines the four hour window when the structure
     * will randomly exit its reinforcement periods and become vulnerable to
     * attack against its armor and/or hull. The structure will become
     * vulnerable at a random time that is +/- 2 hours centered on the value of
     * this property minimum: 0 maximum: 23
     * 
     * @return reinforceHour
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The hour of day that determines the four hour window when the structure will randomly exit its reinforcement periods and become vulnerable to attack against its armor and/or hull. The structure will become vulnerable at a random time that is +/- 2 hours centered on the value of this property")
    public Integer getReinforceHour() {
        return reinforceHour;
    }

    public void setReinforceHour(Integer reinforceHour) {
        this.reinforceHour = reinforceHour;
    }

    public CorporationStructuresResponse services(List<StructureService> services) {

        this.services = services;
        return this;
    }

    public CorporationStructuresResponse addServicesItem(StructureService servicesItem) {
        if (this.services == null) {
            this.services = new ArrayList<>();
        }
        this.services.add(servicesItem);
        return this;
    }

    /**
     * Contains a list of service upgrades, and their state
     * 
     * @return services
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Contains a list of service upgrades, and their state")
    public List<StructureService> getServices() {
        return services;
    }

    public void setServices(List<StructureService> services) {
        this.services = services;
    }

    public CorporationStructuresResponse state(StateEnum stateEnum) {

        this.stateEnum = stateEnum;
        return this;
    }

    public CorporationStructuresResponse stateString(String state) {

        this.state = state;
        return this;
    }

    /**
     * state string
     * 
     * @return state
     **/
    @ApiModelProperty(required = true, value = "state string")
    public StateEnum getState() {
        if (stateEnum == null) {
            stateEnum = StateEnum.fromValue(state);
        }
        return stateEnum;
    }

    public String getStateString() {
        return state;
    }

    public void setState(StateEnum stateEnum) {
        this.stateEnum = stateEnum;
    }

    public void setStateString(String state) {
        this.state = state;
    }

    public CorporationStructuresResponse stateTimerEnd(OffsetDateTime stateTimerEnd) {

        this.stateTimerEnd = stateTimerEnd;
        return this;
    }

    /**
     * Date at which the structure will move to it&#39;s next state
     * 
     * @return stateTimerEnd
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Date at which the structure will move to it's next state")
    public OffsetDateTime getStateTimerEnd() {
        return stateTimerEnd;
    }

    public void setStateTimerEnd(OffsetDateTime stateTimerEnd) {
        this.stateTimerEnd = stateTimerEnd;
    }

    public CorporationStructuresResponse stateTimerStart(OffsetDateTime stateTimerStart) {

        this.stateTimerStart = stateTimerStart;
        return this;
    }

    /**
     * Date at which the structure entered it&#39;s current state
     * 
     * @return stateTimerStart
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Date at which the structure entered it's current state")
    public OffsetDateTime getStateTimerStart() {
        return stateTimerStart;
    }

    public void setStateTimerStart(OffsetDateTime stateTimerStart) {
        this.stateTimerStart = stateTimerStart;
    }

    public CorporationStructuresResponse structureId(Long structureId) {

        this.structureId = structureId;
        return this;
    }

    /**
     * The Item ID of the structure
     * 
     * @return structureId
     **/
    @ApiModelProperty(required = true, value = "The Item ID of the structure")
    public Long getStructureId() {
        return structureId;
    }

    public void setStructureId(Long structureId) {
        this.structureId = structureId;
    }

    public CorporationStructuresResponse systemId(Integer systemId) {

        this.systemId = systemId;
        return this;
    }

    /**
     * The solar system the structure is in
     * 
     * @return systemId
     **/
    @ApiModelProperty(required = true, value = "The solar system the structure is in")
    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    public CorporationStructuresResponse typeId(Integer typeId) {

        this.typeId = typeId;
        return this;
    }

    /**
     * The type id of the structure
     * 
     * @return typeId
     **/
    @ApiModelProperty(required = true, value = "The type id of the structure")
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public CorporationStructuresResponse unanchorsAt(OffsetDateTime unanchorsAt) {

        this.unanchorsAt = unanchorsAt;
        return this;
    }

    /**
     * Date at which the structure will unanchor
     * 
     * @return unanchorsAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Date at which the structure will unanchor")
    public OffsetDateTime getUnanchorsAt() {
        return unanchorsAt;
    }

    public void setUnanchorsAt(OffsetDateTime unanchorsAt) {
        this.unanchorsAt = unanchorsAt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationStructuresResponse corporationStructuresResponse = (CorporationStructuresResponse) o;
        return Objects.equals(this.corporationId, corporationStructuresResponse.corporationId)
                && Objects.equals(this.fuelExpires, corporationStructuresResponse.fuelExpires)
                && Objects.equals(this.name, corporationStructuresResponse.name)
                && Objects.equals(this.nextReinforceApply, corporationStructuresResponse.nextReinforceApply)
                && Objects.equals(this.nextReinforceHour, corporationStructuresResponse.nextReinforceHour)
                && Objects.equals(this.profileId, corporationStructuresResponse.profileId)
                && Objects.equals(this.reinforceHour, corporationStructuresResponse.reinforceHour)
                && Objects.equals(this.services, corporationStructuresResponse.services)
                && Objects.equals(this.state, corporationStructuresResponse.state)
                && Objects.equals(this.stateTimerEnd, corporationStructuresResponse.stateTimerEnd)
                && Objects.equals(this.stateTimerStart, corporationStructuresResponse.stateTimerStart)
                && Objects.equals(this.structureId, corporationStructuresResponse.structureId)
                && Objects.equals(this.systemId, corporationStructuresResponse.systemId)
                && Objects.equals(this.typeId, corporationStructuresResponse.typeId)
                && Objects.equals(this.unanchorsAt, corporationStructuresResponse.unanchorsAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(corporationId, fuelExpires, name, nextReinforceApply, nextReinforceHour, profileId,
                reinforceHour, services, state, stateTimerEnd, stateTimerStart, structureId, systemId, typeId,
                unanchorsAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationStructuresResponse {\n");
        sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
        sb.append("    fuelExpires: ").append(toIndentedString(fuelExpires)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nextReinforceApply: ").append(toIndentedString(nextReinforceApply)).append("\n");
        sb.append("    nextReinforceHour: ").append(toIndentedString(nextReinforceHour)).append("\n");
        sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
        sb.append("    reinforceHour: ").append(toIndentedString(reinforceHour)).append("\n");
        sb.append("    services: ").append(toIndentedString(services)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    stateTimerEnd: ").append(toIndentedString(stateTimerEnd)).append("\n");
        sb.append("    stateTimerStart: ").append(toIndentedString(stateTimerStart)).append("\n");
        sb.append("    structureId: ").append(toIndentedString(structureId)).append("\n");
        sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
        sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
        sb.append("    unanchorsAt: ").append(toIndentedString(unanchorsAt)).append("\n");
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
