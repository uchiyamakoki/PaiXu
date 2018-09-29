package cn.string.day14;

import java.util.Scanner;

public class RegexDemo6 {
    public static void main(String[] args) {
        String ages="18-24";

        String regex="-";

        String[] strArray=ages.split(regex);

        for (int x=0;x<strArray.length;x++){
            System.out.println(strArray[x]);
        }

        int startAge=Integer.parseInt(strArray[0]);
        int endAge=Integer.parseInt(strArray[1]);

        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if (age>=startAge&&age<=endAge){
            System.out.println("你就是我想找的");
        }else {
            System.out.println("不符合我的要求,gun");
        }


    }
}
