package com.practice.daily_code.programs;

import java.util.Arrays;

public class Code31 {

    public static void main(String[] args) {
        int[] input = {3,6,1,9};
        int k= 3;
        Arrays.sort(input);
        System.out.println(Arrays.toString(input));
        input[0]=input[0]+k;
        for (int i = 1; i < input.length; i++) {
            if(input[i]>k)
            {
                input[i]=input[i]-k;
            }
        }
        System.out.println(Arrays.toString(input));
    }
}
