package cn;

import java.util.Scanner;

public class MoWei {
    public static void main(String[] args) {
        int sum=1;
        int d=0;
        int count=0;
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
          sum=sum*i;
        }

        while (d==0){
            d=sum%10;
            sum=sum/10;
            count++;
        }
        count--;
        System.out.println(count);
    }
}
