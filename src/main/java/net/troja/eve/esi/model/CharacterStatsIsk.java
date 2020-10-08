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
 * isk object
 */
@ApiModel(description = "isk object")
public class CharacterStatsIsk implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_IN = "in";
    @SerializedName(SERIALIZED_NAME_IN)
    private Long in;

    public static final String SERIALIZED_NAME_OUT = "out";
    @SerializedName(SERIALIZED_NAME_OUT)
    private Long out;

    public CharacterStatsIsk in(Long in) {

        this.in = in;
        return this;
    }

    /**
     * in integer
     * 
     * @return in
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "in integer")
    public Long getIn() {
        return in;
    }

    public void setIn(Long in) {
        this.in = in;
    }

    public CharacterStatsIsk out(Long out) {

        this.out = out;
        return this;
    }

    /**
     * out integer
     * 
     * @return out
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "out integer")
    public Long getOut() {
        return out;
    }

    public void setOut(Long out) {
        this.out = out;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterStatsIsk characterStatsIsk = (CharacterStatsIsk) o;
        return Objects.equals(this.in, characterStatsIsk.in) && Objects.equals(this.out, characterStatsIsk.out);
    }

    @Override
    public int hashCode() {
        return Objects.hash(in, out);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterStatsIsk {\n");
        sb.append("    in: ").append(toIndentedString(in)).append("\n");
        sb.append("    out: ").append(toIndentedString(out)).append("\n");
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
