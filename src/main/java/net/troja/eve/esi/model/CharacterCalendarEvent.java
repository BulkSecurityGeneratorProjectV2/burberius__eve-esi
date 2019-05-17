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
 * response object
 */
@ApiModel(description = "response object")
public class CharacterCalendarEvent implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * response string
     */
    @JsonAdapter(ResponseEnum.Adapter.class)
    public enum ResponseEnum {
        ACCEPTED("accepted"),

        DECLINED("declined"),

        TENTATIVE("tentative");

        private String value;

        ResponseEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ResponseEnum fromValue(String value) {
            for (ResponseEnum b : ResponseEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<ResponseEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ResponseEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ResponseEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ResponseEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_RESPONSE = "response";
    @SerializedName(SERIALIZED_NAME_RESPONSE)
    private ResponseEnum response;

    public CharacterCalendarEvent response(ResponseEnum response) {
        this.response = response;
        return this;
    }

    /**
     * response string
     * 
     * @return response
     **/
    @ApiModelProperty(required = true, value = "response string")
    public ResponseEnum getResponse() {
        return response;
    }

    public void setResponse(ResponseEnum response) {
        this.response = response;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterCalendarEvent characterCalendarEvent = (CharacterCalendarEvent) o;
        return Objects.equals(this.response, characterCalendarEvent.response);
    }

    @Override
    public int hashCode() {
        return Objects.hash(response);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterCalendarEvent {\n");
        sb.append("    response: ").append(toIndentedString(response)).append("\n");
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
