package cn.string.day16;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo20 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> array=new ArrayList<>();

        //创建并添加元素
        array.add("hello");
        array.add("world");
        array.add("java");

        //遍历集合
        Iterator<String> it=array.iterator();
        while (it.hasNext()){
            String s=it.next();
            System.out.println(s);
        }
        System.out.println("---------------------");
        for (int x=0;x<array.size();x++){
            String s=array.get(x);
            System.out.println(s);
        }
        System.out.println("---------------------");
        for (String s:array){
            System.out.println(s);
        }
    }
}
