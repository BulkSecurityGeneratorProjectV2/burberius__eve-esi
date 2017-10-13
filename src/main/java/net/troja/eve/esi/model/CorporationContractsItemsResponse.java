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
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CorporationContractsItemsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("is_included")
    private Boolean isIncluded = null;

    @JsonProperty("is_singleton")
    private Boolean isSingleton = null;

    @JsonProperty("quantity")
    private Integer quantity = null;

    @JsonProperty("raw_quantity")
    private Integer rawQuantity = null;

    @JsonProperty("record_id")
    private Long recordId = null;

    @JsonProperty("type_id")
    private Integer typeId = null;

    public CorporationContractsItemsResponse isIncluded(Boolean isIncluded) {
        this.isIncluded = isIncluded;
        return this;
    }

    /**
     * true if the contract issuer has submitted this item with the contract,
     * false if the isser is asking for this item in the contract.
     * 
     * @return isIncluded
     **/
    @ApiModelProperty(example = "null", required = true, value = "true if the contract issuer has submitted this item with the contract, false if the isser is asking for this item in the contract.")
    public Boolean getIsIncluded() {
        return isIncluded;
    }

    public void setIsIncluded(Boolean isIncluded) {
        this.isIncluded = isIncluded;
    }

    public CorporationContractsItemsResponse isSingleton(Boolean isSingleton) {
        this.isSingleton = isSingleton;
        return this;
    }

    /**
     * is_singleton boolean
     * 
     * @return isSingleton
     **/
    @ApiModelProperty(example = "null", required = true, value = "is_singleton boolean")
    public Boolean getIsSingleton() {
        return isSingleton;
    }

    public void setIsSingleton(Boolean isSingleton) {
        this.isSingleton = isSingleton;
    }

    public CorporationContractsItemsResponse quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Number of items in the stack
     * 
     * @return quantity
     **/
    @ApiModelProperty(example = "null", required = true, value = "Number of items in the stack")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public CorporationContractsItemsResponse rawQuantity(Integer rawQuantity) {
        this.rawQuantity = rawQuantity;
        return this;
    }

    /**
     * -1 indicates that the item is a singleton (non-stackable). If the item
     * happens to be a Blueprint, -1 is an Original and -2 is a Blueprint Copy
     * 
     * @return rawQuantity
     **/
    @ApiModelProperty(example = "null", value = "-1 indicates that the item is a singleton (non-stackable). If the item happens to be a Blueprint, -1 is an Original and -2 is a Blueprint Copy")
    public Integer getRawQuantity() {
        return rawQuantity;
    }

    public void setRawQuantity(Integer rawQuantity) {
        this.rawQuantity = rawQuantity;
    }

    public CorporationContractsItemsResponse recordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }

    /**
     * Unique ID for the item
     * 
     * @return recordId
     **/
    @ApiModelProperty(example = "null", required = true, value = "Unique ID for the item")
    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public CorporationContractsItemsResponse typeId(Integer typeId) {
        this.typeId = typeId;
        return this;
    }

    /**
     * Type ID for item
     * 
     * @return typeId
     **/
    @ApiModelProperty(example = "null", required = true, value = "Type ID for item")
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
        CorporationContractsItemsResponse corporationContractsItemsResponse = (CorporationContractsItemsResponse) o;
        return Objects.equals(this.isIncluded, corporationContractsItemsResponse.isIncluded)
                && Objects.equals(this.isSingleton, corporationContractsItemsResponse.isSingleton)
                && Objects.equals(this.quantity, corporationContractsItemsResponse.quantity)
                && Objects.equals(this.rawQuantity, corporationContractsItemsResponse.rawQuantity)
                && Objects.equals(this.recordId, corporationContractsItemsResponse.recordId)
                && Objects.equals(this.typeId, corporationContractsItemsResponse.typeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isIncluded, isSingleton, quantity, rawQuantity, recordId, typeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationContractsItemsResponse {\n");

        sb.append("    isIncluded: ").append(toIndentedString(isIncluded)).append("\n");
        sb.append("    isSingleton: ").append(toIndentedString(isSingleton)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    rawQuantity: ").append(toIndentedString(rawQuantity)).append("\n");
        sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
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
