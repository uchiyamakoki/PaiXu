package cn.string.day13;

import java.util.Scanner;

public class StringBuffer10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();


    }
    public static String myReverse(String s){
        String result="";
        char[] chs=s.toCharArray();
        for (int x=chs.length-1;x>=0;x--){
            result+=chs[x];
        }
        return result;
    }

    public static String myReverse2(String s){
        //StringBuffer sb=new StringBuffer(s);

        //sb.reverse();

        //return sb.toString();
        return new StringBuffer(s).reverse().toString();
    }
}
