package cn.string.day16;

import java.util.LinkedList;

public class LinkedListDemo4 {
    public static void main(String[] args) {
        LinkedList link=new LinkedList();

        link.add("hello");
        link.add("world");
        link.addLast("android");
        link.add("java");

        link.addFirst("javaee");
        link.addLast("android");
        System.out.println(link.getFirst());
        System.out.println(link.getLast());
        System.out.println(link);
        System.out.println(link.removeFirst());
        System.out.println(link.removeLast());


    }

}
