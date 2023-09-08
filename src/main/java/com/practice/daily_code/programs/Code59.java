package com.practice.daily_code.programs;

import java.util.HashSet;
import java.util.Set;

public class Code59 {
    public static void main(String[] args) {
        String str = " ";
        Set<Character> hSet = new HashSet<>();
        int greatest = 0;
        for (int i = 0; i <= str.length(); i++) {
            System.out.println(str);
            for (int j = i+1; j <= str.length(); j++) {
                String trystr =  (i==j)?String.valueOf(str.charAt(j)):str.substring(i,j);
                System.out.println(trystr);
                for (int k = 0; k < trystr.length(); k++) {
                    if(!(hSet.add(trystr.charAt(k)))) {
                        if(hSet.size()>=greatest)
                        {
                            greatest = hSet.size();
                            System.out.println(greatest);
                            break;
                        }
                        break;
                    }
                }
                hSet.clear();
            }
        }
        System.out.println(greatest);
    }
}
