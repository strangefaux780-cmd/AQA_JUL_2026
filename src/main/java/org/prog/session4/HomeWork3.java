package org.prog.session4;
import org.prog.session3.ArraysDemo;

import java.util.Arrays;
import java.util.Random;
public class HomeWork3 {
    public static void main(String[] args) {
Random random=new Random();
int [] arr1 = new int[20];
for(int i =0;i< arr1.length;i++)
    arr1[i]= random.nextInt(200);
boolean isSorted = false;
while(!isSorted){
        isSorted=true;
for(int i = 0;i< arr1.length-1;i++) {
    if (arr1[i] > arr1[i + 1]) {
        int temp = arr1[i];
        int pemt = arr1[i + 1];
        arr1[i] = pemt;
        arr1[i + 1] = temp;
        isSorted = false;

    }
}

}
        System.out.println("Відсортований маисв"+ Arrays.toString(arr1));







    }
}
