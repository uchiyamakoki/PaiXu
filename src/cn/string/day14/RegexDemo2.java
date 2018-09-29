package cn.string.day14;

import java.util.Scanner;

public class RegexDemo2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        boolean flag=regex(str);
        System.out.println(flag);

    }

    public static boolean regex(String qq){
       String regex="[1-9][0-9]{4,14}";
       boolean flag=qq.matches(regex);
       return flag;
    }
}
