package cn.string.day19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo15 {
    public static void main(String[] args) {
        String s="2014-11-20";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date d=null;
        try {
     d=sdf.parse(s);
 }catch (ParseException e){
     e.printStackTrace();
 }finally {
     System.out.println("aaaaaaaaaaaa");
        }
        System.out.println(d);
    }
}
