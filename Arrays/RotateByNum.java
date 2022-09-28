package Arrays;
import java.util.*;

import javax.sound.sampled.ReverbType;

public class RotateByNum 
{
    public static void main(String args[])  
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nums[] = new int[n];

        for(int i = 0; i<nums.length;i++)
        {
            nums[i] = scn.nextInt();
        }

        int k = scn.nextInt();

        RotateByNum(nums , k);

        System.out.println();
        for(int val : nums)
        {
            System.out.print(val);
        }

        

    } 

    public static void RotateByNum(int[] nums, int k) 
    {
        k = k % nums.length;
        if(k < 0)
        {
            k = k + nums.length;
        }
        
        reverseArr(nums , 0 , nums.length-k-1);
        reverseArr(nums, nums.length-k , nums.length-1);
        reverseArr(nums, 0 , nums.length-1);
    }
    
    public static void reverseArr(int nums[] , int i, int j )
    {
        while(i < j)
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    
}
