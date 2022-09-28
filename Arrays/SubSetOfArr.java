package Arrays;
import java.util.*;
public class SubSetOfArr 
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i<n; i++)
        {
            arr[i] = scn.nextInt();
        }

        SubSetOfArr(arr);
    }

    public static void SubSetOfArr(int arr[])
    {
        int limit  = (int)Math.pow(2 , arr.length);

        for(int i = 0; i<limit; i++)
        {
            int temp = i;
            String res = "";

            for(int j = arr.length-1; j >=0; j--)
            {
                int rem = temp % 2;
                temp = temp/2;

                if(rem == 0)
                {
                    res = "-\t" + res;
                }
                else
                {
                    res = arr[j] +"\t" + res;
                }

            }

            System.out.println(res);
        }
    }
}
