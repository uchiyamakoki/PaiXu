package cn.string.day14;

public class RegexDemo9 {
    public static void main(String[] args) {
        String s="hello12345worldjava123789";

        String regex="\\d+";
        String regex1="\\d";
        String ss="*";
        String ss1="";

        String result=s.replaceAll(regex1,ss);
        String result1=s.replaceAll(regex1,ss1);

        System.out.println(result1);
    }
}
