package com.practice.daily_code.programs;

public class Code57 {
    public static boolean findSum(int[] arr, int n , int x)
    {
        for (int i = 0,j=1; i < n-1;) {
            if(arr[i] <= x || arr[j] <= x)
            {
                if(arr[i]+arr[j]==x)
                    return true;
                j++;
                if(j == n)
                {
                    i++;
                    j=i+1;
                }
            }
            else {
                i++;
                j=i+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int x = 16;
        int n = arr.length;
        System.out.println(findSum(arr,n,x));
    }
}
