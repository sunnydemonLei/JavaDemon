package com.zeroten.flow.array;

import java.util.Random;

public class ArraySort {

    //冒泡排序
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
    //插入排序
    public static int[] InsertionSort(int[] arr){
        if(arr == null){
            return null;
        }
        for (int index = 0; index < arr.length; index++){
            for (int i = 0; i < arr.length - index - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    arr[i] = arr[i+1] + arr[i];
                    arr[i+1] = arr[i] - arr[i+1];
                    arr[i] = arr[i] - arr[i+1];
                }
            }
        }
        return arr;
    }
    //选择排序
    public static int[] SelectionSort(int[] arr ){
        if (arr == null)
            return null;
        for (int index = 0; index < arr.length; index ++){
            for (int i = index; i < arr.length; i++){
                if (arr[index] < arr[i]) {
                    arr[i] = arr[index] + arr[i];
                    arr[index] = arr[i] - arr[index];
                    arr[i] = arr[i] - arr[index];
                }
            }
        }
        return arr;
    }


}
