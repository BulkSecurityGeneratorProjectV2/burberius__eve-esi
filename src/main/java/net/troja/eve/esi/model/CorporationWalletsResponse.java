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
public class CorporationWalletsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("balance")
    private Double balance = null;

    @JsonProperty("division")
    private Integer division = null;

    public CorporationWalletsResponse balance(Double balance) {
        this.balance = balance;
        return this;
    }

    /**
     * balance number
     * 
     * @return balance
     **/
    @ApiModelProperty(example = "null", required = true, value = "balance number")
    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public CorporationWalletsResponse division(Integer division) {
        this.division = division;
        return this;
    }

    /**
     * division integer minimum: 1 maximum: 7
     * 
     * @return division
     **/
    @ApiModelProperty(example = "null", required = true, value = "division integer")
    public Integer getDivision() {
        return division;
    }

    public void setDivision(Integer division) {
        this.division = division;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationWalletsResponse corporationWalletsResponse = (CorporationWalletsResponse) o;
        return Objects.equals(this.balance, corporationWalletsResponse.balance)
                && Objects.equals(this.division, corporationWalletsResponse.division);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balance, division);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationWalletsResponse {\n");

        sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
        sb.append("    division: ").append(toIndentedString(division)).append("\n");
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
