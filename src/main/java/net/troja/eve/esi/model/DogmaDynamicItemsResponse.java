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
import net.troja.eve.esi.model.DogmaDynamicAttribute;
import net.troja.eve.esi.model.DogmaDynamicEffect;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class DogmaDynamicItemsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_MUTATOR_TYPE_ID = "mutator_type_id";
    @SerializedName(SERIALIZED_NAME_MUTATOR_TYPE_ID)
    private Integer mutatorTypeId;

    public static final String SERIALIZED_NAME_DOGMA_ATTRIBUTES = "dogma_attributes";
    @SerializedName(SERIALIZED_NAME_DOGMA_ATTRIBUTES)
    private List<DogmaDynamicAttribute> dogmaAttributes = new ArrayList<>();

    public static final String SERIALIZED_NAME_SOURCE_TYPE_ID = "source_type_id";
    @SerializedName(SERIALIZED_NAME_SOURCE_TYPE_ID)
    private Integer sourceTypeId;

    public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
    @SerializedName(SERIALIZED_NAME_CREATED_BY)
    private Integer createdBy;

    public static final String SERIALIZED_NAME_DOGMA_EFFECTS = "dogma_effects";
    @SerializedName(SERIALIZED_NAME_DOGMA_EFFECTS)
    private List<DogmaDynamicEffect> dogmaEffects = new ArrayList<>();

    public DogmaDynamicItemsResponse mutatorTypeId(Integer mutatorTypeId) {
        this.mutatorTypeId = mutatorTypeId;
        return this;
    }

    /**
     * The type ID of the mutator used to generate the dynamic item.
     * 
     * @return mutatorTypeId
     **/
    @ApiModelProperty(required = true, value = "The type ID of the mutator used to generate the dynamic item.")
    public Integer getMutatorTypeId() {
        return mutatorTypeId;
    }

    public void setMutatorTypeId(Integer mutatorTypeId) {
        this.mutatorTypeId = mutatorTypeId;
    }

    public DogmaDynamicItemsResponse dogmaAttributes(List<DogmaDynamicAttribute> dogmaAttributes) {
        this.dogmaAttributes = dogmaAttributes;
        return this;
    }

    public DogmaDynamicItemsResponse addDogmaAttributesItem(DogmaDynamicAttribute dogmaAttributesItem) {
        this.dogmaAttributes.add(dogmaAttributesItem);
        return this;
    }

    /**
     * dogma_attributes array
     * 
     * @return dogmaAttributes
     **/
    @ApiModelProperty(required = true, value = "dogma_attributes array")
    public List<DogmaDynamicAttribute> getDogmaAttributes() {
        return dogmaAttributes;
    }

    public void setDogmaAttributes(List<DogmaDynamicAttribute> dogmaAttributes) {
        this.dogmaAttributes = dogmaAttributes;
    }

    public DogmaDynamicItemsResponse sourceTypeId(Integer sourceTypeId) {
        this.sourceTypeId = sourceTypeId;
        return this;
    }

    /**
     * The type ID of the source item the mutator was applied to create the
     * dynamic item.
     * 
     * @return sourceTypeId
     **/
    @ApiModelProperty(required = true, value = "The type ID of the source item the mutator was applied to create the dynamic item.")
    public Integer getSourceTypeId() {
        return sourceTypeId;
    }

    public void setSourceTypeId(Integer sourceTypeId) {
        this.sourceTypeId = sourceTypeId;
    }

    public DogmaDynamicItemsResponse createdBy(Integer createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * The ID of the character who created the item
     * 
     * @return createdBy
     **/
    @ApiModelProperty(required = true, value = "The ID of the character who created the item")
    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public DogmaDynamicItemsResponse dogmaEffects(List<DogmaDynamicEffect> dogmaEffects) {
        this.dogmaEffects = dogmaEffects;
        return this;
    }

    public DogmaDynamicItemsResponse addDogmaEffectsItem(DogmaDynamicEffect dogmaEffectsItem) {
        this.dogmaEffects.add(dogmaEffectsItem);
        return this;
    }

    /**
     * dogma_effects array
     * 
     * @return dogmaEffects
     **/
    @ApiModelProperty(required = true, value = "dogma_effects array")
    public List<DogmaDynamicEffect> getDogmaEffects() {
        return dogmaEffects;
    }

    public void setDogmaEffects(List<DogmaDynamicEffect> dogmaEffects) {
        this.dogmaEffects = dogmaEffects;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DogmaDynamicItemsResponse dogmaDynamicItemsResponse = (DogmaDynamicItemsResponse) o;
        return Objects.equals(this.mutatorTypeId, dogmaDynamicItemsResponse.mutatorTypeId)
                && Objects.equals(this.dogmaAttributes, dogmaDynamicItemsResponse.dogmaAttributes)
                && Objects.equals(this.sourceTypeId, dogmaDynamicItemsResponse.sourceTypeId)
                && Objects.equals(this.createdBy, dogmaDynamicItemsResponse.createdBy)
                && Objects.equals(this.dogmaEffects, dogmaDynamicItemsResponse.dogmaEffects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mutatorTypeId, dogmaAttributes, sourceTypeId, createdBy, dogmaEffects);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DogmaDynamicItemsResponse {\n");
        sb.append("    mutatorTypeId: ").append(toIndentedString(mutatorTypeId)).append("\n");
        sb.append("    dogmaAttributes: ").append(toIndentedString(dogmaAttributes)).append("\n");
        sb.append("    sourceTypeId: ").append(toIndentedString(sourceTypeId)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    dogmaEffects: ").append(toIndentedString(dogmaEffects)).append("\n");
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
