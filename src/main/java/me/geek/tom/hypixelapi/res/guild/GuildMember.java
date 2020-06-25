package me.geek.tom.hypixelapi.res.guild;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.time.ZonedDateTime;

public class GuildMember {

    @Expose
    @SerializedName("uuid")
    public String uuid;
    @Expose
    @SerializedName("rank")
    public String rank;
    @Expose
    @SerializedName("joined")
    public ZonedDateTime joined;

}
