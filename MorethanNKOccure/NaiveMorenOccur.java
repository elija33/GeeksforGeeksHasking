package MorethanNKOccure;

import java.util.Arrays;

public class NaiveMorenOccur {
    public static void printNBy(int number[], int target){
        Arrays.sort(number);
        int i = 1;
        int count = 1;
        while(i < number.length){
            while(i < number.length && number[i] == number[i - 1]){
                count++;
                i++;
            }
            if(count > number.length / target){
                System.out.println(number[i - 1]+ " ");
            count = 1;
            i++;
            }
        }
    }
    public static void main(String[] args) {
        int number[] = new int[]{10,10,20,30,20,10,10};
        int target = 2;
        printNBy(number, target);
    }
}
