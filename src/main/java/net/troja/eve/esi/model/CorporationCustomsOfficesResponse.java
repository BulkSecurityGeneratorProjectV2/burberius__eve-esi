/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * The version of the OpenAPI document: 1.12
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CorporationCustomsOfficesResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ALLIANCE_TAX_RATE = "alliance_tax_rate";
    @SerializedName(SERIALIZED_NAME_ALLIANCE_TAX_RATE)
    private Float allianceTaxRate;

    public static final String SERIALIZED_NAME_ALLOW_ACCESS_WITH_STANDINGS = "allow_access_with_standings";
    @SerializedName(SERIALIZED_NAME_ALLOW_ACCESS_WITH_STANDINGS)
    private Boolean allowAccessWithStandings;

    public static final String SERIALIZED_NAME_ALLOW_ALLIANCE_ACCESS = "allow_alliance_access";
    @SerializedName(SERIALIZED_NAME_ALLOW_ALLIANCE_ACCESS)
    private Boolean allowAllianceAccess;

    public static final String SERIALIZED_NAME_BAD_STANDING_TAX_RATE = "bad_standing_tax_rate";
    @SerializedName(SERIALIZED_NAME_BAD_STANDING_TAX_RATE)
    private Float badStandingTaxRate;

    public static final String SERIALIZED_NAME_CORPORATION_TAX_RATE = "corporation_tax_rate";
    @SerializedName(SERIALIZED_NAME_CORPORATION_TAX_RATE)
    private Float corporationTaxRate;

    public static final String SERIALIZED_NAME_EXCELLENT_STANDING_TAX_RATE = "excellent_standing_tax_rate";
    @SerializedName(SERIALIZED_NAME_EXCELLENT_STANDING_TAX_RATE)
    private Float excellentStandingTaxRate;

    public static final String SERIALIZED_NAME_GOOD_STANDING_TAX_RATE = "good_standing_tax_rate";
    @SerializedName(SERIALIZED_NAME_GOOD_STANDING_TAX_RATE)
    private Float goodStandingTaxRate;

    public static final String SERIALIZED_NAME_NEUTRAL_STANDING_TAX_RATE = "neutral_standing_tax_rate";
    @SerializedName(SERIALIZED_NAME_NEUTRAL_STANDING_TAX_RATE)
    private Float neutralStandingTaxRate;

    public static final String SERIALIZED_NAME_OFFICE_ID = "office_id";
    @SerializedName(SERIALIZED_NAME_OFFICE_ID)
    private Long officeId;

    public static final String SERIALIZED_NAME_REINFORCE_EXIT_END = "reinforce_exit_end";
    @SerializedName(SERIALIZED_NAME_REINFORCE_EXIT_END)
    private Integer reinforceExitEnd;

    public static final String SERIALIZED_NAME_REINFORCE_EXIT_START = "reinforce_exit_start";
    @SerializedName(SERIALIZED_NAME_REINFORCE_EXIT_START)
    private Integer reinforceExitStart;

    /**
     * Access is allowed only for entities with this level of standing or better
     */
    @JsonAdapter(StandingLevelEnum.Adapter.class)
    public enum StandingLevelEnum {
        BAD("bad"),

        EXCELLENT("excellent"),

        GOOD("good"),

        NEUTRAL("neutral"),

        TERRIBLE("terrible");

        private String value;

        StandingLevelEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StandingLevelEnum fromValue(String value) {
            for (StandingLevelEnum b : StandingLevelEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<StandingLevelEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StandingLevelEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StandingLevelEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StandingLevelEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_STANDING_LEVEL = "standing_level";
    @SerializedName(SERIALIZED_NAME_STANDING_LEVEL)
    private String standingLevel;
    private StandingLevelEnum standingLevelEnum;

    public static final String SERIALIZED_NAME_SYSTEM_ID = "system_id";
    @SerializedName(SERIALIZED_NAME_SYSTEM_ID)
    private Integer systemId;

    public static final String SERIALIZED_NAME_TERRIBLE_STANDING_TAX_RATE = "terrible_standing_tax_rate";
    @SerializedName(SERIALIZED_NAME_TERRIBLE_STANDING_TAX_RATE)
    private Float terribleStandingTaxRate;

    public CorporationCustomsOfficesResponse() {
    }

    public CorporationCustomsOfficesResponse allianceTaxRate(Float allianceTaxRate) {

        this.allianceTaxRate = allianceTaxRate;
        return this;
    }

    /**
     * Only present if alliance access is allowed
     * 
     * @return allianceTaxRate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Only present if alliance access is allowed")
    public Float getAllianceTaxRate() {
        return allianceTaxRate;
    }

    public void setAllianceTaxRate(Float allianceTaxRate) {
        this.allianceTaxRate = allianceTaxRate;
    }

    public CorporationCustomsOfficesResponse allowAccessWithStandings(Boolean allowAccessWithStandings) {

        this.allowAccessWithStandings = allowAccessWithStandings;
        return this;
    }

    /**
     * standing_level and any standing related tax rate only present when this
     * is true
     * 
     * @return allowAccessWithStandings
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "standing_level and any standing related tax rate only present when this is true")
    public Boolean getAllowAccessWithStandings() {
        return allowAccessWithStandings;
    }

    public void setAllowAccessWithStandings(Boolean allowAccessWithStandings) {
        this.allowAccessWithStandings = allowAccessWithStandings;
    }

    public CorporationCustomsOfficesResponse allowAllianceAccess(Boolean allowAllianceAccess) {

        this.allowAllianceAccess = allowAllianceAccess;
        return this;
    }

    /**
     * allow_alliance_access boolean
     * 
     * @return allowAllianceAccess
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "allow_alliance_access boolean")
    public Boolean getAllowAllianceAccess() {
        return allowAllianceAccess;
    }

    public void setAllowAllianceAccess(Boolean allowAllianceAccess) {
        this.allowAllianceAccess = allowAllianceAccess;
    }

    public CorporationCustomsOfficesResponse badStandingTaxRate(Float badStandingTaxRate) {

        this.badStandingTaxRate = badStandingTaxRate;
        return this;
    }

    /**
     * bad_standing_tax_rate number
     * 
     * @return badStandingTaxRate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "bad_standing_tax_rate number")
    public Float getBadStandingTaxRate() {
        return badStandingTaxRate;
    }

    public void setBadStandingTaxRate(Float badStandingTaxRate) {
        this.badStandingTaxRate = badStandingTaxRate;
    }

    public CorporationCustomsOfficesResponse corporationTaxRate(Float corporationTaxRate) {

        this.corporationTaxRate = corporationTaxRate;
        return this;
    }

    /**
     * corporation_tax_rate number
     * 
     * @return corporationTaxRate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "corporation_tax_rate number")
    public Float getCorporationTaxRate() {
        return corporationTaxRate;
    }

    public void setCorporationTaxRate(Float corporationTaxRate) {
        this.corporationTaxRate = corporationTaxRate;
    }

    public CorporationCustomsOfficesResponse excellentStandingTaxRate(Float excellentStandingTaxRate) {

        this.excellentStandingTaxRate = excellentStandingTaxRate;
        return this;
    }

    /**
     * Tax rate for entities with excellent level of standing, only present if
     * this level is allowed, same for all other standing related tax rates
     * 
     * @return excellentStandingTaxRate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Tax rate for entities with excellent level of standing, only present if this level is allowed, same for all other standing related tax rates")
    public Float getExcellentStandingTaxRate() {
        return excellentStandingTaxRate;
    }

    public void setExcellentStandingTaxRate(Float excellentStandingTaxRate) {
        this.excellentStandingTaxRate = excellentStandingTaxRate;
    }

    public CorporationCustomsOfficesResponse goodStandingTaxRate(Float goodStandingTaxRate) {

        this.goodStandingTaxRate = goodStandingTaxRate;
        return this;
    }

    /**
     * good_standing_tax_rate number
     * 
     * @return goodStandingTaxRate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "good_standing_tax_rate number")
    public Float getGoodStandingTaxRate() {
        return goodStandingTaxRate;
    }

    public void setGoodStandingTaxRate(Float goodStandingTaxRate) {
        this.goodStandingTaxRate = goodStandingTaxRate;
    }

    public CorporationCustomsOfficesResponse neutralStandingTaxRate(Float neutralStandingTaxRate) {

        this.neutralStandingTaxRate = neutralStandingTaxRate;
        return this;
    }

    /**
     * neutral_standing_tax_rate number
     * 
     * @return neutralStandingTaxRate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "neutral_standing_tax_rate number")
    public Float getNeutralStandingTaxRate() {
        return neutralStandingTaxRate;
    }

    public void setNeutralStandingTaxRate(Float neutralStandingTaxRate) {
        this.neutralStandingTaxRate = neutralStandingTaxRate;
    }

    public CorporationCustomsOfficesResponse officeId(Long officeId) {

        this.officeId = officeId;
        return this;
    }

    /**
     * unique ID of this customs office
     * 
     * @return officeId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "unique ID of this customs office")
    public Long getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Long officeId) {
        this.officeId = officeId;
    }

    public CorporationCustomsOfficesResponse reinforceExitEnd(Integer reinforceExitEnd) {

        this.reinforceExitEnd = reinforceExitEnd;
        return this;
    }

    /**
     * reinforce_exit_end integer minimum: 0 maximum: 23
     * 
     * @return reinforceExitEnd
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "reinforce_exit_end integer")
    public Integer getReinforceExitEnd() {
        return reinforceExitEnd;
    }

    public void setReinforceExitEnd(Integer reinforceExitEnd) {
        this.reinforceExitEnd = reinforceExitEnd;
    }

    public CorporationCustomsOfficesResponse reinforceExitStart(Integer reinforceExitStart) {

        this.reinforceExitStart = reinforceExitStart;
        return this;
    }

    /**
     * Together with reinforce_exit_end, marks a 2-hour period where this
     * customs office could exit reinforcement mode during the day after initial
     * attack minimum: 0 maximum: 23
     * 
     * @return reinforceExitStart
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "Together with reinforce_exit_end, marks a 2-hour period where this customs office could exit reinforcement mode during the day after initial attack")
    public Integer getReinforceExitStart() {
        return reinforceExitStart;
    }

    public void setReinforceExitStart(Integer reinforceExitStart) {
        this.reinforceExitStart = reinforceExitStart;
    }

    public CorporationCustomsOfficesResponse standingLevel(StandingLevelEnum standingLevelEnum) {

        this.standingLevelEnum = standingLevelEnum;
        return this;
    }

    public CorporationCustomsOfficesResponse standingLevelString(String standingLevel) {

        this.standingLevel = standingLevel;
        return this;
    }

    /**
     * Access is allowed only for entities with this level of standing or better
     * 
     * @return standingLevel
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Access is allowed only for entities with this level of standing or better")
    public StandingLevelEnum getStandingLevel() {
        if (standingLevelEnum == null) {
            standingLevelEnum = StandingLevelEnum.fromValue(standingLevel);
        }
        return standingLevelEnum;
    }

    public String getStandingLevelString() {
        return standingLevel;
    }

    public void setStandingLevel(StandingLevelEnum standingLevelEnum) {
        this.standingLevelEnum = standingLevelEnum;
    }

    public void setStandingLevelString(String standingLevel) {
        this.standingLevel = standingLevel;
    }

    public CorporationCustomsOfficesResponse systemId(Integer systemId) {

        this.systemId = systemId;
        return this;
    }

    /**
     * ID of the solar system this customs office is located in
     * 
     * @return systemId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "ID of the solar system this customs office is located in")
    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    public CorporationCustomsOfficesResponse terribleStandingTaxRate(Float terribleStandingTaxRate) {

        this.terribleStandingTaxRate = terribleStandingTaxRate;
        return this;
    }

    /**
     * terrible_standing_tax_rate number
     * 
     * @return terribleStandingTaxRate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "terrible_standing_tax_rate number")
    public Float getTerribleStandingTaxRate() {
        return terribleStandingTaxRate;
    }

    public void setTerribleStandingTaxRate(Float terribleStandingTaxRate) {
        this.terribleStandingTaxRate = terribleStandingTaxRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationCustomsOfficesResponse corporationCustomsOfficesResponse = (CorporationCustomsOfficesResponse) o;
        return Objects.equals(this.allianceTaxRate, corporationCustomsOfficesResponse.allianceTaxRate)
                && Objects.equals(this.allowAccessWithStandings,
                        corporationCustomsOfficesResponse.allowAccessWithStandings)
                && Objects.equals(this.allowAllianceAccess, corporationCustomsOfficesResponse.allowAllianceAccess)
                && Objects.equals(this.badStandingTaxRate, corporationCustomsOfficesResponse.badStandingTaxRate)
                && Objects.equals(this.corporationTaxRate, corporationCustomsOfficesResponse.corporationTaxRate)
                && Objects.equals(this.excellentStandingTaxRate,
                        corporationCustomsOfficesResponse.excellentStandingTaxRate)
                && Objects.equals(this.goodStandingTaxRate, corporationCustomsOfficesResponse.goodStandingTaxRate)
                && Objects
                        .equals(this.neutralStandingTaxRate, corporationCustomsOfficesResponse.neutralStandingTaxRate)
                && Objects.equals(this.officeId, corporationCustomsOfficesResponse.officeId)
                && Objects.equals(this.reinforceExitEnd, corporationCustomsOfficesResponse.reinforceExitEnd)
                && Objects.equals(this.reinforceExitStart, corporationCustomsOfficesResponse.reinforceExitStart)
                && Objects.equals(this.standingLevel, corporationCustomsOfficesResponse.standingLevel)
                && Objects.equals(this.systemId, corporationCustomsOfficesResponse.systemId)
                && Objects.equals(this.terribleStandingTaxRate,
                        corporationCustomsOfficesResponse.terribleStandingTaxRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allianceTaxRate, allowAccessWithStandings, allowAllianceAccess, badStandingTaxRate,
                corporationTaxRate, excellentStandingTaxRate, goodStandingTaxRate, neutralStandingTaxRate, officeId,
                reinforceExitEnd, reinforceExitStart, standingLevel, systemId, terribleStandingTaxRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationCustomsOfficesResponse {\n");
        sb.append("    allianceTaxRate: ").append(toIndentedString(allianceTaxRate)).append("\n");
        sb.append("    allowAccessWithStandings: ").append(toIndentedString(allowAccessWithStandings)).append("\n");
        sb.append("    allowAllianceAccess: ").append(toIndentedString(allowAllianceAccess)).append("\n");
        sb.append("    badStandingTaxRate: ").append(toIndentedString(badStandingTaxRate)).append("\n");
        sb.append("    corporationTaxRate: ").append(toIndentedString(corporationTaxRate)).append("\n");
        sb.append("    excellentStandingTaxRate: ").append(toIndentedString(excellentStandingTaxRate)).append("\n");
        sb.append("    goodStandingTaxRate: ").append(toIndentedString(goodStandingTaxRate)).append("\n");
        sb.append("    neutralStandingTaxRate: ").append(toIndentedString(neutralStandingTaxRate)).append("\n");
        sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
        sb.append("    reinforceExitEnd: ").append(toIndentedString(reinforceExitEnd)).append("\n");
        sb.append("    reinforceExitStart: ").append(toIndentedString(reinforceExitStart)).append("\n");
        sb.append("    standingLevel: ").append(toIndentedString(standingLevel)).append("\n");
        sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
        sb.append("    terribleStandingTaxRate: ").append(toIndentedString(terribleStandingTaxRate)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
