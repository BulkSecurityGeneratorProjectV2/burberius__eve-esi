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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class RegionResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_CONSTELLATIONS = "constellations";
    @SerializedName(SERIALIZED_NAME_CONSTELLATIONS)
    private List<Integer> constellations = new ArrayList<>();

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_REGION_ID = "region_id";
    @SerializedName(SERIALIZED_NAME_REGION_ID)
    private Integer regionId;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public RegionResponse constellations(List<Integer> constellations) {
        this.constellations = constellations;
        return this;
    }

    public RegionResponse addConstellationsItem(Integer constellationsItem) {
        this.constellations.add(constellationsItem);
        return this;
    }

    /**
     * constellations array
     * 
     * @return constellations
     **/
    @ApiModelProperty(required = true, value = "constellations array")
    public List<Integer> getConstellations() {
        return constellations;
    }

    public void setConstellations(List<Integer> constellations) {
        this.constellations = constellations;
    }

    public RegionResponse name(String name) {
        this.name = name;
        return this;
    }

    /**
     * name string
     * 
     * @return name
     **/
    @ApiModelProperty(required = true, value = "name string")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RegionResponse regionId(Integer regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * region_id integer
     * 
     * @return regionId
     **/
    @ApiModelProperty(required = true, value = "region_id integer")
    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public RegionResponse description(String description) {
        this.description = description;
        return this;
    }

    /**
     * description string
     * 
     * @return description
     **/
    @ApiModelProperty(value = "description string")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RegionResponse regionResponse = (RegionResponse) o;
        return Objects.equals(this.constellations, regionResponse.constellations)
                && Objects.equals(this.name, regionResponse.name)
                && Objects.equals(this.regionId, regionResponse.regionId)
                && Objects.equals(this.description, regionResponse.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(constellations, name, regionId, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegionResponse {\n");
        sb.append("    constellations: ").append(toIndentedString(constellations)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
