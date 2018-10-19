package cn.string.day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("fos.txt");

        FileOutputStream fos=new FileOutputStream("fos2.txt");

        int by=0;
        while ((by=fis.read())!=-1){
            fos.write(by);
        }
        fos.close();
        fis.close();
    }
}
