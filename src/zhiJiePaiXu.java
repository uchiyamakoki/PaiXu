/*
直接插入排序
 */
public class zhiJiePaiXu {
    public void insertSort(int[] a){
        int len=a.length;//单独把数组长度拿出来，提高效率
        int insertNum;//要插入的数
        for (int i=1;i<len;i++){//因为第一次不用，所以从1开始
            insertNum=a[i];
            int j=i-1;//序列元素个数
            while (j>=0&&a[j]>insertNum){//从后往前循环，将大于insertNum的数向后移动
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=insertNum;//找到位置，插入当前元素
        }

    }

    public void test1(int[] a){
        int len=a.length;
        int insertNum;
        for (int i=1;i<len;i++){
            insertNum=a[i];
            int j=i-1;
            while (j>=0&&insertNum<a[j]){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=insertNum;
        }
    }
}
