package IntersectionofTwoArrays;

import java.util.HashSet;
import java.util.Set;

public class IntersectionTwoArrays {
    
    public static int intersection(int number[], int numbers[]){
        Set<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i < number.length; i++)
          hs.add(number[i]);
        int res = 0;
        for(int i = 0; i < numbers.length; i++)
        {
            if(hs.contains(numbers[i]))
            {
                res++;
                hs.remove(numbers[i]);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int number[] = new int[]{15,17,27,27,28,15};
        int numbers[] = new int[]{16,17,28,17,31,17};
        System.out.println(intersection(number, numbers));
    }
    
}
