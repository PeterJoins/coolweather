package com.example.administrator.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/4/9 0009.
 */

public class Forecast {
//    "daily_forecast": [
//    {
//        "astro": {
//        "mr": "16:36",
//                "ms": "04:31",
//                "sr": "05:37",
//                "ss": "18:23"
//    },
//        "cond": {
//        "code_d": "305",
//                "code_n": "305",
//                "txt_d": "小雨",
//                "txt_n": "小雨"
//    },
//        "date": "2017-04-09",
//            "hum": "77",
//            "pcpn": "7.1",
//            "pop": "100",
//            "pres": "1012",
//            "tmp": {
//        "max": "13",
//                "min": "10"
//    },
//        "uv": "2",
//            "vis": "13",
//            "wind": {
//        "deg": "40",
//                "dir": "东北风",
//                "sc": "微风",
//                "spd": "8"
//    }
//    },
//    {
//        "astro": {
//        "mr": "17:32",
//                "ms": "05:06",
//                "sr": "05:36",
//                "ss": "18:23"
//    },
//        "cond": {
//        "code_d": "305",
//                "code_n": "305",
//                "txt_d": "小雨",
//                "txt_n": "小雨"
//    },
//        "date": "2017-04-10",
//            "hum": "75",
//            "pcpn": "10.2",
//            "pop": "100",
//            "pres": "1011",
//            "tmp": {
//        "max": "14",
//                "min": "10"
//    },
//        "uv": "2",
//            "vis": "11",
//            "wind": {
//        "deg": "167",
//                "dir": "东北风",
//                "sc": "微风",
//                "spd": "5"
//    }
//    },
//    {
//        "astro": {
//        "mr": "18:26",
//                "ms": "05:40",
//                "sr": "05:34",
//                "ss": "18:24"
//    },
//        "cond": {
//        "code_d": "104",
//                "code_n": "101",
//                "txt_d": "阴",
//                "txt_n": "多云"
//    },
//        "date": "2017-04-11",
//            "hum": "72",
//            "pcpn": "0.7",
//            "pop": "88",
//            "pres": "1013",
//            "tmp": {
//        "max": "15",
//                "min": "10"
//    },
//        "uv": "6",
//            "vis": "15",
//            "wind": {
//        "deg": "159",
//                "dir": "北风",
//                "sc": "微风",
//                "spd": "3"
//    }
//    }
//    ],

    public String date;
    @SerializedName("tmp")
    public Temperature temperature;//温度

    @SerializedName("cond")
    public More more;


    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
