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
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class GraphicResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_COLLISION_FILE = "collision_file";
    @SerializedName(SERIALIZED_NAME_COLLISION_FILE)
    private String collisionFile;

    public static final String SERIALIZED_NAME_GRAPHIC_FILE = "graphic_file";
    @SerializedName(SERIALIZED_NAME_GRAPHIC_FILE)
    private String graphicFile;

    public static final String SERIALIZED_NAME_GRAPHIC_ID = "graphic_id";
    @SerializedName(SERIALIZED_NAME_GRAPHIC_ID)
    private Integer graphicId;

    public static final String SERIALIZED_NAME_ICON_FOLDER = "icon_folder";
    @SerializedName(SERIALIZED_NAME_ICON_FOLDER)
    private String iconFolder;

    public static final String SERIALIZED_NAME_SOF_DNA = "sof_dna";
    @SerializedName(SERIALIZED_NAME_SOF_DNA)
    private String sofDna;

    public static final String SERIALIZED_NAME_SOF_FATION_NAME = "sof_fation_name";
    @SerializedName(SERIALIZED_NAME_SOF_FATION_NAME)
    private String sofFationName;

    public static final String SERIALIZED_NAME_SOF_HULL_NAME = "sof_hull_name";
    @SerializedName(SERIALIZED_NAME_SOF_HULL_NAME)
    private String sofHullName;

    public static final String SERIALIZED_NAME_SOF_RACE_NAME = "sof_race_name";
    @SerializedName(SERIALIZED_NAME_SOF_RACE_NAME)
    private String sofRaceName;

    public GraphicResponse collisionFile(String collisionFile) {

        this.collisionFile = collisionFile;
        return this;
    }

    /**
     * collision_file string
     * 
     * @return collisionFile
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "collision_file string")
    public String getCollisionFile() {
        return collisionFile;
    }

    public void setCollisionFile(String collisionFile) {
        this.collisionFile = collisionFile;
    }

    public GraphicResponse graphicFile(String graphicFile) {

        this.graphicFile = graphicFile;
        return this;
    }

    /**
     * graphic_file string
     * 
     * @return graphicFile
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "graphic_file string")
    public String getGraphicFile() {
        return graphicFile;
    }

    public void setGraphicFile(String graphicFile) {
        this.graphicFile = graphicFile;
    }

    public GraphicResponse graphicId(Integer graphicId) {

        this.graphicId = graphicId;
        return this;
    }

    /**
     * graphic_id integer
     * 
     * @return graphicId
     **/
    @ApiModelProperty(required = true, value = "graphic_id integer")
    public Integer getGraphicId() {
        return graphicId;
    }

    public void setGraphicId(Integer graphicId) {
        this.graphicId = graphicId;
    }

    public GraphicResponse iconFolder(String iconFolder) {

        this.iconFolder = iconFolder;
        return this;
    }

    /**
     * icon_folder string
     * 
     * @return iconFolder
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "icon_folder string")
    public String getIconFolder() {
        return iconFolder;
    }

    public void setIconFolder(String iconFolder) {
        this.iconFolder = iconFolder;
    }

    public GraphicResponse sofDna(String sofDna) {

        this.sofDna = sofDna;
        return this;
    }

    /**
     * sof_dna string
     * 
     * @return sofDna
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "sof_dna string")
    public String getSofDna() {
        return sofDna;
    }

    public void setSofDna(String sofDna) {
        this.sofDna = sofDna;
    }

    public GraphicResponse sofFationName(String sofFationName) {

        this.sofFationName = sofFationName;
        return this;
    }

    /**
     * sof_fation_name string
     * 
     * @return sofFationName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "sof_fation_name string")
    public String getSofFationName() {
        return sofFationName;
    }

    public void setSofFationName(String sofFationName) {
        this.sofFationName = sofFationName;
    }

    public GraphicResponse sofHullName(String sofHullName) {

        this.sofHullName = sofHullName;
        return this;
    }

    /**
     * sof_hull_name string
     * 
     * @return sofHullName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "sof_hull_name string")
    public String getSofHullName() {
        return sofHullName;
    }

    public void setSofHullName(String sofHullName) {
        this.sofHullName = sofHullName;
    }

    public GraphicResponse sofRaceName(String sofRaceName) {

        this.sofRaceName = sofRaceName;
        return this;
    }

    /**
     * sof_race_name string
     * 
     * @return sofRaceName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "sof_race_name string")
    public String getSofRaceName() {
        return sofRaceName;
    }

    public void setSofRaceName(String sofRaceName) {
        this.sofRaceName = sofRaceName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GraphicResponse graphicResponse = (GraphicResponse) o;
        return Objects.equals(this.collisionFile, graphicResponse.collisionFile)
                && Objects.equals(this.graphicFile, graphicResponse.graphicFile)
                && Objects.equals(this.graphicId, graphicResponse.graphicId)
                && Objects.equals(this.iconFolder, graphicResponse.iconFolder)
                && Objects.equals(this.sofDna, graphicResponse.sofDna)
                && Objects.equals(this.sofFationName, graphicResponse.sofFationName)
                && Objects.equals(this.sofHullName, graphicResponse.sofHullName)
                && Objects.equals(this.sofRaceName, graphicResponse.sofRaceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collisionFile, graphicFile, graphicId, iconFolder, sofDna, sofFationName, sofHullName,
                sofRaceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GraphicResponse {\n");
        sb.append("    collisionFile: ").append(toIndentedString(collisionFile)).append("\n");
        sb.append("    graphicFile: ").append(toIndentedString(graphicFile)).append("\n");
        sb.append("    graphicId: ").append(toIndentedString(graphicId)).append("\n");
        sb.append("    iconFolder: ").append(toIndentedString(iconFolder)).append("\n");
        sb.append("    sofDna: ").append(toIndentedString(sofDna)).append("\n");
        sb.append("    sofFationName: ").append(toIndentedString(sofFationName)).append("\n");
        sb.append("    sofHullName: ").append(toIndentedString(sofHullName)).append("\n");
        sb.append("    sofRaceName: ").append(toIndentedString(sofRaceName)).append("\n");
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
