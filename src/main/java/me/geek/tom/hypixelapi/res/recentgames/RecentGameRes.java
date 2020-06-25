package me.geek.tom.hypixelapi.res.recentgames;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RecentGameRes {

    @SerializedName("success")
    @Expose
    public Boolean success;
    @SerializedName("games")
    @Expose
    public List<Game> games = null;

}
