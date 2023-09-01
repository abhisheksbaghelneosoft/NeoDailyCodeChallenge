package com.practice.daily_code.programs;

import org.springframework.aop.target.LazyInitTargetSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Code36 {
    public static void main(String[] args) {
        Integer arr1[] = {1,2,3,4,5};
        Integer arr2[] = {6,7,8,9};
        List<List<Integer>> ls = new ArrayList<>();
        ls.add(Arrays.asList(arr1));
        ls.add(Arrays.asList(arr2));
        int i=0;
        while(i<ls.size()) {
            Iterator it = ls.get(i).listIterator();
            while (it.hasNext()) {
                System.out.print(it.next()+" ");
            }
            i++;
        }

    }
}
