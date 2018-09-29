package cn.string.day13;

public class StringBufferDemo14 {
    public static void main(String[] args) {
        int[] arr={24,69,80,57,13};

        for(int y=0;y<arr.length-1;y++){
            for (int x=0;x<arr.length-1-y;x++){
                if (arr[x]>arr[x+1]){
                    int temp=arr[x];
                    arr[x]=arr[x+1];
                    arr[x+1]=temp;
                }
            }
        }

        printArray(arr);
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for (int x=0;x<arr.length;x++){
            if(x==arr.length-1){
                System.out.print(arr[x]+"]");
            }else {
                System.out.print(arr[x]+", ");
            }
        }
    }

    public static  void bubbleSort(int[] arr){
        for(int y=0;y<arr.length-1;y++){
            for (int x=0;x<arr.length-1-y;x++){
                if (arr[x]>arr[x+1]){
                    int temp=arr[x];
                    arr[x]=arr[x+1];
                    arr[x+1]=temp;
                }
            }
        }
    }
}
