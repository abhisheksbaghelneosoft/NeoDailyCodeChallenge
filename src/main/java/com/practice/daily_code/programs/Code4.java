package com.practice.daily_code.programs;

import java.util.Arrays;
import java.util.Stack;

public class Code4 {

    public static void main(String[] args) {

        int[] arr = {1,0,1,0,0,1,1,1,1,1,0};
//        int[] arr={ 0, 0, 1, 0, 1, 1, 1, 0, 1, 1 };
        int count[]=new int[arr.length];
        int max=0;
        int temp=0;
        Stack<Integer> st= new Stack<>();
        for(int i=0;i< arr.length;i++)
        {
            temp=arr[i];
            arr[i]=1;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]==1)
                {
                    st.push(1);
                    if(max< st.size())
                        max= st.size();
                }
                else
                {
                    st.clear();
                }
            }
            arr[i]=temp;
            count[i]=max;
        }

        int countMax=0;
        int index=0;
        for(int i=0;i<count.length;i++)
        {
            if(countMax<count[i])
            {
                index=i;
                countMax=count[i];
            }
        }
        System.out.println(index+" : "+countMax);
        arr[index]=1;
    }
}
