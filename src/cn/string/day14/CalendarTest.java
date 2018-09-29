package cn.string.day14;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int year=sc.nextInt();

        Calendar c=Calendar.getInstance();
        c.set(year,2,1);
        c.add(Calendar.DATE,-1);

        System.out.println(c.get(Calendar.DATE));

    }
}
