package cn.string.day20;

import java.io.File;

public class FileDeleteDemo7 {
    public static void main(String[] args) {
        File srcFolder =new File("demo");
        
        deleteFolder(srcFolder);
    }

    private static void deleteFolder(File srcFolder) {
        File[] fileArray=srcFolder.listFiles();
        for (File file:fileArray){
            if (file.isDirectory()){
                deleteFolder(file);
            }else {
                System.out.println(file.getName()+file.delete());
            }
        }
        System.out.println(srcFolder.getName()+srcFolder.delete());
    }
}
