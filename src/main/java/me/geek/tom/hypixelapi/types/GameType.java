package me.geek.tom.hypixelapi.types;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum GameType {
    QUAKECRAFT("Quake", "Quake", 2),
    WALLS("Walls", "Walls", 3),
    PAINTBALL("Paintball", "Paintball", 4),
    SURVIVAL_GAMES("HungerGames", "Blitz Survival Games", 5),
    TNTGAMES("TNTGames", "TNT Games", 6),
    VAMPIREZ("VampireZ", "VampireZ", 7),
    WALLS3("Walls3", "Mega Walls", 13),
    ARCADE("Arcade", "Arcade", 14),
    ARENA("Arena", "Arena", 17),
    UHC("UHC", "UHC Champions", 20),
    MCGO("MCGO", "Cops and Crims", 21),
    BATTLEGROUND("Battleground", "Warlords", 23),
    SUPER_SMASH("SuperSmash", "Smash Heroes", 24),
    GINGERBREAD("GingerBread", "Turbo Kart Racers", 25),
    HOUSING("Housing", "Housing", 26),
    SKYWARS("SkyWars", "SkyWars", 51),
    TRUE_COMBAT("TrueCombat", "Crazy Walls", 52),
    SPEED_UHC("SpeedUHC", "Speed UHC", 54),
    SKYCLASH("SkyClash", "SkyClash", 55),
    LEGACY("Legacy", "Classic Games", 56),
    PROTOTYPE("Prototype", "Prototype", 57),
    BEDWARS("Bedwars", "Bed Wars", 58),
    MURDER_MYSTERY("MurderMystery", "Murder Mystery", 59),
    BUILD_BATTLE("BuildBattle", "Build Battle", 60),
    DUELS("Duels", "Duels", 61),
    SKYBLOCK("SkyBlock", "SkyBlock", 63),
    PIT("Pit", "Pit", 64);

    private final String databaseName;
    private final String friendlyName;
    private final int id;

    GameType(String databaseName, String friendyName, int id) {
        this.databaseName = databaseName;
        this.friendlyName = friendyName;
        this.id = id;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public String getFriendlyName() {
        return friendlyName;
    }

    public int getId() {
        return id;
    }

    public static GameType fromId(int id) {
        List<GameType> types = Arrays.stream(values()).filter(type -> type.id == id).collect(Collectors.toList());
        if (types.size() == 0)
            return null;
        return types.get(0);
    }

}
