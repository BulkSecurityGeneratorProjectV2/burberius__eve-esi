/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * The version of the OpenAPI document: 1.7.14
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
import net.troja.eve.esi.model.CorporationDivisionsHangar;
import net.troja.eve.esi.model.CorporationDivisionsWallet;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CorporationDivisionsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_HANGAR = "hangar";
    @SerializedName(SERIALIZED_NAME_HANGAR)
    private List<CorporationDivisionsHangar> hangar = null;

    public static final String SERIALIZED_NAME_WALLET = "wallet";
    @SerializedName(SERIALIZED_NAME_WALLET)
    private List<CorporationDivisionsWallet> wallet = null;

    public CorporationDivisionsResponse hangar(List<CorporationDivisionsHangar> hangar) {

        this.hangar = hangar;
        return this;
    }

    public CorporationDivisionsResponse addHangarItem(CorporationDivisionsHangar hangarItem) {
        if (this.hangar == null) {
            this.hangar = new ArrayList<>();
        }
        this.hangar.add(hangarItem);
        return this;
    }

    /**
     * hangar array
     * 
     * @return hangar
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "hangar array")
    public List<CorporationDivisionsHangar> getHangar() {
        return hangar;
    }

    public void setHangar(List<CorporationDivisionsHangar> hangar) {
        this.hangar = hangar;
    }

    public CorporationDivisionsResponse wallet(List<CorporationDivisionsWallet> wallet) {

        this.wallet = wallet;
        return this;
    }

    public CorporationDivisionsResponse addWalletItem(CorporationDivisionsWallet walletItem) {
        if (this.wallet == null) {
            this.wallet = new ArrayList<>();
        }
        this.wallet.add(walletItem);
        return this;
    }

    /**
     * wallet array
     * 
     * @return wallet
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "wallet array")
    public List<CorporationDivisionsWallet> getWallet() {
        return wallet;
    }

    public void setWallet(List<CorporationDivisionsWallet> wallet) {
        this.wallet = wallet;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationDivisionsResponse corporationDivisionsResponse = (CorporationDivisionsResponse) o;
        return Objects.equals(this.hangar, corporationDivisionsResponse.hangar)
                && Objects.equals(this.wallet, corporationDivisionsResponse.wallet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hangar, wallet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationDivisionsResponse {\n");
        sb.append("    hangar: ").append(toIndentedString(hangar)).append("\n");
        sb.append("    wallet: ").append(toIndentedString(wallet)).append("\n");
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
