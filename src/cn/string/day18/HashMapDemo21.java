package cn.string.day18;

import cn.string.day16.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo21 {
    public static void main(String[] args) {
        HashMap<String,HashMap<String,ArrayList<Student>>> czbkMap=new HashMap<String,HashMap<String,ArrayList<Student>>>();

        HashMap<String,ArrayList<Student>> bjCzbkMap=new HashMap<String,ArrayList<Student>>();

        ArrayList<Student> array1=new ArrayList<Student>();
        Student s1=new Student("林青霞",27);
        Student s2=new Student("风清扬",30);
        array1.add(s1);
        array1.add(s2);
        ArrayList<Student> array2=new ArrayList<Student>();
        Student s3=new Student("林青霞",27);
        Student s4=new Student("风清扬",30);
        array2.add(s3);
        array2.add(s4);
        czbkMap.put("北京校区",bjCzbkMap);
        //上海校区数据自己放
        //广州校区数据自己放
        //西安校区数据自己放
        HashMap<String,ArrayList<Student>> xaCzbkMap=new HashMap<String,ArrayList<Student>>();

        ArrayList<Student> array3=new ArrayList<Student>();
        Student s5=new Student("林青霞",27);
        Student s6=new Student("风清扬",30);
        array3.add(s5);
        array3.add(s6);
        ArrayList<Student> array4=new ArrayList<Student>();
        Student s7=new Student("赵雅芝",28);
        Student s8=new Student("武鑫",29);
        array4.add(s7);
        array4.add(s8);
        xaCzbkMap.put("基础班",array3);
        xaCzbkMap.put("XX班",array4);
        czbkMap.put("西安校区",xaCzbkMap);

        Set<String> czbkMapSet=czbkMap.keySet();
        for (String czbkMapKey:czbkMapSet){
            System.out.println(czbkMapKey);

            HashMap<String,ArrayList<Student>> czbkMapValue=czbkMap.get(czbkMapKey);
            Set<String> czbkMapValueSet=czbkMapValue.keySet();

            for (String czbkMapValueKey:czbkMapValueSet){
                ArrayList<Student> czbkMapValueValue=czbkMapValue.get(czbkMapValueKey);
                for (Student s:czbkMapValueValue){
                   System.out.println(s.getName()+s.getAge());
                }
            }
        }

    }
}
