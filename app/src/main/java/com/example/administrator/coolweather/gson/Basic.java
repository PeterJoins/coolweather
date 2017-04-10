package com.example.administrator.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/4/9 0009.
 */

//"basic": {
//        "city": "苏州",
//        "cnty": "中国",
//        "id": "CN101190401",
//        "lat": "31.299379",
//        "lon": "120.619585",
//        "update": {
//        "loc": "2017-04-09 14:51",
//        "utc": "2017-04-09 06:51"
//        }
//        },

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
