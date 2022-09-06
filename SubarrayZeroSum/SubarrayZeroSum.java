package SubarrayZeroSum;

import java.util.HashSet;
import java.util.Set;

public class SubarrayZeroSum {

    public static int ZeroSumSubarray(int number[])
    {
        Set<Integer> us = new HashSet<Integer>();
        int prefix_sum = 0;
        us.add(0);
        for(int i = 0; i < number.length; i++)
        {
            prefix_sum += number[i];
            if(us.contains(prefix_sum) == true)
              return 1;
              
            us.add(prefix_sum);
        }
        
        return 0;
    }
    public static void main(String[] args) {
        int number[] = new int[]{5, 3, 9, -4, -6, 7, -1};
        System.out.println(ZeroSumSubarray(number));
    }
}
