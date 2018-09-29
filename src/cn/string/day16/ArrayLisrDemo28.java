package cn.string.day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayLisrDemo28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<Integer> arrayList=new ArrayList<Integer>();

        while (true){
            int number=sc.nextInt();
            if (number!=0){
                arrayList.add(number);
            }else {
                break;
            }
        }
        Integer[] i=new Integer[arrayList.size()];
        arrayList.toArray(i);
        Arrays.sort(i);
       // System.out.println(i);
        //System.out.println(i1);
        System.out.println(arrayToString(i)+i[i.length-1]);

    }

    public static String arrayToString(Integer[] i){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for (int x=0;x<i.length;x++){
            if (x==i.length-1){
                sb.append(i[x]);
            }else {
                sb.append(i[x]).append(", ");
            }

            sb.append("]");
        }
            return sb.toString();
    }
}
