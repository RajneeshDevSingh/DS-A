package Arrays;
import java.util.*;

public class SpanOfArray 
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i<n;i++)
        {
             arr[i] = scn.nextInt();
        }

        System.out.println("\n"+SpanOfArray(arr));
    }

    public static int SpanOfArray(int arr[]) 
    {

        int ans;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0 ;i<arr.length-1;i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }

            if(min > arr[i])
            {
                min = arr[i];
            }
        }

        ans = max-min;
        return ans;
    }
    
}
