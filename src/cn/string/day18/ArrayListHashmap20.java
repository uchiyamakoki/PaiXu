package cn.string.day18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ArrayListHashmap20 {
    public static void main(String[] args) {
        ArrayList<HashMap<String,String>> array=new ArrayList<HashMap<String,String>>();

        HashMap<String,String> hm1=new HashMap<String,String>();
        hm1.put("周瑜","小乔");
        hm1.put("吕布","貂蝉");

        array.add(hm1);

        HashMap<String,String> hm2=new HashMap<String,String>();
        hm2.put("郭靖","黄蓉");
        hm2.put("杨过","小龙女");

        array.add(hm2);

        for (HashMap<String,String> hm:array){
            Set<String> set=hm.keySet();
            for (String key:set){
                String value=hm.get(key);
                System.out.println(key+"---"+value);
            }
        }
    }
}
