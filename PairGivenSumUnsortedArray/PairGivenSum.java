package PairGivenSumUnsortedArray;
import java.util.HashSet;

public class PairGivenSum {
    public static int pairWithSum(int number[], int target){
        HashSet<Integer> num = new HashSet<>();
        for(int i = 0; i < number.length; i++){
            if(num.contains(target - number[i])){
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int number[] = new int[]{3, 8, 4, 7, 6, 1};
        int target = 14;
        System.out.println(pairWithSum(number, target));
    }
}
