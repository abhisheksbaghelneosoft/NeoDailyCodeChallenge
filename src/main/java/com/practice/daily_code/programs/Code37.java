package com.practice.daily_code.programs;

public class Code37 {
    public static void main(String[] args) {
        int n = 100;
        int factorCount;
        int openCount=0;
        for (int i = 1; i <= n; i++) {
            factorCount=1;
            for (int j = 1; j <= n; j++) {
                if(i%j==0)
                {
                        factorCount++;
                }
            }
            if(factorCount%2==0)
            {
                System.out.print(i+"  ");
                openCount++;
            }
        }
        System.out.println();
        System.out.println(openCount);
    }
}
