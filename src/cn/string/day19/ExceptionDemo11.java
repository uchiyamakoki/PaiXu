package cn.string.day19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo11 {
    public static void main(String[] args) {
        String s="2014-11-20";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date d=sdf.parse(s);
            System.out.println(d);
        }catch (ParseException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }
}
