package me.geek.tom.hypixelapi.res.guild;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Banner {

    @Expose
    @SerializedName("Base")
    public String base;
    @Expose
    @SerializedName("Patterns")
    public List<BannerPattern> patterns;

}
