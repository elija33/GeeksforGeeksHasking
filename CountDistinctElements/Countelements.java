package CountDistinctElements;

import java.util.HashSet;
import java.util.Set;

public class Countelements {
    public static int countDist(int number[]){
        Set<Integer> num = new HashSet<Integer>();
        for(int i = 0; i < number.length; i++){
            num.add(number[i]);
        }
        return num.size();
    }
    public static void main(String[] args) {
        int number[] = new int[]{15, 16, 27, 27, 28, 15, 6, 6, 15};

        System.out.println(countDist(number));
    }
}
