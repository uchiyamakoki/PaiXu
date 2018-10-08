package cn.string.day19;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo13 {
    public static void main(String[] args) {
        //method();
        try {
            method2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void method() {
      /*  String s="2014-11-20";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d=sdf.parse(s);
        System.out.println(d);*/
        int a=10;
        int b=0;
        if (b==0){
            throw new ArithmeticException();
        }else {
            System.out.println(a/b);
        }
    }
    private static void method2() throws Exception {
      /*  String s="2014-11-20";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d=sdf.parse(s);
        System.out.println(d);*/
        int a=10;
        int b=0;
        if (b==0){
            throw new Exception();
        }else {
            System.out.println(a/b);
        }
    }
}
