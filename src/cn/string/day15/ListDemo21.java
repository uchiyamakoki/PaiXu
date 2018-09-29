package cn.string.day15;

import java.util.ArrayList;
import java.util.List;

public class ListDemo21 {
    public static void main(String[] args) {
        List list=new ArrayList();


        list.add("hello");
        list.add("world");
        list.add("java");

        //System.out.println(list.get(0));
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
