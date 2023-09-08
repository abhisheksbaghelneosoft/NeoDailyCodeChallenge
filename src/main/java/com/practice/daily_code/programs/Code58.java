package com.practice.daily_code.programs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Code58 {
    static int[] arr = {1, 4, 45, 6, 10, 8};
    static int x = 16;
    public static boolean compare(int i)
    {
        for (int j = 0; j < arr.length; j++) {
            if(i+arr[j]==x && i!=arr[j])
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Arrays.stream(arr).filter(Code58::compare).forEach(System.out::println);
    }
}
