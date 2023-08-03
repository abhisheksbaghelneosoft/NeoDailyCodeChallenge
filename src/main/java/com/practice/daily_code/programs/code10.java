package com.practice.daily_code.programs;

public class code10 {

    public static void main(String[] args) {

        int nums[] = { 1, 2, 3, 4, 5 };
        int pos[] = { 3, 2, 4, 1, 0 };
        int tempNums=0;
        int tempPos=0;

        for (int i = 0; i < nums.length; i++) {
            for(int j=0;j<nums.length;j++)
            {
                if(pos[j]==i)
                {
                    System.out.println("pos[j] :: "+pos[j]+"   "
                            + "nums[j] :: "+nums[j]+"  pos[pos[j]] :: "
                            +pos[pos[j]]+"  nums[pos[j]] :: "+nums[pos[j]]);
                    tempPos=pos[j];
                    tempNums=nums[j];
                    nums[j]=nums[pos[j]];
                    nums[pos[j]]=tempNums;
                    pos[j]=pos[pos[j]];
                    pos[tempPos]=tempPos;
                    System.out.println("nums :");
                    for(int x: nums)
                        System.out.print(x+" ");
                    System.out.println();
                    System.out.println("pos :");
                    for(int x: pos)
                        System.out.print(x+" ");
                    System.out.println();


                    break;

                }
            }
        }

        System.out.println("nums:");
        for (int i : nums)
        {
            System.out.print(i+" ");
        }
    }

}
