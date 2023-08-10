package com.practice.daily_code.programs;

public class Code15 {

    public static void main(String[] args) {

        int n=51;
        int tempN= n;
        int rm;
        int count=0;
        while(n>0)
        {
            rm=n%10;
            if(tempN%rm==0)
                count++;
            n=n/10;
        }
        System.out.println(count);

    }

}
