/**
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.2.7.dev1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
public class MarketPricesResponse implements Serializable {
    @JsonProperty("adjusted_price")
    private Float adjustedPrice = null;

    @JsonProperty("average_price")
    private Float averagePrice = null;

    @JsonProperty("type_id")
    private Long typeId = null;

    public MarketPricesResponse adjustedPrice(Float adjustedPrice) {
        this.adjustedPrice = adjustedPrice;
        return this;
    }

    /**
     * adjusted_price number
     * 
     * @return adjustedPrice
     **/
    @ApiModelProperty(example = "null", value = "adjusted_price number")
    public Float getAdjustedPrice() {
        return adjustedPrice;
    }

    public void setAdjustedPrice(Float adjustedPrice) {
        this.adjustedPrice = adjustedPrice;
    }

    public MarketPricesResponse averagePrice(Float averagePrice) {
        this.averagePrice = averagePrice;
        return this;
    }

    /**
     * average_price number
     * 
     * @return averagePrice
     **/
    @ApiModelProperty(example = "null", value = "average_price number")
    public Float getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(Float averagePrice) {
        this.averagePrice = averagePrice;
    }

    public MarketPricesResponse typeId(Long typeId) {
        this.typeId = typeId;
        return this;
    }

    /**
     * type_id integer
     * 
     * @return typeId
     **/
    @ApiModelProperty(example = "null", required = true, value = "type_id integer")
    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
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
        MarketPricesResponse marketPricesResponse = (MarketPricesResponse) o;
        return Objects.equals(this.adjustedPrice, marketPricesResponse.adjustedPrice)
                && Objects.equals(this.averagePrice, marketPricesResponse.averagePrice)
                && Objects.equals(this.typeId, marketPricesResponse.typeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adjustedPrice, averagePrice, typeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MarketPricesResponse {\n");

        sb.append("    adjustedPrice: ").append(toIndentedString(adjustedPrice)).append("\n");
        sb.append("    averagePrice: ").append(toIndentedString(averagePrice)).append("\n");
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