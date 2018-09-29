package cn.string.day17;

import java.util.HashSet;
import java.util.Set;

/*
List 有序，可重复

Set 无序，唯一
 */
public class SetDemo10 {
    public static void main(String[] args) {
        Set<String> set=new HashSet<String>();
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("world");

        for (String s:set){
            System.out.println(s);
        }
    }
}
