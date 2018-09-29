package cn.string.day18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo5 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String,String>();

        map.put("杨过","小龙女");
        map.put("郭靖","黄蓉");
        map.put("杨康","穆念慈");
        map.put("陈玄风","梅超风");

      /*  Set<String> set=map.keySet();
        for (String key:set){
            System.out.println(key+map.get(key));
        }*/
      Set<Map.Entry<String,String>> set=map.entrySet();

      for (Map.Entry<String,String> m:set){
          System.out.println(m.getKey()+m.getValue());
      }
    }
}
