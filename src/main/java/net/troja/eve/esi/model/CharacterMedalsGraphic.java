/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * The version of the OpenAPI document: 1.11
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
 * graphic object
 */
@ApiModel(description = "graphic object")
public class CharacterMedalsGraphic implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_COLOR = "color";
    @SerializedName(SERIALIZED_NAME_COLOR)
    private Integer color;

    public static final String SERIALIZED_NAME_GRAPHIC = "graphic";
    @SerializedName(SERIALIZED_NAME_GRAPHIC)
    private String graphic;

    public static final String SERIALIZED_NAME_LAYER = "layer";
    @SerializedName(SERIALIZED_NAME_LAYER)
    private Integer layer;

    public static final String SERIALIZED_NAME_PART = "part";
    @SerializedName(SERIALIZED_NAME_PART)
    private Integer part;

    public CharacterMedalsGraphic color(Integer color) {

        this.color = color;
        return this;
    }

    /**
     * color integer
     * 
     * @return color
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "color integer")
    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public CharacterMedalsGraphic graphic(String graphic) {

        this.graphic = graphic;
        return this;
    }

    /**
     * graphic string
     * 
     * @return graphic
     **/
    @ApiModelProperty(required = true, value = "graphic string")
    public String getGraphic() {
        return graphic;
    }

    public void setGraphic(String graphic) {
        this.graphic = graphic;
    }

    public CharacterMedalsGraphic layer(Integer layer) {

        this.layer = layer;
        return this;
    }

    /**
     * layer integer
     * 
     * @return layer
     **/
    @ApiModelProperty(required = true, value = "layer integer")
    public Integer getLayer() {
        return layer;
    }

    public void setLayer(Integer layer) {
        this.layer = layer;
    }

    public CharacterMedalsGraphic part(Integer part) {

        this.part = part;
        return this;
    }

    /**
     * part integer
     * 
     * @return part
     **/
    @ApiModelProperty(required = true, value = "part integer")
    public Integer getPart() {
        return part;
    }

    public void setPart(Integer part) {
        this.part = part;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterMedalsGraphic characterMedalsGraphic = (CharacterMedalsGraphic) o;
        return Objects.equals(this.color, characterMedalsGraphic.color)
                && Objects.equals(this.graphic, characterMedalsGraphic.graphic)
                && Objects.equals(this.layer, characterMedalsGraphic.layer)
                && Objects.equals(this.part, characterMedalsGraphic.part);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, graphic, layer, part);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterMedalsGraphic {\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    graphic: ").append(toIndentedString(graphic)).append("\n");
        sb.append("    layer: ").append(toIndentedString(layer)).append("\n");
        sb.append("    part: ").append(toIndentedString(part)).append("\n");
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
