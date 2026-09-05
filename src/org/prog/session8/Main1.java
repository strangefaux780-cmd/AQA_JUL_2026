package org.prog.session8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) {
        Map<Android,Set<String>> androidmap=new HashMap<>();
        Android android1=new Android("Black","Pixel 8 Pro","+380 67 123 45 67","David");
        Android android2=new Android( "White","Pixel 9a","+380 50 987 65 43","Bob");
        Android android3=new Android("Blue","Huawei","+380 63 456 78 90","Jason");
        androidmap.put(android1,new HashSet<>());
        androidmap.get(android1).add("380 67 123 45 67");
        androidmap.put(android2,new HashSet<>());
        androidmap.get(android2).add("+380 50 987 65 43");
        androidmap.put(android3,new HashSet<>());
        androidmap.get(android3).add("+380 63 456 78 90");
        Map<Apple,Set<String>>applemap=new HashMap<>();
        Apple apple1=new Apple("Gold","Iphone 16e","+380 97 321 65 98","David");
        Apple apple2=new Apple("Red","Iphone 13 Pro Max","+380 95 852 14 73","Jane");
        Apple apple3=new Apple("Orange","Iphone 17 Pro Max","+38077 77 777 77","Oleksandr");
        applemap.put(apple1,new HashSet<>());
        applemap.get(apple1).add("+380 97 321 65 98");
        applemap.put(apple2,new HashSet<>());
        applemap.get(apple2).add("+380 95 852 14 73");
        applemap.put(apple3,new HashSet<>());
        applemap.get(apple3).add("+38077 77 777 77");
       // System.out.println(applemap + "(&&)" + androidmap);
        Map<Android,Set<String>> androidOwner=new HashMap<>();
        androidOwner.put(android1,new HashSet<>());
        androidOwner.get(android1).add("David");
        androidOwner.put(android2,new HashSet<>());
        androidOwner.get(android2).add("Bob");
        androidOwner.put(android3,new HashSet<>());
        androidOwner.get(android3).add("Jason");
        System.out.println(androidOwner);
        Map<Apple,Set<String>> appleOwner=new HashMap<>();
        appleOwner.put(apple1,new HashSet<>());
        appleOwner.get(apple1).add("David");
        appleOwner.put(apple2,new HashSet<>());
        appleOwner.get(apple2).add("Jane");
        appleOwner.put(apple3,new HashSet<>());
        appleOwner.get(apple3).add("Oleksandr");
        System.out.println(appleOwner);


















        //Android android = new Android("Green","Pixel 10");
        //Android android1 = new Android("black","Samsung Galaxy 26");
       // Android androidanoTher=new Android("Green","Pixel 10");
       // Apple apple = new Apple("White","XS");
       // Apple apple1=new Apple("Golden","XR");
     //   Apple appleanoTher=new Apple("white","17 pro max");

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
 //   public static void unklockfingers(Android android) {
   //     android.unklockPhone();
    }
   // public static void unklockFaceid(Apple apple) {
     //   apple.unklockPhone();
    //}
    //public static void unklockIphone(Iphone iphone) {
      //  iphone.unklockPhone();





