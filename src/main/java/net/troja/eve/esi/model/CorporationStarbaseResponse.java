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
import net.troja.eve.esi.model.CorporationStarbaseFuel;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CorporationStarbaseResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * Who can view the starbase (POS)'s fule bay. Characters either need to
     * have required role or belong to the starbase (POS) owner's corporation or
     * alliance, as described by the enum, all other access settings follows the
     * same scheme
     */
    public enum FuelBayViewEnum {
        ALLIANCE_MEMBER("alliance_member"),

        CONFIG_STARBASE_EQUIPMENT_ROLE("config_starbase_equipment_role"),

        CORPORATION_MEMBER("corporation_member"),

        STARBASE_FUEL_TECHNICIAN_ROLE("starbase_fuel_technician_role");

        private String value;

        FuelBayViewEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static FuelBayViewEnum fromValue(String text) {
            for (FuelBayViewEnum b : FuelBayViewEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("fuel_bay_view")
    private FuelBayViewEnum fuelBayView = null;

    /**
     * Who can take fuel blocks out of the starbase (POS)'s fuel bay
     */
    public enum FuelBayTakeEnum {
        ALLIANCE_MEMBER("alliance_member"),

        CONFIG_STARBASE_EQUIPMENT_ROLE("config_starbase_equipment_role"),

        CORPORATION_MEMBER("corporation_member"),

        STARBASE_FUEL_TECHNICIAN_ROLE("starbase_fuel_technician_role");

        private String value;

        FuelBayTakeEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static FuelBayTakeEnum fromValue(String text) {
            for (FuelBayTakeEnum b : FuelBayTakeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("fuel_bay_take")
    private FuelBayTakeEnum fuelBayTake = null;

    /**
     * Who can anchor starbase (POS) and its structures
     */
    public enum AnchorEnum {
        ALLIANCE_MEMBER("alliance_member"),

        CONFIG_STARBASE_EQUIPMENT_ROLE("config_starbase_equipment_role"),

        CORPORATION_MEMBER("corporation_member"),

        STARBASE_FUEL_TECHNICIAN_ROLE("starbase_fuel_technician_role");

        private String value;

        AnchorEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AnchorEnum fromValue(String text) {
            for (AnchorEnum b : AnchorEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("anchor")
    private AnchorEnum anchor = null;

    /**
     * Who can unanchor starbase (POS) and its structures
     */
    public enum UnanchorEnum {
        ALLIANCE_MEMBER("alliance_member"),

        CONFIG_STARBASE_EQUIPMENT_ROLE("config_starbase_equipment_role"),

        CORPORATION_MEMBER("corporation_member"),

        STARBASE_FUEL_TECHNICIAN_ROLE("starbase_fuel_technician_role");

        private String value;

        UnanchorEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static UnanchorEnum fromValue(String text) {
            for (UnanchorEnum b : UnanchorEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("unanchor")
    private UnanchorEnum unanchor = null;

    /**
     * Who can online starbase (POS) and its structures
     */
    public enum OnlineEnum {
        ALLIANCE_MEMBER("alliance_member"),

        CONFIG_STARBASE_EQUIPMENT_ROLE("config_starbase_equipment_role"),

        CORPORATION_MEMBER("corporation_member"),

        STARBASE_FUEL_TECHNICIAN_ROLE("starbase_fuel_technician_role");

        private String value;

        OnlineEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OnlineEnum fromValue(String text) {
            for (OnlineEnum b : OnlineEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("online")
    private OnlineEnum online = null;

    /**
     * Who can offline starbase (POS) and its structures
     */
    public enum OfflineEnum {
        ALLIANCE_MEMBER("alliance_member"),

        CONFIG_STARBASE_EQUIPMENT_ROLE("config_starbase_equipment_role"),

        CORPORATION_MEMBER("corporation_member"),

        STARBASE_FUEL_TECHNICIAN_ROLE("starbase_fuel_technician_role");

        private String value;

        OfflineEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OfflineEnum fromValue(String text) {
            for (OfflineEnum b : OfflineEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("offline")
    private OfflineEnum offline = null;

    @JsonProperty("allow_corporation_members")
    private Boolean allowCorporationMembers = null;

    @JsonProperty("allow_alliance_members")
    private Boolean allowAllianceMembers = null;

    @JsonProperty("use_alliance_standings")
    private Boolean useAllianceStandings = null;

    @JsonProperty("attack_standing_threshold")
    private Float attackStandingThreshold = null;

    @JsonProperty("attack_security_status_threshold")
    private Float attackSecurityStatusThreshold = null;

    @JsonProperty("attack_if_other_security_status_dropping")
    private Boolean attackIfOtherSecurityStatusDropping = null;

    @JsonProperty("attack_if_at_war")
    private Boolean attackIfAtWar = null;

    @JsonProperty("fuels")
    private List<CorporationStarbaseFuel> fuels = new ArrayList<CorporationStarbaseFuel>();

    public CorporationStarbaseResponse fuelBayView(FuelBayViewEnum fuelBayView) {
        this.fuelBayView = fuelBayView;
        return this;
    }

    /**
     * Who can view the starbase (POS)'s fule bay. Characters either need to
     * have required role or belong to the starbase (POS) owner's corporation or
     * alliance, as described by the enum, all other access settings follows the
     * same scheme
     * 
     * @return fuelBayView
     **/
    @ApiModelProperty(example = "null", required = true, value = "Who can view the starbase (POS)'s fule bay. Characters either need to have required role or belong to the starbase (POS) owner's corporation or alliance, as described by the enum, all other access settings follows the same scheme")
    public FuelBayViewEnum getFuelBayView() {
        return fuelBayView;
    }

    public void setFuelBayView(FuelBayViewEnum fuelBayView) {
        this.fuelBayView = fuelBayView;
    }

    public CorporationStarbaseResponse fuelBayTake(FuelBayTakeEnum fuelBayTake) {
        this.fuelBayTake = fuelBayTake;
        return this;
    }

    /**
     * Who can take fuel blocks out of the starbase (POS)'s fuel bay
     * 
     * @return fuelBayTake
     **/
    @ApiModelProperty(example = "null", required = true, value = "Who can take fuel blocks out of the starbase (POS)'s fuel bay")
    public FuelBayTakeEnum getFuelBayTake() {
        return fuelBayTake;
    }

    public void setFuelBayTake(FuelBayTakeEnum fuelBayTake) {
        this.fuelBayTake = fuelBayTake;
    }

    public CorporationStarbaseResponse anchor(AnchorEnum anchor) {
        this.anchor = anchor;
        return this;
    }

    /**
     * Who can anchor starbase (POS) and its structures
     * 
     * @return anchor
     **/
    @ApiModelProperty(example = "null", required = true, value = "Who can anchor starbase (POS) and its structures")
    public AnchorEnum getAnchor() {
        return anchor;
    }

    public void setAnchor(AnchorEnum anchor) {
        this.anchor = anchor;
    }

    public CorporationStarbaseResponse unanchor(UnanchorEnum unanchor) {
        this.unanchor = unanchor;
        return this;
    }

    /**
     * Who can unanchor starbase (POS) and its structures
     * 
     * @return unanchor
     **/
    @ApiModelProperty(example = "null", required = true, value = "Who can unanchor starbase (POS) and its structures")
    public UnanchorEnum getUnanchor() {
        return unanchor;
    }

    public void setUnanchor(UnanchorEnum unanchor) {
        this.unanchor = unanchor;
    }

    public CorporationStarbaseResponse online(OnlineEnum online) {
        this.online = online;
        return this;
    }

    /**
     * Who can online starbase (POS) and its structures
     * 
     * @return online
     **/
    @ApiModelProperty(example = "null", required = true, value = "Who can online starbase (POS) and its structures")
    public OnlineEnum getOnline() {
        return online;
    }

    public void setOnline(OnlineEnum online) {
        this.online = online;
    }

    public CorporationStarbaseResponse offline(OfflineEnum offline) {
        this.offline = offline;
        return this;
    }

    /**
     * Who can offline starbase (POS) and its structures
     * 
     * @return offline
     **/
    @ApiModelProperty(example = "null", required = true, value = "Who can offline starbase (POS) and its structures")
    public OfflineEnum getOffline() {
        return offline;
    }

    public void setOffline(OfflineEnum offline) {
        this.offline = offline;
    }

    public CorporationStarbaseResponse allowCorporationMembers(Boolean allowCorporationMembers) {
        this.allowCorporationMembers = allowCorporationMembers;
        return this;
    }

    /**
     * allow_corporation_members boolean
     * 
     * @return allowCorporationMembers
     **/
    @ApiModelProperty(example = "null", required = true, value = "allow_corporation_members boolean")
    public Boolean getAllowCorporationMembers() {
        return allowCorporationMembers;
    }

    public void setAllowCorporationMembers(Boolean allowCorporationMembers) {
        this.allowCorporationMembers = allowCorporationMembers;
    }

    public CorporationStarbaseResponse allowAllianceMembers(Boolean allowAllianceMembers) {
        this.allowAllianceMembers = allowAllianceMembers;
        return this;
    }

    /**
     * allow_alliance_members boolean
     * 
     * @return allowAllianceMembers
     **/
    @ApiModelProperty(example = "null", required = true, value = "allow_alliance_members boolean")
    public Boolean getAllowAllianceMembers() {
        return allowAllianceMembers;
    }

    public void setAllowAllianceMembers(Boolean allowAllianceMembers) {
        this.allowAllianceMembers = allowAllianceMembers;
    }

    public CorporationStarbaseResponse useAllianceStandings(Boolean useAllianceStandings) {
        this.useAllianceStandings = useAllianceStandings;
        return this;
    }

    /**
     * True if the starbase (POS) is using alliance standings, otherwise using
     * corporation's
     * 
     * @return useAllianceStandings
     **/
    @ApiModelProperty(example = "null", required = true, value = "True if the starbase (POS) is using alliance standings, otherwise using corporation's")
    public Boolean getUseAllianceStandings() {
        return useAllianceStandings;
    }

    public void setUseAllianceStandings(Boolean useAllianceStandings) {
        this.useAllianceStandings = useAllianceStandings;
    }

    public CorporationStarbaseResponse attackStandingThreshold(Float attackStandingThreshold) {
        this.attackStandingThreshold = attackStandingThreshold;
        return this;
    }

    /**
     * Starbase (POS) will attack if target's standing is lower than this value
     * 
     * @return attackStandingThreshold
     **/
    @ApiModelProperty(example = "null", value = "Starbase (POS) will attack if target's standing is lower than this value")
    public Float getAttackStandingThreshold() {
        return attackStandingThreshold;
    }

    public void setAttackStandingThreshold(Float attackStandingThreshold) {
        this.attackStandingThreshold = attackStandingThreshold;
    }

    public CorporationStarbaseResponse attackSecurityStatusThreshold(Float attackSecurityStatusThreshold) {
        this.attackSecurityStatusThreshold = attackSecurityStatusThreshold;
        return this;
    }

    /**
     * Starbase (POS) will attack if target's security standing is lower than
     * this value
     * 
     * @return attackSecurityStatusThreshold
     **/
    @ApiModelProperty(example = "null", value = "Starbase (POS) will attack if target's security standing is lower than this value")
    public Float getAttackSecurityStatusThreshold() {
        return attackSecurityStatusThreshold;
    }

    public void setAttackSecurityStatusThreshold(Float attackSecurityStatusThreshold) {
        this.attackSecurityStatusThreshold = attackSecurityStatusThreshold;
    }

    public CorporationStarbaseResponse attackIfOtherSecurityStatusDropping(Boolean attackIfOtherSecurityStatusDropping) {
        this.attackIfOtherSecurityStatusDropping = attackIfOtherSecurityStatusDropping;
        return this;
    }

    /**
     * attack_if_other_security_status_dropping boolean
     * 
     * @return attackIfOtherSecurityStatusDropping
     **/
    @ApiModelProperty(example = "null", required = true, value = "attack_if_other_security_status_dropping boolean")
    public Boolean getAttackIfOtherSecurityStatusDropping() {
        return attackIfOtherSecurityStatusDropping;
    }

    public void setAttackIfOtherSecurityStatusDropping(Boolean attackIfOtherSecurityStatusDropping) {
        this.attackIfOtherSecurityStatusDropping = attackIfOtherSecurityStatusDropping;
    }

    public CorporationStarbaseResponse attackIfAtWar(Boolean attackIfAtWar) {
        this.attackIfAtWar = attackIfAtWar;
        return this;
    }

    /**
     * attack_if_at_war boolean
     * 
     * @return attackIfAtWar
     **/
    @ApiModelProperty(example = "null", required = true, value = "attack_if_at_war boolean")
    public Boolean getAttackIfAtWar() {
        return attackIfAtWar;
    }

    public void setAttackIfAtWar(Boolean attackIfAtWar) {
        this.attackIfAtWar = attackIfAtWar;
    }

    public CorporationStarbaseResponse fuels(List<CorporationStarbaseFuel> fuels) {
        this.fuels = fuels;
        return this;
    }

    public CorporationStarbaseResponse addFuelsItem(CorporationStarbaseFuel fuelsItem) {
        this.fuels.add(fuelsItem);
        return this;
    }

    /**
     * Fuel blocks and other things that will be consumed when operating a
     * starbase (POS)
     * 
     * @return fuels
     **/
    @ApiModelProperty(example = "null", value = "Fuel blocks and other things that will be consumed when operating a starbase (POS)")
    public List<CorporationStarbaseFuel> getFuels() {
        return fuels;
    }

    public void setFuels(List<CorporationStarbaseFuel> fuels) {
        this.fuels = fuels;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationStarbaseResponse corporationStarbaseResponse = (CorporationStarbaseResponse) o;
        return Objects.equals(this.fuelBayView, corporationStarbaseResponse.fuelBayView)
                && Objects.equals(this.fuelBayTake, corporationStarbaseResponse.fuelBayTake)
                && Objects.equals(this.anchor, corporationStarbaseResponse.anchor)
                && Objects.equals(this.unanchor, corporationStarbaseResponse.unanchor)
                && Objects.equals(this.online, corporationStarbaseResponse.online)
                && Objects.equals(this.offline, corporationStarbaseResponse.offline)
                && Objects.equals(this.allowCorporationMembers, corporationStarbaseResponse.allowCorporationMembers)
                && Objects.equals(this.allowAllianceMembers, corporationStarbaseResponse.allowAllianceMembers)
                && Objects.equals(this.useAllianceStandings, corporationStarbaseResponse.useAllianceStandings)
                && Objects.equals(this.attackStandingThreshold, corporationStarbaseResponse.attackStandingThreshold)
                && Objects.equals(this.attackSecurityStatusThreshold,
                        corporationStarbaseResponse.attackSecurityStatusThreshold)
                && Objects.equals(this.attackIfOtherSecurityStatusDropping,
                        corporationStarbaseResponse.attackIfOtherSecurityStatusDropping)
                && Objects.equals(this.attackIfAtWar, corporationStarbaseResponse.attackIfAtWar)
                && Objects.equals(this.fuels, corporationStarbaseResponse.fuels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fuelBayView, fuelBayTake, anchor, unanchor, online, offline, allowCorporationMembers,
                allowAllianceMembers, useAllianceStandings, attackStandingThreshold, attackSecurityStatusThreshold,
                attackIfOtherSecurityStatusDropping, attackIfAtWar, fuels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationStarbaseResponse {\n");

        sb.append("    fuelBayView: ").append(toIndentedString(fuelBayView)).append("\n");
        sb.append("    fuelBayTake: ").append(toIndentedString(fuelBayTake)).append("\n");
        sb.append("    anchor: ").append(toIndentedString(anchor)).append("\n");
        sb.append("    unanchor: ").append(toIndentedString(unanchor)).append("\n");
        sb.append("    online: ").append(toIndentedString(online)).append("\n");
        sb.append("    offline: ").append(toIndentedString(offline)).append("\n");
        sb.append("    allowCorporationMembers: ").append(toIndentedString(allowCorporationMembers)).append("\n");
        sb.append("    allowAllianceMembers: ").append(toIndentedString(allowAllianceMembers)).append("\n");
        sb.append("    useAllianceStandings: ").append(toIndentedString(useAllianceStandings)).append("\n");
        sb.append("    attackStandingThreshold: ").append(toIndentedString(attackStandingThreshold)).append("\n");
        sb.append("    attackSecurityStatusThreshold: ").append(toIndentedString(attackSecurityStatusThreshold))
                .append("\n");
        sb.append("    attackIfOtherSecurityStatusDropping: ")
                .append(toIndentedString(attackIfOtherSecurityStatusDropping)).append("\n");
        sb.append("    attackIfAtWar: ").append(toIndentedString(attackIfAtWar)).append("\n");
        sb.append("    fuels: ").append(toIndentedString(fuels)).append("\n");
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