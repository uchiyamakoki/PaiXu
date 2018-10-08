package cn.string.day18;

import java.util.ArrayList;
import java.util.Collections;

public class PokerDemo27 {
    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<String>();

        String[] colors={"♠","♥","♣","方块"};

        String[] numbers={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

        for (String color:colors){
            for (String number:numbers){
                array.add(color.concat(number));
            }
        }
        array.add("大王");
        array.add("小王");

        Collections.shuffle(array);

        ArrayList<String> player1=new ArrayList<String>();
        ArrayList<String> player2=new ArrayList<String>();
        ArrayList<String> player3=new ArrayList<String>();
        ArrayList<String> dipai=new ArrayList<String>();

        for (int x=0;x<array.size();x++){
            if (x>array.size()-3){
                dipai.add(array.get(x));
            }
            else if (x%3==0){
               player1.add(array.get(x));
            }else if (x%3==1){
                player2.add(array.get(x));
            }else if (x%3==2){
                player3.add(array.get(x));
            }
        }

        //System.out.println(array);
        //System.out.println(array);
        //System.out.println(array);
        //System.out.println(array);
        //System.out.println(array);
        //lookPoker(String name,ArrayList<String> array);
        lookPoker("player1",player1);
    }

    public static void lookPoker(String name,ArrayList<String> array){
          System.out.println(name);
          for (String s:array){
              System.out.println(s);
          }
    }
}
