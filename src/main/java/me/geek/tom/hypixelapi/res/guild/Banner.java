package me.geek.tom.hypixelapi.res.guild;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Banner {

    @Expose
    @SerializedName("Base")
    private String base;
    @Expose
    @SerializedName("Patterns")
    private List<BannerPattern> patterns;

}
