package org.prog.session8;

public class Main1 {
    public static void main(String[] args) {
        Android android = new Android("Green","Pixel 10");
        Android android1 = new Android("black","Samsung Galaxy 26");
        Android androidanoTher=new Android("Green","Pixel 10");
        Apple apple = new Apple("White","XS");
        Apple apple1=new Apple("Golden","XR");
        Apple appleanoTher=new Apple("white","17 pro max");

      //  unklockfingers(android);
        //unklockFaceid(apple);
        //HomeWork.unlockIphone(android);
        //HomeWork.unlockIphone(apple);
        System.out.println(android.equals(apple));
        System.out.println(android.hashCode());
        System.out.println(android.equals(androidanoTher));
        System.out.println(android.hashCode());
        System.out.println(apple.equals(appleanoTher));
        System.out.println(apple.hashCode());
        System.out.println(apple1.equals(appleanoTher));
        System.out.println(apple1.hashCode());
        System.out.println(android1.equals(android));
        System.out.println(android1.hashCode());





    }

    public static void unklockfingers(Android android) {
        android.unklockPhone();
    }

    public static void unklockFaceid(Apple apple) {
        apple.unklockPhone();
    }
    public static void unklockIphone(Iphone iphone){
iphone.unklockPhone();

    }
}