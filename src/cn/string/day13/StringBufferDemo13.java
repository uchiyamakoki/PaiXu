package cn.string.day13;

public class StringBufferDemo13 {
    public static void main(String[] args) {
            String s="ab";
            boolean a=duiChen(s);
            System.out.println(a);
    }

    public static boolean duiChen(String s){
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        if(sb.toString().equals(s)){
            return true;
        }else {
            return false;
        }
    }
}
