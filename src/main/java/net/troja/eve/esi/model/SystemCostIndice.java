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
 * cost_indice object
 */
@ApiModel(description = "cost_indice object")
public class SystemCostIndice implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * activity string
     */
    @JsonAdapter(ActivityEnum.Adapter.class)
    public enum ActivityEnum {
        COPYING("copying"),

        DUPLICATING("duplicating"),

        INVENTION("invention"),

        MANUFACTURING("manufacturing"),

        NONE("none"),

        REACTION("reaction"),

        RESEARCHING_MATERIAL_EFFICIENCY("researching_material_efficiency"),

        RESEARCHING_TECHNOLOGY("researching_technology"),

        RESEARCHING_TIME_EFFICIENCY("researching_time_efficiency"),

        REVERSE_ENGINEERING("reverse_engineering");

        private String value;

        ActivityEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ActivityEnum fromValue(String value) {
            for (ActivityEnum b : ActivityEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<ActivityEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ActivityEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ActivityEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ActivityEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_ACTIVITY = "activity";
    @SerializedName(SERIALIZED_NAME_ACTIVITY)
    private String activity;
    private ActivityEnum activityEnum;

    public static final String SERIALIZED_NAME_COST_INDEX = "cost_index";
    @SerializedName(SERIALIZED_NAME_COST_INDEX)
    private Float costIndex;

    public SystemCostIndice activity(ActivityEnum activityEnum) {

        this.activityEnum = activityEnum;
        return this;
    }

    public SystemCostIndice activityString(String activity) {

        this.activity = activity;
        return this;
    }

    /**
     * activity string
     * 
     * @return activity
     **/
    @ApiModelProperty(required = true, value = "activity string")
    public ActivityEnum getActivity() {
        if (activityEnum == null) {
            activityEnum = ActivityEnum.fromValue(activity);
        }
        return activityEnum;
    }

    public String getActivityString() {
        return activity;
    }

    public void setActivity(ActivityEnum activityEnum) {
        this.activityEnum = activityEnum;
    }

    public void setActivityString(String activity) {
        this.activity = activity;
    }

    public SystemCostIndice costIndex(Float costIndex) {

        this.costIndex = costIndex;
        return this;
    }

    /**
     * cost_index number
     * 
     * @return costIndex
     **/
    @ApiModelProperty(required = true, value = "cost_index number")
    public Float getCostIndex() {
        return costIndex;
    }

    public void setCostIndex(Float costIndex) {
        this.costIndex = costIndex;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SystemCostIndice systemCostIndice = (SystemCostIndice) o;
        return Objects.equals(this.activity, systemCostIndice.activity)
                && Objects.equals(this.costIndex, systemCostIndice.costIndex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activity, costIndex);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SystemCostIndice {\n");
        sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
        sb.append("    costIndex: ").append(toIndentedString(costIndex)).append("\n");
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
