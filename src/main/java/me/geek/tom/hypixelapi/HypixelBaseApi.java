package me.geek.tom.hypixelapi;

import me.geek.tom.hypixelapi.res.FindGuildRes;
import me.geek.tom.hypixelapi.res.PlayerCountRes;
import me.geek.tom.hypixelapi.res.PlayerRes;
import me.geek.tom.hypixelapi.res.boosters.BoostersRes;
import me.geek.tom.hypixelapi.res.friends.FriendsRes;
import me.geek.tom.hypixelapi.res.gamecount.GameCountRes;
import me.geek.tom.hypixelapi.res.guild.GuildRes;
import me.geek.tom.hypixelapi.res.leaderboards.LeaderboardRes;
import me.geek.tom.hypixelapi.res.recentgames.RecentGameRes;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface HypixelBaseApi {

    @GET("/playerCount")
    Call<PlayerCountRes> getPlayerCount(@Query("key") String key);

    @GET("/boosters")
    Call<BoostersRes> getBoosters(@Query("key") String key);

    @GET("/findGuild")
    Call<FindGuildRes> findGuildByName(@Query("key") String key, @Query("byName") String name);

    @GET("/findGuild")
    Call<FindGuildRes> findGuildById(@Query("key") String key, @Query("byUuid") String id);

    @GET("/friends")
    Call<FriendsRes> getFriends(@Query("key") String key, @Query("uuid") String uuid);

    @GET("/gameCounts")
    Call<GameCountRes> gameCounts(@Query("key") String key);

    @GET("/guild")
    Call<GuildRes> getGuildById(@Query("key") String key, @Query("id") String id);

    @GET("/guild")
    Call<GuildRes> getGuildByName(@Query("key") String key, @Query("name") String name);

    @GET("/guild")
    Call<GuildRes> getGuildByPlayer(@Query("key") String key, @Query("player") String playerUuid);

    @GET("/leaderboards")
    Call<LeaderboardRes> getLeaderboards(@Query("key") String key);

    @GET("/player")
    Call<PlayerRes> getPlayer(@Query("key") String key, @Query("uuid") String playerUuid);

    @GET("/recentGames")
    Call<RecentGameRes> getRecentGames(@Query("key") String key, @Query("uuid") String playerUuid);

}
