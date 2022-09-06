package UnionTwoUnsortedArrays;

import java.util.HashSet;
import java.util.Set;

public class UnionTwoArrays {
    public static int unionSize(int number[], int numbers[])
    {
        Set<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i < number.length; i++)
          hs.add(number[i]);
        for(int i = 0; i < numbers.length; i++)
          hs.add(numbers[i]);
          
        return hs.size();
    }
    public static void main(String[] args) {
        int number[] = new int[]{2, 8, 3, 5, 6};
        int numbers[] = new int[]{4, 8, 3, 6, 1};
        
        System.out.println(unionSize(number, numbers));
    }
}
