package cn.string.day12;

public class StringDemo22 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        String s="";

        s+="[";
        for(int x=0;x<arr.length;x++){
            if(x==arr.length-1){
                s+=arr[x];
                s+="]";
            }else {
                s+=arr[x];
                s+=", ";
            }
        }
        System.out.println(s);


    }
    public static String arrayToString(int[] arr){
        String s="";

        s+="[";
        for(int x=0;x<arr.length;x++){
            if(x==arr.length-1){
                s+=arr[x];
                s+="]";
            }else {
                s+=arr[x];
                s+=", ";
            }
        }
        return s;

    }
}
