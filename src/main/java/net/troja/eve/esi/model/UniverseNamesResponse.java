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
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class UniverseNamesResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * category string
     */
    @JsonAdapter(CategoryEnum.Adapter.class)
    public enum CategoryEnum {
        ALLIANCE("alliance"),

        CHARACTER("character"),

        CONSTELLATION("constellation"),

        CORPORATION("corporation"),

        INVENTORY_TYPE("inventory_type"),

        REGION("region"),

        SOLAR_SYSTEM("solar_system"),

        STATION("station"),

        FACTION("faction");

        private String value;

        CategoryEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static CategoryEnum fromValue(String value) {
            for (CategoryEnum b : CategoryEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<CategoryEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final CategoryEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public CategoryEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return CategoryEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_CATEGORY = "category";
    @SerializedName(SERIALIZED_NAME_CATEGORY)
    private String category;
    private CategoryEnum categoryEnum;

    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private Integer id;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public UniverseNamesResponse category(CategoryEnum categoryEnum) {

        this.categoryEnum = categoryEnum;
        return this;
    }

    public UniverseNamesResponse categoryString(String category) {

        this.category = category;
        return this;
    }

    /**
     * category string
     * 
     * @return category
     **/
    @ApiModelProperty(required = true, value = "category string")
    public CategoryEnum getCategory() {
        if (categoryEnum == null) {
            categoryEnum = CategoryEnum.fromValue(category);
        }
        return categoryEnum;
    }

    public String getCategoryString() {
        return category;
    }

    public void setCategory(CategoryEnum categoryEnum) {
        this.categoryEnum = categoryEnum;
    }

    public void setCategoryString(String category) {
        this.category = category;
    }

    public UniverseNamesResponse id(Integer id) {

        this.id = id;
        return this;
    }

    /**
     * id integer
     * 
     * @return id
     **/
    @ApiModelProperty(required = true, value = "id integer")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UniverseNamesResponse name(String name) {

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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UniverseNamesResponse universeNamesResponse = (UniverseNamesResponse) o;
        return Objects.equals(this.category, universeNamesResponse.category)
                && Objects.equals(this.id, universeNamesResponse.id)
                && Objects.equals(this.name, universeNamesResponse.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, id, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UniverseNamesResponse {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
