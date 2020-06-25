package me.geek.tom.hypixelapi.res.guild;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GuildRes {

    @SerializedName("success")
    @Expose
    public Boolean success;
    @SerializedName("guild")
    @Expose
    public Guild guild;

}
