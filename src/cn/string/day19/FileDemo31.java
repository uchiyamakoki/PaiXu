package cn.string.day19;

import java.io.File;

public class FileDemo31 {
    public static void main(String[] args) {
        File srcFolder=new File("E:\\棋魂");

        File[] fileArray=srcFolder.listFiles();
        for (File file:fileArray){
            //System.out.println(file);
            String name=file.getName();
            int index=name.indexOf("_");
            String numberString=name.substring(index+1,index+4);
            //System.out.println(numberString);

            int startIndex=name.lastIndexOf("_");
            //int endIndex=name.lastIndexOf(".");
            //String nameString=name.substring(startIndex+1,endIndex);
            String nameString=name.substring(startIndex);
            String newName=numberString.concat(nameString);

            File newFile=new File(srcFolder,newName);
            file.renameTo(newFile);
        }
    }
}
