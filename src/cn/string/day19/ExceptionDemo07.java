package cn.string.day19;

public class ExceptionDemo07 {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try {
            System.out.println(a/b);
        }catch (ArithmeticException ar){
             System.out.println("除数不能为0");
        }
        System.out.println("over");
    }
}
