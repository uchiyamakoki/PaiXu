package cn.string.day19;

import java.io.File;
import java.io.IOException;

public class FileDemo23 {
    public static void main(String[] args) throws IOException {
     /*   File file=new File("e:\\a.txt");
        System.out.println("createNewFile:"+file.createNewFile());*/

        File file=new File("a.txt");
        System.out.println("createNewFile:"+file.createNewFile());

        File file1=new File("aaa\\bbb\\ccc");
        System.out.println("mkdirs:"+file1.mkdirs());

        File file2=new File("a.txt");
        System.out.println("delete:"+file2.delete());

        File file3=new File("aaa\\bbb\\ccc");
        System.out.println("delete:"+file3.delete());

        File file5=new File("aaa\\bbb");
        System.out.println("delete:"+file5.delete());

        File file4=new File("aaa");
        System.out.println("delete:"+file4.delete());
    }
}
