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
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class OpportunitiesTasksResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NOTIFICATION = "notification";
    @SerializedName(SERIALIZED_NAME_NOTIFICATION)
    private String notification;

    public static final String SERIALIZED_NAME_TASK_ID = "task_id";
    @SerializedName(SERIALIZED_NAME_TASK_ID)
    private Integer taskId;

    public OpportunitiesTasksResponse description(String description) {

        this.description = description;
        return this;
    }

    /**
     * description string
     * 
     * @return description
     **/
    @ApiModelProperty(required = true, value = "description string")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OpportunitiesTasksResponse name(String name) {

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

    public OpportunitiesTasksResponse notification(String notification) {

        this.notification = notification;
        return this;
    }

    /**
     * notification string
     * 
     * @return notification
     **/
    @ApiModelProperty(required = true, value = "notification string")
    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public OpportunitiesTasksResponse taskId(Integer taskId) {

        this.taskId = taskId;
        return this;
    }

    /**
     * task_id integer
     * 
     * @return taskId
     **/
    @ApiModelProperty(required = true, value = "task_id integer")
    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpportunitiesTasksResponse opportunitiesTasksResponse = (OpportunitiesTasksResponse) o;
        return Objects.equals(this.description, opportunitiesTasksResponse.description)
                && Objects.equals(this.name, opportunitiesTasksResponse.name)
                && Objects.equals(this.notification, opportunitiesTasksResponse.notification)
                && Objects.equals(this.taskId, opportunitiesTasksResponse.taskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, name, notification, taskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpportunitiesTasksResponse {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
