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
import net.troja.eve.esi.model.PlanetHead;
import java.io.Serializable;

/**
 * extractor_details object
 */
@ApiModel(description = "extractor_details object")
public class PlanetExtractorDetails implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_HEAD_RADIUS = "head_radius";
    @SerializedName(SERIALIZED_NAME_HEAD_RADIUS)
    private Float headRadius;

    public static final String SERIALIZED_NAME_QTY_PER_CYCLE = "qty_per_cycle";
    @SerializedName(SERIALIZED_NAME_QTY_PER_CYCLE)
    private Integer qtyPerCycle;

    public static final String SERIALIZED_NAME_CYCLE_TIME = "cycle_time";
    @SerializedName(SERIALIZED_NAME_CYCLE_TIME)
    private Integer cycleTime;

    public static final String SERIALIZED_NAME_HEADS = "heads";
    @SerializedName(SERIALIZED_NAME_HEADS)
    private List<PlanetHead> heads = new ArrayList<>();

    public static final String SERIALIZED_NAME_PRODUCT_TYPE_ID = "product_type_id";
    @SerializedName(SERIALIZED_NAME_PRODUCT_TYPE_ID)
    private Integer productTypeId;

    public PlanetExtractorDetails headRadius(Float headRadius) {
        this.headRadius = headRadius;
        return this;
    }

    /**
     * head_radius number
     * 
     * @return headRadius
     **/
    @ApiModelProperty(value = "head_radius number")
    public Float getHeadRadius() {
        return headRadius;
    }

    public void setHeadRadius(Float headRadius) {
        this.headRadius = headRadius;
    }

    public PlanetExtractorDetails qtyPerCycle(Integer qtyPerCycle) {
        this.qtyPerCycle = qtyPerCycle;
        return this;
    }

    /**
     * qty_per_cycle integer
     * 
     * @return qtyPerCycle
     **/
    @ApiModelProperty(value = "qty_per_cycle integer")
    public Integer getQtyPerCycle() {
        return qtyPerCycle;
    }

    public void setQtyPerCycle(Integer qtyPerCycle) {
        this.qtyPerCycle = qtyPerCycle;
    }

    public PlanetExtractorDetails cycleTime(Integer cycleTime) {
        this.cycleTime = cycleTime;
        return this;
    }

    /**
     * in seconds
     * 
     * @return cycleTime
     **/
    @ApiModelProperty(value = "in seconds")
    public Integer getCycleTime() {
        return cycleTime;
    }

    public void setCycleTime(Integer cycleTime) {
        this.cycleTime = cycleTime;
    }

    public PlanetExtractorDetails heads(List<PlanetHead> heads) {
        this.heads = heads;
        return this;
    }

    public PlanetExtractorDetails addHeadsItem(PlanetHead headsItem) {
        this.heads.add(headsItem);
        return this;
    }

    /**
     * heads array
     * 
     * @return heads
     **/
    @ApiModelProperty(required = true, value = "heads array")
    public List<PlanetHead> getHeads() {
        return heads;
    }

    public void setHeads(List<PlanetHead> heads) {
        this.heads = heads;
    }

    public PlanetExtractorDetails productTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
        return this;
    }

    /**
     * product_type_id integer
     * 
     * @return productTypeId
     **/
    @ApiModelProperty(value = "product_type_id integer")
    public Integer getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlanetExtractorDetails planetExtractorDetails = (PlanetExtractorDetails) o;
        return Objects.equals(this.headRadius, planetExtractorDetails.headRadius)
                && Objects.equals(this.qtyPerCycle, planetExtractorDetails.qtyPerCycle)
                && Objects.equals(this.cycleTime, planetExtractorDetails.cycleTime)
                && Objects.equals(this.heads, planetExtractorDetails.heads)
                && Objects.equals(this.productTypeId, planetExtractorDetails.productTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(headRadius, qtyPerCycle, cycleTime, heads, productTypeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlanetExtractorDetails {\n");
        sb.append("    headRadius: ").append(toIndentedString(headRadius)).append("\n");
        sb.append("    qtyPerCycle: ").append(toIndentedString(qtyPerCycle)).append("\n");
        sb.append("    cycleTime: ").append(toIndentedString(cycleTime)).append("\n");
        sb.append("    heads: ").append(toIndentedString(heads)).append("\n");
        sb.append("    productTypeId: ").append(toIndentedString(productTypeId)).append("\n");
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
