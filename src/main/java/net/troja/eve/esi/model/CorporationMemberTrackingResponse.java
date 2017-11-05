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

package net.troja.eve.esi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CorporationMemberTrackingResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("character_id")
    private Integer characterId = null;

    @JsonProperty("start_date")
    private OffsetDateTime startDate = null;

    @JsonProperty("base_id")
    private Integer baseId = null;

    @JsonProperty("logon_date")
    private OffsetDateTime logonDate = null;

    @JsonProperty("logoff_date")
    private OffsetDateTime logoffDate = null;

    @JsonProperty("location_id")
    private Long locationId = null;

    @JsonProperty("ship_type_id")
    private Integer shipTypeId = null;

    public CorporationMemberTrackingResponse characterId(Integer characterId) {
        this.characterId = characterId;
        return this;
    }

    /**
     * character_id integer
     * 
     * @return characterId
     **/
    @ApiModelProperty(example = "null", required = true, value = "character_id integer")
    public Integer getCharacterId() {
        return characterId;
    }

    public void setCharacterId(Integer characterId) {
        this.characterId = characterId;
    }

    public CorporationMemberTrackingResponse startDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * start_date string
     * 
     * @return startDate
     **/
    @ApiModelProperty(example = "null", value = "start_date string")
    public OffsetDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
    }

    public CorporationMemberTrackingResponse baseId(Integer baseId) {
        this.baseId = baseId;
        return this;
    }

    /**
     * base_id integer
     * 
     * @return baseId
     **/
    @ApiModelProperty(example = "null", value = "base_id integer")
    public Integer getBaseId() {
        return baseId;
    }

    public void setBaseId(Integer baseId) {
        this.baseId = baseId;
    }

    public CorporationMemberTrackingResponse logonDate(OffsetDateTime logonDate) {
        this.logonDate = logonDate;
        return this;
    }

    /**
     * logon_date string
     * 
     * @return logonDate
     **/
    @ApiModelProperty(example = "null", value = "logon_date string")
    public OffsetDateTime getLogonDate() {
        return logonDate;
    }

    public void setLogonDate(OffsetDateTime logonDate) {
        this.logonDate = logonDate;
    }

    public CorporationMemberTrackingResponse logoffDate(OffsetDateTime logoffDate) {
        this.logoffDate = logoffDate;
        return this;
    }

    /**
     * logoff_date string
     * 
     * @return logoffDate
     **/
    @ApiModelProperty(example = "null", value = "logoff_date string")
    public OffsetDateTime getLogoffDate() {
        return logoffDate;
    }

    public void setLogoffDate(OffsetDateTime logoffDate) {
        this.logoffDate = logoffDate;
    }

    public CorporationMemberTrackingResponse locationId(Long locationId) {
        this.locationId = locationId;
        return this;
    }

    /**
     * location_id integer
     * 
     * @return locationId
     **/
    @ApiModelProperty(example = "null", value = "location_id integer")
    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public CorporationMemberTrackingResponse shipTypeId(Integer shipTypeId) {
        this.shipTypeId = shipTypeId;
        return this;
    }

    /**
     * ship_type_id integer
     * 
     * @return shipTypeId
     **/
    @ApiModelProperty(example = "null", value = "ship_type_id integer")
    public Integer getShipTypeId() {
        return shipTypeId;
    }

    public void setShipTypeId(Integer shipTypeId) {
        this.shipTypeId = shipTypeId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationMemberTrackingResponse corporationMemberTrackingResponse = (CorporationMemberTrackingResponse) o;
        return Objects.equals(this.characterId, corporationMemberTrackingResponse.characterId)
                && Objects.equals(this.startDate, corporationMemberTrackingResponse.startDate)
                && Objects.equals(this.baseId, corporationMemberTrackingResponse.baseId)
                && Objects.equals(this.logonDate, corporationMemberTrackingResponse.logonDate)
                && Objects.equals(this.logoffDate, corporationMemberTrackingResponse.logoffDate)
                && Objects.equals(this.locationId, corporationMemberTrackingResponse.locationId)
                && Objects.equals(this.shipTypeId, corporationMemberTrackingResponse.shipTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(characterId, startDate, baseId, logonDate, logoffDate, locationId, shipTypeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationMemberTrackingResponse {\n");

        sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    baseId: ").append(toIndentedString(baseId)).append("\n");
        sb.append("    logonDate: ").append(toIndentedString(logonDate)).append("\n");
        sb.append("    logoffDate: ").append(toIndentedString(logoffDate)).append("\n");
        sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
        sb.append("    shipTypeId: ").append(toIndentedString(shipTypeId)).append("\n");
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
