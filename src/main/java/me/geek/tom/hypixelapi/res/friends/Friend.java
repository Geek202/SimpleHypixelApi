package me.geek.tom.hypixelapi.res.friends;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Friend {

    @SerializedName("_id")
    @Expose
    public String id;
    @SerializedName("uuidSender")
    @Expose
    public String uuidSender;
    @SerializedName("uuidReceiver")
    @Expose
    public String uuidReceiver;
    @SerializedName("started")
    @Expose
    public Long started;

    public String getOtherUser(String person) {
        if (uuidReceiver.equals(person))
            return uuidSender;
        else
            return uuidReceiver;
    }

}
