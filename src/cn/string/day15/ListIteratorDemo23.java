package cn.string.day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo23 {
    public static void main(String[] args) {

        List list=new ArrayList();

        list.add("hello");
        list.add("world");
        list.add("java");

        ListIterator iterator=list.listIterator();
        while (iterator.hasNext()){
            String s= (String) iterator.next();
            System.out.println(s);
        }
    }
}
