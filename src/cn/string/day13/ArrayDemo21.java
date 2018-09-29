package cn.string.day13;

public class ArrayDemo21 {
    public static void main(String[] args) {
        int[] arr={24,69,80,57,13};

        bubbleSort(arr);
        int index=getIndex(arr,80);
        System.out.println(index);

    }


    public  static void bubbleSort(int[] chs){
        for (int x=0;x<chs.length-1;x++){
            for(int y=0;y<chs.length-1-x;y++){
                if(chs[y]>chs[y+1]){
                    int temp=chs[y];
                    chs[y]=chs[y+1];
                    chs[y+1]=temp;
                }
            }
        }
    }

    public static int getIndex(int[] arr,int value){
        int max=arr.length-1;
        int min=0;

        int mid=(max+min)/2;

        while(arr[mid]!=value){
            if (arr[mid]>value){
                max=mid-1;
            }else if(arr[mid]<value){
                min=mid+1;
            }
            if(min>max){
                return -1;
            }
            mid=(max+min)/2;
        }

        return mid;
    }
}
