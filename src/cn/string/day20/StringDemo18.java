package cn.string.day20;

import java.util.Arrays;

public class StringDemo18 {
    public static void main(String[] args) {
       // String s="abcde";//[97, 98, 99, 100, 101]
        String s="我爱你中国";//[-26, -120, -111, -25, -120, -79, -28, -67, -96, -28, -72, -83, -27, -101, -67]
        byte[] bys=s.getBytes();
        System.out.println(Arrays.toString(bys));
    }
}
