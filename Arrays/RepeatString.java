package Arrays;

import java.util.*;

import javax.sql.rowset.spi.SyncResolver;

public class RepeatString {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        String str= scn.nextLine();
        int n = scn.nextInt();
    
        // System.out.println(repeatedString(str , n));
        repeatedString(str, n);

    }

    public static void repeatedString(String s, long n)
    {
        
        int strlength = s.length();
        long q = n/strlength;
        long rem = n%strlength;
        
        long partialString = (rem == 0)? 0 : rem;
        
        long aCount = q*getCount(s , s.length()) + getCount(s , partialString);
        
        System.out.println(aCount);
       

    
    }

    public static long getCount(String s , long strlen )
    {
        long count = 0;
        for(int i = 0; i<strlen;i++)
        {
            if(s.charAt(i) == 'a')
            {
                count++;
            }
        }
        
        return count;
    }
    
}
