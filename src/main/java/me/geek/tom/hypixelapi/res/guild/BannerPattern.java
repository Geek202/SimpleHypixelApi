package me.geek.tom.hypixelapi.res.guild;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BannerPattern {

    @Expose
    @SerializedName("Pattern")
    public String pattern;
    @Expose
    @SerializedName("Color")
    public String color;

}
