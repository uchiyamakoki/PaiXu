package cn.string.day20;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File14 {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("fos3.txt",true);

        for (int x=0;x<10;x++){
            fos.write(("hello"+x).getBytes());
            fos.write("\n".getBytes());
        }

        fos.close();

    }
}
