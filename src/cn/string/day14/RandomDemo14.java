package cn.string.day14;

import java.util.Random;

/*

 */
public class RandomDemo14 {
    public static void main(String[] args) {
        Random r=new Random();
        for (int x=0;x<10;x++){
            int num=r.nextInt(100)+1;
            System.out.println(num);
        }
    }
}
