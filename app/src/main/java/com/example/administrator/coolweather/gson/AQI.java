package com.example.administrator.coolweather.gson;

/**
 * Created by Administrator on 2017/4/9 0009.
 */

public class AQI {

//    "aqi": {
//        "city": {
//                    "aqi": "59",
//                    "co": "1",
//                    "no2": "36",
//                    "o3": "89",
//                    "pm10": "52",
//                    "pm25": "42",
//                    "qlty": "良",
//                    "so2": "10"
//        }
//    },
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }

}
