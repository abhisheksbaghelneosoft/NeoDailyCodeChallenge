package com.practice.daily_code.programs;

public class Code28 {

    public static void main(String[] args) {

        int n=-14;
        int m=4;
        int rm = n%m;
        int result=0;
        if(n>0) {
            result = m - rm <= rm ? n + m - rm : n - rm;
        } else if (n<0) {
            result = Math.abs(m) - Math.abs(rm) <= Math.abs(rm) ? n - m - rm : n + Math.abs(rm);
        }else {
            System.out.println("Division by zero");
        }
        System.out.println(result);
    }

}
