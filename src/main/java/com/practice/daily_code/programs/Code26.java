package com.practice.daily_code.programs;

public class Code26 {

    public static void main(String[] args) {

        int x1 = 3;
        int y1 = 4;
        int r1 = 5;
        int x2 = 14;
        int y2 = 18;
        int r2 = 18;
        double c = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println((r1+r2>c)?1:0);
    }
}