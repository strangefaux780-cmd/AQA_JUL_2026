package org.prog.session8;

public class Main1 {
    public static void main(String[] args) {
        Android android = new Android();
        Apple apple = new Apple();
        unklockfingers(android);
        unklockFaceid(apple);
        HomeWork.unlockIphone(android);
        HomeWork.unlockIphone(apple);



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