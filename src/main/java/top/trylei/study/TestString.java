package top.trylei.study;


import javax.sound.midi.Soundbank;

public class TestString {


    public void TestStringLength(){
        String str = "hello,\uD835\uDD5D\uD835\uDD60\uD835\uDD60\uD835\uDD5C";
        System.out.println(str);
        System.out.println("length is: " + str.length());
        System.out.println("code point count is: " + str.codePointCount(0, str.length()));
    }


    public void TestStringNull(){
        String str = "hello world!! hihi";
        System.out.println(str.contains("i"));
        System.out.println(str.indexOf("o",2));
    }

    public void TestStringAppend(){

    }

}
