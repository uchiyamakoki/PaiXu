package cn.string.day16;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo13 {
    public static void main(String[] args) {
        //JDK7新特性：范型推断
        ArrayList<Student> array=new ArrayList<Student>();

        Student s1=new Student("曹操",40);
        Student s2=new Student("蒋干",30);
        Student s3=new Student("诸葛亮",26);

        array.add(s1);
        array.add(s2);
        array.add(s3);

        Iterator<Student> it=array.iterator();

        while (it.hasNext()){
            Student s=it.next();
            System.out.println(s.getName()+"---"+s.getAge());
        }

        System.out.println("----------------------");

        for (int i=0;i<array.size();i++){
            Student s=array.get(i);
            System.out.println(s.getName()+"---"+s.getAge());
        }


    }
}
