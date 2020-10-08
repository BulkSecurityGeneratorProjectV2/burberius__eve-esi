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
import java.time.OffsetDateTime;
import net.troja.eve.esi.model.CorporationBookmarkItem;
import net.troja.eve.esi.model.CorporationBookmarksCoordinates;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CorporationBookmarksResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_BOOKMARK_ID = "bookmark_id";
    @SerializedName(SERIALIZED_NAME_BOOKMARK_ID)
    private Integer bookmarkId;

    public static final String SERIALIZED_NAME_COORDINATES = "coordinates";
    @SerializedName(SERIALIZED_NAME_COORDINATES)
    private CorporationBookmarksCoordinates coordinates;

    public static final String SERIALIZED_NAME_CREATED = "created";
    @SerializedName(SERIALIZED_NAME_CREATED)
    private OffsetDateTime created;

    public static final String SERIALIZED_NAME_CREATOR_ID = "creator_id";
    @SerializedName(SERIALIZED_NAME_CREATOR_ID)
    private Integer creatorId;

    public static final String SERIALIZED_NAME_FOLDER_ID = "folder_id";
    @SerializedName(SERIALIZED_NAME_FOLDER_ID)
    private Integer folderId;

    public static final String SERIALIZED_NAME_ITEM = "item";
    @SerializedName(SERIALIZED_NAME_ITEM)
    private CorporationBookmarkItem item;

    public static final String SERIALIZED_NAME_LABEL = "label";
    @SerializedName(SERIALIZED_NAME_LABEL)
    private String label;

    public static final String SERIALIZED_NAME_LOCATION_ID = "location_id";
    @SerializedName(SERIALIZED_NAME_LOCATION_ID)
    private Integer locationId;

    public static final String SERIALIZED_NAME_NOTES = "notes";
    @SerializedName(SERIALIZED_NAME_NOTES)
    private String notes;

    public CorporationBookmarksResponse bookmarkId(Integer bookmarkId) {

        this.bookmarkId = bookmarkId;
        return this;
    }

    /**
     * bookmark_id integer
     * 
     * @return bookmarkId
     **/
    @ApiModelProperty(required = true, value = "bookmark_id integer")
    public Integer getBookmarkId() {
        return bookmarkId;
    }

    public void setBookmarkId(Integer bookmarkId) {
        this.bookmarkId = bookmarkId;
    }

    public CorporationBookmarksResponse coordinates(CorporationBookmarksCoordinates coordinates) {

        this.coordinates = coordinates;
        return this;
    }

    /**
     * Get coordinates
     * 
     * @return coordinates
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public CorporationBookmarksCoordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(CorporationBookmarksCoordinates coordinates) {
        this.coordinates = coordinates;
    }

    public CorporationBookmarksResponse created(OffsetDateTime created) {

        this.created = created;
        return this;
    }

    /**
     * created string
     * 
     * @return created
     **/
    @ApiModelProperty(required = true, value = "created string")
    public OffsetDateTime getCreated() {
        return created;
    }

    public void setCreated(OffsetDateTime created) {
        this.created = created;
    }

    public CorporationBookmarksResponse creatorId(Integer creatorId) {

        this.creatorId = creatorId;
        return this;
    }

    /**
     * creator_id integer
     * 
     * @return creatorId
     **/
    @ApiModelProperty(required = true, value = "creator_id integer")
    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public CorporationBookmarksResponse folderId(Integer folderId) {

        this.folderId = folderId;
        return this;
    }

    /**
     * folder_id integer
     * 
     * @return folderId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "folder_id integer")
    public Integer getFolderId() {
        return folderId;
    }

    public void setFolderId(Integer folderId) {
        this.folderId = folderId;
    }

    public CorporationBookmarksResponse item(CorporationBookmarkItem item) {

        this.item = item;
        return this;
    }

    /**
     * Get item
     * 
     * @return item
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public CorporationBookmarkItem getItem() {
        return item;
    }

    public void setItem(CorporationBookmarkItem item) {
        this.item = item;
    }

    public CorporationBookmarksResponse label(String label) {

        this.label = label;
        return this;
    }

    /**
     * label string
     * 
     * @return label
     **/
    @ApiModelProperty(required = true, value = "label string")
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public CorporationBookmarksResponse locationId(Integer locationId) {

        this.locationId = locationId;
        return this;
    }

    /**
     * location_id integer
     * 
     * @return locationId
     **/
    @ApiModelProperty(required = true, value = "location_id integer")
    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public CorporationBookmarksResponse notes(String notes) {

        this.notes = notes;
        return this;
    }

    /**
     * notes string
     * 
     * @return notes
     **/
    @ApiModelProperty(required = true, value = "notes string")
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationBookmarksResponse corporationBookmarksResponse = (CorporationBookmarksResponse) o;
        return Objects.equals(this.bookmarkId, corporationBookmarksResponse.bookmarkId)
                && Objects.equals(this.coordinates, corporationBookmarksResponse.coordinates)
                && Objects.equals(this.created, corporationBookmarksResponse.created)
                && Objects.equals(this.creatorId, corporationBookmarksResponse.creatorId)
                && Objects.equals(this.folderId, corporationBookmarksResponse.folderId)
                && Objects.equals(this.item, corporationBookmarksResponse.item)
                && Objects.equals(this.label, corporationBookmarksResponse.label)
                && Objects.equals(this.locationId, corporationBookmarksResponse.locationId)
                && Objects.equals(this.notes, corporationBookmarksResponse.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookmarkId, coordinates, created, creatorId, folderId, item, label, locationId, notes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationBookmarksResponse {\n");
        sb.append("    bookmarkId: ").append(toIndentedString(bookmarkId)).append("\n");
        sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
        sb.append("    item: ").append(toIndentedString(item)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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
