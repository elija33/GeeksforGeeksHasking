package LongestSubarrayGivenSum;

import java.util.HashSet;

public class LongestSubGivenSum {
    public static int largestSubarraywithsum(int number[], int target){
        int prefix_sum = 0;
        HashSet<Integer> us = new HashSet<>();
        us.add(0);
        for(int i = 0; i < number.length; i++)
        {
            prefix_sum += number[i];
            if(us.contains(prefix_sum - target))
              return 1;
            us.add(prefix_sum);
        }
        return 0;
    }
    public static void main(String[] args) {
        int number[] = new int[]{8, 3, -7, -4, 1};
        int target = -8;
        
        System.out.println(largestSubarraywithsum(number, target));
    }
}
