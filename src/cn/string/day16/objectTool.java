package cn.string.day16;

/*public class objectTool<T> {
  *//*  public void show(String s){
        System.out.println(s);
    }

    public void show(Integer integer){
        System.out.println(integer);
    }

    public void show(boolean b){
        System.out.println(b);
    }*//*
  public void show(T t){
      System.out.println(t);
  }

}*/
public class objectTool{
    public <T> void show(T t){
        objectTool ot=new objectTool();
        ot.show("hello");
        ot.show(100);
        ot.show(true);
    }
}
