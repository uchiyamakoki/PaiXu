package cn.string.day16;

import java.util.ArrayList;
import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random r=new Random();

        ArrayList<Integer> array=new ArrayList<Integer>();

        int conut=0;

        while (conut<10){
            int number=r.nextInt(20)+1;

            if (!array.contains(number)){
                array.add(number);
                conut++;
            }

        }
        for (Integer i:array){
            System.out.println(i);
        }
    }
}
