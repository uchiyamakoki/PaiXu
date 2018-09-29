package cn.string.day16;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList link=new LinkedList();
        link.addFirst("hello");
        link.addFirst("world");
        link.addFirst("java");

        Iterator it=link.iterator();
        while (it.hasNext()){
            String s= (String) it.next();
            System.out.println(s);
        }
    }
}
