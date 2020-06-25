package me.geek.tom.hypixelapi.res.guild;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import me.geek.tom.hypixelapi.types.GameType;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

public class Guild {

    @Expose
    @SerializedName("_id")
    public String _id;
    @Expose
    @SerializedName("name")
    public String name;
    @Expose
    @SerializedName("description")
    public String description;
    @Expose
    @SerializedName("tag")
    public String tag;
    @Expose
    @SerializedName("publiclyListed")
    public Boolean publiclyListed;
    @Expose
    @SerializedName("banner")
    public Banner banner;
    @Expose
    @SerializedName("members")
    public List<GuildMember> members;
    @Expose
    @SerializedName("coins")
    public int coins;
    @Expose
    @SerializedName("coinsEver")
    public int coinsEver;
    @Expose
    @SerializedName("created")
    public ZonedDateTime created;
    @Expose
    @SerializedName("joinable")
    public Boolean joinable;
    @Expose
    @SerializedName("exp")
    public long exp;
    @Expose
    @SerializedName("legacyRanking")
    public int legacyRanking;
    @Expose
    @SerializedName("ranks")
    public List<GuildRank> ranks;
    @Expose
    @SerializedName("achievements")
    public Map<String, Integer> achievements;
    @Expose
    @SerializedName("guildExpByGameType")
    public Map<GameType, Integer> guildExpByGameType;



}
