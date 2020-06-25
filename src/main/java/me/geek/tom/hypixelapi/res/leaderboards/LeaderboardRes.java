package me.geek.tom.hypixelapi.res.leaderboards;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import me.geek.tom.hypixelapi.types.GameType;

import java.util.List;
import java.util.Map;

public class LeaderboardRes {

    @SerializedName("success")
    @Expose
    public Boolean success;

    @SerializedName("leaderboards")
    @Expose
    public Map<GameType, List<GameLeaderboard>> leaderboards;

}
