public class sheelSort {
    public void sheelSort(int[] a){
        int len=a.length;
        while (len!=0){
            len=len/2;
            for (int i=0;i<len;i++){
                for (int j=i+len;j<a.length;j+=len){
                    int k=j-len;
                    int temp=a[j];
                    while (k>=0&&temp<a[k]){
                        a[k+len]=a[k];
                        k-=len;
                    }
                    a[k+len]=temp;
                }
            }
        }
    }

    public void sheelSort2(int[] a){
        int len=a.length;
        while (len!=0){
            len=len/2;
            for (int i=0;i<len;i++){
                for (int j=i+len;j<a.length;j+=len){
                    int k=j-len;
                    int temp=a[j];
                    while (k>=0&&temp<a[k]){
                        a[k+len]=a[k];
                        k-=len;
                    }
                    a[k+len]=temp;
                }
            }
        }

    }
}
