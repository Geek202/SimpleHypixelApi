package me.geek.tom.hypixelapi.res.gamecount;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class GameCountRes {

    @Expose
    @SerializedName("games")
    public Map<String, GameCount> games;

    @Expose
    @SerializedName("playerCount")
    public int playerCount;

}
