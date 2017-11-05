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
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class FactionsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("faction_id")
    private Integer factionId = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("solar_system_id")
    private Integer solarSystemId = null;

    @JsonProperty("corporation_id")
    private Integer corporationId = null;

    @JsonProperty("militia_corporation_id")
    private Integer militiaCorporationId = null;

    @JsonProperty("size_factor")
    private Float sizeFactor = null;

    @JsonProperty("station_count")
    private Integer stationCount = null;

    @JsonProperty("station_system_count")
    private Integer stationSystemCount = null;

    @JsonProperty("is_unique")
    private Boolean isUnique = null;

    public FactionsResponse factionId(Integer factionId) {
        this.factionId = factionId;
        return this;
    }

    /**
     * faction_id integer
     * 
     * @return factionId
     **/
    @ApiModelProperty(example = "null", required = true, value = "faction_id integer")
    public Integer getFactionId() {
        return factionId;
    }

    public void setFactionId(Integer factionId) {
        this.factionId = factionId;
    }

    public FactionsResponse name(String name) {
        this.name = name;
        return this;
    }

    /**
     * name string
     * 
     * @return name
     **/
    @ApiModelProperty(example = "null", required = true, value = "name string")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FactionsResponse description(String description) {
        this.description = description;
        return this;
    }

    /**
     * description string
     * 
     * @return description
     **/
    @ApiModelProperty(example = "null", required = true, value = "description string")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FactionsResponse solarSystemId(Integer solarSystemId) {
        this.solarSystemId = solarSystemId;
        return this;
    }

    /**
     * solar_system_id integer
     * 
     * @return solarSystemId
     **/
    @ApiModelProperty(example = "null", required = true, value = "solar_system_id integer")
    public Integer getSolarSystemId() {
        return solarSystemId;
    }

    public void setSolarSystemId(Integer solarSystemId) {
        this.solarSystemId = solarSystemId;
    }

    public FactionsResponse corporationId(Integer corporationId) {
        this.corporationId = corporationId;
        return this;
    }

    /**
     * corporation_id integer
     * 
     * @return corporationId
     **/
    @ApiModelProperty(example = "null", required = true, value = "corporation_id integer")
    public Integer getCorporationId() {
        return corporationId;
    }

    public void setCorporationId(Integer corporationId) {
        this.corporationId = corporationId;
    }

    public FactionsResponse militiaCorporationId(Integer militiaCorporationId) {
        this.militiaCorporationId = militiaCorporationId;
        return this;
    }

    /**
     * militia_corporation_id integer
     * 
     * @return militiaCorporationId
     **/
    @ApiModelProperty(example = "null", value = "militia_corporation_id integer")
    public Integer getMilitiaCorporationId() {
        return militiaCorporationId;
    }

    public void setMilitiaCorporationId(Integer militiaCorporationId) {
        this.militiaCorporationId = militiaCorporationId;
    }

    public FactionsResponse sizeFactor(Float sizeFactor) {
        this.sizeFactor = sizeFactor;
        return this;
    }

    /**
     * size_factor number
     * 
     * @return sizeFactor
     **/
    @ApiModelProperty(example = "null", required = true, value = "size_factor number")
    public Float getSizeFactor() {
        return sizeFactor;
    }

    public void setSizeFactor(Float sizeFactor) {
        this.sizeFactor = sizeFactor;
    }

    public FactionsResponse stationCount(Integer stationCount) {
        this.stationCount = stationCount;
        return this;
    }

    /**
     * station_count integer
     * 
     * @return stationCount
     **/
    @ApiModelProperty(example = "null", required = true, value = "station_count integer")
    public Integer getStationCount() {
        return stationCount;
    }

    public void setStationCount(Integer stationCount) {
        this.stationCount = stationCount;
    }

    public FactionsResponse stationSystemCount(Integer stationSystemCount) {
        this.stationSystemCount = stationSystemCount;
        return this;
    }

    /**
     * station_system_count integer
     * 
     * @return stationSystemCount
     **/
    @ApiModelProperty(example = "null", required = true, value = "station_system_count integer")
    public Integer getStationSystemCount() {
        return stationSystemCount;
    }

    public void setStationSystemCount(Integer stationSystemCount) {
        this.stationSystemCount = stationSystemCount;
    }

    public FactionsResponse isUnique(Boolean isUnique) {
        this.isUnique = isUnique;
        return this;
    }

    /**
     * is_unique boolean
     * 
     * @return isUnique
     **/
    @ApiModelProperty(example = "null", required = true, value = "is_unique boolean")
    public Boolean getIsUnique() {
        return isUnique;
    }

    public void setIsUnique(Boolean isUnique) {
        this.isUnique = isUnique;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FactionsResponse factionsResponse = (FactionsResponse) o;
        return Objects.equals(this.factionId, factionsResponse.factionId)
                && Objects.equals(this.name, factionsResponse.name)
                && Objects.equals(this.description, factionsResponse.description)
                && Objects.equals(this.solarSystemId, factionsResponse.solarSystemId)
                && Objects.equals(this.corporationId, factionsResponse.corporationId)
                && Objects.equals(this.militiaCorporationId, factionsResponse.militiaCorporationId)
                && Objects.equals(this.sizeFactor, factionsResponse.sizeFactor)
                && Objects.equals(this.stationCount, factionsResponse.stationCount)
                && Objects.equals(this.stationSystemCount, factionsResponse.stationSystemCount)
                && Objects.equals(this.isUnique, factionsResponse.isUnique);
    }

    @Override
    public int hashCode() {
        return Objects.hash(factionId, name, description, solarSystemId, corporationId, militiaCorporationId,
                sizeFactor, stationCount, stationSystemCount, isUnique);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FactionsResponse {\n");

        sb.append("    factionId: ").append(toIndentedString(factionId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    solarSystemId: ").append(toIndentedString(solarSystemId)).append("\n");
        sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
        sb.append("    militiaCorporationId: ").append(toIndentedString(militiaCorporationId)).append("\n");
        sb.append("    sizeFactor: ").append(toIndentedString(sizeFactor)).append("\n");
        sb.append("    stationCount: ").append(toIndentedString(stationCount)).append("\n");
        sb.append("    stationSystemCount: ").append(toIndentedString(stationSystemCount)).append("\n");
        sb.append("    isUnique: ").append(toIndentedString(isUnique)).append("\n");
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
