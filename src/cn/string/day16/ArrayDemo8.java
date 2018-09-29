package cn.string.day16;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayDemo8 {
    public static void main(String[] args) {
        ArrayList array=new ArrayList();

        Student s1=new Student("余一",27);
        Student s2=new Student("沈宁",40);
        Student s3=new Student("王珞蓉",35);
        Student s4=new Student("郑紫悦",18);
        Student s5=new Student("徐榕霞",16);
        Student s6=new Student("余一",27);

        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);
        array.add(s5);
        array.add(s6);


        ArrayList newArray=new ArrayList();
        Iterator it=array.iterator();
        while (it.hasNext()){
            Student s= (Student) it.next();
            if (!newArray.contains(s)){
                newArray.add(s);
            }
        }
        for (int x=0;x<newArray.size();x++){
            Student s= (Student) newArray.get(x);
            System.out.println(s.getName()+s.getAge());
        }

    }
}
