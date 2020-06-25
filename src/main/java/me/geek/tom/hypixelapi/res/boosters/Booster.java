package me.geek.tom.hypixelapi.res.boosters;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import me.geek.tom.hypixelapi.types.GameType;

import java.util.List;

public class Booster {


    @SerializedName("_id")
    @Expose
    public String id;

    @SerializedName("purchaserUuid")
    @Expose
    public String purchaserUuid;

    @SerializedName("amount")
    @Expose
    public Double amount;

    @SerializedName("originalLength")
    @Expose
    public Integer originalLength;

    @SerializedName("length")
    @Expose
    public Integer length;

    @SerializedName("gameType")
    @Expose
    public Integer gameType;

    @SerializedName("dateActivated")
    @Expose
    public Long dateActivated;

    @SerializedName("stacked")
    @Expose
    /* This is type Object because hypixel sometimes returns Boolean and sometimes List<String>
       Use an instanceof check to determine the type and handle it correctly */
    public Object stacked;

    public GameType getGameType() {
        return GameType.fromId(gameType);
    }

}
