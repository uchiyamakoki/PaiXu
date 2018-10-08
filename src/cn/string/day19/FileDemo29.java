package cn.string.day19;

import java.io.File;
import java.io.FilenameFilter;

public class FileDemo29 {
    public static void main(String[] args) {
        File file=new File("e:\\");

        //File[] fileArray=file.listFiles();
       /* for (File f:fileArray){
            if (f.isFile()){
                if (f.getName().endsWith(".jpg")){
                    System.out.println(f.getName());
                }
            }
        }*/
       String[] strArray=file.list(new FilenameFilter() {
           @Override
           public boolean accept(File dir, String name) {
               File file=new File(dir,name);
               boolean flag=file.isFile();
               boolean flag2=name.endsWith(".jpg");
               return flag&&flag2;
           }
       });
       for (String s:strArray){
           System.out.println(s);
       }
    }
}
