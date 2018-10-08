import java.util.HashMap;
import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<Integer, String>();
        String s="";
        int t,sum;

        map.put(10,"A");
        map.put(11,"B");
        map.put(12,"C");
        map.put(13,"D");
        map.put(14,"E");
        map.put(15,"F");

        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();

        if (m/n==0){
            t=m%n;
            if (t<10){
                s=t+s;
            }else if (t>=10){
                s=map.get(t);
            }
        }

        while (m/n!=0){
           t=m%n;
           if (t<10){
               s=t+s;
           }else if (t>=10){
               s=map.get(t)+s;
           }
           m=m/n;
           if (m/n==0){
               s=m+s;
           }
        }
        System.out.println(s);
    }
}
