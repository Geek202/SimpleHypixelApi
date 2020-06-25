package me.geek.tom.hypixelapi.res.friends;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FriendsRes {

    @SerializedName("success")
    @Expose
    public Boolean success;
    @SerializedName("records")
    @Expose
    public List<Friend> friends = null;

}
