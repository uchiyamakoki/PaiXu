package cn.string.ShuZu;

public class Main21 {
    public static void main(String[] args) {
        int[] arr=new int[20];
        for (int i=0;i<arr.length;i++){
            arr[i]=i;
        }
        int[] scores=new int[]{100,99,66};
        for (int i=0;i<scores.length;i++){
            System.out.println(scores[i]);
        }
        for (int score:scores){
            System.out.println(score);
        }
    }
}
