package cn.string.day19;

import java.io.File;

public class FileDemo25 {
    public static void main(String[] args) {
        File file=new File("东方不败.jpg");

        System.out.println("isDirectory:"+file.isDirectory());
        System.out.println("isFile:"+file.isFile());
        System.out.println("exists:"+file.exists());
        System.out.println("canRead:"+file.canRead());
        System.out.println("canWrite:"+file.canWrite());
        System.out.println("isHidden:"+file.isHidden());

    }
}
