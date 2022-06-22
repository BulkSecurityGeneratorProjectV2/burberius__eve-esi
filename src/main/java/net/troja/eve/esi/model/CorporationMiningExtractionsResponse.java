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
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CorporationMiningExtractionsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_CHUNK_ARRIVAL_TIME = "chunk_arrival_time";
    @SerializedName(SERIALIZED_NAME_CHUNK_ARRIVAL_TIME)
    private OffsetDateTime chunkArrivalTime;

    public static final String SERIALIZED_NAME_EXTRACTION_START_TIME = "extraction_start_time";
    @SerializedName(SERIALIZED_NAME_EXTRACTION_START_TIME)
    private OffsetDateTime extractionStartTime;

    public static final String SERIALIZED_NAME_MOON_ID = "moon_id";
    @SerializedName(SERIALIZED_NAME_MOON_ID)
    private Integer moonId;

    public static final String SERIALIZED_NAME_NATURAL_DECAY_TIME = "natural_decay_time";
    @SerializedName(SERIALIZED_NAME_NATURAL_DECAY_TIME)
    private OffsetDateTime naturalDecayTime;

    public static final String SERIALIZED_NAME_STRUCTURE_ID = "structure_id";
    @SerializedName(SERIALIZED_NAME_STRUCTURE_ID)
    private Long structureId;

    public CorporationMiningExtractionsResponse chunkArrivalTime(OffsetDateTime chunkArrivalTime) {

        this.chunkArrivalTime = chunkArrivalTime;
        return this;
    }

    /**
     * The time at which the chunk being extracted will arrive and can be
     * fractured by the moon mining drill.
     * 
     * @return chunkArrivalTime
     **/
    @ApiModelProperty(required = true, value = "The time at which the chunk being extracted will arrive and can be fractured by the moon mining drill. ")
    public OffsetDateTime getChunkArrivalTime() {
        return chunkArrivalTime;
    }

    public void setChunkArrivalTime(OffsetDateTime chunkArrivalTime) {
        this.chunkArrivalTime = chunkArrivalTime;
    }

    public CorporationMiningExtractionsResponse extractionStartTime(OffsetDateTime extractionStartTime) {

        this.extractionStartTime = extractionStartTime;
        return this;
    }

    /**
     * The time at which the current extraction was initiated.
     * 
     * @return extractionStartTime
     **/
    @ApiModelProperty(required = true, value = "The time at which the current extraction was initiated. ")
    public OffsetDateTime getExtractionStartTime() {
        return extractionStartTime;
    }

    public void setExtractionStartTime(OffsetDateTime extractionStartTime) {
        this.extractionStartTime = extractionStartTime;
    }

    public CorporationMiningExtractionsResponse moonId(Integer moonId) {

        this.moonId = moonId;
        return this;
    }

    /**
     * moon_id integer
     * 
     * @return moonId
     **/
    @ApiModelProperty(required = true, value = "moon_id integer")
    public Integer getMoonId() {
        return moonId;
    }

    public void setMoonId(Integer moonId) {
        this.moonId = moonId;
    }

    public CorporationMiningExtractionsResponse naturalDecayTime(OffsetDateTime naturalDecayTime) {

        this.naturalDecayTime = naturalDecayTime;
        return this;
    }

    /**
     * The time at which the chunk being extracted will naturally fracture if it
     * is not first fractured by the moon mining drill.
     * 
     * @return naturalDecayTime
     **/
    @ApiModelProperty(required = true, value = "The time at which the chunk being extracted will naturally fracture if it is not first fractured by the moon mining drill. ")
    public OffsetDateTime getNaturalDecayTime() {
        return naturalDecayTime;
    }

    public void setNaturalDecayTime(OffsetDateTime naturalDecayTime) {
        this.naturalDecayTime = naturalDecayTime;
    }

    public CorporationMiningExtractionsResponse structureId(Long structureId) {

        this.structureId = structureId;
        return this;
    }

    /**
     * structure_id integer
     * 
     * @return structureId
     **/
    @ApiModelProperty(required = true, value = "structure_id integer")
    public Long getStructureId() {
        return structureId;
    }

    public void setStructureId(Long structureId) {
        this.structureId = structureId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationMiningExtractionsResponse corporationMiningExtractionsResponse = (CorporationMiningExtractionsResponse) o;
        return Objects.equals(this.chunkArrivalTime, corporationMiningExtractionsResponse.chunkArrivalTime)
                && Objects.equals(this.extractionStartTime, corporationMiningExtractionsResponse.extractionStartTime)
                && Objects.equals(this.moonId, corporationMiningExtractionsResponse.moonId)
                && Objects.equals(this.naturalDecayTime, corporationMiningExtractionsResponse.naturalDecayTime)
                && Objects.equals(this.structureId, corporationMiningExtractionsResponse.structureId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chunkArrivalTime, extractionStartTime, moonId, naturalDecayTime, structureId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationMiningExtractionsResponse {\n");
        sb.append("    chunkArrivalTime: ").append(toIndentedString(chunkArrivalTime)).append("\n");
        sb.append("    extractionStartTime: ").append(toIndentedString(extractionStartTime)).append("\n");
        sb.append("    moonId: ").append(toIndentedString(moonId)).append("\n");
        sb.append("    naturalDecayTime: ").append(toIndentedString(naturalDecayTime)).append("\n");
        sb.append("    structureId: ").append(toIndentedString(structureId)).append("\n");
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
