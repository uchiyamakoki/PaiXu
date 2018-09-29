/*
直接插入排序
 */
public class zhiJiePaiXu {
    public void insertSort(int[] a){
        int len=a.length;
        int insertNum;
        for (int i=1;i<len;i++){
            int j=i-1;
            insertNum=a[i];
            while (j>=0&&insertNum<a[j]){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=insertNum;
        }
    }

    public void inserSort(int[] a){
        int len=a.length;
        int insertNum;
        for(int i=1;i<len;i++){
            int j=i-1;
            insertNum=a[i];
            while (j>=0&&a[j]>insertNum){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=insertNum;
        }
    }

}
