package cn.string.day16;

import java.util.Arrays;
import java.util.List;

public class ArrayDemo24 {
    public static void main(String[] args) {
        //String[] strArray={"hello","world","java"};
        List<String> list= Arrays.asList("hello","world","java");
        //list.add("add"); 但是不支持add remove/这种集合本质数组，长度不变 但是支持修改

        for (String s:list){
            System.out.println(s);
        }
    }
}
