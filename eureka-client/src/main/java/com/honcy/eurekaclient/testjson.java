package com.honcy.eurekaclient;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.HashMap;
import java.util.Map;

public class testjson {

    public static void main(String[] args) {
        Map map = new HashMap();
        JSONObject jsonbarge = new JSONObject();
        map.put("BG_VOY",null);
        map.put("BG_COMP","22");
        Object jsonparams =JSONObject.toJSON(map);
        System.out.println(JSONObject.toJSONString(map,SerializerFeature.WriteNullStringAsEmpty));
        JSONArray ja = new JSONArray();
        ja.add(jsonparams);
        jsonbarge.put("BARGE",ja);

        JSONObject jo = new JSONObject();
        jo.put("BG_COMP","22");
        jo.put("BG_VOY2",null);
        jo.put("BG_COMP2","22");
        String str = JSONObject.toJSONString(jsonparams, SerializerFeature.WriteNullStringAsEmpty);
        System.out.println(str);
        System.out.println( );
        System.out.println(JSONObject.toJSONString(jo.toJSONString(), SerializerFeature.WriteNullStringAsEmpty));

        Map < String , Object > jsonMap = new HashMap< String , Object>();
        jsonMap.put("a",1);
        jsonMap.put("b","");
        jsonMap.put("c",null);
        jsonMap.put("d","wuzhuti.cn");

        String str2 = JSONObject.toJSONString(jsonMap,SerializerFeature.WriteNullStringAsEmpty);
        System.out.println(str2);
//输出结果:{"a":1,"b":"","c":null,"d":"wuzhuti.cn"}
        student a = new student();
        a.name=null;
        a.age="18";
        System.out.println(JSONObject.toJSONString(a,SerializerFeature.WriteNullStringAsEmpty));


    }
}
class  student{
//    @JSONField(serialzeFeatures={SerializerFeature.WriteMapNullValue,SerializerFeature.WriteNullStringAsEmpty})
    public  String name;
//    @JSONField(serialzeFeatures={SerializerFeature.WriteMapNullValue,SerializerFeature.WriteNullStringAsEmpty})
    public String age;

}
