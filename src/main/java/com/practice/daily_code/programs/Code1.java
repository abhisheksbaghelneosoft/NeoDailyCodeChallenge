package com.practice.daily_code.programs;

public class Code1 {

    int getMax(int a[], int n) {
        int max = a[0];
        for(int i = 1; i<n; i++) {
            if(a[i] > max)
                max = a[i];
        }
        return max;
    }

    void countSort(int[] a, int n)
    {
        int[] output = new int [n+1];
        int max = getMax(a, n);
        int[] count = new int [max+1];

        for (int i = 0; i <= max; ++i)
        {
            count[i] = 0;
        }

        for (int i = 0; i < n; i++)
        {
            count[a[i]]++;
        }

        for(int i = 1; i<=max; i++)
            count[i] += count[i-1];

        for (int i = n - 1; i >= 0; i--) {
            output[count[a[i]] - 1] = a[i];
            count[a[i]]--;
        }

        for(int i = 0; i<n; i++) {
            a[i] = output[i];
        }
    }

    void printArray(int a[], int n) {
        for (int i = 0; i < n; ++i)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int a[] = { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 };
        int n = a.length;
        Code1 c1 = new Code1();
        System.out.println("Before sorting  : ");
        c1.printArray(a,n);
        c1.countSort(a, n);
        System.out.println("After sorting : ");
        c1.printArray(a, n);
    }
}
