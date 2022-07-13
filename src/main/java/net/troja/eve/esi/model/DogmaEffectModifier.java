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
 * modifier object
 */
@ApiModel(description = "modifier object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DogmaEffectModifier implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_DOMAIN = "domain";
    @SerializedName(SERIALIZED_NAME_DOMAIN)
    private String domain;

    public static final String SERIALIZED_NAME_EFFECT_ID = "effect_id";
    @SerializedName(SERIALIZED_NAME_EFFECT_ID)
    private Integer effectId;

    public static final String SERIALIZED_NAME_FUNC = "func";
    @SerializedName(SERIALIZED_NAME_FUNC)
    private String func;

    public static final String SERIALIZED_NAME_MODIFIED_ATTRIBUTE_ID = "modified_attribute_id";
    @SerializedName(SERIALIZED_NAME_MODIFIED_ATTRIBUTE_ID)
    private Integer modifiedAttributeId;

    public static final String SERIALIZED_NAME_MODIFYING_ATTRIBUTE_ID = "modifying_attribute_id";
    @SerializedName(SERIALIZED_NAME_MODIFYING_ATTRIBUTE_ID)
    private Integer modifyingAttributeId;

    public static final String SERIALIZED_NAME_OPERATOR = "operator";
    @SerializedName(SERIALIZED_NAME_OPERATOR)
    private Integer operator;

    public DogmaEffectModifier() {
    }

    public DogmaEffectModifier domain(String domain) {

        this.domain = domain;
        return this;
    }

    /**
     * domain string
     * 
     * @return domain
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "domain string")
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public DogmaEffectModifier effectId(Integer effectId) {

        this.effectId = effectId;
        return this;
    }

    /**
     * effect_id integer
     * 
     * @return effectId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "effect_id integer")
    public Integer getEffectId() {
        return effectId;
    }

    public void setEffectId(Integer effectId) {
        this.effectId = effectId;
    }

    public DogmaEffectModifier func(String func) {

        this.func = func;
        return this;
    }

    /**
     * func string
     * 
     * @return func
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "func string")
    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func;
    }

    public DogmaEffectModifier modifiedAttributeId(Integer modifiedAttributeId) {

        this.modifiedAttributeId = modifiedAttributeId;
        return this;
    }

    /**
     * modified_attribute_id integer
     * 
     * @return modifiedAttributeId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "modified_attribute_id integer")
    public Integer getModifiedAttributeId() {
        return modifiedAttributeId;
    }

    public void setModifiedAttributeId(Integer modifiedAttributeId) {
        this.modifiedAttributeId = modifiedAttributeId;
    }

    public DogmaEffectModifier modifyingAttributeId(Integer modifyingAttributeId) {

        this.modifyingAttributeId = modifyingAttributeId;
        return this;
    }

    /**
     * modifying_attribute_id integer
     * 
     * @return modifyingAttributeId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "modifying_attribute_id integer")
    public Integer getModifyingAttributeId() {
        return modifyingAttributeId;
    }

    public void setModifyingAttributeId(Integer modifyingAttributeId) {
        this.modifyingAttributeId = modifyingAttributeId;
    }

    public DogmaEffectModifier operator(Integer operator) {

        this.operator = operator;
        return this;
    }

    /**
     * operator integer
     * 
     * @return operator
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "operator integer")
    public Integer getOperator() {
        return operator;
    }

    public void setOperator(Integer operator) {
        this.operator = operator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DogmaEffectModifier dogmaEffectModifier = (DogmaEffectModifier) o;
        return Objects.equals(this.domain, dogmaEffectModifier.domain)
                && Objects.equals(this.effectId, dogmaEffectModifier.effectId)
                && Objects.equals(this.func, dogmaEffectModifier.func)
                && Objects.equals(this.modifiedAttributeId, dogmaEffectModifier.modifiedAttributeId)
                && Objects.equals(this.modifyingAttributeId, dogmaEffectModifier.modifyingAttributeId)
                && Objects.equals(this.operator, dogmaEffectModifier.operator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, effectId, func, modifiedAttributeId, modifyingAttributeId, operator);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DogmaEffectModifier {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    effectId: ").append(toIndentedString(effectId)).append("\n");
        sb.append("    func: ").append(toIndentedString(func)).append("\n");
        sb.append("    modifiedAttributeId: ").append(toIndentedString(modifiedAttributeId)).append("\n");
        sb.append("    modifyingAttributeId: ").append(toIndentedString(modifyingAttributeId)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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
