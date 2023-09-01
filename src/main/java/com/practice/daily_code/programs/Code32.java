package com.practice.daily_code.programs;

public class Code32 {
    public static void main(String[] args) {
        int n= 11;
        int count=0;
        while(n!=1)
        {
            if(n%2==0)
            {
                n=n/2;
                System.out.println(n);
            }
            else {
                n= (3*n)+1;
                System.out.println(n);
            }
            count++;
        }
        System.out.println("Total iteration : : "+count);
    }
}
