package cn.string.day16;

import java.util.ArrayList;

public class ListTest25 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Student>> bigArrayList=new ArrayList<ArrayList<Student>>();

        ArrayList<Student> firstArrayList=new ArrayList<Student>();
        Student s1=new Student("余一",30);
        Student s2=new Student("余一老婆",29);
        Student s3=new Student("余一小娇妻",28);
        Student s4=new Student("余一嘿嘿嘿",27);
        Student s5=new Student("余一贱人",26);
        firstArrayList.add(s1);
        firstArrayList.add(s2);
        firstArrayList.add(s3);
        firstArrayList.add(s4);
        firstArrayList.add(s5);
        bigArrayList.add(firstArrayList);

        ArrayList<Student> secondArrayList=new ArrayList<Student>();
        Student w1=new Student("王珞蓉",30);
        Student w2=new Student("王珞蓉老婆",29);
        Student w3=new Student("王珞蓉母猪",28);
        Student w4=new Student("王珞蓉rbq",27);
        secondArrayList.add(w1);
        secondArrayList.add(w2);
        secondArrayList.add(w3);
        secondArrayList.add(w4);
        bigArrayList.add(secondArrayList);

        for (ArrayList<Student> arrayList:bigArrayList){
            for (Student s:arrayList){
                System.out.println(s.getName()+s.getAge());
            }
        }
    }
}
