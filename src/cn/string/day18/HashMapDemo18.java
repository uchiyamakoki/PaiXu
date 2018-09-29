package cn.string.day18;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo18 {

    public static void main(String[] args) {
        HashMap<String,HashMap<String,Integer>> czbk=new HashMap<String,HashMap<String,Integer>>();

        HashMap<String,Integer> jcMap=new HashMap<String, Integer>();

        jcMap.put("余一",20);
        jcMap.put("沈宁",20);

        czbk.put("jc",jcMap);

        HashMap<String,Integer> jyMap=new HashMap<String, Integer>();

        jcMap.put("余一老婆",20);
        jcMap.put("沈宁老公",20);

        czbk.put("jy",jyMap);

        Set<String> key=czbk.keySet();
        for (String s:key){
            HashMap<String,Integer> value=czbk.get(s);

            Set<String> key2=value.keySet();
            for (String s2:key2){
                Integer value2=value.get(s2);
            }
        }



    }
}
