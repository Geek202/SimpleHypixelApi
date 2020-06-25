package me.geek.tom.hypixelapi.res.boosters;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BoostersRes {

    @SerializedName("success")
    @Expose
    public Boolean success;
    @SerializedName("boosters")
    @Expose
    public List<Booster> boosters = null;
    @SerializedName("boosterState")
    @Expose
    public BoosterState boosterState;

}
