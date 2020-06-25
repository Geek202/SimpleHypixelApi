package me.geek.tom.hypixelapi.res.recentgames;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import me.geek.tom.hypixelapi.types.GameType;

import java.time.ZonedDateTime;

public class Game {

    @SerializedName("date")
    @Expose
    public ZonedDateTime date;
    @SerializedName("gameType")
    @Expose
    public GameType gameType;
    @SerializedName("mode")
    @Expose
    public String mode;
    @SerializedName("map")
    @Expose
    public String map;
    @SerializedName("ended")
    @Expose
    public ZonedDateTime ended;

}
