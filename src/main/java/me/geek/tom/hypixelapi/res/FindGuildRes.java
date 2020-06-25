package me.geek.tom.hypixelapi.res;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FindGuildRes {

    @SerializedName("success")
    @Expose
    public Boolean success;
    @SerializedName("guild")
    @Expose
    public String guild;

}
