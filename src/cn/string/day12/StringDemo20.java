package cn.string.day12;

public class StringDemo20 {
    public static void main(String[] args) {
        String s1="helloworld";
        String s2=s1.replace('l','k');
        String s3=s1.replace("owo","ak4");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        String s4="helloworld";
        String s5=s4.trim();
        System.out.println(s4+"----");
        System.out.println(s5+"----");

        String s6="hello";
        String s7="hello";
        String s8="abc";
        String s9="xyz";
        System.out.println(s6.compareTo(s7));
        System.out.println(s6.compareTo(s8));
        System.out.println(s6.compareTo(s9));
    }
}
