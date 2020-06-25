package me.geek.tom.hypixelapi.res;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlayerRes {

    @Expose
    @SerializedName("player")
    public JsonObject player;

    @Expose
    @SerializedName("success")
    public Boolean success;

}
