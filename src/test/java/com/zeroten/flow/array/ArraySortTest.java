package com.zeroten.flow.array;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Random;

import static org.testng.Assert.*;

public class ArraySortTest {

    @Test
    public void SortTest(){
        Random rand = new Random();
        int[] arr =  new int[10];
        for (int i = 0; i < arr.length ;  i++){
            arr[i] = rand.nextInt(100);
        }
        int[] arr1 = arr;
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr);
        Assert.assertEquals(ArraySort.sort(arr1),arr);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr));
    }


}