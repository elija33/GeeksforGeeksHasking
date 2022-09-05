package CountDistinctEleWindow;

import java.util.HashMap;

public class EfficientCountElementWindow {
    public static void printDistincts(int number[], int target){
        HashMap<Integer, Integer> num = new HashMap<>();

        for(int i = 0; i < target; i++){
            num.put(number[i], num.getOrDefault(number[i], 0) + 1);
        }

        System.out.println(num.size()+ " ");

        for(int i = target; i < number.length; i++){
            num.put(number[i - target], num.get(number[i - target]) - 1);{
                if(num.get(number[i - target]) == 0){
                    num.remove(number[i - target]);
                }
                num.put(number[i], num.getOrDefault(number[i], 0) + 1);
                System.out.print(num.size()+ " ");
            }
        }
    }
    public static void main(String[] args) {
        int number[] = new int[]{10,10,5,3,20,5};
        int target = 4;
        printDistincts(number, target);
    }
}
