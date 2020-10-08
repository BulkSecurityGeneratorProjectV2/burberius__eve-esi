/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * The version of the OpenAPI document: 1.7.2
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
public class CorporationBlueprintsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
    @SerializedName(SERIALIZED_NAME_ITEM_ID)
    private Long itemId;

    /**
     * Type of the location_id
     */
    @JsonAdapter(LocationFlagEnum.Adapter.class)
    public enum LocationFlagEnum {
        ASSETSAFETY("AssetSafety"),

        AUTOFIT("AutoFit"),

        BONUS("Bonus"),

        BOOSTER("Booster"),

        BOOSTERBAY("BoosterBay"),

        CAPSULE("Capsule"),

        CARGO("Cargo"),

        CORPDELIVERIES("CorpDeliveries"),

        CORPSAG1("CorpSAG1"),

        CORPSAG2("CorpSAG2"),

        CORPSAG3("CorpSAG3"),

        CORPSAG4("CorpSAG4"),

        CORPSAG5("CorpSAG5"),

        CORPSAG6("CorpSAG6"),

        CORPSAG7("CorpSAG7"),

        CRATELOOT("CrateLoot"),

        DELIVERIES("Deliveries"),

        DRONEBAY("DroneBay"),

        DUSTBATTLE("DustBattle"),

        DUSTDATABANK("DustDatabank"),

        FIGHTERBAY("FighterBay"),

        FIGHTERTUBE0("FighterTube0"),

        FIGHTERTUBE1("FighterTube1"),

        FIGHTERTUBE2("FighterTube2"),

        FIGHTERTUBE3("FighterTube3"),

        FIGHTERTUBE4("FighterTube4"),

        FLEETHANGAR("FleetHangar"),

        FRIGATEESCAPEBAY("FrigateEscapeBay"),

        HANGAR("Hangar"),

        HANGARALL("HangarAll"),

        HISLOT0("HiSlot0"),

        HISLOT1("HiSlot1"),

        HISLOT2("HiSlot2"),

        HISLOT3("HiSlot3"),

        HISLOT4("HiSlot4"),

        HISLOT5("HiSlot5"),

        HISLOT6("HiSlot6"),

        HISLOT7("HiSlot7"),

        HIDDENMODIFIERS("HiddenModifiers"),

        IMPLANT("Implant"),

        IMPOUNDED("Impounded"),

        JUNKYARDREPROCESSED("JunkyardReprocessed"),

        JUNKYARDTRASHED("JunkyardTrashed"),

        LOSLOT0("LoSlot0"),

        LOSLOT1("LoSlot1"),

        LOSLOT2("LoSlot2"),

        LOSLOT3("LoSlot3"),

        LOSLOT4("LoSlot4"),

        LOSLOT5("LoSlot5"),

        LOSLOT6("LoSlot6"),

        LOSLOT7("LoSlot7"),

        LOCKED("Locked"),

        MEDSLOT0("MedSlot0"),

        MEDSLOT1("MedSlot1"),

        MEDSLOT2("MedSlot2"),

        MEDSLOT3("MedSlot3"),

        MEDSLOT4("MedSlot4"),

        MEDSLOT5("MedSlot5"),

        MEDSLOT6("MedSlot6"),

        MEDSLOT7("MedSlot7"),

        OFFICEFOLDER("OfficeFolder"),

        PILOT("Pilot"),

        PLANETSURFACE("PlanetSurface"),

        QUAFEBAY("QuafeBay"),

        REWARD("Reward"),

        RIGSLOT0("RigSlot0"),

        RIGSLOT1("RigSlot1"),

        RIGSLOT2("RigSlot2"),

        RIGSLOT3("RigSlot3"),

        RIGSLOT4("RigSlot4"),

        RIGSLOT5("RigSlot5"),

        RIGSLOT6("RigSlot6"),

        RIGSLOT7("RigSlot7"),

        SECONDARYSTORAGE("SecondaryStorage"),

        SERVICESLOT0("ServiceSlot0"),

        SERVICESLOT1("ServiceSlot1"),

        SERVICESLOT2("ServiceSlot2"),

        SERVICESLOT3("ServiceSlot3"),

        SERVICESLOT4("ServiceSlot4"),

        SERVICESLOT5("ServiceSlot5"),

        SERVICESLOT6("ServiceSlot6"),

        SERVICESLOT7("ServiceSlot7"),

        SHIPHANGAR("ShipHangar"),

        SHIPOFFLINE("ShipOffline"),

        SKILL("Skill"),

        SKILLINTRAINING("SkillInTraining"),

        SPECIALIZEDAMMOHOLD("SpecializedAmmoHold"),

        SPECIALIZEDCOMMANDCENTERHOLD("SpecializedCommandCenterHold"),

        SPECIALIZEDFUELBAY("SpecializedFuelBay"),

        SPECIALIZEDGASHOLD("SpecializedGasHold"),

        SPECIALIZEDINDUSTRIALSHIPHOLD("SpecializedIndustrialShipHold"),

        SPECIALIZEDLARGESHIPHOLD("SpecializedLargeShipHold"),

        SPECIALIZEDMATERIALBAY("SpecializedMaterialBay"),

        SPECIALIZEDMEDIUMSHIPHOLD("SpecializedMediumShipHold"),

        SPECIALIZEDMINERALHOLD("SpecializedMineralHold"),

        SPECIALIZEDOREHOLD("SpecializedOreHold"),

        SPECIALIZEDPLANETARYCOMMODITIESHOLD("SpecializedPlanetaryCommoditiesHold"),

        SPECIALIZEDSALVAGEHOLD("SpecializedSalvageHold"),

        SPECIALIZEDSHIPHOLD("SpecializedShipHold"),

        SPECIALIZEDSMALLSHIPHOLD("SpecializedSmallShipHold"),

        STRUCTUREACTIVE("StructureActive"),

        STRUCTUREFUEL("StructureFuel"),

        STRUCTUREINACTIVE("StructureInactive"),

        STRUCTUREOFFLINE("StructureOffline"),

        SUBSYSTEMBAY("SubSystemBay"),

        SUBSYSTEMSLOT0("SubSystemSlot0"),

        SUBSYSTEMSLOT1("SubSystemSlot1"),

        SUBSYSTEMSLOT2("SubSystemSlot2"),

        SUBSYSTEMSLOT3("SubSystemSlot3"),

        SUBSYSTEMSLOT4("SubSystemSlot4"),

        SUBSYSTEMSLOT5("SubSystemSlot5"),

        SUBSYSTEMSLOT6("SubSystemSlot6"),

        SUBSYSTEMSLOT7("SubSystemSlot7"),

        UNLOCKED("Unlocked"),

        WALLET("Wallet"),

        WARDROBE("Wardrobe");

        private String value;

        LocationFlagEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static LocationFlagEnum fromValue(String value) {
            for (LocationFlagEnum b : LocationFlagEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<LocationFlagEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final LocationFlagEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public LocationFlagEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return LocationFlagEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_LOCATION_FLAG = "location_flag";
    @SerializedName(SERIALIZED_NAME_LOCATION_FLAG)
    private String locationFlag;
    private LocationFlagEnum locationFlagEnum;

    public static final String SERIALIZED_NAME_LOCATION_ID = "location_id";
    @SerializedName(SERIALIZED_NAME_LOCATION_ID)
    private Long locationId;

    public static final String SERIALIZED_NAME_MATERIAL_EFFICIENCY = "material_efficiency";
    @SerializedName(SERIALIZED_NAME_MATERIAL_EFFICIENCY)
    private Integer materialEfficiency;

    public static final String SERIALIZED_NAME_QUANTITY = "quantity";
    @SerializedName(SERIALIZED_NAME_QUANTITY)
    private Integer quantity;

    public static final String SERIALIZED_NAME_RUNS = "runs";
    @SerializedName(SERIALIZED_NAME_RUNS)
    private Integer runs;

    public static final String SERIALIZED_NAME_TIME_EFFICIENCY = "time_efficiency";
    @SerializedName(SERIALIZED_NAME_TIME_EFFICIENCY)
    private Integer timeEfficiency;

    public static final String SERIALIZED_NAME_TYPE_ID = "type_id";
    @SerializedName(SERIALIZED_NAME_TYPE_ID)
    private Integer typeId;

    public CorporationBlueprintsResponse itemId(Long itemId) {

        this.itemId = itemId;
        return this;
    }

    /**
     * Unique ID for this item.
     * 
     * @return itemId
     **/
    @ApiModelProperty(required = true, value = "Unique ID for this item.")
    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public CorporationBlueprintsResponse locationFlag(LocationFlagEnum locationFlagEnum) {

        this.locationFlagEnum = locationFlagEnum;
        return this;
    }

    public CorporationBlueprintsResponse locationFlagString(String locationFlag) {

        this.locationFlag = locationFlag;
        return this;
    }

    /**
     * Type of the location_id
     * 
     * @return locationFlag
     **/
    @ApiModelProperty(required = true, value = "Type of the location_id")
    public LocationFlagEnum getLocationFlag() {
        if (locationFlagEnum == null) {
            locationFlagEnum = LocationFlagEnum.fromValue(locationFlag);
        }
        return locationFlagEnum;
    }

    public String getLocationFlagString() {
        return locationFlag;
    }

    public void setLocationFlag(LocationFlagEnum locationFlagEnum) {
        this.locationFlagEnum = locationFlagEnum;
    }

    public void setLocationFlagString(String locationFlag) {
        this.locationFlag = locationFlag;
    }

    public CorporationBlueprintsResponse locationId(Long locationId) {

        this.locationId = locationId;
        return this;
    }

    /**
     * References a station, a ship or an item_id if this blueprint is located
     * within a container.
     * 
     * @return locationId
     **/
    @ApiModelProperty(required = true, value = "References a station, a ship or an item_id if this blueprint is located within a container.")
    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public CorporationBlueprintsResponse materialEfficiency(Integer materialEfficiency) {

        this.materialEfficiency = materialEfficiency;
        return this;
    }

    /**
     * Material Efficiency Level of the blueprint. minimum: 0 maximum: 25
     * 
     * @return materialEfficiency
     **/
    @ApiModelProperty(required = true, value = "Material Efficiency Level of the blueprint.")
    public Integer getMaterialEfficiency() {
        return materialEfficiency;
    }

    public void setMaterialEfficiency(Integer materialEfficiency) {
        this.materialEfficiency = materialEfficiency;
    }

    public CorporationBlueprintsResponse quantity(Integer quantity) {

        this.quantity = quantity;
        return this;
    }

    /**
     * A range of numbers with a minimum of -2 and no maximum value where -1 is
     * an original and -2 is a copy. It can be a positive integer if it is a
     * stack of blueprint originals fresh from the market (e.g. no activities
     * performed on them yet). minimum: -2
     * 
     * @return quantity
     **/
    @ApiModelProperty(required = true, value = "A range of numbers with a minimum of -2 and no maximum value where -1 is an original and -2 is a copy. It can be a positive integer if it is a stack of blueprint originals fresh from the market (e.g. no activities performed on them yet).")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public CorporationBlueprintsResponse runs(Integer runs) {

        this.runs = runs;
        return this;
    }

    /**
     * Number of runs remaining if the blueprint is a copy, -1 if it is an
     * original. minimum: -1
     * 
     * @return runs
     **/
    @ApiModelProperty(required = true, value = "Number of runs remaining if the blueprint is a copy, -1 if it is an original.")
    public Integer getRuns() {
        return runs;
    }

    public void setRuns(Integer runs) {
        this.runs = runs;
    }

    public CorporationBlueprintsResponse timeEfficiency(Integer timeEfficiency) {

        this.timeEfficiency = timeEfficiency;
        return this;
    }

    /**
     * Time Efficiency Level of the blueprint. minimum: 0 maximum: 20
     * 
     * @return timeEfficiency
     **/
    @ApiModelProperty(required = true, value = "Time Efficiency Level of the blueprint.")
    public Integer getTimeEfficiency() {
        return timeEfficiency;
    }

    public void setTimeEfficiency(Integer timeEfficiency) {
        this.timeEfficiency = timeEfficiency;
    }

    public CorporationBlueprintsResponse typeId(Integer typeId) {

        this.typeId = typeId;
        return this;
    }

    /**
     * type_id integer
     * 
     * @return typeId
     **/
    @ApiModelProperty(required = true, value = "type_id integer")
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
        CorporationBlueprintsResponse corporationBlueprintsResponse = (CorporationBlueprintsResponse) o;
        return Objects.equals(this.itemId, corporationBlueprintsResponse.itemId)
                && Objects.equals(this.locationFlag, corporationBlueprintsResponse.locationFlag)
                && Objects.equals(this.locationId, corporationBlueprintsResponse.locationId)
                && Objects.equals(this.materialEfficiency, corporationBlueprintsResponse.materialEfficiency)
                && Objects.equals(this.quantity, corporationBlueprintsResponse.quantity)
                && Objects.equals(this.runs, corporationBlueprintsResponse.runs)
                && Objects.equals(this.timeEfficiency, corporationBlueprintsResponse.timeEfficiency)
                && Objects.equals(this.typeId, corporationBlueprintsResponse.typeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, locationFlag, locationId, materialEfficiency, quantity, runs, timeEfficiency,
                typeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationBlueprintsResponse {\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    locationFlag: ").append(toIndentedString(locationFlag)).append("\n");
        sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
        sb.append("    materialEfficiency: ").append(toIndentedString(materialEfficiency)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    runs: ").append(toIndentedString(runs)).append("\n");
        sb.append("    timeEfficiency: ").append(toIndentedString(timeEfficiency)).append("\n");
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
