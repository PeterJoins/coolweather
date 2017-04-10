package com.example.administrator.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/4/9 0009.
 * 由于JSON数据结构复杂，所以只取简单部分示例
 */

public class Now {
//    "now": {
//                "cond": {
//                    "code": "300",
//                    "txt": "阵雨"
//                    },
//                "fl": "14",
//                "hum": "76",
//                "pcpn": "0",
//                "pres": "1012",
//                "tmp": "12",
//                "vis": "7",
//                "wind": {
//                    "deg": "51",
//                    "dir": "东北风",
//                    "sc": "3-4",
//                    "spd": "17"
//        }
//    },
    @SerializedName("tmp")
    public String temperature;//温度

    @SerializedName("cond")
    public More more;
    public class More{

        @SerializedName("txt")
        public String info;

    }
}
