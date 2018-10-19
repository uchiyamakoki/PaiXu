package cn.string.day20;
/*
5!=1*2*3*4*5;
 */
public class DiGuiDemo2 {
    public static void main(String[] args) {
        int jc=1;
        for (int x=2;x<=5;x++){
            jc*=x;
        }
        System.out.println("5的阶乘是："+jc);

    }
}
