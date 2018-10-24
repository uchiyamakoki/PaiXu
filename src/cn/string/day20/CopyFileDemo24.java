package cn.string.day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo24 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("fos2.txt");
        FileOutputStream fos=new FileOutputStream("fos.txt");

        byte[] bys=new byte[1024];
        int len=0;
        while ((len=fis.read(bys))!=-1){
             fos.write(bys,0,len);
        }

        fos.close();
        fis.close();


    }
}
