package cn.string.day19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo10 {

    public static void main(String[] args) {
      /*  int a=10;
        int b=0;
        System.out.println(a/b);*/

      String s="2014-11-20";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date d=sdf.parse(s);
            System.out.println(d);
        }catch (ParseException e){
            //e.printStackTrace();
            System.out.println("解析出错");
        }
    }
}
