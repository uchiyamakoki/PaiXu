package cn.string.day14;

import java.util.Scanner;

public class RegexTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();
        String regex="[a-zA-Z_0-9]+@[a-zA-Z_0-9]{2,6}(\\.[a-zA-Z_0-9]{2,3})+";
        String regex1="\\w+@\\w{2,6}(\\.\\w{2,3})+";

        boolean flag=str.matches(regex1);

        System.out.println(flag);
    }
}
