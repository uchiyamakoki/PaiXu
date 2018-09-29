package cn.string.day18;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> m=new HashMap<String,String>();

        //System.out.println("put:"+m.put("文章","马伊琍"));
        //System.out.println("put:"+m.put("文章","姚笛"));

        m.put("邓超","孙俪");
        m.put("黄晓明","杨颖");
        m.put("周杰伦","蔡依林");
        m.put("刘恺威","杨幂");//也是无序的

        //System.out.println("remove:"+m.remove("黄晓明"));
        //System.out.println("remove:"+m.remove("黄晓"));

       // System.out.println("containsKey"+m.containsKey("黄晓明"));
       // System.out.println("containsKey"+m.containsKey("黄晓"));

       System.out.println(m.size());
        System.out.println("map:"+m);
    }

}
