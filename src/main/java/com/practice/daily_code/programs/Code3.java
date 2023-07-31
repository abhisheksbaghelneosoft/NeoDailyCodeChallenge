package com.practice.daily_code.programs;

import java.util.Scanner;

public class Code3 {

    public static void main(String[] args) {
        System.out.print("Enter the number of entries you want : ");
        Scanner sc = new Scanner(System.in);
        int entries = sc.nextInt();
         int inputArr[]=new int[entries];
        System.out.println();
         int dayCount=0;
        for (int i = 0; i < entries; i++)
        {
            dayCount++;
            System.out.print("Enter day "+dayCount+" gift prize : ");
            inputArr[i]=sc.nextInt();
            System.out.println();
        }

//        int arr[][]=new int[5][2];
//
//        for (int i=0;i<entries;i++)
//        {
//            System.out.println("Enter day count : ");
//            arr[i][0]= sc.nextInt();
//            System.out.println("Enter gift price : ");
//            arr[i][1]= sc.nextInt();
//        }
//
//        int price[]=new int[arr.length];
//        for(int i=0; i<arr.length;i++)
//        {
//            price[i]=arr[i][1];
//        }

        //taking a 2D array as input where everyday amount and price of gift is given
        //int arr[][]= {{1,3},{2,3},{3,2},{4,1},{5,3}};

        //taking out the price array from that given array by picking arr[0][1] and putting it in price[0]
        //int price[]={3,3,2,1,3};

        //marking initial amount 0 before day1
        int amount=0;
        int possibility=0;
        for(int i=0;i<inputArr.length;i++)
        {
            //everyday 1 unit is earned so adding daily 1 unit
            amount=amount+1;

            //applying condition for checking if we have the amount to buy gift or not
            if(inputArr[i]<=amount)
            {
                //when we buy gift we will have to reduce the price as well
                amount=amount-inputArr[i];
                possibility++;
            }
        }
        //total possibility will be this
        System.out.println("Total number of possibilities : "+possibility);

    }

}
