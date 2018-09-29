package cn.string.day14;

import java.util.Scanner;

public class RegexDemo4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String phone=sc.nextLine();

        String regex="1[38]\\d{9}";

        boolean flag=phone.matches(regex);
        System.out.println(flag);
    }
}
