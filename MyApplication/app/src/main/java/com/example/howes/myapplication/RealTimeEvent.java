package com.example.howes.myapplication;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.JsonObject;

/**
 * Created by howes on 4/3/17.
 */

public class RealTimeEvent {


    @SerializedName("event")
    private int event;

    @SerializedName("params")
    private JsonObject params;

    public int getType() {
        return event;
    }

    public <T> T getParams(Class<T> type) {
        return new Gson().fromJson(params.toString(), type);
    }
}
