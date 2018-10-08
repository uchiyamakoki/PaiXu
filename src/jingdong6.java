import java.util.Scanner;

public class jingdong6 {
    public static int n=0;
    public static long calSum1(int a[],int sum){
        long dp[][]=new long[n+1][sum+1];
        dp[0][0]=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(j>=a[i])
                    dp[i][j]=dp[i-1][j-a[i]]+dp[i-1][j];
                else
                    dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][sum];
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            n=in.nextInt();
            int a[]=new int[n+1];
            int sum=in.nextInt();
            for(int i=1;i<=n;i++){
                a[i]=in.nextInt();
            }
            System.out.println(calSum1(a,sum));
        }
        in.close();
    }
}
