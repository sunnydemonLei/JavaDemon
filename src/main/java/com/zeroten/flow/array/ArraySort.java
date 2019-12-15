package com.zeroten.flow.array;

import java.util.Random;

public class ArraySort {

    public static int[] sort(int[] arr){
        for (int index1 = 0; index1 < arr.length ;index1 ++){
            for(int index2 = index1 ;index2 <arr.length ; index2 ++){
                if(arr[index1] > arr[index2]){
                    arr[index1] = arr[index1] + arr[index2];
                    arr[index2] = arr[index1] - arr[index2];
                    arr[index1] = arr[index1] - arr[index2];
                }

            }
        }
        return arr;

    }
}
