package cn.string.day23;

public class MyThreadDemo {
    public static void main(String[] args) {
        /*MyThreadDemo1 my=new MyThreadDemo1();

        my.run();
        my.run();*/

        MyThreadDemo1 my=new MyThreadDemo1("沈宁");
        MyThreadDemo1 my1=new MyThreadDemo1("余一");
        /*my.setName("沈宁");
        my1.setName("余一");
*/

      // System.out.println(Thread.currentThread().getName());
        //System.out.println(my.getPriority());
        //System.out.println(my1.getPriority());
    /*    my.setPriority(10);
        my1.setPriority(1);*/

        my.start();

       /* try {
            my.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        my1.start();
    }
}
