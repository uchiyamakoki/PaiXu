package cn.string.day18;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //List<Integer> zhuozi=new ArrayList<Integer>();
        int sum=0;
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();


        Scanner sc=new Scanner(System.in);

        System.out.println("请输入n（桌子张数）,m（客人批数）：");
        int n=sc.nextInt();
        int m=sc.nextInt();

        System.out.println("请输入每张桌子容量:");
        for (int x=0;x<n;x++){
            int zz=sc.nextInt();
            //zhuozi.add(zz);
            map.put(zz,0);
        }
        Set<Integer> key=map.keySet();
        System.out.println("请输入客人相关信息:");
        for (int y=0;y<m;y++){
            int people=sc.nextInt();
            int price=sc.nextInt();
            for (int zzz:key){
                if (people<=zzz&&price>=map.get(zzz)){
                     map.put(zzz,price);
                }
            }
        }
        for (int  zzzz:key){
            sum=sum+map.get(zzzz);
        }
        System.out.println(sum);
    }
}
