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
import java.util.ArrayList;
import java.util.List;
import net.troja.eve.esi.model.InsurancePriceLevel;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class InsurancePricesResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("type_id")
    private Integer typeId = null;

    @JsonProperty("levels")
    private List<InsurancePriceLevel> levels = new ArrayList<InsurancePriceLevel>();

    public InsurancePricesResponse typeId(Integer typeId) {
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

    public InsurancePricesResponse levels(List<InsurancePriceLevel> levels) {
        this.levels = levels;
        return this;
    }

    public InsurancePricesResponse addLevelsItem(InsurancePriceLevel levelsItem) {
        this.levels.add(levelsItem);
        return this;
    }

    /**
     * A list of a available insurance levels for this ship type
     * 
     * @return levels
     **/
    @ApiModelProperty(example = "null", required = true, value = "A list of a available insurance levels for this ship type")
    public List<InsurancePriceLevel> getLevels() {
        return levels;
    }

    public void setLevels(List<InsurancePriceLevel> levels) {
        this.levels = levels;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InsurancePricesResponse insurancePricesResponse = (InsurancePricesResponse) o;
        return Objects.equals(this.typeId, insurancePricesResponse.typeId)
                && Objects.equals(this.levels, insurancePricesResponse.levels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeId, levels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InsurancePricesResponse {\n");

        sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
        sb.append("    levels: ").append(toIndentedString(levels)).append("\n");
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
