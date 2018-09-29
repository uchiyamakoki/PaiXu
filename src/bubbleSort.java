public class bubbleSort {
    public static void bubbleSort(int[] numbers){
       int len=numbers.length;
       int temp=0;
        for(int i=0;i<len;i++){
           for (int y=0;y<len-i-1;y++){
               if (numbers[y]>numbers[y+1]){
                  temp=numbers[y];
                  numbers[y]=numbers[y+1];
                  numbers[y+1]=temp;
               }
           }
       }
    }
}
