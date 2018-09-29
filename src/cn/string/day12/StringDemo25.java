package cn.string.day12;

public class StringDemo25 {
    public static void main(String[] args) {
        String maxString="ilovejavailovejavahhhjavagun";
        String minString="java";

       int count=getCount(maxString,minString);
       System.out.println(count);
    }
    public static int getCount(String  maxString,String minString){
        int count=0;

       // int index=maxString.indexOf(minString);
        int index;
        while ((index=maxString.indexOf(minString))!=-1){
            count++;

            //int startIndex=index+minString.length();
            maxString=maxString.substring(index+minString.length());

            //index=maxString.indexOf(minString);
        }
        return count;
    }
}
