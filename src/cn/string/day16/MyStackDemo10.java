package cn.string.day16;

public class MyStackDemo10 {
    public static void main(String[] args) {
        MyStack ms=new MyStack();

        ms.add("hello");
        ms.add("world");
        ms.add("java");



        while (!ms.isEmpty()){
            System.out.println(ms.get());
        }

    }
}
