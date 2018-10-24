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

    public void addList(int e){
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
}
