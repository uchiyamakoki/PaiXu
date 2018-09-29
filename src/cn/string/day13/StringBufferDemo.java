package cn.string.day13;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        StringBuffer sb2=new StringBuffer(50);
        System.out.println(sb2);
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());

        StringBuffer sb3=new StringBuffer("hello");
        System.out.println(sb3);
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());
    }

    public static void bubbleSort(int[] chs){
        for (int x=0;x<chs.length-1;x++){
            for (int y=0;y<chs.length-1-x;y++){
                        if(chs[y]>chs[y+1]){
                            int temp=chs[y+1];
                            chs[y+1]=chs[y];
                            chs[y]=temp;
                        }
            }
        }
    }
}
