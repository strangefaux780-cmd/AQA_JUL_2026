package org.prog.session2;
public class HomeWork1 {
    public static void main (String[] args) {
        int pointMoney = 500;
        int kmtoPoint = 5;
        if (pointMoney < 500 && kmtoPoint > 10) {
            System.out.println("The retail point does not go due to low amount and it is not profitable");
        } else if (pointMoney < 500 && kmtoPoint <= 10) {
            System.out.println("The retail point will go next week so that the order amount is bigger");
        } else if (pointMoney >= 500 && kmtoPoint > 10) {
            System.out.println("The retail point is delivered because the order amount is large");
        } else {
            System.out.println("The retail point goes");
        }
    }
    }


