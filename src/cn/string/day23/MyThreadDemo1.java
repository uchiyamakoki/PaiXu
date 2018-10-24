package cn.string.day23;

import java.util.Date;

public class MyThreadDemo1 extends Thread{
    public MyThreadDemo1(){

    }

    public MyThreadDemo1(String name) {
        super(name);
    }

    public void run(){
        for(int x=0;x<100;x++){
            System.out.println(getName()+"----"+x+",日期"+new Date());

            Thread.yield();

          /*  try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }

}
