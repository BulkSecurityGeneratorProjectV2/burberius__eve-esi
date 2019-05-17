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
import java.io.Serializable;

/**
 * travel object
 */
@ApiModel(description = "travel object")
public class CharacterStatsTravel implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_JUMPS_STARGATE_LOW_SEC = "jumps_stargate_low_sec";
    @SerializedName(SERIALIZED_NAME_JUMPS_STARGATE_LOW_SEC)
    private Long jumpsStargateLowSec;

    public static final String SERIALIZED_NAME_WARPS_TO_BOOKMARK = "warps_to_bookmark";
    @SerializedName(SERIALIZED_NAME_WARPS_TO_BOOKMARK)
    private Long warpsToBookmark;

    public static final String SERIALIZED_NAME_DOCKS_HIGH_SEC = "docks_high_sec";
    @SerializedName(SERIALIZED_NAME_DOCKS_HIGH_SEC)
    private Long docksHighSec;

    public static final String SERIALIZED_NAME_WARPS_NULL_SEC = "warps_null_sec";
    @SerializedName(SERIALIZED_NAME_WARPS_NULL_SEC)
    private Long warpsNullSec;

    public static final String SERIALIZED_NAME_WARPS_WORMHOLE = "warps_wormhole";
    @SerializedName(SERIALIZED_NAME_WARPS_WORMHOLE)
    private Long warpsWormhole;

    public static final String SERIALIZED_NAME_DISTANCE_WARPED_LOW_SEC = "distance_warped_low_sec";
    @SerializedName(SERIALIZED_NAME_DISTANCE_WARPED_LOW_SEC)
    private Long distanceWarpedLowSec;

    public static final String SERIALIZED_NAME_WARPS_TO_FLEET_MEMBER = "warps_to_fleet_member";
    @SerializedName(SERIALIZED_NAME_WARPS_TO_FLEET_MEMBER)
    private Long warpsToFleetMember;

    public static final String SERIALIZED_NAME_JUMPS_WORMHOLE = "jumps_wormhole";
    @SerializedName(SERIALIZED_NAME_JUMPS_WORMHOLE)
    private Long jumpsWormhole;

    public static final String SERIALIZED_NAME_ALIGN_TO = "align_to";
    @SerializedName(SERIALIZED_NAME_ALIGN_TO)
    private Long alignTo;

    public static final String SERIALIZED_NAME_DISTANCE_WARPED_HIGH_SEC = "distance_warped_high_sec";
    @SerializedName(SERIALIZED_NAME_DISTANCE_WARPED_HIGH_SEC)
    private Long distanceWarpedHighSec;

    public static final String SERIALIZED_NAME_DOCKS_LOW_SEC = "docks_low_sec";
    @SerializedName(SERIALIZED_NAME_DOCKS_LOW_SEC)
    private Long docksLowSec;

    public static final String SERIALIZED_NAME_DISTANCE_WARPED_WORMHOLE = "distance_warped_wormhole";
    @SerializedName(SERIALIZED_NAME_DISTANCE_WARPED_WORMHOLE)
    private Long distanceWarpedWormhole;

    public static final String SERIALIZED_NAME_WARPS_LOW_SEC = "warps_low_sec";
    @SerializedName(SERIALIZED_NAME_WARPS_LOW_SEC)
    private Long warpsLowSec;

    public static final String SERIALIZED_NAME_WARPS_HIGH_SEC = "warps_high_sec";
    @SerializedName(SERIALIZED_NAME_WARPS_HIGH_SEC)
    private Long warpsHighSec;

    public static final String SERIALIZED_NAME_WARPS_TO_CELESTIAL = "warps_to_celestial";
    @SerializedName(SERIALIZED_NAME_WARPS_TO_CELESTIAL)
    private Long warpsToCelestial;

    public static final String SERIALIZED_NAME_JUMPS_STARGATE_HIGH_SEC = "jumps_stargate_high_sec";
    @SerializedName(SERIALIZED_NAME_JUMPS_STARGATE_HIGH_SEC)
    private Long jumpsStargateHighSec;

    public static final String SERIALIZED_NAME_ACCELERATION_GATE_ACTIVATIONS = "acceleration_gate_activations";
    @SerializedName(SERIALIZED_NAME_ACCELERATION_GATE_ACTIVATIONS)
    private Long accelerationGateActivations;

    public static final String SERIALIZED_NAME_DOCKS_NULL_SEC = "docks_null_sec";
    @SerializedName(SERIALIZED_NAME_DOCKS_NULL_SEC)
    private Long docksNullSec;

    public static final String SERIALIZED_NAME_DISTANCE_WARPED_NULL_SEC = "distance_warped_null_sec";
    @SerializedName(SERIALIZED_NAME_DISTANCE_WARPED_NULL_SEC)
    private Long distanceWarpedNullSec;

    public static final String SERIALIZED_NAME_JUMPS_STARGATE_NULL_SEC = "jumps_stargate_null_sec";
    @SerializedName(SERIALIZED_NAME_JUMPS_STARGATE_NULL_SEC)
    private Long jumpsStargateNullSec;

    public static final String SERIALIZED_NAME_WARPS_TO_SCAN_RESULT = "warps_to_scan_result";
    @SerializedName(SERIALIZED_NAME_WARPS_TO_SCAN_RESULT)
    private Long warpsToScanResult;

    public CharacterStatsTravel jumpsStargateLowSec(Long jumpsStargateLowSec) {
        this.jumpsStargateLowSec = jumpsStargateLowSec;
        return this;
    }

    /**
     * jumps_stargate_low_sec integer
     * 
     * @return jumpsStargateLowSec
     **/
    @ApiModelProperty(value = "jumps_stargate_low_sec integer")
    public Long getJumpsStargateLowSec() {
        return jumpsStargateLowSec;
    }

    public void setJumpsStargateLowSec(Long jumpsStargateLowSec) {
        this.jumpsStargateLowSec = jumpsStargateLowSec;
    }

    public CharacterStatsTravel warpsToBookmark(Long warpsToBookmark) {
        this.warpsToBookmark = warpsToBookmark;
        return this;
    }

    /**
     * warps_to_bookmark integer
     * 
     * @return warpsToBookmark
     **/
    @ApiModelProperty(value = "warps_to_bookmark integer")
    public Long getWarpsToBookmark() {
        return warpsToBookmark;
    }

    public void setWarpsToBookmark(Long warpsToBookmark) {
        this.warpsToBookmark = warpsToBookmark;
    }

    public CharacterStatsTravel docksHighSec(Long docksHighSec) {
        this.docksHighSec = docksHighSec;
        return this;
    }

    /**
     * docks_high_sec integer
     * 
     * @return docksHighSec
     **/
    @ApiModelProperty(value = "docks_high_sec integer")
    public Long getDocksHighSec() {
        return docksHighSec;
    }

    public void setDocksHighSec(Long docksHighSec) {
        this.docksHighSec = docksHighSec;
    }

    public CharacterStatsTravel warpsNullSec(Long warpsNullSec) {
        this.warpsNullSec = warpsNullSec;
        return this;
    }

    /**
     * warps_null_sec integer
     * 
     * @return warpsNullSec
     **/
    @ApiModelProperty(value = "warps_null_sec integer")
    public Long getWarpsNullSec() {
        return warpsNullSec;
    }

    public void setWarpsNullSec(Long warpsNullSec) {
        this.warpsNullSec = warpsNullSec;
    }

    public CharacterStatsTravel warpsWormhole(Long warpsWormhole) {
        this.warpsWormhole = warpsWormhole;
        return this;
    }

    /**
     * warps_wormhole integer
     * 
     * @return warpsWormhole
     **/
    @ApiModelProperty(value = "warps_wormhole integer")
    public Long getWarpsWormhole() {
        return warpsWormhole;
    }

    public void setWarpsWormhole(Long warpsWormhole) {
        this.warpsWormhole = warpsWormhole;
    }

    public CharacterStatsTravel distanceWarpedLowSec(Long distanceWarpedLowSec) {
        this.distanceWarpedLowSec = distanceWarpedLowSec;
        return this;
    }

    /**
     * distance_warped_low_sec integer
     * 
     * @return distanceWarpedLowSec
     **/
    @ApiModelProperty(value = "distance_warped_low_sec integer")
    public Long getDistanceWarpedLowSec() {
        return distanceWarpedLowSec;
    }

    public void setDistanceWarpedLowSec(Long distanceWarpedLowSec) {
        this.distanceWarpedLowSec = distanceWarpedLowSec;
    }

    public CharacterStatsTravel warpsToFleetMember(Long warpsToFleetMember) {
        this.warpsToFleetMember = warpsToFleetMember;
        return this;
    }

    /**
     * warps_to_fleet_member integer
     * 
     * @return warpsToFleetMember
     **/
    @ApiModelProperty(value = "warps_to_fleet_member integer")
    public Long getWarpsToFleetMember() {
        return warpsToFleetMember;
    }

    public void setWarpsToFleetMember(Long warpsToFleetMember) {
        this.warpsToFleetMember = warpsToFleetMember;
    }

    public CharacterStatsTravel jumpsWormhole(Long jumpsWormhole) {
        this.jumpsWormhole = jumpsWormhole;
        return this;
    }

    /**
     * jumps_wormhole integer
     * 
     * @return jumpsWormhole
     **/
    @ApiModelProperty(value = "jumps_wormhole integer")
    public Long getJumpsWormhole() {
        return jumpsWormhole;
    }

    public void setJumpsWormhole(Long jumpsWormhole) {
        this.jumpsWormhole = jumpsWormhole;
    }

    public CharacterStatsTravel alignTo(Long alignTo) {
        this.alignTo = alignTo;
        return this;
    }

    /**
     * align_to integer
     * 
     * @return alignTo
     **/
    @ApiModelProperty(value = "align_to integer")
    public Long getAlignTo() {
        return alignTo;
    }

    public void setAlignTo(Long alignTo) {
        this.alignTo = alignTo;
    }

    public CharacterStatsTravel distanceWarpedHighSec(Long distanceWarpedHighSec) {
        this.distanceWarpedHighSec = distanceWarpedHighSec;
        return this;
    }

    /**
     * distance_warped_high_sec integer
     * 
     * @return distanceWarpedHighSec
     **/
    @ApiModelProperty(value = "distance_warped_high_sec integer")
    public Long getDistanceWarpedHighSec() {
        return distanceWarpedHighSec;
    }

    public void setDistanceWarpedHighSec(Long distanceWarpedHighSec) {
        this.distanceWarpedHighSec = distanceWarpedHighSec;
    }

    public CharacterStatsTravel docksLowSec(Long docksLowSec) {
        this.docksLowSec = docksLowSec;
        return this;
    }

    /**
     * docks_low_sec integer
     * 
     * @return docksLowSec
     **/
    @ApiModelProperty(value = "docks_low_sec integer")
    public Long getDocksLowSec() {
        return docksLowSec;
    }

    public void setDocksLowSec(Long docksLowSec) {
        this.docksLowSec = docksLowSec;
    }

    public CharacterStatsTravel distanceWarpedWormhole(Long distanceWarpedWormhole) {
        this.distanceWarpedWormhole = distanceWarpedWormhole;
        return this;
    }

    /**
     * distance_warped_wormhole integer
     * 
     * @return distanceWarpedWormhole
     **/
    @ApiModelProperty(value = "distance_warped_wormhole integer")
    public Long getDistanceWarpedWormhole() {
        return distanceWarpedWormhole;
    }

    public void setDistanceWarpedWormhole(Long distanceWarpedWormhole) {
        this.distanceWarpedWormhole = distanceWarpedWormhole;
    }

    public CharacterStatsTravel warpsLowSec(Long warpsLowSec) {
        this.warpsLowSec = warpsLowSec;
        return this;
    }

    /**
     * warps_low_sec integer
     * 
     * @return warpsLowSec
     **/
    @ApiModelProperty(value = "warps_low_sec integer")
    public Long getWarpsLowSec() {
        return warpsLowSec;
    }

    public void setWarpsLowSec(Long warpsLowSec) {
        this.warpsLowSec = warpsLowSec;
    }

    public CharacterStatsTravel warpsHighSec(Long warpsHighSec) {
        this.warpsHighSec = warpsHighSec;
        return this;
    }

    /**
     * warps_high_sec integer
     * 
     * @return warpsHighSec
     **/
    @ApiModelProperty(value = "warps_high_sec integer")
    public Long getWarpsHighSec() {
        return warpsHighSec;
    }

    public void setWarpsHighSec(Long warpsHighSec) {
        this.warpsHighSec = warpsHighSec;
    }

    public CharacterStatsTravel warpsToCelestial(Long warpsToCelestial) {
        this.warpsToCelestial = warpsToCelestial;
        return this;
    }

    /**
     * warps_to_celestial integer
     * 
     * @return warpsToCelestial
     **/
    @ApiModelProperty(value = "warps_to_celestial integer")
    public Long getWarpsToCelestial() {
        return warpsToCelestial;
    }

    public void setWarpsToCelestial(Long warpsToCelestial) {
        this.warpsToCelestial = warpsToCelestial;
    }

    public CharacterStatsTravel jumpsStargateHighSec(Long jumpsStargateHighSec) {
        this.jumpsStargateHighSec = jumpsStargateHighSec;
        return this;
    }

    /**
     * jumps_stargate_high_sec integer
     * 
     * @return jumpsStargateHighSec
     **/
    @ApiModelProperty(value = "jumps_stargate_high_sec integer")
    public Long getJumpsStargateHighSec() {
        return jumpsStargateHighSec;
    }

    public void setJumpsStargateHighSec(Long jumpsStargateHighSec) {
        this.jumpsStargateHighSec = jumpsStargateHighSec;
    }

    public CharacterStatsTravel accelerationGateActivations(Long accelerationGateActivations) {
        this.accelerationGateActivations = accelerationGateActivations;
        return this;
    }

    /**
     * acceleration_gate_activations integer
     * 
     * @return accelerationGateActivations
     **/
    @ApiModelProperty(value = "acceleration_gate_activations integer")
    public Long getAccelerationGateActivations() {
        return accelerationGateActivations;
    }

    public void setAccelerationGateActivations(Long accelerationGateActivations) {
        this.accelerationGateActivations = accelerationGateActivations;
    }

    public CharacterStatsTravel docksNullSec(Long docksNullSec) {
        this.docksNullSec = docksNullSec;
        return this;
    }

    /**
     * docks_null_sec integer
     * 
     * @return docksNullSec
     **/
    @ApiModelProperty(value = "docks_null_sec integer")
    public Long getDocksNullSec() {
        return docksNullSec;
    }

    public void setDocksNullSec(Long docksNullSec) {
        this.docksNullSec = docksNullSec;
    }

    public CharacterStatsTravel distanceWarpedNullSec(Long distanceWarpedNullSec) {
        this.distanceWarpedNullSec = distanceWarpedNullSec;
        return this;
    }

    /**
     * distance_warped_null_sec integer
     * 
     * @return distanceWarpedNullSec
     **/
    @ApiModelProperty(value = "distance_warped_null_sec integer")
    public Long getDistanceWarpedNullSec() {
        return distanceWarpedNullSec;
    }

    public void setDistanceWarpedNullSec(Long distanceWarpedNullSec) {
        this.distanceWarpedNullSec = distanceWarpedNullSec;
    }

    public CharacterStatsTravel jumpsStargateNullSec(Long jumpsStargateNullSec) {
        this.jumpsStargateNullSec = jumpsStargateNullSec;
        return this;
    }

    /**
     * jumps_stargate_null_sec integer
     * 
     * @return jumpsStargateNullSec
     **/
    @ApiModelProperty(value = "jumps_stargate_null_sec integer")
    public Long getJumpsStargateNullSec() {
        return jumpsStargateNullSec;
    }

    public void setJumpsStargateNullSec(Long jumpsStargateNullSec) {
        this.jumpsStargateNullSec = jumpsStargateNullSec;
    }

    public CharacterStatsTravel warpsToScanResult(Long warpsToScanResult) {
        this.warpsToScanResult = warpsToScanResult;
        return this;
    }

    /**
     * warps_to_scan_result integer
     * 
     * @return warpsToScanResult
     **/
    @ApiModelProperty(value = "warps_to_scan_result integer")
    public Long getWarpsToScanResult() {
        return warpsToScanResult;
    }

    public void setWarpsToScanResult(Long warpsToScanResult) {
        this.warpsToScanResult = warpsToScanResult;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterStatsTravel characterStatsTravel = (CharacterStatsTravel) o;
        return Objects.equals(this.jumpsStargateLowSec, characterStatsTravel.jumpsStargateLowSec)
                && Objects.equals(this.warpsToBookmark, characterStatsTravel.warpsToBookmark)
                && Objects.equals(this.docksHighSec, characterStatsTravel.docksHighSec)
                && Objects.equals(this.warpsNullSec, characterStatsTravel.warpsNullSec)
                && Objects.equals(this.warpsWormhole, characterStatsTravel.warpsWormhole)
                && Objects.equals(this.distanceWarpedLowSec, characterStatsTravel.distanceWarpedLowSec)
                && Objects.equals(this.warpsToFleetMember, characterStatsTravel.warpsToFleetMember)
                && Objects.equals(this.jumpsWormhole, characterStatsTravel.jumpsWormhole)
                && Objects.equals(this.alignTo, characterStatsTravel.alignTo)
                && Objects.equals(this.distanceWarpedHighSec, characterStatsTravel.distanceWarpedHighSec)
                && Objects.equals(this.docksLowSec, characterStatsTravel.docksLowSec)
                && Objects.equals(this.distanceWarpedWormhole, characterStatsTravel.distanceWarpedWormhole)
                && Objects.equals(this.warpsLowSec, characterStatsTravel.warpsLowSec)
                && Objects.equals(this.warpsHighSec, characterStatsTravel.warpsHighSec)
                && Objects.equals(this.warpsToCelestial, characterStatsTravel.warpsToCelestial)
                && Objects.equals(this.jumpsStargateHighSec, characterStatsTravel.jumpsStargateHighSec)
                && Objects.equals(this.accelerationGateActivations, characterStatsTravel.accelerationGateActivations)
                && Objects.equals(this.docksNullSec, characterStatsTravel.docksNullSec)
                && Objects.equals(this.distanceWarpedNullSec, characterStatsTravel.distanceWarpedNullSec)
                && Objects.equals(this.jumpsStargateNullSec, characterStatsTravel.jumpsStargateNullSec)
                && Objects.equals(this.warpsToScanResult, characterStatsTravel.warpsToScanResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jumpsStargateLowSec, warpsToBookmark, docksHighSec, warpsNullSec, warpsWormhole,
                distanceWarpedLowSec, warpsToFleetMember, jumpsWormhole, alignTo, distanceWarpedHighSec, docksLowSec,
                distanceWarpedWormhole, warpsLowSec, warpsHighSec, warpsToCelestial, jumpsStargateHighSec,
                accelerationGateActivations, docksNullSec, distanceWarpedNullSec, jumpsStargateNullSec,
                warpsToScanResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterStatsTravel {\n");
        sb.append("    jumpsStargateLowSec: ").append(toIndentedString(jumpsStargateLowSec)).append("\n");
        sb.append("    warpsToBookmark: ").append(toIndentedString(warpsToBookmark)).append("\n");
        sb.append("    docksHighSec: ").append(toIndentedString(docksHighSec)).append("\n");
        sb.append("    warpsNullSec: ").append(toIndentedString(warpsNullSec)).append("\n");
        sb.append("    warpsWormhole: ").append(toIndentedString(warpsWormhole)).append("\n");
        sb.append("    distanceWarpedLowSec: ").append(toIndentedString(distanceWarpedLowSec)).append("\n");
        sb.append("    warpsToFleetMember: ").append(toIndentedString(warpsToFleetMember)).append("\n");
        sb.append("    jumpsWormhole: ").append(toIndentedString(jumpsWormhole)).append("\n");
        sb.append("    alignTo: ").append(toIndentedString(alignTo)).append("\n");
        sb.append("    distanceWarpedHighSec: ").append(toIndentedString(distanceWarpedHighSec)).append("\n");
        sb.append("    docksLowSec: ").append(toIndentedString(docksLowSec)).append("\n");
        sb.append("    distanceWarpedWormhole: ").append(toIndentedString(distanceWarpedWormhole)).append("\n");
        sb.append("    warpsLowSec: ").append(toIndentedString(warpsLowSec)).append("\n");
        sb.append("    warpsHighSec: ").append(toIndentedString(warpsHighSec)).append("\n");
        sb.append("    warpsToCelestial: ").append(toIndentedString(warpsToCelestial)).append("\n");
        sb.append("    jumpsStargateHighSec: ").append(toIndentedString(jumpsStargateHighSec)).append("\n");
        sb.append("    accelerationGateActivations: ").append(toIndentedString(accelerationGateActivations))
                .append("\n");
        sb.append("    docksNullSec: ").append(toIndentedString(docksNullSec)).append("\n");
        sb.append("    distanceWarpedNullSec: ").append(toIndentedString(distanceWarpedNullSec)).append("\n");
        sb.append("    jumpsStargateNullSec: ").append(toIndentedString(jumpsStargateNullSec)).append("\n");
        sb.append("    warpsToScanResult: ").append(toIndentedString(warpsToScanResult)).append("\n");
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
