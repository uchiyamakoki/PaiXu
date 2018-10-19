package cn.string.day20;

public class DiGui05 {
    public static void main(String[] args) {
        int[] arr=new int[20];
        arr[0]=1;
        arr[1]=1;
        for (int x=2;x<arr.length;x++){
            arr[x]=arr[x-2]+arr[x-1];
        }
        System.out.println(arr[19]);
        System.out.println("-----------");

        int a=1;
        int b=1;
        for (int x=0;x<18;x++){
            b=a+b;
            a=b-a;
        }
        System.out.println(b);
        System.out.println("-----------");
        System.out.println(fib(20));
    }

    public static int fib(int n){
        if (n==1||n==2){
            return 1;
        }else {
            return fib(n-1)+fib(n-2);
        }
    }
}
