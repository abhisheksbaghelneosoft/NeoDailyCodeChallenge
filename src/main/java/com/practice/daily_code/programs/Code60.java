package com.practice.daily_code.programs;

public class Code60 {
    public static void main(String[] args) {
        int n = 8;
        String binary = Integer.toBinaryString(n);
        int count = 0;
        for (int i = 0; i < binary.length(); i++) {
            if(binary.charAt(i)=='1')
                count++;
        }
        System.out.println(count);
    }
}
