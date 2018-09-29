package cn.string.day13;

import jdk.nashorn.internal.runtime.FindProperty;

public class StringBufferDemo9 {
    public static void main(String[] args) {
        int[] arr={44,33,55,11,22};

    }
    public static String arrayToString(int[] arr){
        String s="";

        s+="[";
        for(int x=0;x<arr.length;x++){
            if(x==arr.length-1){
                s+=arr[x];
            }else {
                s+=arr[x];
                s+=",";
            }
        }
        s+="]";

        return s ;
    }

    public static String arrayToString2(int[] arr){
        StringBuffer sb=new StringBuffer();

        sb.append("[");
        for (int x=0;x<arr.length;x++){
            if (x==arr.length-1){
                sb.append(arr[x]);
            }else {
                sb.append(arr[x]);
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
