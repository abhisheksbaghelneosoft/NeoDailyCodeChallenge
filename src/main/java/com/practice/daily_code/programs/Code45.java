package com.practice.daily_code.programs;

import java.util.Arrays;
public class Code45 {

    public static String reverseString(String str)
    {
        String str1="";
        for (int i = str.length()-1; i>=0; i--) {
            str1=str1 + str.charAt(i);
        }
        return str1;
    }

    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";


//        first way------------------------------>
        String[] strArr = str.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            StringBuilder builder = new StringBuilder(strArr[i]);
            strArr[i]=builder.reverse().toString();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if(i!= strArr.length-1)
                sb.append(strArr[i]).append(" ");
            else
                sb.append(strArr[i]);
        }
        System.out.println(sb);


//        second way------------------------------------->
        Arrays.stream(str.split(" ")).map(Code45::reverseString)
                .forEach(s -> System.out.print(s+" "));
    }
}
