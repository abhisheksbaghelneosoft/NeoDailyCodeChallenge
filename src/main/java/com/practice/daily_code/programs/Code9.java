package com.practice.daily_code.programs;

public class Code9 {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5 };
        int pos[] = { 3, 2, 4, 1, 0 };

        int output[]= new int[nums.length];

        for (int i = 0; i < output.length; i++) {
            output[pos[i]]= nums[i];
        }
        for(int i: output)
        {
            System.out.print(i+" ");
        }

    }
}
