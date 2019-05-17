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
import java.time.LocalDate;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class MarketHistoryResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_DATE = "date";
    @SerializedName(SERIALIZED_NAME_DATE)
    private LocalDate date;

    public static final String SERIALIZED_NAME_VOLUME = "volume";
    @SerializedName(SERIALIZED_NAME_VOLUME)
    private Long volume;

    public static final String SERIALIZED_NAME_AVERAGE = "average";
    @SerializedName(SERIALIZED_NAME_AVERAGE)
    private Double average;

    public static final String SERIALIZED_NAME_ORDER_COUNT = "order_count";
    @SerializedName(SERIALIZED_NAME_ORDER_COUNT)
    private Long orderCount;

    public static final String SERIALIZED_NAME_HIGHEST = "highest";
    @SerializedName(SERIALIZED_NAME_HIGHEST)
    private Double highest;

    public static final String SERIALIZED_NAME_LOWEST = "lowest";
    @SerializedName(SERIALIZED_NAME_LOWEST)
    private Double lowest;

    public MarketHistoryResponse date(LocalDate date) {
        this.date = date;
        return this;
    }

    /**
     * The date of this historical statistic entry
     * 
     * @return date
     **/
    @ApiModelProperty(required = true, value = "The date of this historical statistic entry")
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public MarketHistoryResponse volume(Long volume) {
        this.volume = volume;
        return this;
    }

    /**
     * Total
     * 
     * @return volume
     **/
    @ApiModelProperty(required = true, value = "Total")
    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public MarketHistoryResponse average(Double average) {
        this.average = average;
        return this;
    }

    /**
     * average number
     * 
     * @return average
     **/
    @ApiModelProperty(required = true, value = "average number")
    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public MarketHistoryResponse orderCount(Long orderCount) {
        this.orderCount = orderCount;
        return this;
    }

    /**
     * Total number of orders happened that day
     * 
     * @return orderCount
     **/
    @ApiModelProperty(required = true, value = "Total number of orders happened that day")
    public Long getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Long orderCount) {
        this.orderCount = orderCount;
    }

    public MarketHistoryResponse highest(Double highest) {
        this.highest = highest;
        return this;
    }

    /**
     * highest number
     * 
     * @return highest
     **/
    @ApiModelProperty(required = true, value = "highest number")
    public Double getHighest() {
        return highest;
    }

    public void setHighest(Double highest) {
        this.highest = highest;
    }

    public MarketHistoryResponse lowest(Double lowest) {
        this.lowest = lowest;
        return this;
    }

    /**
     * lowest number
     * 
     * @return lowest
     **/
    @ApiModelProperty(required = true, value = "lowest number")
    public Double getLowest() {
        return lowest;
    }

    public void setLowest(Double lowest) {
        this.lowest = lowest;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MarketHistoryResponse marketHistoryResponse = (MarketHistoryResponse) o;
        return Objects.equals(this.date, marketHistoryResponse.date)
                && Objects.equals(this.volume, marketHistoryResponse.volume)
                && Objects.equals(this.average, marketHistoryResponse.average)
                && Objects.equals(this.orderCount, marketHistoryResponse.orderCount)
                && Objects.equals(this.highest, marketHistoryResponse.highest)
                && Objects.equals(this.lowest, marketHistoryResponse.lowest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, volume, average, orderCount, highest, lowest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MarketHistoryResponse {\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    average: ").append(toIndentedString(average)).append("\n");
        sb.append("    orderCount: ").append(toIndentedString(orderCount)).append("\n");
        sb.append("    highest: ").append(toIndentedString(highest)).append("\n");
        sb.append("    lowest: ").append(toIndentedString(lowest)).append("\n");
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
