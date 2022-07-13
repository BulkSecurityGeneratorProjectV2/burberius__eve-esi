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
 * link object
 */
@ApiModel(description = "link object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlanetLink implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_DESTINATION_PIN_ID = "destination_pin_id";
    @SerializedName(SERIALIZED_NAME_DESTINATION_PIN_ID)
    private Long destinationPinId;

    public static final String SERIALIZED_NAME_LINK_LEVEL = "link_level";
    @SerializedName(SERIALIZED_NAME_LINK_LEVEL)
    private Integer linkLevel;

    public static final String SERIALIZED_NAME_SOURCE_PIN_ID = "source_pin_id";
    @SerializedName(SERIALIZED_NAME_SOURCE_PIN_ID)
    private Long sourcePinId;

    public PlanetLink() {
    }

    public PlanetLink destinationPinId(Long destinationPinId) {

        this.destinationPinId = destinationPinId;
        return this;
    }

    /**
     * destination_pin_id integer
     * 
     * @return destinationPinId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "destination_pin_id integer")
    public Long getDestinationPinId() {
        return destinationPinId;
    }

    public void setDestinationPinId(Long destinationPinId) {
        this.destinationPinId = destinationPinId;
    }

    public PlanetLink linkLevel(Integer linkLevel) {

        this.linkLevel = linkLevel;
        return this;
    }

    /**
     * link_level integer minimum: 0 maximum: 10
     * 
     * @return linkLevel
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "link_level integer")
    public Integer getLinkLevel() {
        return linkLevel;
    }

    public void setLinkLevel(Integer linkLevel) {
        this.linkLevel = linkLevel;
    }

    public PlanetLink sourcePinId(Long sourcePinId) {

        this.sourcePinId = sourcePinId;
        return this;
    }

    /**
     * source_pin_id integer
     * 
     * @return sourcePinId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "source_pin_id integer")
    public Long getSourcePinId() {
        return sourcePinId;
    }

    public void setSourcePinId(Long sourcePinId) {
        this.sourcePinId = sourcePinId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlanetLink planetLink = (PlanetLink) o;
        return Objects.equals(this.destinationPinId, planetLink.destinationPinId)
                && Objects.equals(this.linkLevel, planetLink.linkLevel)
                && Objects.equals(this.sourcePinId, planetLink.sourcePinId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destinationPinId, linkLevel, sourcePinId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlanetLink {\n");
        sb.append("    destinationPinId: ").append(toIndentedString(destinationPinId)).append("\n");
        sb.append("    linkLevel: ").append(toIndentedString(linkLevel)).append("\n");
        sb.append("    sourcePinId: ").append(toIndentedString(sourcePinId)).append("\n");
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
