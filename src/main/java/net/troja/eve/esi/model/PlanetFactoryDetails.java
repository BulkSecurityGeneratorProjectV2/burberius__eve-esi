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
 * factory_details object
 */
@ApiModel(description = "factory_details object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlanetFactoryDetails implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_SCHEMATIC_ID = "schematic_id";
    @SerializedName(SERIALIZED_NAME_SCHEMATIC_ID)
    private Integer schematicId;

    public PlanetFactoryDetails() {
    }

    public PlanetFactoryDetails schematicId(Integer schematicId) {

        this.schematicId = schematicId;
        return this;
    }

    /**
     * schematic_id integer
     * 
     * @return schematicId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "schematic_id integer")
    public Integer getSchematicId() {
        return schematicId;
    }

    public void setSchematicId(Integer schematicId) {
        this.schematicId = schematicId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlanetFactoryDetails planetFactoryDetails = (PlanetFactoryDetails) o;
        return Objects.equals(this.schematicId, planetFactoryDetails.schematicId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schematicId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlanetFactoryDetails {\n");
        sb.append("    schematicId: ").append(toIndentedString(schematicId)).append("\n");
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
