package cn.string.day18;

import cn.string.day16.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo26 {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<Student>();

        Student s1=new Student("yiyi",27);
        Student s2=new Student("yui",30);
        Student s3=new Student("bazhujia",26);

        list.add(s1);
        list.add(s2);
        list.add(s3);

       // Collections.sort(list);
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num=o2.getAge()-o1.getAge();
                int num2=num==0?o1.getName().compareTo(o2.getName()):num;
                return num2;
            }
        });

        for (Student s:list){
            System.out.println(s.getName()+s.getAge());
        }
    }
}
