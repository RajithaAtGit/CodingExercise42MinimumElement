package com.gtrxone;

import java.util.Scanner;

public class Main {

    private  static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = {1,2,3,-1,4,10};
        System.out.println(findMin(myArray));
    }

    private static int findMin(int[] array){
        int min = 0;
        boolean first = true;
//        for (int i = 0; i < array.length; i++) {
//            if (first){
//                first =false;
//                min = array[i];
//            }
//            if (min > array[i]){
//                min = array[i];
//            }
//        }

        for (int num:array){
            if (first){
                first=false;
                min=num;
            }
            if (min>num){
                min=num;
            }
        }
        return min;
    }
}
