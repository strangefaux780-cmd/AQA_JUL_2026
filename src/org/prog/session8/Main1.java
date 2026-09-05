package org.prog.session8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) {
        //Android android = new Android("Green","Pixel 10");
        //Android android1 = new Android("black","Samsung Galaxy 26");
       // Android androidanoTher=new Android("Green","Pixel 10");
       // Apple apple = new Apple("White","XS");
       // Apple apple1=new Apple("Golden","XR");
     //   Apple appleanoTher=new Apple("white","17 pro max");
        Set String=new HashSet<>();
        Map<String, Set<String>> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        Map<String, Set<String>> map2 = new HashMap<>();
        map.put("Android" , new HashSet<>());
        map.get("Android").add("+380 68 456 78 90");
        map.get("Android").add("+380 73 345 67 89");
        map.get("Android").add("+380 67 234 56 78");
        map.put("Apple",new HashSet<>());
        map.get("Apple").add("+380 50 123 45 67");
        map.get("Apple").add("+380 67 482 91 53");
        map.get("Apple").add("+380 55 345 67 85");
        map2.put("Android",new HashSet<>());
        map2.get("Android").add("David");
        map2.put("Apple",new HashSet<>());
        map2.get("Apple").add("Jane");
        System.out.println(map);
        System.out.println(map2);
      //  unklockfingers(android);
        //unklockFaceid(apple);
        //HomeWork.unlockIphone(android);
        //HomeWork.unlockIphone(apple);
      //  System.out.println(android.equals(apple));
       // System.out.println(android.hashCode());
       // System.out.println(android.equals(androidanoTher));
        //System.out.println(android.hashCode());
        //System.out.println(apple.equals(appleanoTher));
        //System.out.println(apple.hashCode());
        //System.out.println(apple1.equals(appleanoTher));
        //System.out.println(apple1.hashCode());
        //System.out.println(android1.equals(android));
        //System.out.println(android1.hashCode());





    }

    public static void unklockfingers(Android android) {
        android.unklockPhone();
    }

    public static void unklockFaceid(Apple apple) {
        apple.unklockPhone();
    }
    public static void unklockIphone(Iphone iphone) {
        iphone.unklockPhone();

    }



}