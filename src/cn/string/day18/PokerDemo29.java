package cn.string.day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerDemo29 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<Integer, String>();

        ArrayList<Integer> array=new ArrayList<Integer>();

        String[] colors={"♠","♥","♣","方块"};

        String[] numbers={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        int index=0;
        for (String number:numbers){
            for (String color:colors){
                String poker=color.concat(number);
                hm.put(index,poker);
                array.add(index);
                index++;
            }
        }
        hm.put(index,"小王");
        array.add(index);
        index++;
        hm.put(index,"大王");
        array.add(index);

        Collections.shuffle(array);

        TreeSet<Integer> player1=new TreeSet<Integer>();
        TreeSet<Integer> player2=new TreeSet<Integer>();
        TreeSet<Integer> player3=new TreeSet<Integer>();
        TreeSet<Integer> diPai=new TreeSet<Integer>();

        for (int x=0;x<array.size();x++){
              if (x>array.size()-3){
                  diPai.add(array.get(x));
              }else if (x%3==0){
                  player1.add(array.get(x));
              }else if (x%3==1){
                  player2.add(array.get(x));
              }else if (x%3==2){
                  player3.add(array.get(x));
              }
        }
         lookPoker("1",player1,hm);

    }

    private static void lookPoker(String name,TreeSet<Integer> ts,HashMap<Integer,String> hm){
          System.out.println(name);
          for (Integer key:ts){
              String value=hm.get(key);
              System.out.println(value);
          }
    }
}
