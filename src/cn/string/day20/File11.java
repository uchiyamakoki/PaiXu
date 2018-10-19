package cn.string.day20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File11 {
    public static void main(String[] args) throws IOException {
       /* File file=new File("file.txt");
        FileOutputStream fos=new FileOutputStream(file);*/
        FileOutputStream fos=new FileOutputStream("fos.txt");

        fos.write("hello,io".getBytes());
        fos.write("java".getBytes());

        fos.close();


    }
}
