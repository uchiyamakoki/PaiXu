package cn.string.day19;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file=new File("E:\\demo\\a.txt");

        File file1=new File("E:\\demo","a.txt");

        File file2=new File("e:\\demo");
        File file3=new File(file2,"a.txt");
    }
}
