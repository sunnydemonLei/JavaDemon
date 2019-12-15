package com.zeroten.flow;



import java.util.Arrays;
import java.util.Scanner;

public class test {
    /*
    题⽬：给定⼀个年龄，然后判断该年龄属于⼉童、⻘年、中年还是⽼年；
            年龄使⽤ int 类型，只⽀持整数。
     */

    public static  void test11(){
        Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
        System.out.println(num);
    }


    //测试吸血鬼数字

    public void VampireTest(){
        for (int i = 1001;i < 10000 ; i++){
            TestNumber(com(a(i),b(i)),com(c(i),d(i)),i);
            TestNumber(com(b(i),a(i)),com(c(i),d(i)),i);
            TestNumber(com(a(i),b(i)),com(d(i),c(i)),i);
            TestNumber(com(b(i),a(i)),com(d(i),c(i)),i);
            TestNumber(com(a(i),c(i)),com(b(i),d(i)),i);
            TestNumber(com(c(i),a(i)),com(b(i),d(i)),i);
            TestNumber(com(a(i),c(i)),com(d(i),b(i)),i);
            TestNumber(com(c(i),a(i)),com(d(i),b(i)),i);
            TestNumber(com(a(i),d(i)),com(b(i),c(i)),i);
            TestNumber(com(a(i),d(i)),com(c(i),b(i)),i);
            TestNumber(com(d(i),a(i)),com(b(i),c(i)),i);
            TestNumber(com(d(i),a(i)),com(c(i),b(i)),i);


        }
    }
    public int com(int i,int y){
        return i*10 + y ;
    }
    public void TestNumber(int i,int y , int num){
        if(i * y == num  ) {
            System.out.println(num+"=" +i+ "*" +y);

        }
    }
    public int a(int i){
        return i/1000;
    }
    public int b (int i){
        return i%1000/100;
    }
    public int c(int i){
        return i%1000%100/10 ;
    }
    public int d(int i){
        return i%1000%100%10 ;
    }

    //测试吸血鬼数字

    public void testNum(){
        for (int i=10;i<100;i++){
            for (int j=i+1;j<100;j++){
                int target=i*j;
                if (target<1000||target>9999){
                    continue;
                }
                int[] targetNum = { target / 1000, target / 100 % 10, target / 10 % 100 % 10, target%10 };
                int[] strNum = { i % 10, i / 10, j % 10, j / 10 };
                Arrays.sort(targetNum);
                Arrays.sort(strNum);
                if (Arrays.equals(targetNum,strNum)){
                    System.out.println(target + " = " + i + " * " + j);
                }
            }
        }
    }


    public void TestData(){
        isPalindrome(121);
    }
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        String str = String.valueOf(x);
        StringBuffer sb = new StringBuffer(str);

        StringBuffer sb1 = new StringBuffer(str);
        if (sb1.equals(sb.reverse()) ){
            System.out.println(sb.toString()+"\n"+sb1.toString());
            return true;
        }else {
            return false;
        }
    }
}
