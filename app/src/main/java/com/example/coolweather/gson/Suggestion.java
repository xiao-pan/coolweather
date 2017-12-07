package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/12/6.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comport comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Sport {
        @SerializedName("txt")
        public CarWash info;
    }

    public class Comport {
        @SerializedName("txt")
        public CarWash info;
    }

    public class CarWash {
        @SerializedName("txt")
        public CarWash info;
    }
}
