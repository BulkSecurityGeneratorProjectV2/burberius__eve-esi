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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import net.troja.eve.esi.model.KillmailAttacker;
import net.troja.eve.esi.model.KillmailVictim;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class KillmailResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ATTACKERS = "attackers";
    @SerializedName(SERIALIZED_NAME_ATTACKERS)
    private List<KillmailAttacker> attackers = new ArrayList<>();

    public static final String SERIALIZED_NAME_KILLMAIL_ID = "killmail_id";
    @SerializedName(SERIALIZED_NAME_KILLMAIL_ID)
    private Integer killmailId;

    public static final String SERIALIZED_NAME_KILLMAIL_TIME = "killmail_time";
    @SerializedName(SERIALIZED_NAME_KILLMAIL_TIME)
    private OffsetDateTime killmailTime;

    public static final String SERIALIZED_NAME_MOON_ID = "moon_id";
    @SerializedName(SERIALIZED_NAME_MOON_ID)
    private Integer moonId;

    public static final String SERIALIZED_NAME_SOLAR_SYSTEM_ID = "solar_system_id";
    @SerializedName(SERIALIZED_NAME_SOLAR_SYSTEM_ID)
    private Integer solarSystemId;

    public static final String SERIALIZED_NAME_VICTIM = "victim";
    @SerializedName(SERIALIZED_NAME_VICTIM)
    private KillmailVictim victim;

    public static final String SERIALIZED_NAME_WAR_ID = "war_id";
    @SerializedName(SERIALIZED_NAME_WAR_ID)
    private Integer warId;

    public KillmailResponse attackers(List<KillmailAttacker> attackers) {

        this.attackers = attackers;
        return this;
    }

    public KillmailResponse addAttackersItem(KillmailAttacker attackersItem) {
        this.attackers.add(attackersItem);
        return this;
    }

    /**
     * attackers array
     * 
     * @return attackers
     **/
    @ApiModelProperty(required = true, value = "attackers array")
    public List<KillmailAttacker> getAttackers() {
        return attackers;
    }

    public void setAttackers(List<KillmailAttacker> attackers) {
        this.attackers = attackers;
    }

    public KillmailResponse killmailId(Integer killmailId) {

        this.killmailId = killmailId;
        return this;
    }

    /**
     * ID of the killmail
     * 
     * @return killmailId
     **/
    @ApiModelProperty(required = true, value = "ID of the killmail")
    public Integer getKillmailId() {
        return killmailId;
    }

    public void setKillmailId(Integer killmailId) {
        this.killmailId = killmailId;
    }

    public KillmailResponse killmailTime(OffsetDateTime killmailTime) {

        this.killmailTime = killmailTime;
        return this;
    }

    /**
     * Time that the victim was killed and the killmail generated
     * 
     * @return killmailTime
     **/
    @ApiModelProperty(required = true, value = "Time that the victim was killed and the killmail generated ")
    public OffsetDateTime getKillmailTime() {
        return killmailTime;
    }

    public void setKillmailTime(OffsetDateTime killmailTime) {
        this.killmailTime = killmailTime;
    }

    public KillmailResponse moonId(Integer moonId) {

        this.moonId = moonId;
        return this;
    }

    /**
     * Moon if the kill took place at one
     * 
     * @return moonId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Moon if the kill took place at one")
    public Integer getMoonId() {
        return moonId;
    }

    public void setMoonId(Integer moonId) {
        this.moonId = moonId;
    }

    public KillmailResponse solarSystemId(Integer solarSystemId) {

        this.solarSystemId = solarSystemId;
        return this;
    }

    /**
     * Solar system that the kill took place in
     * 
     * @return solarSystemId
     **/
    @ApiModelProperty(required = true, value = "Solar system that the kill took place in ")
    public Integer getSolarSystemId() {
        return solarSystemId;
    }

    public void setSolarSystemId(Integer solarSystemId) {
        this.solarSystemId = solarSystemId;
    }

    public KillmailResponse victim(KillmailVictim victim) {

        this.victim = victim;
        return this;
    }

    /**
     * Get victim
     * 
     * @return victim
     **/
    @ApiModelProperty(required = true, value = "")
    public KillmailVictim getVictim() {
        return victim;
    }

    public void setVictim(KillmailVictim victim) {
        this.victim = victim;
    }

    public KillmailResponse warId(Integer warId) {

        this.warId = warId;
        return this;
    }

    /**
     * War if the killmail is generated in relation to an official war
     * 
     * @return warId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "War if the killmail is generated in relation to an official war ")
    public Integer getWarId() {
        return warId;
    }

    public void setWarId(Integer warId) {
        this.warId = warId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KillmailResponse killmailResponse = (KillmailResponse) o;
        return Objects.equals(this.attackers, killmailResponse.attackers)
                && Objects.equals(this.killmailId, killmailResponse.killmailId)
                && Objects.equals(this.killmailTime, killmailResponse.killmailTime)
                && Objects.equals(this.moonId, killmailResponse.moonId)
                && Objects.equals(this.solarSystemId, killmailResponse.solarSystemId)
                && Objects.equals(this.victim, killmailResponse.victim)
                && Objects.equals(this.warId, killmailResponse.warId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attackers, killmailId, killmailTime, moonId, solarSystemId, victim, warId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KillmailResponse {\n");
        sb.append("    attackers: ").append(toIndentedString(attackers)).append("\n");
        sb.append("    killmailId: ").append(toIndentedString(killmailId)).append("\n");
        sb.append("    killmailTime: ").append(toIndentedString(killmailTime)).append("\n");
        sb.append("    moonId: ").append(toIndentedString(moonId)).append("\n");
        sb.append("    solarSystemId: ").append(toIndentedString(solarSystemId)).append("\n");
        sb.append("    victim: ").append(toIndentedString(victim)).append("\n");
        sb.append("    warId: ").append(toIndentedString(warId)).append("\n");
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
