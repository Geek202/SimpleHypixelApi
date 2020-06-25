package me.geek.tom.hypixelapi.res;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlayerCountRes {
    @SerializedName("success")
    @Expose
    public Boolean success;
    @SerializedName("playerCount")
    @Expose
    public Integer playerCount;
}
