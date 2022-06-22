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
import java.util.ArrayList;
import java.util.List;
import net.troja.eve.esi.model.FittingItem;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CharacterFittingsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_FITTING_ID = "fitting_id";
    @SerializedName(SERIALIZED_NAME_FITTING_ID)
    private Integer fittingId;

    public static final String SERIALIZED_NAME_ITEMS = "items";
    @SerializedName(SERIALIZED_NAME_ITEMS)
    private List<FittingItem> items = new ArrayList<>();

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_SHIP_TYPE_ID = "ship_type_id";
    @SerializedName(SERIALIZED_NAME_SHIP_TYPE_ID)
    private Integer shipTypeId;

    public CharacterFittingsResponse description(String description) {

        this.description = description;
        return this;
    }

    /**
     * description string
     * 
     * @return description
     **/
    @ApiModelProperty(required = true, value = "description string")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CharacterFittingsResponse fittingId(Integer fittingId) {

        this.fittingId = fittingId;
        return this;
    }

    /**
     * fitting_id integer
     * 
     * @return fittingId
     **/
    @ApiModelProperty(required = true, value = "fitting_id integer")
    public Integer getFittingId() {
        return fittingId;
    }

    public void setFittingId(Integer fittingId) {
        this.fittingId = fittingId;
    }

    public CharacterFittingsResponse items(List<FittingItem> items) {

        this.items = items;
        return this;
    }

    public CharacterFittingsResponse addItemsItem(FittingItem itemsItem) {
        this.items.add(itemsItem);
        return this;
    }

    /**
     * items array
     * 
     * @return items
     **/
    @ApiModelProperty(required = true, value = "items array")
    public List<FittingItem> getItems() {
        return items;
    }

    public void setItems(List<FittingItem> items) {
        this.items = items;
    }

    public CharacterFittingsResponse name(String name) {

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

    public CharacterFittingsResponse shipTypeId(Integer shipTypeId) {

        this.shipTypeId = shipTypeId;
        return this;
    }

    /**
     * ship_type_id integer
     * 
     * @return shipTypeId
     **/
    @ApiModelProperty(required = true, value = "ship_type_id integer")
    public Integer getShipTypeId() {
        return shipTypeId;
    }

    public void setShipTypeId(Integer shipTypeId) {
        this.shipTypeId = shipTypeId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterFittingsResponse characterFittingsResponse = (CharacterFittingsResponse) o;
        return Objects.equals(this.description, characterFittingsResponse.description)
                && Objects.equals(this.fittingId, characterFittingsResponse.fittingId)
                && Objects.equals(this.items, characterFittingsResponse.items)
                && Objects.equals(this.name, characterFittingsResponse.name)
                && Objects.equals(this.shipTypeId, characterFittingsResponse.shipTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, fittingId, items, name, shipTypeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterFittingsResponse {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    fittingId: ").append(toIndentedString(fittingId)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    shipTypeId: ").append(toIndentedString(shipTypeId)).append("\n");
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
