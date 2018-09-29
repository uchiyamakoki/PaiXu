package cn.string.day12;

import java.util.Scanner;

public class StringDemo24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String line=sc.nextLine();

        String result="";
        char[] chs=line.toCharArray();
        for(int x=chs.length-1;x>=0;x--){
                result+=chs[x];
        }
        System.out.println(result);
    }

    public static String myReverse(String s){
        Scanner sc=new Scanner(System.in);

        String line=sc.nextLine();

        String result="";
        char[] chs=line.toCharArray();
        for(int x=chs.length-1;x>=0;x--){
            result+=chs[x];
        }
        return result;
    }
}
