package cn.string.day21;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s="你好";

        byte[] bys=s.getBytes();
        System.out.println(Arrays.toString(bys));

        String ss=new String(bys,"UTF-8");

        System.out.println(ss);
    }
}
