package cn.string.day20;

import java.io.*;

/*
复制文本文件
数据源
目的地
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        //封装数据源
        FileInputStream fis=new FileInputStream("a.txt");
        //封装目的地
        FileOutputStream fos=new FileOutputStream("b.txt");

        int by=0;
        while ((by=fis.read())!=-1){
                fos.write(by);
        }

        fos.close();
        fis.close();

    }
}
