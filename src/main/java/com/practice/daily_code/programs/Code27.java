package com.practice.daily_code.programs;

public class Code27 {

    public static void main(String[] args) {

        int n= -20 ;
        int m=5;
        int min= 0;
        int max= 0;
        int temp;

        if(n==0)
        {
            System.out.println("Alert!! Division by Zero");
        }

        else if(n<0)
        {
            for (int i = -1; i > n-m; i--) {
                if(Math.abs(i)%m==0)
                {
                    if(min>i)
                    {
                        temp=min;
                        min=((Math.abs(i)-Math.abs(n))>(Math.abs(n)-Math.abs(min)))?temp:i;
                    }
                }
            }
            System.out.println(min);
        }

        else {
            for (int i = 1; i < n+m; i++) {
                if(i%m==0)
                {
                    if(max<i)
                    {
                        temp=max;
                        max=(n-max>i-n)?i:temp;
                    }
                }
            }
            System.out.println(max);
        }
    }
}

