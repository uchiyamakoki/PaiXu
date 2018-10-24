public class bubbleSort {
    public static void bubbleSort(int[] numbers){
      int temp=0;
        for(int i=0;i<numbers.length-1;i++){
          for (int t=0;t<numbers.length-1-i;t++){
              if (numbers[i]>numbers[i+1]){
                  temp=numbers[i];
                  numbers[i]=numbers[i+1];
                  numbers[i+1]=temp;
              }
          }
      }
    }
}
