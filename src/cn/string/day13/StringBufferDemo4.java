package cn.string.day13;

public class StringBufferDemo4 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("hello").append("world").append("java");
        System.out.println(sb);

        //sb.deleteCharAt(1);

        //sb.deleteCharAt(1);
        //sb.delete(5,10);
        sb.delete(0,sb.length());
        System.out.println(sb);
    }
}
