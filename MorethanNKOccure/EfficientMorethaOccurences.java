package MorethanNKOccure;
import java.util.HashMap;
import java.util.Map;

public class EfficientMorethaOccurences {
    public static void printNBy(int number[], int target){
        HashMap<Integer, Integer> num = new HashMap<Integer, Integer>();

        for(int nums : number){
            num.put(nums, num.getOrDefault(nums, 0) + 1);
        for(Map.Entry<Integer, Integer> e: num.entrySet())
            if(e.getValue() > number.length / target){
                System.out.println(e.getKey()+ " ");
            }
        }
    }
    public static void main(String[] args) {
        int number[] = new int[]{10,10,20,30,20,10,10};
        int target = 2;
        printNBy(number, target);
    }
}
