package org.prog.session3;

import java.lang.module.FindException;
import java.util.Random;

public class Homework2masive {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr1 = new int[7];
        int[] arr2 = new int[7];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(100);
            System.out.println(arr1[i]);
        }
            for (int i = 0; i < arr2.length; i++) {
                arr2[arr2.length - 1 - i] = arr1[i];
            }
        System.out.println("====================================================================================================");
            for (int i = 0;i< arr2.length;i++){
                System.out.println(arr2[i]);
            }

    }
}