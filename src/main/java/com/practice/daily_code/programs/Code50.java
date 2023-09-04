package com.practice.daily_code.programs;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Code50 {

    public static int bSearch(int[] arr,int n)
    {
        int high = arr.length;
        int low = 0;
        int mid = 0;
        int counter = arr.length;
        while(counter!=0)
        {
            mid= (high+low)/2;
            if(arr[mid]==n)
            {
                log.error("mid==n");
                break;
            }
            else if(arr[mid]<n)
            {
                log.error("mid<n");
                counter/=2;
                low=mid;
                high= arr.length;
            }
            else {
                log.error("mid>n");
                counter/=2;
                low=0;
                high=mid;
            }
        }
        if(arr[mid]!=n)
        {
            return -1;
        }
        else
            return mid;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = 9;
        int index = bSearch(arr,n);
        log.error("Index of n is : : "+index);
    }
}
