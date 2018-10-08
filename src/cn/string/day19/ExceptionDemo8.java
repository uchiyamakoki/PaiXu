package cn.string.day19;

public class ExceptionDemo8 {
    public static void main(String[] args) {
           method4();
    }
    public static void method4(){
        int a=10;
        int b=0;
        int[] arr={1,2,3};
        try {
            System.out.println(a/b);
            System.out.println(arr[3]);
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException ar){
            System.out.println("出问题了");
        }
        System.out.println("over");
    }
    public static void method3(){
        int a=10;
        int b=0;
        int[] arr={1,2,3};
        try {
            System.out.println(a/b);
            System.out.println(arr[3]);
        }catch (ArithmeticException ar){
            System.out.println("除数不能为0");
        } catch (ArrayIndexOutOfBoundsException ar){
            System.out.println("你访问了不该访问的");
        }
        System.out.println("over");
    }

    public  static void method2(){
        int a=10;
        int b=0;
        try {
            System.out.println(a/b);
        }catch (ArithmeticException ar){
            System.out.println("除数不能为0");
        }
        int[] arr={1,2,3};
        try {
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException ar){
            System.out.println("你访问了不该访问的");
        }
        System.out.println("over");
    }
}
