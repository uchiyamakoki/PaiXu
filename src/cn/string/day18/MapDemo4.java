package cn.string.day18;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo4 {
    public static void main(String[] args) {
        Map<String,String> m=new HashMap<String,String>();

        //System.out.println("put:"+m.put("文章","马伊琍"));
        //System.out.println("put:"+m.put("文章","姚笛"));

        m.put("邓超","孙俪");
        m.put("黄晓明","杨颖");
        m.put("周杰伦","蔡依林");
        m.put("刘恺威","杨幂");//也是无序的

        System.out.println(m.get("周杰伦"));
        System.out.println(m.get("周杰"));

        Set<String> set=m.keySet();
        for (String key:set){
            System.out.println(key);
        }

        Collection<String> values=m.values();
        for (String s:values){
            System.out.println(s);
        }
    }
}
