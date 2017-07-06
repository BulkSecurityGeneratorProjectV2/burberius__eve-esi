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
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CharacterAttributesResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("accrued_remap_cooldown_date")
    private OffsetDateTime accruedRemapCooldownDate = null;

    @JsonProperty("bonus_remaps")
    private Integer bonusRemaps = null;

    @JsonProperty("charisma")
    private Integer charisma = null;

    @JsonProperty("intelligence")
    private Integer intelligence = null;

    @JsonProperty("last_remap_date")
    private OffsetDateTime lastRemapDate = null;

    @JsonProperty("memory")
    private Integer memory = null;

    @JsonProperty("perception")
    private Integer perception = null;

    @JsonProperty("willpower")
    private Integer willpower = null;

    public CharacterAttributesResponse accruedRemapCooldownDate(OffsetDateTime accruedRemapCooldownDate) {
        this.accruedRemapCooldownDate = accruedRemapCooldownDate;
        return this;
    }

    /**
     * Neural remapping cooldown after a character uses remap accrued over time
     * 
     * @return accruedRemapCooldownDate
     **/
    @ApiModelProperty(example = "null", value = "Neural remapping cooldown after a character uses remap accrued over time")
    public OffsetDateTime getAccruedRemapCooldownDate() {
        return accruedRemapCooldownDate;
    }

    public void setAccruedRemapCooldownDate(OffsetDateTime accruedRemapCooldownDate) {
        this.accruedRemapCooldownDate = accruedRemapCooldownDate;
    }

    public CharacterAttributesResponse bonusRemaps(Integer bonusRemaps) {
        this.bonusRemaps = bonusRemaps;
        return this;
    }

    /**
     * Number of available bonus character neural remaps
     * 
     * @return bonusRemaps
     **/
    @ApiModelProperty(example = "null", value = "Number of available bonus character neural remaps")
    public Integer getBonusRemaps() {
        return bonusRemaps;
    }

    public void setBonusRemaps(Integer bonusRemaps) {
        this.bonusRemaps = bonusRemaps;
    }

    public CharacterAttributesResponse charisma(Integer charisma) {
        this.charisma = charisma;
        return this;
    }

    /**
     * charisma integer
     * 
     * @return charisma
     **/
    @ApiModelProperty(example = "null", required = true, value = "charisma integer")
    public Integer getCharisma() {
        return charisma;
    }

    public void setCharisma(Integer charisma) {
        this.charisma = charisma;
    }

    public CharacterAttributesResponse intelligence(Integer intelligence) {
        this.intelligence = intelligence;
        return this;
    }

    /**
     * intelligence integer
     * 
     * @return intelligence
     **/
    @ApiModelProperty(example = "null", required = true, value = "intelligence integer")
    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public CharacterAttributesResponse lastRemapDate(OffsetDateTime lastRemapDate) {
        this.lastRemapDate = lastRemapDate;
        return this;
    }

    /**
     * Datetime of last neural remap, including usage of bonus remaps
     * 
     * @return lastRemapDate
     **/
    @ApiModelProperty(example = "null", value = "Datetime of last neural remap, including usage of bonus remaps")
    public OffsetDateTime getLastRemapDate() {
        return lastRemapDate;
    }

    public void setLastRemapDate(OffsetDateTime lastRemapDate) {
        this.lastRemapDate = lastRemapDate;
    }

    public CharacterAttributesResponse memory(Integer memory) {
        this.memory = memory;
        return this;
    }

    /**
     * memory integer
     * 
     * @return memory
     **/
    @ApiModelProperty(example = "null", required = true, value = "memory integer")
    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public CharacterAttributesResponse perception(Integer perception) {
        this.perception = perception;
        return this;
    }

    /**
     * perception integer
     * 
     * @return perception
     **/
    @ApiModelProperty(example = "null", required = true, value = "perception integer")
    public Integer getPerception() {
        return perception;
    }

    public void setPerception(Integer perception) {
        this.perception = perception;
    }

    public CharacterAttributesResponse willpower(Integer willpower) {
        this.willpower = willpower;
        return this;
    }

    /**
     * willpower integer
     * 
     * @return willpower
     **/
    @ApiModelProperty(example = "null", required = true, value = "willpower integer")
    public Integer getWillpower() {
        return willpower;
    }

    public void setWillpower(Integer willpower) {
        this.willpower = willpower;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterAttributesResponse characterAttributesResponse = (CharacterAttributesResponse) o;
        return Objects.equals(this.accruedRemapCooldownDate, characterAttributesResponse.accruedRemapCooldownDate)
                && Objects.equals(this.bonusRemaps, characterAttributesResponse.bonusRemaps)
                && Objects.equals(this.charisma, characterAttributesResponse.charisma)
                && Objects.equals(this.intelligence, characterAttributesResponse.intelligence)
                && Objects.equals(this.lastRemapDate, characterAttributesResponse.lastRemapDate)
                && Objects.equals(this.memory, characterAttributesResponse.memory)
                && Objects.equals(this.perception, characterAttributesResponse.perception)
                && Objects.equals(this.willpower, characterAttributesResponse.willpower);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accruedRemapCooldownDate, bonusRemaps, charisma, intelligence, lastRemapDate, memory,
                perception, willpower);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterAttributesResponse {\n");

        sb.append("    accruedRemapCooldownDate: ").append(toIndentedString(accruedRemapCooldownDate)).append("\n");
        sb.append("    bonusRemaps: ").append(toIndentedString(bonusRemaps)).append("\n");
        sb.append("    charisma: ").append(toIndentedString(charisma)).append("\n");
        sb.append("    intelligence: ").append(toIndentedString(intelligence)).append("\n");
        sb.append("    lastRemapDate: ").append(toIndentedString(lastRemapDate)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    perception: ").append(toIndentedString(perception)).append("\n");
        sb.append("    willpower: ").append(toIndentedString(willpower)).append("\n");
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