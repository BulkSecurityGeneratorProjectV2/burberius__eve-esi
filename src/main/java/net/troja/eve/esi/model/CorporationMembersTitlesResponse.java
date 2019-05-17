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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CorporationMembersTitlesResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_CHARACTER_ID = "character_id";
    @SerializedName(SERIALIZED_NAME_CHARACTER_ID)
    private Integer characterId;

    public static final String SERIALIZED_NAME_TITLES = "titles";
    @SerializedName(SERIALIZED_NAME_TITLES)
    private List<Integer> titles = new ArrayList<>();

    public CorporationMembersTitlesResponse characterId(Integer characterId) {
        this.characterId = characterId;
        return this;
    }

    /**
     * character_id integer
     * 
     * @return characterId
     **/
    @ApiModelProperty(required = true, value = "character_id integer")
    public Integer getCharacterId() {
        return characterId;
    }

    public void setCharacterId(Integer characterId) {
        this.characterId = characterId;
    }

    public CorporationMembersTitlesResponse titles(List<Integer> titles) {
        this.titles = titles;
        return this;
    }

    public CorporationMembersTitlesResponse addTitlesItem(Integer titlesItem) {
        this.titles.add(titlesItem);
        return this;
    }

    /**
     * A list of title_id
     * 
     * @return titles
     **/
    @ApiModelProperty(required = true, value = "A list of title_id")
    public List<Integer> getTitles() {
        return titles;
    }

    public void setTitles(List<Integer> titles) {
        this.titles = titles;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationMembersTitlesResponse corporationMembersTitlesResponse = (CorporationMembersTitlesResponse) o;
        return Objects.equals(this.characterId, corporationMembersTitlesResponse.characterId)
                && Objects.equals(this.titles, corporationMembersTitlesResponse.titles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(characterId, titles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationMembersTitlesResponse {\n");
        sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
        sb.append("    titles: ").append(toIndentedString(titles)).append("\n");
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
