package cn.string.day16;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        ArrayList array=new ArrayList();

        array.add("hello");
        array.add("world");
        array.add("java");
        array.add("world");

        ArrayList newArray=new ArrayList();

        Iterator it=array.iterator();
        while (it.hasNext()){
            String s= (String) it.next();
            if (!newArray.contains(s)){
                newArray.add(s);
            }
        }
        for (int x=0;x<newArray.size();x++){
            String s= (String) newArray.get(x);
            System.out.println(s);
        }
    }
}
