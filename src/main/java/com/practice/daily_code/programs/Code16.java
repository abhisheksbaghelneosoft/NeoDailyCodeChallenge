package com.practice.daily_code.programs;

public class Code16 {

    public static void main(String[] args) {

        int n=5;
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0&&j==0)
                {
                    arr[i][j]=1;
                }
                if(j==0&&i!=0)
                {
                    arr[i][j]=arr[i-1][j];
                }
                if (j!=0&&i!=0)
                {
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n-i-1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }


    }

}
