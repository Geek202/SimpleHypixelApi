package me.geek.tom.hypixelapi.test;

import me.geek.tom.hypixelapi.HypixelBaseApi;
import me.geek.tom.hypixelapi.HypixelApiBuilder;
import me.geek.tom.hypixelapi.res.FindGuildRes;
import me.geek.tom.hypixelapi.res.PlayerCountRes;
import me.geek.tom.hypixelapi.res.boosters.BoostersRes;
import me.geek.tom.hypixelapi.res.friends.Friend;
import me.geek.tom.hypixelapi.res.friends.FriendsRes;
import me.geek.tom.hypixelapi.res.gamecount.GameCount;
import me.geek.tom.hypixelapi.res.gamecount.GameCountRes;
import me.geek.tom.hypixelapi.res.guild.Guild;
import me.geek.tom.hypixelapi.res.guild.GuildRes;
import me.geek.tom.hypixelapi.res.leaderboards.GameLeaderboard;
import me.geek.tom.hypixelapi.res.leaderboards.LeaderboardRes;
import me.geek.tom.hypixelapi.res.recentgames.Game;
import me.geek.tom.hypixelapi.res.recentgames.RecentGameRes;
import me.geek.tom.hypixelapi.types.GameType;
import retrofit2.Response;

import java.io.*;
import java.util.List;
import java.util.Map;

public class ApiTest {

    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.err.println("Usage: <program> <hypixelApiKey> <test>");
            return;
        }

        HypixelBaseApi api = HypixelApiBuilder.createBaseApi();

        switch (args[1]) {
            case "playerCount":
                playerCount(args[0], api);
                break;
            case "boosters":
                boosters(args[0], api);
                break;
            case "findGuilds":
                findGuild(args[0], api);
                break;
            case "friends":
                friends(args[0], api);
                break;
            case "gameCounts":
                gameCounts(args[0], api);
                break;
            case "guild":
                getGuild(args[0], api);
                break;
            case "leaderboard":
                leaderboard(args[0], api);
                break;
            case "recentGames":
                recentGames(args[0], api);
                break;
            case "all":
                playerCount(args[0], api);
                boosters(args[0], api);
                findGuild(args[0], api);
                friends(args[0], api);
                gameCounts(args[0], api);
                getGuild(args[0], api);
                leaderboard(args[0], api);
                recentGames(args[0], api);
                break;
        }
    }

    private static void recentGames(String key, HypixelBaseApi api) throws IOException {
        Response<RecentGameRes> res = api.getRecentGames(key, "51ec296c75574a4697b8553b4e2f7112").execute();

        List<Game> games = res.body().games;
        System.out.println("Drummer_Tyler's recent games:");
        for (Game game : games) {
            System.out.println("\tPlayed " + game.gameType.getFriendlyName() + " on the map " + game.map);
        }

    }

    private static void leaderboard(String key, HypixelBaseApi api) throws IOException {
        Response<LeaderboardRes> res = api.getLeaderboards(key).execute();
        LeaderboardRes leadboards = res.body();
        for (Map.Entry<GameType, List<GameLeaderboard>> entry : leadboards.leaderboards.entrySet()) {
            System.out.println("Writing leaderboard for: " + entry.getKey().getFriendlyName() + "...");
            File outDir = new File("leaderboards", entry.getKey().getDatabaseName());
            if (!outDir.exists())
                outDir.mkdirs();
            writeLeaderboards(entry.getValue(), outDir);
        }
    }

    private static void writeLeaderboards(List<GameLeaderboard> boards, File outDir) throws IOException {
        for (GameLeaderboard board : boards) {
            PrintWriter writer = new PrintWriter(new FileWriter(new File(outDir, board.path + ".txt"), true));
            for (String entry : board.leaders)
                writer.println(entry);
            writer.flush();
            writer.close();
        }
    }

    private static void getGuild(String key, HypixelBaseApi api) throws IOException {
        Response<GuildRes> res = api.getGuildByName(key, "TylerR").execute();
        Guild guild = res.body().guild;
        System.out.println("Stats for guild: '" + guild.name + "':");
        System.out.println("\tDescription: " + guild.description);
        System.out.println("\tCoin count: " + guild.coins + "/" + guild.coinsEver);
        System.out.println("\tMembers: " + guild.members.size());
        System.out.println("\tCreated: " + guild.created);
        System.out.println("\tExperience: " + guild.exp);
        System.out.println("\tExperience by game:");
        for (Map.Entry<GameType, Integer> entry : guild.guildExpByGameType.entrySet())
            System.out.println("\t\t" + entry.getKey().getFriendlyName() + ": " + entry.getValue());
        System.out.println("\tAchievement progress:");
        for (Map.Entry<String, Integer> entry : guild.achievements.entrySet())
            System.out.println("\t\t" + entry.getKey() + ": " + entry.getValue());
    }

    private static void gameCounts(String key, HypixelBaseApi api) throws IOException {
        Response<GameCountRes> res = api.gameCounts(key).execute();
        System.out.println("Player counts for all gamemodes:");
        for (Map.Entry<String, GameCount> entry : res.body().games.entrySet()) {
            String type;
            try {
                type = GameType.valueOf(entry.getKey()).getFriendlyName();
            } catch (IllegalArgumentException e) {
                type = entry.getKey();
            }
            GameCount count = entry.getValue();
            System.out.println("\t"+type+":");
            System.out.println("\t\tTotal players: " + count.playerCount);
            if (count.modes != null) {
                for (Map.Entry<String, Integer> e : count.modes.entrySet()) {
                    System.out.println("\t\t" + e.getKey() + ": " + e.getValue());
                }
            }
        }
    }

    private static void friends(String key, HypixelBaseApi api) throws IOException {
        Response<FriendsRes> res = api.getFriends(key, "07e92b46838640678f728ab96e606fb7").execute();
        System.out.println("Tom_The_Geek's friends:");
        for (Friend friend : res.body().friends) {
            System.out.println("\t" + friend.getOtherUser("07e92b46838640678f728ab96e606fb7"));
        }
    }

    private static void findGuild(String key, HypixelBaseApi api) throws IOException {
        Response<FindGuildRes> res = api.findGuildByName(key, "TylerR").execute();
        System.out.println("Guild ID of 'TylerR' is " + res.body().guild);
    }

    private static void boosters(String key, HypixelBaseApi api) throws IOException {
        Response<BoostersRes> res = api.getBoosters(key).execute();
        for (GameType type : GameType.values()) {
            BoostersRes boosters = res.body();
            long count = boosters.boosters.stream().filter(booster -> booster.getGameType().equals(type)).count();
            System.out.println("There are " + count + " boosters active for " + type.getFriendlyName());
        }
    }

    private static void playerCount(String key, HypixelBaseApi api) throws IOException {
        Response<PlayerCountRes> res = api.getPlayerCount(key).execute();
        System.out.println("There are " + res.body().playerCount + " users online!");
    }

}
