package me.geek.tom.hypixelapi.res.guild;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.time.ZonedDateTime;

public class GuildRank {

    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("default")
    @Expose
    public Boolean _default;
    @SerializedName("priority")
    @Expose
    public Long priority;
    @SerializedName("created")
    @Expose
    public ZonedDateTime created;

}
