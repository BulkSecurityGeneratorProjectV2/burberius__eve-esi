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
import java.io.Serializable;

/**
 * dogma_attribute object
 */
@ApiModel(description = "dogma_attribute object")
public class TypeDogmaAttribute implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ATTRIBUTE_ID = "attribute_id";
    @SerializedName(SERIALIZED_NAME_ATTRIBUTE_ID)
    private Integer attributeId;

    public static final String SERIALIZED_NAME_VALUE = "value";
    @SerializedName(SERIALIZED_NAME_VALUE)
    private Float value;

    public TypeDogmaAttribute attributeId(Integer attributeId) {

        this.attributeId = attributeId;
        return this;
    }

    /**
     * attribute_id integer
     * 
     * @return attributeId
     **/
    @ApiModelProperty(required = true, value = "attribute_id integer")
    public Integer getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
    }

    public TypeDogmaAttribute value(Float value) {

        this.value = value;
        return this;
    }

    /**
     * value number
     * 
     * @return value
     **/
    @ApiModelProperty(required = true, value = "value number")
    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TypeDogmaAttribute typeDogmaAttribute = (TypeDogmaAttribute) o;
        return Objects.equals(this.attributeId, typeDogmaAttribute.attributeId)
                && Objects.equals(this.value, typeDogmaAttribute.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attributeId, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TypeDogmaAttribute {\n");
        sb.append("    attributeId: ").append(toIndentedString(attributeId)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
