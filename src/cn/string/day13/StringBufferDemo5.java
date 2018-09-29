package cn.string.day13;

public class StringBufferDemo5 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();

        sb.append("hello");
        sb.append("world");
        sb.append("java");

        sb.replace(5,10,"节日快乐");
        System.out.println(sb);
    }
}
