package cn.string.day17;

import java.util.HashSet;

public class DogDemo15 {
    public static void main(String[] args) {
        HashSet<Dog> hs=new HashSet<Dog>();

        Dog d1=new Dog(25,"余一","粉色",'女');
        Dog d2=new Dog(22,"余一骚猪","粉色",'女');
        Dog d3=new Dog(22,"余一骚猪","黄色",'女');
        Dog d4=new Dog(20,"余一骚猪","粉色",'女');

        hs.add(d1);
        hs.add(d2);
        hs.add(d3);
        hs.add(d4);

        for (Dog d:hs){
            System.out.println(d.getAge()+"---------"+d.getSex()+d.getColor()+d.getName());
        }
    }
}
