package LongestConsecutiveSubs;

import java.util.Arrays;

public class SortingLongestConsecutiveSubs {
    public static int findLongest(int number[]){
        Arrays.sort(number);
        int total = 1;
        int curr = 1;
        for(int i = 1; i < number.length; i++){
            if(number[i] == number[i - 1] + 1){
                curr++;
            }
            else{
                total = Math.max(total, curr);
                curr = 1;
            }
        }
        total = Math.max(total, curr);
        return total;
    }
    public static void main(String[] args) {
        int number[] = new int[]{1, 9, 3, 4, 2, 10, 13};
        System.out.println(findLongest(number));
    }
}
