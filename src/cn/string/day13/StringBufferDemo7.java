package cn.string.day13;

public class StringBufferDemo7 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();

        sb.append("hello").append("world").append("java");

        //String s=sb.substring(5);
        String ss=sb.substring(5,10);
        System.out.println(ss);
    }
}
