/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * The version of the OpenAPI document: 1.12
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
import net.troja.eve.esi.model.FactionWarfareLeaderboardActiveTotalKills;
import net.troja.eve.esi.model.FactionWarfareLeaderboardLastWeekKills;
import net.troja.eve.esi.model.FactionWarfareLeaderboardYesterdayKills;
import java.io.Serializable;

/**
 * Top 4 rankings of factions by number of kills from yesterday, last week and
 * in total
 */
@ApiModel(description = "Top 4 rankings of factions by number of kills from yesterday, last week and in total")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FactionWarfareLeaderboardKills implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ACTIVE_TOTAL = "active_total";
    @SerializedName(SERIALIZED_NAME_ACTIVE_TOTAL)
    private List<FactionWarfareLeaderboardActiveTotalKills> activeTotal = new ArrayList<>();

    public static final String SERIALIZED_NAME_LAST_WEEK = "last_week";
    @SerializedName(SERIALIZED_NAME_LAST_WEEK)
    private List<FactionWarfareLeaderboardLastWeekKills> lastWeek = new ArrayList<>();

    public static final String SERIALIZED_NAME_YESTERDAY = "yesterday";
    @SerializedName(SERIALIZED_NAME_YESTERDAY)
    private List<FactionWarfareLeaderboardYesterdayKills> yesterday = new ArrayList<>();

    public FactionWarfareLeaderboardKills() {
    }

    public FactionWarfareLeaderboardKills activeTotal(List<FactionWarfareLeaderboardActiveTotalKills> activeTotal) {

        this.activeTotal = activeTotal;
        return this;
    }

    public FactionWarfareLeaderboardKills addActiveTotalItem(FactionWarfareLeaderboardActiveTotalKills activeTotalItem) {
        this.activeTotal.add(activeTotalItem);
        return this;
    }

    /**
     * Top 4 ranking of factions active in faction warfare by total kills. A
     * faction is considered \&quot;active\&quot; if they have participated in
     * faction warfare in the past 14 days
     * 
     * @return activeTotal
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "Top 4 ranking of factions active in faction warfare by total kills. A faction is considered \"active\" if they have participated in faction warfare in the past 14 days")
    public List<FactionWarfareLeaderboardActiveTotalKills> getActiveTotal() {
        return activeTotal;
    }

    public void setActiveTotal(List<FactionWarfareLeaderboardActiveTotalKills> activeTotal) {
        this.activeTotal = activeTotal;
    }

    public FactionWarfareLeaderboardKills lastWeek(List<FactionWarfareLeaderboardLastWeekKills> lastWeek) {

        this.lastWeek = lastWeek;
        return this;
    }

    public FactionWarfareLeaderboardKills addLastWeekItem(FactionWarfareLeaderboardLastWeekKills lastWeekItem) {
        this.lastWeek.add(lastWeekItem);
        return this;
    }

    /**
     * Top 4 ranking of factions by kills in the past week
     * 
     * @return lastWeek
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "Top 4 ranking of factions by kills in the past week")
    public List<FactionWarfareLeaderboardLastWeekKills> getLastWeek() {
        return lastWeek;
    }

    public void setLastWeek(List<FactionWarfareLeaderboardLastWeekKills> lastWeek) {
        this.lastWeek = lastWeek;
    }

    public FactionWarfareLeaderboardKills yesterday(List<FactionWarfareLeaderboardYesterdayKills> yesterday) {

        this.yesterday = yesterday;
        return this;
    }

    public FactionWarfareLeaderboardKills addYesterdayItem(FactionWarfareLeaderboardYesterdayKills yesterdayItem) {
        this.yesterday.add(yesterdayItem);
        return this;
    }

    /**
     * Top 4 ranking of factions by kills in the past day
     * 
     * @return yesterday
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "Top 4 ranking of factions by kills in the past day")
    public List<FactionWarfareLeaderboardYesterdayKills> getYesterday() {
        return yesterday;
    }

    public void setYesterday(List<FactionWarfareLeaderboardYesterdayKills> yesterday) {
        this.yesterday = yesterday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FactionWarfareLeaderboardKills factionWarfareLeaderboardKills = (FactionWarfareLeaderboardKills) o;
        return Objects.equals(this.activeTotal, factionWarfareLeaderboardKills.activeTotal)
                && Objects.equals(this.lastWeek, factionWarfareLeaderboardKills.lastWeek)
                && Objects.equals(this.yesterday, factionWarfareLeaderboardKills.yesterday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activeTotal, lastWeek, yesterday);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FactionWarfareLeaderboardKills {\n");
        sb.append("    activeTotal: ").append(toIndentedString(activeTotal)).append("\n");
        sb.append("    lastWeek: ").append(toIndentedString(lastWeek)).append("\n");
        sb.append("    yesterday: ").append(toIndentedString(yesterday)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
