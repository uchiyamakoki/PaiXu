package cn.string.day18;

import java.util.HashMap;

public class HashtableDemo {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<String,String>();
        hm.put("it001","hello");
        hm.put(null,"world");
        hm.put("java",null);

        System.out.println(hm);
    }
}
