package me.geek.tom.hypixelapi.res.guild;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BannerPattern {

    @Expose
    @SerializedName("Pattern")
    private String pattern;
    @Expose
    @SerializedName("Color")
    private String color;

}
