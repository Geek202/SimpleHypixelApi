package me.geek.tom.hypixelapi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import me.geek.tom.hypixelapi.adapter.DateTimeAdapter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.time.ZonedDateTime;

public class HypixelApiBuilder {

    public static final String BASE_URL = "https://api.hypixel.net/";

    public static HypixelBaseApi createBaseApi() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .registerTypeAdapter(ZonedDateTime.class, new DateTimeAdapter())
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        return retrofit.create(HypixelBaseApi.class);
    }

}
