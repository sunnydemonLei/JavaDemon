package com.zeroten.flow.array;

import org.testng.annotations.Test;

import java.util.Arrays;

public class ArrayTest {
    //遍历数组的方法
    @Test
    public void TestArrays(){
        Integer[] arr ={1,2,3,4,5};
       /* for(int index = 0; index < arr.length; index++ ){
            System.out.println("下标："+index+",存放的值是："+arr[index]);
            System.out.println(String.format("下标：%d ,存放的值是：%d",index,arr[index]));
        }*/

       //for  each方法
        /* int index = 0;
         for(int val : arr){
            System.out.println("第"+ index + "次取到" +val);
            index ++;
        }*/
        //lambda方式
        Arrays.asList(arr).forEach(val -> {
            System.out.println("值是"+val);
        });
    }

}
