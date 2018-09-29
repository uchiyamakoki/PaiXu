package cn.string.day15;

import java.util.ArrayList;
import java.util.List;

public class ListDemo20 {
    public static void main(String[] args) {
        List list=new ArrayList();

        list.add("hello");
        list.add("world");
        list.add("java");

        list.add(1,"android");
        list.add(3,"javaee");

        list.remove(0);

        System.out.println("list:"+list);
    }
}
