package Arrays;

import java.io.*;

public class findele 
{   
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6,7,8,9};

        System.out.println(FindEle(arr, 5));
    }

    public static int FindEle(int arr[] , int n)
    {
        int idx = 0;

        for(int i = 0; i<arr.length-1;i++)
        {
            if(arr[i] == n)
            {
                idx = i;
            }

        }


        return idx;
    }

	
}


