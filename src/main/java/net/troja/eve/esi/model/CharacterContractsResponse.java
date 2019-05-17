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
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CharacterContractsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_REWARD = "reward";
    @SerializedName(SERIALIZED_NAME_REWARD)
    private Double reward;

    public static final String SERIALIZED_NAME_END_LOCATION_ID = "end_location_id";
    @SerializedName(SERIALIZED_NAME_END_LOCATION_ID)
    private Long endLocationId;

    public static final String SERIALIZED_NAME_ISSUER_CORPORATION_ID = "issuer_corporation_id";
    @SerializedName(SERIALIZED_NAME_ISSUER_CORPORATION_ID)
    private Integer issuerCorporationId;

    public static final String SERIALIZED_NAME_CONTRACT_ID = "contract_id";
    @SerializedName(SERIALIZED_NAME_CONTRACT_ID)
    private Integer contractId;

    public static final String SERIALIZED_NAME_DAYS_TO_COMPLETE = "days_to_complete";
    @SerializedName(SERIALIZED_NAME_DAYS_TO_COMPLETE)
    private Integer daysToComplete;

    /**
     * To whom the contract is available
     */
    @JsonAdapter(AvailabilityEnum.Adapter.class)
    public enum AvailabilityEnum {
        PUBLIC("public"),

        PERSONAL("personal"),

        CORPORATION("corporation"),

        ALLIANCE("alliance");

        private String value;

        AvailabilityEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static AvailabilityEnum fromValue(String value) {
            for (AvailabilityEnum b : AvailabilityEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<AvailabilityEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final AvailabilityEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public AvailabilityEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return AvailabilityEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_AVAILABILITY = "availability";
    @SerializedName(SERIALIZED_NAME_AVAILABILITY)
    private AvailabilityEnum availability;

    public static final String SERIALIZED_NAME_BUYOUT = "buyout";
    @SerializedName(SERIALIZED_NAME_BUYOUT)
    private Double buyout;

    public static final String SERIALIZED_NAME_TITLE = "title";
    @SerializedName(SERIALIZED_NAME_TITLE)
    private String title;

    /**
     * Type of the contract
     */
    @JsonAdapter(TypeEnum.Adapter.class)
    public enum TypeEnum {
        UNKNOWN("unknown"),

        ITEM_EXCHANGE("item_exchange"),

        AUCTION("auction"),

        COURIER("courier"),

        LOAN("loan");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<TypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TypeEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_TYPE = "type";
    @SerializedName(SERIALIZED_NAME_TYPE)
    private TypeEnum type;

    public static final String SERIALIZED_NAME_DATE_EXPIRED = "date_expired";
    @SerializedName(SERIALIZED_NAME_DATE_EXPIRED)
    private OffsetDateTime dateExpired;

    public static final String SERIALIZED_NAME_START_LOCATION_ID = "start_location_id";
    @SerializedName(SERIALIZED_NAME_START_LOCATION_ID)
    private Long startLocationId;

    public static final String SERIALIZED_NAME_VOLUME = "volume";
    @SerializedName(SERIALIZED_NAME_VOLUME)
    private Double volume;

    public static final String SERIALIZED_NAME_ISSUER_ID = "issuer_id";
    @SerializedName(SERIALIZED_NAME_ISSUER_ID)
    private Integer issuerId;

    public static final String SERIALIZED_NAME_DATE_ACCEPTED = "date_accepted";
    @SerializedName(SERIALIZED_NAME_DATE_ACCEPTED)
    private OffsetDateTime dateAccepted;

    public static final String SERIALIZED_NAME_ACCEPTOR_ID = "acceptor_id";
    @SerializedName(SERIALIZED_NAME_ACCEPTOR_ID)
    private Integer acceptorId;

    public static final String SERIALIZED_NAME_DATE_ISSUED = "date_issued";
    @SerializedName(SERIALIZED_NAME_DATE_ISSUED)
    private OffsetDateTime dateIssued;

    public static final String SERIALIZED_NAME_PRICE = "price";
    @SerializedName(SERIALIZED_NAME_PRICE)
    private Double price;

    public static final String SERIALIZED_NAME_DATE_COMPLETED = "date_completed";
    @SerializedName(SERIALIZED_NAME_DATE_COMPLETED)
    private OffsetDateTime dateCompleted;

    public static final String SERIALIZED_NAME_FOR_CORPORATION = "for_corporation";
    @SerializedName(SERIALIZED_NAME_FOR_CORPORATION)
    private Boolean forCorporation;

    public static final String SERIALIZED_NAME_COLLATERAL = "collateral";
    @SerializedName(SERIALIZED_NAME_COLLATERAL)
    private Double collateral;

    public static final String SERIALIZED_NAME_ASSIGNEE_ID = "assignee_id";
    @SerializedName(SERIALIZED_NAME_ASSIGNEE_ID)
    private Integer assigneeId;

    /**
     * Status of the the contract
     */
    @JsonAdapter(StatusEnum.Adapter.class)
    public enum StatusEnum {
        OUTSTANDING("outstanding"),

        IN_PROGRESS("in_progress"),

        FINISHED_ISSUER("finished_issuer"),

        FINISHED_CONTRACTOR("finished_contractor"),

        FINISHED("finished"),

        CANCELLED("cancelled"),

        REJECTED("rejected"),

        FAILED("failed"),

        DELETED("deleted"),

        REVERSED("reversed");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<StatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StatusEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StatusEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_STATUS = "status";
    @SerializedName(SERIALIZED_NAME_STATUS)
    private StatusEnum status;

    public CharacterContractsResponse reward(Double reward) {
        this.reward = reward;
        return this;
    }

    /**
     * Remuneration for contract (for Couriers only)
     * 
     * @return reward
     **/
    @ApiModelProperty(value = "Remuneration for contract (for Couriers only)")
    public Double getReward() {
        return reward;
    }

    public void setReward(Double reward) {
        this.reward = reward;
    }

    public CharacterContractsResponse endLocationId(Long endLocationId) {
        this.endLocationId = endLocationId;
        return this;
    }

    /**
     * End location ID (for Couriers contract)
     * 
     * @return endLocationId
     **/
    @ApiModelProperty(value = "End location ID (for Couriers contract)")
    public Long getEndLocationId() {
        return endLocationId;
    }

    public void setEndLocationId(Long endLocationId) {
        this.endLocationId = endLocationId;
    }

    public CharacterContractsResponse issuerCorporationId(Integer issuerCorporationId) {
        this.issuerCorporationId = issuerCorporationId;
        return this;
    }

    /**
     * Character&#39;s corporation ID for the issuer
     * 
     * @return issuerCorporationId
     **/
    @ApiModelProperty(required = true, value = "Character's corporation ID for the issuer")
    public Integer getIssuerCorporationId() {
        return issuerCorporationId;
    }

    public void setIssuerCorporationId(Integer issuerCorporationId) {
        this.issuerCorporationId = issuerCorporationId;
    }

    public CharacterContractsResponse contractId(Integer contractId) {
        this.contractId = contractId;
        return this;
    }

    /**
     * contract_id integer
     * 
     * @return contractId
     **/
    @ApiModelProperty(required = true, value = "contract_id integer")
    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public CharacterContractsResponse daysToComplete(Integer daysToComplete) {
        this.daysToComplete = daysToComplete;
        return this;
    }

    /**
     * Number of days to perform the contract
     * 
     * @return daysToComplete
     **/
    @ApiModelProperty(value = "Number of days to perform the contract")
    public Integer getDaysToComplete() {
        return daysToComplete;
    }

    public void setDaysToComplete(Integer daysToComplete) {
        this.daysToComplete = daysToComplete;
    }

    public CharacterContractsResponse availability(AvailabilityEnum availability) {
        this.availability = availability;
        return this;
    }

    /**
     * To whom the contract is available
     * 
     * @return availability
     **/
    @ApiModelProperty(required = true, value = "To whom the contract is available")
    public AvailabilityEnum getAvailability() {
        return availability;
    }

    public void setAvailability(AvailabilityEnum availability) {
        this.availability = availability;
    }

    public CharacterContractsResponse buyout(Double buyout) {
        this.buyout = buyout;
        return this;
    }

    /**
     * Buyout price (for Auctions only)
     * 
     * @return buyout
     **/
    @ApiModelProperty(value = "Buyout price (for Auctions only)")
    public Double getBuyout() {
        return buyout;
    }

    public void setBuyout(Double buyout) {
        this.buyout = buyout;
    }

    public CharacterContractsResponse title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Title of the contract
     * 
     * @return title
     **/
    @ApiModelProperty(value = "Title of the contract")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CharacterContractsResponse type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Type of the contract
     * 
     * @return type
     **/
    @ApiModelProperty(required = true, value = "Type of the contract")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CharacterContractsResponse dateExpired(OffsetDateTime dateExpired) {
        this.dateExpired = dateExpired;
        return this;
    }

    /**
     * Expiration date of the contract
     * 
     * @return dateExpired
     **/
    @ApiModelProperty(required = true, value = "Expiration date of the contract")
    public OffsetDateTime getDateExpired() {
        return dateExpired;
    }

    public void setDateExpired(OffsetDateTime dateExpired) {
        this.dateExpired = dateExpired;
    }

    public CharacterContractsResponse startLocationId(Long startLocationId) {
        this.startLocationId = startLocationId;
        return this;
    }

    /**
     * Start location ID (for Couriers contract)
     * 
     * @return startLocationId
     **/
    @ApiModelProperty(value = "Start location ID (for Couriers contract)")
    public Long getStartLocationId() {
        return startLocationId;
    }

    public void setStartLocationId(Long startLocationId) {
        this.startLocationId = startLocationId;
    }

    public CharacterContractsResponse volume(Double volume) {
        this.volume = volume;
        return this;
    }

    /**
     * Volume of items in the contract
     * 
     * @return volume
     **/
    @ApiModelProperty(value = "Volume of items in the contract")
    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public CharacterContractsResponse issuerId(Integer issuerId) {
        this.issuerId = issuerId;
        return this;
    }

    /**
     * Character ID for the issuer
     * 
     * @return issuerId
     **/
    @ApiModelProperty(required = true, value = "Character ID for the issuer")
    public Integer getIssuerId() {
        return issuerId;
    }

    public void setIssuerId(Integer issuerId) {
        this.issuerId = issuerId;
    }

    public CharacterContractsResponse dateAccepted(OffsetDateTime dateAccepted) {
        this.dateAccepted = dateAccepted;
        return this;
    }

    /**
     * Date of confirmation of contract
     * 
     * @return dateAccepted
     **/
    @ApiModelProperty(value = "Date of confirmation of contract")
    public OffsetDateTime getDateAccepted() {
        return dateAccepted;
    }

    public void setDateAccepted(OffsetDateTime dateAccepted) {
        this.dateAccepted = dateAccepted;
    }

    public CharacterContractsResponse acceptorId(Integer acceptorId) {
        this.acceptorId = acceptorId;
        return this;
    }

    /**
     * Who will accept the contract
     * 
     * @return acceptorId
     **/
    @ApiModelProperty(required = true, value = "Who will accept the contract")
    public Integer getAcceptorId() {
        return acceptorId;
    }

    public void setAcceptorId(Integer acceptorId) {
        this.acceptorId = acceptorId;
    }

    public CharacterContractsResponse dateIssued(OffsetDateTime dateIssued) {
        this.dateIssued = dateIssued;
        return this;
    }

    /**
     * Сreation date of the contract
     * 
     * @return dateIssued
     **/
    @ApiModelProperty(required = true, value = "Сreation date of the contract")
    public OffsetDateTime getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(OffsetDateTime dateIssued) {
        this.dateIssued = dateIssued;
    }

    public CharacterContractsResponse price(Double price) {
        this.price = price;
        return this;
    }

    /**
     * Price of contract (for ItemsExchange and Auctions)
     * 
     * @return price
     **/
    @ApiModelProperty(value = "Price of contract (for ItemsExchange and Auctions)")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public CharacterContractsResponse dateCompleted(OffsetDateTime dateCompleted) {
        this.dateCompleted = dateCompleted;
        return this;
    }

    /**
     * Date of completed of contract
     * 
     * @return dateCompleted
     **/
    @ApiModelProperty(value = "Date of completed of contract")
    public OffsetDateTime getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(OffsetDateTime dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    public CharacterContractsResponse forCorporation(Boolean forCorporation) {
        this.forCorporation = forCorporation;
        return this;
    }

    /**
     * true if the contract was issued on behalf of the issuer&#39;s corporation
     * 
     * @return forCorporation
     **/
    @ApiModelProperty(required = true, value = "true if the contract was issued on behalf of the issuer's corporation")
    public Boolean getForCorporation() {
        return forCorporation;
    }

    public void setForCorporation(Boolean forCorporation) {
        this.forCorporation = forCorporation;
    }

    public CharacterContractsResponse collateral(Double collateral) {
        this.collateral = collateral;
        return this;
    }

    /**
     * Collateral price (for Couriers only)
     * 
     * @return collateral
     **/
    @ApiModelProperty(value = "Collateral price (for Couriers only)")
    public Double getCollateral() {
        return collateral;
    }

    public void setCollateral(Double collateral) {
        this.collateral = collateral;
    }

    public CharacterContractsResponse assigneeId(Integer assigneeId) {
        this.assigneeId = assigneeId;
        return this;
    }

    /**
     * ID to whom the contract is assigned, can be corporation or character ID
     * 
     * @return assigneeId
     **/
    @ApiModelProperty(required = true, value = "ID to whom the contract is assigned, can be corporation or character ID")
    public Integer getAssigneeId() {
        return assigneeId;
    }

    public void setAssigneeId(Integer assigneeId) {
        this.assigneeId = assigneeId;
    }

    public CharacterContractsResponse status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Status of the the contract
     * 
     * @return status
     **/
    @ApiModelProperty(required = true, value = "Status of the the contract")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterContractsResponse characterContractsResponse = (CharacterContractsResponse) o;
        return Objects.equals(this.reward, characterContractsResponse.reward)
                && Objects.equals(this.endLocationId, characterContractsResponse.endLocationId)
                && Objects.equals(this.issuerCorporationId, characterContractsResponse.issuerCorporationId)
                && Objects.equals(this.contractId, characterContractsResponse.contractId)
                && Objects.equals(this.daysToComplete, characterContractsResponse.daysToComplete)
                && Objects.equals(this.availability, characterContractsResponse.availability)
                && Objects.equals(this.buyout, characterContractsResponse.buyout)
                && Objects.equals(this.title, characterContractsResponse.title)
                && Objects.equals(this.type, characterContractsResponse.type)
                && Objects.equals(this.dateExpired, characterContractsResponse.dateExpired)
                && Objects.equals(this.startLocationId, characterContractsResponse.startLocationId)
                && Objects.equals(this.volume, characterContractsResponse.volume)
                && Objects.equals(this.issuerId, characterContractsResponse.issuerId)
                && Objects.equals(this.dateAccepted, characterContractsResponse.dateAccepted)
                && Objects.equals(this.acceptorId, characterContractsResponse.acceptorId)
                && Objects.equals(this.dateIssued, characterContractsResponse.dateIssued)
                && Objects.equals(this.price, characterContractsResponse.price)
                && Objects.equals(this.dateCompleted, characterContractsResponse.dateCompleted)
                && Objects.equals(this.forCorporation, characterContractsResponse.forCorporation)
                && Objects.equals(this.collateral, characterContractsResponse.collateral)
                && Objects.equals(this.assigneeId, characterContractsResponse.assigneeId)
                && Objects.equals(this.status, characterContractsResponse.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reward, endLocationId, issuerCorporationId, contractId, daysToComplete, availability,
                buyout, title, type, dateExpired, startLocationId, volume, issuerId, dateAccepted, acceptorId,
                dateIssued, price, dateCompleted, forCorporation, collateral, assigneeId, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterContractsResponse {\n");
        sb.append("    reward: ").append(toIndentedString(reward)).append("\n");
        sb.append("    endLocationId: ").append(toIndentedString(endLocationId)).append("\n");
        sb.append("    issuerCorporationId: ").append(toIndentedString(issuerCorporationId)).append("\n");
        sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
        sb.append("    daysToComplete: ").append(toIndentedString(daysToComplete)).append("\n");
        sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
        sb.append("    buyout: ").append(toIndentedString(buyout)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    dateExpired: ").append(toIndentedString(dateExpired)).append("\n");
        sb.append("    startLocationId: ").append(toIndentedString(startLocationId)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
        sb.append("    dateAccepted: ").append(toIndentedString(dateAccepted)).append("\n");
        sb.append("    acceptorId: ").append(toIndentedString(acceptorId)).append("\n");
        sb.append("    dateIssued: ").append(toIndentedString(dateIssued)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    dateCompleted: ").append(toIndentedString(dateCompleted)).append("\n");
        sb.append("    forCorporation: ").append(toIndentedString(forCorporation)).append("\n");
        sb.append("    collateral: ").append(toIndentedString(collateral)).append("\n");
        sb.append("    assigneeId: ").append(toIndentedString(assigneeId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
