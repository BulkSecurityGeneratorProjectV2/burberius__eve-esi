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
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CharacterMailinglistsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_MAILING_LIST_ID = "mailing_list_id";
    @SerializedName(SERIALIZED_NAME_MAILING_LIST_ID)
    private Integer mailingListId;

    public CharacterMailinglistsResponse name(String name) {
        this.name = name;
        return this;
    }

    /**
     * name string
     * 
     * @return name
     **/
    @ApiModelProperty(required = true, value = "name string")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CharacterMailinglistsResponse mailingListId(Integer mailingListId) {
        this.mailingListId = mailingListId;
        return this;
    }

    /**
     * Mailing list ID
     * 
     * @return mailingListId
     **/
    @ApiModelProperty(required = true, value = "Mailing list ID")
    public Integer getMailingListId() {
        return mailingListId;
    }

    public void setMailingListId(Integer mailingListId) {
        this.mailingListId = mailingListId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterMailinglistsResponse characterMailinglistsResponse = (CharacterMailinglistsResponse) o;
        return Objects.equals(this.name, characterMailinglistsResponse.name)
                && Objects.equals(this.mailingListId, characterMailinglistsResponse.mailingListId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mailingListId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterMailinglistsResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    mailingListId: ").append(toIndentedString(mailingListId)).append("\n");
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
