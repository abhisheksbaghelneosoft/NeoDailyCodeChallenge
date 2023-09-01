package com.practice.daily_code.programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class Code43 {

    public static void main(String[] args) {
        int num = 7;
        int sum;
        int rm;
        Set<Integer> set = new LinkedHashSet<>();
        if(num<10)
        {
            num*=num;
        }
        while (num != 1) {
            sum = 0;
            while (num != 0) {
                rm = num % 10;
                sum = sum + (rm * rm);
                num = num / 10;
            }
            if(!set.add(sum))
            {
                break;
            }
            System.out.println(sum);
            num = sum;
        }
        if(num==1)
        {
            System.out.println("happy");
        }
        else {
            System.out.println("unhappy");
        }
    }
}
