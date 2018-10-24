package cn.string.ShuZu;

public class Array {
    private int[] data;
    private int size;

    //构造函数，传入数组的容量capacity构造Array
    public Array(int capacity){

        data=new int[capacity];
        size=0;
    }
    //无参数的构造函数,默认数组的容量capacity=10
    public Array(){
        this(10);
    }

    public int getSize(){
        return size;
    }

    //获取数组的容量
    public int getCapacity(){
        return data.length;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void addLast(int e){
      add(size,e);
    }
    public void addFirst(int e){
        add(0,e);
    }
    //在第index个位置插入一个新元素
    public void add(int index,int e){
        if (size==data.length){
            throw new IllegalArgumentException("AddLast failed.Array is full");
        }

        if (index<0||index>size){
            throw new IllegalArgumentException("AddLast failed.Array is <0 or >size");
        }

        for (int i=size-1;i>=index;i--){
            data[i+1]=data[i];
        }
        data[index]=e;
        size++;
    }

    public String toString(){
        StringBuilder res=new StringBuilder();
        res.append(String.format("Array: size = %d , capacity =%d\n",size,data.length));

        res.append('[');
        for (int i=0;i<size;i++){
            res.append(data[i]);
            if (i!=size-1){
                res.append(",");
            }
        }
        res.append("]");
        return res.toString();
    }
    //获取index索引位置的元素
    int get(int index){
        if (index<0||index>=size){
            throw new IllegalArgumentException("Get failed.Index is illegal.");
        }
        return data[index];
    }

    void set(int index,int e){
        if (index<0||index>=size){
            throw new IllegalArgumentException("Get failed.Index is illegal.");
        }
        data[index]=e;
    }
}
