package com.practice.daily_code.programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Code35 {

    public static void printCombination(String[] arr, int line,String st)
    {
        if(line>=arr.length){
            return;
        }
//        st=st+arr[line].charAt(0);
        printCombination(arr,++line,st);
        if(line>1) {
            for (int i = 0; i < arr.length; i++) {
                String prevTemp = st;
                prevTemp = st + arr[line - 2].charAt(i);
                System.out.println("TEST : : " + prevTemp);
                for (int j = 0; j < arr.length; j++) {
                    String temp = prevTemp;
                    temp = prevTemp + arr[line - 1].charAt(j);
                    System.out.println(temp);
                }
            }
        }
    }

    public static void getCombination(String[] str)
    {
        for (int i = 0; i < str[0].length(); i++) {
            printCombination(str,0,String.valueOf(str[0].charAt(i)));
        }
    }

    public static void main(String[] args) {
        Map<Integer,String> map = new LinkedHashMap<>();
        int arr[] = {2,3,4};
        map.put(2,"ABC");
        map.put(3,"DEF");
        map.put(4,"GHI");
        String[] arrStr = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i]))
                arrStr[i]=map.get(arr[i]);
        }
        System.out.println(Arrays.toString(arrStr)+" ");
        getCombination(arrStr);
        System.out.println(map);
    }
}
