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
 * dogma_effect object
 */
@ApiModel(description = "dogma_effect object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TypeDogmaEffect implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_EFFECT_ID = "effect_id";
    @SerializedName(SERIALIZED_NAME_EFFECT_ID)
    private Integer effectId;

    public static final String SERIALIZED_NAME_IS_DEFAULT = "is_default";
    @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
    private Boolean isDefault;

    public TypeDogmaEffect() {
    }

    public TypeDogmaEffect effectId(Integer effectId) {

        this.effectId = effectId;
        return this;
    }

    /**
     * effect_id integer
     * 
     * @return effectId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "effect_id integer")
    public Integer getEffectId() {
        return effectId;
    }

    public void setEffectId(Integer effectId) {
        this.effectId = effectId;
    }

    public TypeDogmaEffect isDefault(Boolean isDefault) {

        this.isDefault = isDefault;
        return this;
    }

    /**
     * is_default boolean
     * 
     * @return isDefault
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "is_default boolean")
    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TypeDogmaEffect typeDogmaEffect = (TypeDogmaEffect) o;
        return Objects.equals(this.effectId, typeDogmaEffect.effectId)
                && Objects.equals(this.isDefault, typeDogmaEffect.isDefault);
    }

    @Override
    public int hashCode() {
        return Objects.hash(effectId, isDefault);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TypeDogmaEffect {\n");
        sb.append("    effectId: ").append(toIndentedString(effectId)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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
