package com.practice.daily_code.programs;

import java.util.Arrays;

public class Code20 {

    public static void main(String[] args) {

        int input[]= { 4, 6, 3, 9, 7, 10 };
        int[] output= new int[input.length];
        for (int i = 0; i < input.length; i++) {
            int val=0;
            for (int j = i; j < input.length; j++) {
                if(input[i]<input[j])
                    val++;
            }
            output[i]= val;
        }
        System.out.println(Arrays.toString(output));
    }

}
