package cn.string.day18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiDi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        List<Integer> list=new ArrayList();
        for (int i=0;i<n;i++){
            Scanner sc2=new Scanner(System.in);
            int t=sc2.nextInt();
            list.add(t);
        }
        if (n==1){
            System.out.println(list.get(0));
        }else if (n==2){
            System.out.println(list.get(0)+list.get(1));
        }else {
            int sum=list.get(0)+list.get(1);
            for (int y=0;y<n-2;y++){
                if ((list.get(y)+list.get(y+1))>(list.get(y+1)+list.get(y+2))){
                    sum=list.get(y)+list.get(y+1);
                }else {
                    sum=list.get(y+1)+list.get(y+2);
                }
            }
            System.out.println(sum);

        }
    }
}
