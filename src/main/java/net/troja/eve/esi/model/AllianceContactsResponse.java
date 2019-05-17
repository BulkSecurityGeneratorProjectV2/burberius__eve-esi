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
public class AllianceContactsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_STANDING = "standing";
    @SerializedName(SERIALIZED_NAME_STANDING)
    private Float standing;

    /**
     * contact_type string
     */
    @JsonAdapter(ContactTypeEnum.Adapter.class)
    public enum ContactTypeEnum {
        CHARACTER("character"),

        CORPORATION("corporation"),

        ALLIANCE("alliance"),

        FACTION("faction");

        private String value;

        ContactTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ContactTypeEnum fromValue(String value) {
            for (ContactTypeEnum b : ContactTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<ContactTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ContactTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ContactTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ContactTypeEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_CONTACT_TYPE = "contact_type";
    @SerializedName(SERIALIZED_NAME_CONTACT_TYPE)
    private ContactTypeEnum contactType;

    public static final String SERIALIZED_NAME_LABEL_IDS = "label_ids";
    @SerializedName(SERIALIZED_NAME_LABEL_IDS)
    private List<Long> labelIds = new ArrayList<>();

    public static final String SERIALIZED_NAME_CONTACT_ID = "contact_id";
    @SerializedName(SERIALIZED_NAME_CONTACT_ID)
    private Integer contactId;

    public AllianceContactsResponse standing(Float standing) {
        this.standing = standing;
        return this;
    }

    /**
     * Standing of the contact
     * 
     * @return standing
     **/
    @ApiModelProperty(required = true, value = "Standing of the contact")
    public Float getStanding() {
        return standing;
    }

    public void setStanding(Float standing) {
        this.standing = standing;
    }

    public AllianceContactsResponse contactType(ContactTypeEnum contactType) {
        this.contactType = contactType;
        return this;
    }

    /**
     * contact_type string
     * 
     * @return contactType
     **/
    @ApiModelProperty(required = true, value = "contact_type string")
    public ContactTypeEnum getContactType() {
        return contactType;
    }

    public void setContactType(ContactTypeEnum contactType) {
        this.contactType = contactType;
    }

    public AllianceContactsResponse labelIds(List<Long> labelIds) {
        this.labelIds = labelIds;
        return this;
    }

    public AllianceContactsResponse addLabelIdsItem(Long labelIdsItem) {
        if (this.labelIds == null) {
            this.labelIds = new ArrayList<>();
        }
        this.labelIds.add(labelIdsItem);
        return this;
    }

    /**
     * label_ids array
     * 
     * @return labelIds
     **/
    @ApiModelProperty(value = "label_ids array")
    public List<Long> getLabelIds() {
        return labelIds;
    }

    public void setLabelIds(List<Long> labelIds) {
        this.labelIds = labelIds;
    }

    public AllianceContactsResponse contactId(Integer contactId) {
        this.contactId = contactId;
        return this;
    }

    /**
     * contact_id integer
     * 
     * @return contactId
     **/
    @ApiModelProperty(required = true, value = "contact_id integer")
    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AllianceContactsResponse allianceContactsResponse = (AllianceContactsResponse) o;
        return Objects.equals(this.standing, allianceContactsResponse.standing)
                && Objects.equals(this.contactType, allianceContactsResponse.contactType)
                && Objects.equals(this.labelIds, allianceContactsResponse.labelIds)
                && Objects.equals(this.contactId, allianceContactsResponse.contactId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(standing, contactType, labelIds, contactId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AllianceContactsResponse {\n");
        sb.append("    standing: ").append(toIndentedString(standing)).append("\n");
        sb.append("    contactType: ").append(toIndentedString(contactType)).append("\n");
        sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
        sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
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
