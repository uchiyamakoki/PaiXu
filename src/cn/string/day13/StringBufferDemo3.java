package cn.string.day13;

public class StringBufferDemo3 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();

        StringBuffer sb2=sb.append("hello");

        System.out.println(sb);
        System.out.println(sb2);
        System.out.println(sb==sb2);

        sb.insert(5,"world");
        System.out.println(sb);
    }
}
