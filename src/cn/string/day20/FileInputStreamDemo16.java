package cn.string.day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo16 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis=new FileInputStream("fos.txt");

//        int by=fis.read();
//        System.out.println(by);
//        System.out.println((char)by);
//
//        by=fis.read();
//        System.out.println(by);
//        System.out.println((char)by);
//
//        by=fis.read();
//        System.out.println(by);
//        System.out.println((char)by);
//
//        by=fis.read();
//        System.out.println(by);
//        System.out.println((char)by);
        int by=fis.read();
        while (by!=-1){
            System.out.println((char)by);
            by=fis.read();
        }
        fis.close();
    }
}
