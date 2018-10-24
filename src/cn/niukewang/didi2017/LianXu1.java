package cn.niukewang.didi2017;

import java.util.Scanner;

public class LianXu1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] nums=new int[100000];
        int sum=0;

        int n=sc.nextInt();
        for (int i=0;i<n;i++){
           nums[i]=sc.nextInt();
        }

        for (int q=0;q<n-2;q++){
            sum=nums[q]+nums[q+1]>nums[q+1]+nums[q+2]?nums[q]+nums[q+1]:nums[q+1]+nums[q+2];
        }
        System.out.println(sum);
    }
}
