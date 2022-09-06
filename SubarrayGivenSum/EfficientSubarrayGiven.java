package SubarrayGivenSum;

import java.util.HashSet;
import java.util.Set;

public class EfficientSubarrayGiven {
    public static boolean isSum(int number[], int sum)
    {
        Set<Integer> s = new HashSet<Integer>();
        int pre_sum = 0;
        for(int i = 0; i < number.length; i++)
        {
            if(pre_sum==sum)
                return true;
            pre_sum += number[i];
            if(s.contains(pre_sum-sum) == true)
                return true;
              
            s.add(pre_sum);
        }
        
        return false;
    }
    public static void main(String[] args) {
        int number[] = new int[]{5, 8, 6, 13, 3, -1};
        int sum=22;
        
        System.out.println(isSum(number, sum));
    }
}
