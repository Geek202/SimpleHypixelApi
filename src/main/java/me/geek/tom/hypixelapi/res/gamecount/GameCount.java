package me.geek.tom.hypixelapi.res.gamecount;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class GameCount {

    @Expose
    @SerializedName("modes")
    public Map<String, Integer> modes;

    @Expose
    @SerializedName("players")
    public int playerCount;

}
