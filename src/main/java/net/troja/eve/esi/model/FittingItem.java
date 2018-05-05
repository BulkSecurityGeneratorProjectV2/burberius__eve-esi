/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package net.troja.eve.esi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * item object
 */
@ApiModel(description = "item object")
public class FittingItem implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("flag")
    private Integer flag = null;

    @JsonProperty("quantity")
    private Integer quantity = null;

    @JsonProperty("type_id")
    private Integer typeId = null;

    public FittingItem flag(Integer flag) {
        this.flag = flag;
        return this;
    }

    /**
     * flag integer
     * 
     * @return flag
     **/
    @ApiModelProperty(example = "null", required = true, value = "flag integer")
    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public FittingItem quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * quantity integer
     * 
     * @return quantity
     **/
    @ApiModelProperty(example = "null", required = true, value = "quantity integer")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public FittingItem typeId(Integer typeId) {
        this.typeId = typeId;
        return this;
    }

    /**
     * type_id integer
     * 
     * @return typeId
     **/
    @ApiModelProperty(example = "null", required = true, value = "type_id integer")
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FittingItem fittingItem = (FittingItem) o;
        return Objects.equals(this.flag, fittingItem.flag) && Objects.equals(this.quantity, fittingItem.quantity)
                && Objects.equals(this.typeId, fittingItem.typeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flag, quantity, typeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FittingItem {\n");

        sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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
