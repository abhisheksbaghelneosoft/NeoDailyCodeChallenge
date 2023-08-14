package com.practice.daily_code.programs;

import java.util.HashSet;

public class Code17 {

    public static void main(String[] args) {
        int n=1920;
        String combined= String.valueOf(n)+String.valueOf(n*2)+String.valueOf(n*3);
        HashSet<Character> hSet = new HashSet<>();
        for (int i = 0; i < combined.length(); i++) {hSet.add(combined.charAt(i));}
        System.out.println((!hSet.contains('0') && hSet.size() == 9) ? "fascinating number": (hSet.contains('0') && hSet.size() == 10) ? "fascinating number" : "not fascinating");
    }
}
