package cn.string.day19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo12 {
    public static void main(String[] args) {
        System.out.println("今天天气不错");
        try {
            method();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("但是阴暗");

        method2();
    }

    private static void method2() throws ArithmeticException{
        int a=10;
        int b=0;
        System.out.println(a/b);
    }

    private static void method() throws ParseException {
        String s="2014-11-20";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       Date d=sdf.parse(s);
       System.out.println(d);
    }
}
