package Arrays;
import java.util.*;

public class sumOfTwoArr 
{
    public static void main(String args[])
    {
        Scanner   scn = new Scanner(System.in);
        int n1 = scn.nextInt();

        int arr1[] = new int[n1];

        for(int i = 0;i<n1;i++)
        {
            arr1[i] = scn.nextInt();
        }


        int n2 = scn.nextInt();
        int arr2[] = new int[n2];

        for(int j = 0; j<n2;j++)
        {
            arr2[j] = scn.nextInt();
        }

        SumOfTwoArray(arr1 , arr2); 
        

    }   
    
    public static void SumOfTwoArray(int arr1[] , int arr2[])
    {
        int res[] = new int[arr1.length < arr2.length ? arr2.length : arr1.length];
        int p1 = arr1.length-1;
        int p2 = arr2.length-1;
        int resp3 = res.length-1;

        int carry = 0;

        while(resp3 >= 0)
        {
            int val1 = p1 >= 0 ? arr1[p1] : 0;
            int val2 = p2 >= 0 ? arr2[p2] : 0;

            int sum = val1 + val2 + carry;

            int digit = sum % 10;
            carry = sum / 10;

            res[resp3] = digit;
            p1--;
            p2--;
            resp3--;

        }

        System.out.println();
        if(carry != 0)
        {
            System.out.print(carry);
        }
        for(int val : res)
        {
            System.out.print(val);
        }
        

    }


    
}
