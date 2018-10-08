package cn.string.day19;

import java.io.File;

public class FileDemo27 {
    public static void main(String[] args) {
        File file=new File("e:\\");

     /*   String[] strArray=file.list();
        for (String s:strArray){
            System.out.println(s);
        }*/
     File[] fileArrat=file.listFiles();
     for (File f:fileArrat){
         System.out.println(f.getName());
     }
    }
}
