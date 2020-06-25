package me.geek.tom.hypixelapi.res.leaderboards;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GameLeaderboard {

    @SerializedName("path")
    @Expose
    public String path;
    @SerializedName("prefix")
    @Expose
    public String prefix;
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("location")
    @Expose
    public String location;
    @SerializedName("count")
    @Expose
    public Long count;
    @SerializedName("leaders")
    @Expose
    public List<String> leaders;

}
