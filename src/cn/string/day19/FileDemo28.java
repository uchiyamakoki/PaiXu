package cn.string.day19;

import java.io.File;

public class FileDemo28 {
    public static void main(String[] args) {
        File file=new File("e:\\");

        File[] fileArray=file.listFiles();
        for (File f:fileArray){
            if (f.isFile()){
                if (f.getName().endsWith(".jpg")){
                    System.out.println(f.getName());
                }
            }
        }
    }
}
