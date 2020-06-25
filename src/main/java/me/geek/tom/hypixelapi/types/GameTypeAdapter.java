package me.geek.tom.hypixelapi.types;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class GameTypeAdapter extends TypeAdapter<GameType> {
    @Override
    public void write(JsonWriter out, GameType value) throws IOException {
        out.value(value.getId());
    }

    @Override
    public GameType read(JsonReader in) throws IOException {
        JsonToken peek = in.peek();
        if (peek == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        return GameType.fromId(in.nextInt());
    }
}
