package cn.string.day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo17 {
    public static void main(String[] args) {
        List list=new ArrayList();

        list.add("hello");
        list.add("world");
        list.add("java");

        Iterator it=list.iterator();
        while (it.hasNext()){
            String s= (String) it.next();
            System.out.println(s);
        }

    }
}
