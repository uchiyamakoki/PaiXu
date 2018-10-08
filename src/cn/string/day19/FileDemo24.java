package cn.string.day19;

import java.io.File;

public class FileDemo24 {
    public static void main(String[] args) {
        File file=new File("1c.jpg");

        File newFile=new File("东方不败.jpg");

        System.out.println("renameTo:"+file.renameTo(newFile));
    }
}
