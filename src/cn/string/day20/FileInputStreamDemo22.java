package cn.string.day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo22 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("fos2.txt");

        //byte[] bys=new byte[5];
     /*   int len=fis.read(bys);
        System.out.println(len);
        System.out.println(new String(bys));

        len=fis.read(bys);
        System.out.println(len);
        System.out.println(new String(bys));

        len=fis.read(bys);
        System.out.println(len);
        System.out.println(new String(bys));*/
        /*
        5
abc 空格(2)+abc \r \n

5
java  半个空格（1）+java
4

yui   半个空格（1）+yui
         */


       /* int len=0;
        while ((len=fis.read(bys))!=-1){
            System.out.print(new String(bys,0,len));
        }*/
       byte[] bys=new byte[1024];
       int len=0;
       while ((len=fis.read(bys))!=-1){
           System.out.print(new String(bys,0,len));
       }

        fis.close();
    }
}
