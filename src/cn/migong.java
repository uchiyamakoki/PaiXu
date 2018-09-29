package cn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class migong {
    public static void main(String[] args) {
        List<String> mgg=new ArrayList<String>();

        Scanner sc=new Scanner(System.in);
        System.out.println("输入m,n,p:" );
        int m=sc.nextInt();
        int n=sc.nextInt();
        int p=sc.nextInt();

        int count=m-1;

        int[][] mg=new int[9][9];
        System.out.println("输入路径:" );
        for (int x=0;x<n;x++){
            for (int y=0;y<m;y++){
                mg[x][y]=sc.nextInt();
            }
        }
        for (int x=0;x<n;x++){
            for (int y=0;y<m;y++){
                if (mg[x][y]==1){
                    mgg.add("["+m+","+n+"]");
                }else if (mg[x][y]==0){
                    count=count+3;
                    break;
                }
            }
        }

        if (count<=p){
            for (String s:mgg){
                System.out.println(s);
            }
        }else {
            System.out.println("Can not escape!");
        }



    }
}
