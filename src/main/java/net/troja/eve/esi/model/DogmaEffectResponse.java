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
import java.util.ArrayList;
import java.util.List;
import net.troja.eve.esi.model.DogmaEffectModifier;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DogmaEffectResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_DISALLOW_AUTO_REPEAT = "disallow_auto_repeat";
    @SerializedName(SERIALIZED_NAME_DISALLOW_AUTO_REPEAT)
    private Boolean disallowAutoRepeat;

    public static final String SERIALIZED_NAME_DISCHARGE_ATTRIBUTE_ID = "discharge_attribute_id";
    @SerializedName(SERIALIZED_NAME_DISCHARGE_ATTRIBUTE_ID)
    private Integer dischargeAttributeId;

    public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
    @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
    private String displayName;

    public static final String SERIALIZED_NAME_DURATION_ATTRIBUTE_ID = "duration_attribute_id";
    @SerializedName(SERIALIZED_NAME_DURATION_ATTRIBUTE_ID)
    private Integer durationAttributeId;

    public static final String SERIALIZED_NAME_EFFECT_CATEGORY = "effect_category";
    @SerializedName(SERIALIZED_NAME_EFFECT_CATEGORY)
    private Integer effectCategory;

    public static final String SERIALIZED_NAME_EFFECT_ID = "effect_id";
    @SerializedName(SERIALIZED_NAME_EFFECT_ID)
    private Integer effectId;

    public static final String SERIALIZED_NAME_ELECTRONIC_CHANCE = "electronic_chance";
    @SerializedName(SERIALIZED_NAME_ELECTRONIC_CHANCE)
    private Boolean electronicChance;

    public static final String SERIALIZED_NAME_FALLOFF_ATTRIBUTE_ID = "falloff_attribute_id";
    @SerializedName(SERIALIZED_NAME_FALLOFF_ATTRIBUTE_ID)
    private Integer falloffAttributeId;

    public static final String SERIALIZED_NAME_ICON_ID = "icon_id";
    @SerializedName(SERIALIZED_NAME_ICON_ID)
    private Integer iconId;

    public static final String SERIALIZED_NAME_IS_ASSISTANCE = "is_assistance";
    @SerializedName(SERIALIZED_NAME_IS_ASSISTANCE)
    private Boolean isAssistance;

    public static final String SERIALIZED_NAME_IS_OFFENSIVE = "is_offensive";
    @SerializedName(SERIALIZED_NAME_IS_OFFENSIVE)
    private Boolean isOffensive;

    public static final String SERIALIZED_NAME_IS_WARP_SAFE = "is_warp_safe";
    @SerializedName(SERIALIZED_NAME_IS_WARP_SAFE)
    private Boolean isWarpSafe;

    public static final String SERIALIZED_NAME_MODIFIERS = "modifiers";
    @SerializedName(SERIALIZED_NAME_MODIFIERS)
    private List<DogmaEffectModifier> modifiers = null;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_POST_EXPRESSION = "post_expression";
    @SerializedName(SERIALIZED_NAME_POST_EXPRESSION)
    private Integer postExpression;

    public static final String SERIALIZED_NAME_PRE_EXPRESSION = "pre_expression";
    @SerializedName(SERIALIZED_NAME_PRE_EXPRESSION)
    private Integer preExpression;

    public static final String SERIALIZED_NAME_PUBLISHED = "published";
    @SerializedName(SERIALIZED_NAME_PUBLISHED)
    private Boolean published;

    public static final String SERIALIZED_NAME_RANGE_ATTRIBUTE_ID = "range_attribute_id";
    @SerializedName(SERIALIZED_NAME_RANGE_ATTRIBUTE_ID)
    private Integer rangeAttributeId;

    public static final String SERIALIZED_NAME_RANGE_CHANCE = "range_chance";
    @SerializedName(SERIALIZED_NAME_RANGE_CHANCE)
    private Boolean rangeChance;

    public static final String SERIALIZED_NAME_TRACKING_SPEED_ATTRIBUTE_ID = "tracking_speed_attribute_id";
    @SerializedName(SERIALIZED_NAME_TRACKING_SPEED_ATTRIBUTE_ID)
    private Integer trackingSpeedAttributeId;

    public DogmaEffectResponse() {
    }

    public DogmaEffectResponse description(String description) {

        this.description = description;
        return this;
    }

    /**
     * description string
     * 
     * @return description
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "description string")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DogmaEffectResponse disallowAutoRepeat(Boolean disallowAutoRepeat) {

        this.disallowAutoRepeat = disallowAutoRepeat;
        return this;
    }

    /**
     * disallow_auto_repeat boolean
     * 
     * @return disallowAutoRepeat
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "disallow_auto_repeat boolean")
    public Boolean getDisallowAutoRepeat() {
        return disallowAutoRepeat;
    }

    public void setDisallowAutoRepeat(Boolean disallowAutoRepeat) {
        this.disallowAutoRepeat = disallowAutoRepeat;
    }

    public DogmaEffectResponse dischargeAttributeId(Integer dischargeAttributeId) {

        this.dischargeAttributeId = dischargeAttributeId;
        return this;
    }

    /**
     * discharge_attribute_id integer
     * 
     * @return dischargeAttributeId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "discharge_attribute_id integer")
    public Integer getDischargeAttributeId() {
        return dischargeAttributeId;
    }

    public void setDischargeAttributeId(Integer dischargeAttributeId) {
        this.dischargeAttributeId = dischargeAttributeId;
    }

    public DogmaEffectResponse displayName(String displayName) {

        this.displayName = displayName;
        return this;
    }

    /**
     * display_name string
     * 
     * @return displayName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "display_name string")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public DogmaEffectResponse durationAttributeId(Integer durationAttributeId) {

        this.durationAttributeId = durationAttributeId;
        return this;
    }

    /**
     * duration_attribute_id integer
     * 
     * @return durationAttributeId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "duration_attribute_id integer")
    public Integer getDurationAttributeId() {
        return durationAttributeId;
    }

    public void setDurationAttributeId(Integer durationAttributeId) {
        this.durationAttributeId = durationAttributeId;
    }

    public DogmaEffectResponse effectCategory(Integer effectCategory) {

        this.effectCategory = effectCategory;
        return this;
    }

    /**
     * effect_category integer
     * 
     * @return effectCategory
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "effect_category integer")
    public Integer getEffectCategory() {
        return effectCategory;
    }

    public void setEffectCategory(Integer effectCategory) {
        this.effectCategory = effectCategory;
    }

    public DogmaEffectResponse effectId(Integer effectId) {

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

    public DogmaEffectResponse electronicChance(Boolean electronicChance) {

        this.electronicChance = electronicChance;
        return this;
    }

    /**
     * electronic_chance boolean
     * 
     * @return electronicChance
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "electronic_chance boolean")
    public Boolean getElectronicChance() {
        return electronicChance;
    }

    public void setElectronicChance(Boolean electronicChance) {
        this.electronicChance = electronicChance;
    }

    public DogmaEffectResponse falloffAttributeId(Integer falloffAttributeId) {

        this.falloffAttributeId = falloffAttributeId;
        return this;
    }

    /**
     * falloff_attribute_id integer
     * 
     * @return falloffAttributeId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "falloff_attribute_id integer")
    public Integer getFalloffAttributeId() {
        return falloffAttributeId;
    }

    public void setFalloffAttributeId(Integer falloffAttributeId) {
        this.falloffAttributeId = falloffAttributeId;
    }

    public DogmaEffectResponse iconId(Integer iconId) {

        this.iconId = iconId;
        return this;
    }

    /**
     * icon_id integer
     * 
     * @return iconId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "icon_id integer")
    public Integer getIconId() {
        return iconId;
    }

    public void setIconId(Integer iconId) {
        this.iconId = iconId;
    }

    public DogmaEffectResponse isAssistance(Boolean isAssistance) {

        this.isAssistance = isAssistance;
        return this;
    }

    /**
     * is_assistance boolean
     * 
     * @return isAssistance
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "is_assistance boolean")
    public Boolean getIsAssistance() {
        return isAssistance;
    }

    public void setIsAssistance(Boolean isAssistance) {
        this.isAssistance = isAssistance;
    }

    public DogmaEffectResponse isOffensive(Boolean isOffensive) {

        this.isOffensive = isOffensive;
        return this;
    }

    /**
     * is_offensive boolean
     * 
     * @return isOffensive
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "is_offensive boolean")
    public Boolean getIsOffensive() {
        return isOffensive;
    }

    public void setIsOffensive(Boolean isOffensive) {
        this.isOffensive = isOffensive;
    }

    public DogmaEffectResponse isWarpSafe(Boolean isWarpSafe) {

        this.isWarpSafe = isWarpSafe;
        return this;
    }

    /**
     * is_warp_safe boolean
     * 
     * @return isWarpSafe
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "is_warp_safe boolean")
    public Boolean getIsWarpSafe() {
        return isWarpSafe;
    }

    public void setIsWarpSafe(Boolean isWarpSafe) {
        this.isWarpSafe = isWarpSafe;
    }

    public DogmaEffectResponse modifiers(List<DogmaEffectModifier> modifiers) {

        this.modifiers = modifiers;
        return this;
    }

    public DogmaEffectResponse addModifiersItem(DogmaEffectModifier modifiersItem) {
        if (this.modifiers == null) {
            this.modifiers = new ArrayList<>();
        }
        this.modifiers.add(modifiersItem);
        return this;
    }

    /**
     * modifiers array
     * 
     * @return modifiers
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "modifiers array")
    public List<DogmaEffectModifier> getModifiers() {
        return modifiers;
    }

    public void setModifiers(List<DogmaEffectModifier> modifiers) {
        this.modifiers = modifiers;
    }

    public DogmaEffectResponse name(String name) {

        this.name = name;
        return this;
    }

    /**
     * name string
     * 
     * @return name
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "name string")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DogmaEffectResponse postExpression(Integer postExpression) {

        this.postExpression = postExpression;
        return this;
    }

    /**
     * post_expression integer
     * 
     * @return postExpression
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "post_expression integer")
    public Integer getPostExpression() {
        return postExpression;
    }

    public void setPostExpression(Integer postExpression) {
        this.postExpression = postExpression;
    }

    public DogmaEffectResponse preExpression(Integer preExpression) {

        this.preExpression = preExpression;
        return this;
    }

    /**
     * pre_expression integer
     * 
     * @return preExpression
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "pre_expression integer")
    public Integer getPreExpression() {
        return preExpression;
    }

    public void setPreExpression(Integer preExpression) {
        this.preExpression = preExpression;
    }

    public DogmaEffectResponse published(Boolean published) {

        this.published = published;
        return this;
    }

    /**
     * published boolean
     * 
     * @return published
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "published boolean")
    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public DogmaEffectResponse rangeAttributeId(Integer rangeAttributeId) {

        this.rangeAttributeId = rangeAttributeId;
        return this;
    }

    /**
     * range_attribute_id integer
     * 
     * @return rangeAttributeId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "range_attribute_id integer")
    public Integer getRangeAttributeId() {
        return rangeAttributeId;
    }

    public void setRangeAttributeId(Integer rangeAttributeId) {
        this.rangeAttributeId = rangeAttributeId;
    }

    public DogmaEffectResponse rangeChance(Boolean rangeChance) {

        this.rangeChance = rangeChance;
        return this;
    }

    /**
     * range_chance boolean
     * 
     * @return rangeChance
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "range_chance boolean")
    public Boolean getRangeChance() {
        return rangeChance;
    }

    public void setRangeChance(Boolean rangeChance) {
        this.rangeChance = rangeChance;
    }

    public DogmaEffectResponse trackingSpeedAttributeId(Integer trackingSpeedAttributeId) {

        this.trackingSpeedAttributeId = trackingSpeedAttributeId;
        return this;
    }

    /**
     * tracking_speed_attribute_id integer
     * 
     * @return trackingSpeedAttributeId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "tracking_speed_attribute_id integer")
    public Integer getTrackingSpeedAttributeId() {
        return trackingSpeedAttributeId;
    }

    public void setTrackingSpeedAttributeId(Integer trackingSpeedAttributeId) {
        this.trackingSpeedAttributeId = trackingSpeedAttributeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DogmaEffectResponse dogmaEffectResponse = (DogmaEffectResponse) o;
        return Objects.equals(this.description, dogmaEffectResponse.description)
                && Objects.equals(this.disallowAutoRepeat, dogmaEffectResponse.disallowAutoRepeat)
                && Objects.equals(this.dischargeAttributeId, dogmaEffectResponse.dischargeAttributeId)
                && Objects.equals(this.displayName, dogmaEffectResponse.displayName)
                && Objects.equals(this.durationAttributeId, dogmaEffectResponse.durationAttributeId)
                && Objects.equals(this.effectCategory, dogmaEffectResponse.effectCategory)
                && Objects.equals(this.effectId, dogmaEffectResponse.effectId)
                && Objects.equals(this.electronicChance, dogmaEffectResponse.electronicChance)
                && Objects.equals(this.falloffAttributeId, dogmaEffectResponse.falloffAttributeId)
                && Objects.equals(this.iconId, dogmaEffectResponse.iconId)
                && Objects.equals(this.isAssistance, dogmaEffectResponse.isAssistance)
                && Objects.equals(this.isOffensive, dogmaEffectResponse.isOffensive)
                && Objects.equals(this.isWarpSafe, dogmaEffectResponse.isWarpSafe)
                && Objects.equals(this.modifiers, dogmaEffectResponse.modifiers)
                && Objects.equals(this.name, dogmaEffectResponse.name)
                && Objects.equals(this.postExpression, dogmaEffectResponse.postExpression)
                && Objects.equals(this.preExpression, dogmaEffectResponse.preExpression)
                && Objects.equals(this.published, dogmaEffectResponse.published)
                && Objects.equals(this.rangeAttributeId, dogmaEffectResponse.rangeAttributeId)
                && Objects.equals(this.rangeChance, dogmaEffectResponse.rangeChance)
                && Objects.equals(this.trackingSpeedAttributeId, dogmaEffectResponse.trackingSpeedAttributeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, disallowAutoRepeat, dischargeAttributeId, displayName, durationAttributeId,
                effectCategory, effectId, electronicChance, falloffAttributeId, iconId, isAssistance, isOffensive,
                isWarpSafe, modifiers, name, postExpression, preExpression, published, rangeAttributeId, rangeChance,
                trackingSpeedAttributeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DogmaEffectResponse {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    disallowAutoRepeat: ").append(toIndentedString(disallowAutoRepeat)).append("\n");
        sb.append("    dischargeAttributeId: ").append(toIndentedString(dischargeAttributeId)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    durationAttributeId: ").append(toIndentedString(durationAttributeId)).append("\n");
        sb.append("    effectCategory: ").append(toIndentedString(effectCategory)).append("\n");
        sb.append("    effectId: ").append(toIndentedString(effectId)).append("\n");
        sb.append("    electronicChance: ").append(toIndentedString(electronicChance)).append("\n");
        sb.append("    falloffAttributeId: ").append(toIndentedString(falloffAttributeId)).append("\n");
        sb.append("    iconId: ").append(toIndentedString(iconId)).append("\n");
        sb.append("    isAssistance: ").append(toIndentedString(isAssistance)).append("\n");
        sb.append("    isOffensive: ").append(toIndentedString(isOffensive)).append("\n");
        sb.append("    isWarpSafe: ").append(toIndentedString(isWarpSafe)).append("\n");
        sb.append("    modifiers: ").append(toIndentedString(modifiers)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    postExpression: ").append(toIndentedString(postExpression)).append("\n");
        sb.append("    preExpression: ").append(toIndentedString(preExpression)).append("\n");
        sb.append("    published: ").append(toIndentedString(published)).append("\n");
        sb.append("    rangeAttributeId: ").append(toIndentedString(rangeAttributeId)).append("\n");
        sb.append("    rangeChance: ").append(toIndentedString(rangeChance)).append("\n");
        sb.append("    trackingSpeedAttributeId: ").append(toIndentedString(trackingSpeedAttributeId)).append("\n");
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
