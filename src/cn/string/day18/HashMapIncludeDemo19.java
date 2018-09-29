package cn.string.day18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapIncludeDemo19 {
    public static void main(String[] args) {
        HashMap<String,ArrayList<String>> hm=new HashMap<String,ArrayList<String>>();

        ArrayList<String> array1=new ArrayList<String>();
        array1.add("吕布");
        array1.add("周瑜");

        hm.put("三国演义",array1);

        ArrayList<String> array2=new ArrayList<String>();
        array2.add("令狐冲");
        array2.add("林平之");

        hm.put("笑傲江湖",array2);

        Set<String> set=hm.keySet();
        for (String key:set){
            ArrayList<String> value=hm.get(key);
            System.out.println(key);
            for (String s:value){
                System.out.println(s);
            }
        }


    }
}
