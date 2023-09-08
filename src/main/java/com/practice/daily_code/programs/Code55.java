package com.practice.daily_code.programs;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Code55 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int x = 16;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<=x)
            {
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[i]+arr[j]==x) {
                        log.info("Yes");
                        break;
                    }
                }
            }
        }
    }
}
