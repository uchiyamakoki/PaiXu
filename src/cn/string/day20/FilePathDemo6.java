package cn.string.day20;

import java.io.File;

public class FilePathDemo6 {
    public static void main(String[] args) {
        File srcFolder=new File("D:\\秋之回忆同人");

        getAllJavaFilePaths(srcFolder);
    }

    private static void getAllJavaFilePaths(File srcFolder) {
        File[] fileArray=srcFolder.listFiles();

        for (File file:fileArray){
            if (file.isDirectory()){
                getAllJavaFilePaths(file);
            }else {
                if (file.getName().endsWith(".mp3")){
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
