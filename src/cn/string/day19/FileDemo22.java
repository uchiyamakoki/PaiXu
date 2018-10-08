package cn.string.day19;

import java.io.File;
import java.io.IOException;

public class FileDemo22 {
    public static void main(String[] args) throws IOException {
        File file=new File("e:\\demoda");
        System.out.println("mkdir:"+file.mkdir());

        File file1=new File("e:\\demoda\\a.txt");
        System.out.println("createNewFile:"+file1.createNewFile());
        //先文件夹（目录），再文件
        /*File file2=new File("e:\\test\\b.txt");
        System.out.println("createNewFile:"+file2.createNewFile());*/

     /*   File file3=new File("e:\\test\\aaa");
        System.out.println("createNewFile:"+file3.createNewFile());*/

       /* File file4=new File("e:\\test");
        File file5=new File("e:\\test\\aaa");
        System.out.println("mkdir:"+file4.mkdir());
        System.out.println("mkdir:"+file5.mkdir());*/

       /*File file6=new File("e:\\aaa\\bbb\\ccc\\ddd");
       System.out.println("mkdir:"+file6.mkdirs());*/

       File file7=new File("e:\\liuyi\\a.txt");
       System.out.println("mkdirs:"+file7.mkdirs());



    }
}
